package com.sample.ui.pages.forms;

import com.sample.ui.pages.base.BasePageComponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class SignInForm extends BasePageComponent {

    @FindBy( css = "#login_form" )
    public WebElement formContainer;

    @FindBy( css = "#email" )
    public WebElement emailAddressInput;

    @FindBy( css = "#passwd" )
    public WebElement passwordInput;

    @FindBy( css = "#SubmitLogin" )
    public WebElement signInButton;
}
