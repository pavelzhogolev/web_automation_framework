package com.sample.ui.pages.forms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import com.sample.ui.pages.base.BasePageComponent;

@Component
public class AddressForm extends BasePageComponent {

    @FindBy( css = "#account-creation_form" )
    public WebElement formContainer;

    @FindBy( css = "#firstname" )
    public WebElement firstNameInput;

    @FindBy( css = "#lastname" )
    public WebElement lastNameInput;

    @FindBy( css = "#address1" )
    public WebElement addressInput;

    @FindBy( css = "#city" )
    public WebElement cityInput;

    @FindBy( css = "#id_state" )
    public WebElement stateDropdown;

    @FindBy( css = "#postcode" )
    public WebElement postalCodeInput;

    @FindBy( css = "#id_country" )
    public WebElement countryDropdown;

    @FindBy( css = "#phone_mobile" )
    public WebElement mobilePhoneInput;

    @FindBy( css = "#alias" )
    public WebElement aliasInput;
}
