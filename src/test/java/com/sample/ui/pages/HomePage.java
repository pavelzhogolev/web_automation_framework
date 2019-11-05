package com.sample.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@DependsOn("webDriver")
public class HomePage extends BasePage {

    @FindBy( css = ".login" )
    public WebElement signInButton;

    private String pageUrl = "";

    public void openPage() {
        super.openPage( this.pageUrl );
    }

    public boolean isPageOpened() {
        return true;
    }
}
