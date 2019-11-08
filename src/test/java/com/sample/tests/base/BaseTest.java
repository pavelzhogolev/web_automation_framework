package com.sample.tests.base;

import com.sample.framework.ApplicationConfig;
import com.sample.ui.handlers.HomePageHandler;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

@ContextConfiguration( classes = ApplicationConfig.class )
public class BaseTest extends AbstractTestNGSpringContextTests {

    @Autowired
    WebDriver webDriver;

    @BeforeSuite
    protected void beforeSuite() {
    }

    @BeforeTest
    protected void beforeTest() {
    }

    @AfterSuite
    protected void afterSuite() {
        webDriver.quit();
    }
}
