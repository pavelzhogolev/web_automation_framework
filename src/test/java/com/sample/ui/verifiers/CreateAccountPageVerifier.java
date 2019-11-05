package com.sample.ui.verifiers;

import com.sample.framework.ec.PageLoaded;
import com.sample.ui.pages.CreateAccountPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateAccountPageVerifier {

    @Autowired
    protected WebDriver webDriver;

    @Autowired
    private CreateAccountPage createAccountPage;

    public boolean isCurrentPage() {
        WebDriverWait wait = new WebDriverWait( webDriver, 60 );
        wait.until( new PageLoaded() );

        return createAccountPage.getPageUrl().equals(webDriver.getCurrentUrl());
    }
}
