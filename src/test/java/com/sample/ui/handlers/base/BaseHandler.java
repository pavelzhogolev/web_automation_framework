package com.sample.ui.handlers.base;

import com.sample.framework.ec.PageLoaded;
import com.sample.ui.handlers.interfaces.Handler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Configuration
@PropertySource( "classpath:application.properties" )
public class BaseHandler implements Handler {

    @Value( "${baseUrl}" )
    private String baseUrl;

    @Value( "${timeout}" )
    private int defaultTimeout;

    @Autowired
    protected WebDriver webDriver;

    @Override
    public void openPage( String pageUrl ) {
        String fullPageUrl = this.baseUrl + pageUrl;
        log.info( "Open '{}' link.", fullPageUrl );
        webDriver.get( fullPageUrl );
        this.waitForPageLoaded();
    }

    @Override
    public void waitForPageLoaded() {
        log.debug( "Wait for page to open." );
        WebDriverWait wait = new WebDriverWait( webDriver, this.defaultTimeout );
        wait.until( new PageLoaded() );
    }

    public void waitForElementDisplayed( WebElement element ) {
        log.debug( "Wait for element to be displayed." );
        WebDriverWait wait = new WebDriverWait( webDriver, this.defaultTimeout );
        wait.until( ExpectedConditions.visibilityOfAllElements( element ) );
    }
}
