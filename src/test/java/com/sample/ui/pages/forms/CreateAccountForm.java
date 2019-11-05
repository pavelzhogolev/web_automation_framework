package com.sample.ui.pages.forms;

import com.sample.ui.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateAccountForm extends BasePage {



    @FindBy( css = "#email_create" )
    public WebElement emailAddressInput;

    @FindBy( css = "#SubmitCreate" )
    public WebElement createAccountButton;
}
