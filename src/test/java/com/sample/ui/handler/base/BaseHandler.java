package com.sample.ui.handler.base;

import com.sample.framework.ec.PageLoaded;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseHandler {

    @Autowired
    protected WebDriver webDriver;

    protected void waitForPageLoaded() {
        WebDriverWait wait = new WebDriverWait( webDriver, 60 );
        wait.until( new PageLoaded() );
    }
}
