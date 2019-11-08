package com.sample.ui.pages.forms;

import com.sample.ui.pages.base.BasePageComponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class SignUpForm extends BasePageComponent {

    @FindBy( css = "#create-account_form" )
    public WebElement formContainer;

    @FindBy( css = "#email_create" )
    public WebElement emailAddressInput;

    @FindBy( css = "#SubmitCreate" )
    public WebElement createAccountButton;
}
