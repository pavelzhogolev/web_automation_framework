package com.sample.tests;

import com.sample.model.Account;
import com.sample.tests.base.BaseTest;
import com.sample.ui.handler.HomePageHandler;
import com.sample.ui.handler.SignInPageHandler;
import com.sample.ui.pages.HomePage;
import com.sample.ui.verifiers.CreateAccountPageVerifier;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Slf4j
public class CreateAccountTests extends BaseTest {

    @Autowired
    private HomePage homePage;

    @Autowired
    private HomePageHandler homePageHandler;

    @Autowired
    private SignInPageHandler signInPageHandler;

    @Autowired
    private CreateAccountPageVerifier createAccountPageVerifier;

    @DataProvider( name = "createAccountDataProvider" )
    public Object[][] testCreateAccountDataProvider() {
        return new Object[][] {
                { Account.builder().email( "john.doe@test.com" ).build() }
        };
    }

    @Test( dataProvider = "createAccountDataProvider" )
    void testCreateAccount( Account account ){
        log.info( "'Create Account' test started." );

        homePage.openPage();
        homePageHandler.signIn();
        signInPageHandler.createNewAccount( account.getEmail() );

        Assert.assertTrue( createAccountPageVerifier.isCurrentPage(), "Create Account page is not opened." );

        log.info( "'Create Account' test completed." );
    }

}
