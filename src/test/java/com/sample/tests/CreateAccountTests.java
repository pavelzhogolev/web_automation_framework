package com.sample.tests;

import com.sample.framework.utils.EmailGenerator;
import com.sample.model.Account;
import com.sample.model.Address;
import com.sample.tests.base.BaseTest;
import com.sample.ui.handlers.CreateAccountPageHandler;
import com.sample.ui.handlers.HomePageHandler;
import com.sample.ui.handlers.SignInPageHandler;
import com.sample.ui.handlers.TopBarHandler;
import com.sample.ui.verifiers.TopBarVerifier;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Slf4j
public class CreateAccountTests extends BaseTest {

    @Autowired
    private HomePageHandler homePage;

    @Autowired
    private TopBarHandler topBar;

    @Autowired
    private SignInPageHandler signInPage;

    @Autowired
    private CreateAccountPageHandler createAccountPage;

    @Autowired
    private TopBarVerifier topBarVerifier;

    @DataProvider( name = "createAccountDataProvider" )
    public Object[][] testCreateAccountDataProvider() {
        //TODO move test data to external files
        Address address = Address.builder()
                .address( "2400 W 17th St" )
                .city( "Wilmington" )
                .state( "Delaware" )
                .postalCode( "19805" )
                .mobilePhone( "89996664466" )
                .alias( "Primary address" )
                .build();

        Account account = Account.builder()
                .firstName( "John" )
                .lastName( "Doe" )
                .email( EmailGenerator.generateEmail() )
                .password( "Mzaq1xsw2" )
                .dateOfBirth( "01/01/1990" )
                .address( address )
                .build();

        return new Object[][] {{ account }};
    }

    @Test( dataProvider = "createAccountDataProvider" )
    void testCreateAccount( Account account ){
        log.info( "'Create Account' test started." );


        homePage.openPage(); //TODO move to the BaseTest class
        topBar.signIn();
        signInPage.signUpWithEmail( account.getEmail() );
        createAccountPage.registerAccount( account );

        topBarVerifier.verifyAccountName( account ).assertAll();

        log.info( "'Create Account' test completed." );
    }

}
