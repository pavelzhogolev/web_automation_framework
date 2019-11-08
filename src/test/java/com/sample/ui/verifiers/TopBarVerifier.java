package com.sample.ui.verifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.testng.asserts.SoftAssert;

import com.sample.model.Account;
import com.sample.ui.pages.TopBar;
import com.sample.ui.verifiers.base.BaseVerifier;

@Component
public class TopBarVerifier extends BaseVerifier {

    @Autowired
    TopBar topBar;

    public SoftAssert verifyAccountName( Account account ) {
        this.waitForPageLoaded();
        SoftAssert softAssert = new SoftAssert();

        String expectedUserName = String.format( "%s %s", account.getFirstName(), account.getLastName() );
        softAssert.assertTrue( expectedUserName.equals( topBar.getSignedInUserName() ) );

        return softAssert;
    }
}
