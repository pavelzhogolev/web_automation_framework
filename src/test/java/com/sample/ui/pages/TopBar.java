package com.sample.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import com.sample.ui.pages.base.BasePageComponent;

@Component
public class TopBar extends BasePageComponent {

    @FindBy( css = ".login" )
    public WebElement signInButton;

    @FindBy( css = "div.header_user_info > a > span" )
    public WebElement userNameText;

    public String getSignedInUserName() {
        return userNameText.getText();
    }
}
