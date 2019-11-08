package com.sample.ui.pages.forms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import com.sample.ui.pages.base.BasePageComponent;

@Component
public class PersonalInformationForm extends BasePageComponent {

    @FindBy( css = "#account-creation_form" )
    public WebElement formContainer;

    @FindBy( css = "#id_gender1" )
    public WebElement mailRadiobutton;

    @FindBy( css = "#customer_firstname" )
    public WebElement firstNameInput;

    @FindBy( css = "#customer_lastname" )
    public WebElement lastNameInput;

    @FindBy( css = "#email" )
    public WebElement emailInput;

    @FindBy( css = "#passwd" )
    public WebElement passwordInput;

    @FindBy( css = "#days" )
    public WebElement dayDropdown;

    @FindBy( css = "#months" )
    public WebElement monthDropdown;

    @FindBy( css = "#years" )
    public WebElement yearDropdown;
}
