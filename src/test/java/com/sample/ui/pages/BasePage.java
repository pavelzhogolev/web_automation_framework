package com.sample.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BasePage {

    private final String baseUrl = "http://automationpractice.com/index.php";

    @Autowired
    protected WebDriver webDriver;

    public void openPage(String pageUrl ) {
        webDriver.get( this.baseUrl + pageUrl );
        this.waitForPageToLoad();
    }

    public String getTitle() {
        return webDriver.getTitle();
    }

    public void waitForPageToLoad() {

    }

    @PostConstruct
    public void initPage() {
        PageFactory.initElements( webDriver, this );
    }
}
