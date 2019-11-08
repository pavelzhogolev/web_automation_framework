package com.sample.ui.verifiers;

import com.sample.framework.ec.PageLoaded;
import com.sample.ui.pages.AccountDetailsPage;
import com.sample.ui.verifiers.base.BaseVerifier;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountDetailsPageVerifier extends BaseVerifier {

    @Autowired
    private AccountDetailsPage accountDetailsPage;

    public boolean isCurrentPage() {
        WebDriverWait wait = new WebDriverWait( webDriver, 60 );
        wait.until( new PageLoaded() );

        return accountDetailsPage.getPageUrl().equals(webDriver.getCurrentUrl());
    }
}
