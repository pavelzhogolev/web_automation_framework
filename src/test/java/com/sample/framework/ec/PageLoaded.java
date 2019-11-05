package com.sample.framework.ec;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class PageLoaded implements ExpectedCondition<Boolean> {

    @Override
    public Boolean apply( WebDriver input ) {
        Object readyState = ((JavascriptExecutor) input).executeScript( "return document['readyState']" );
        return null == readyState || "complete".equals( readyState );
    }

    @Override
    public String toString(){
        return "'Page is loaded'";
    }

}
