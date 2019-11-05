package com.sample.tests.base;

import com.sample.framework.ApplicationConfig;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

@ContextConfiguration( classes = ApplicationConfig.class )
public class BaseTest extends AbstractTestNGSpringContextTests {

    @Autowired
    WebDriver webDriver;

    @BeforeSuite
    protected void beforeSuite() {
    }

    @AfterSuite
    protected void afterSuite() {
        webDriver.quit();
    }
}
