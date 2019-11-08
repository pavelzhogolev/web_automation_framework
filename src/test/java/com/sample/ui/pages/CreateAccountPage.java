package com.sample.ui.pages;

import lombok.Getter;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.ui.pages.base.BasePage;
import com.sample.ui.pages.forms.AddressForm;
import com.sample.ui.pages.forms.PersonalInformationForm;

@Getter
@Component
public class CreateAccountPage extends BasePage {

    private String pageUrl = "?controller=authentication&back=my-account#account-creation";

    @Autowired
    PersonalInformationForm personalInformationForm;

    @Autowired
    AddressForm addressForm;

    @FindBy( css = "#submitAccount" )
    public WebElement registerButton;
}
