package com.sample.ui.verifiers.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.framework.ec.PageLoaded;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class BaseVerifier {

    @Autowired
    protected WebDriver webDriver;

    public void waitForPageLoaded() {
        log.debug( "Wait for page to open." );
        WebDriverWait wait = new WebDriverWait( webDriver, 60 );
        wait.until( new PageLoaded() );
    }
}
