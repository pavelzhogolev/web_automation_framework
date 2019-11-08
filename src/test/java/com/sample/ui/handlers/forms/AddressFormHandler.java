package com.sample.ui.handlers.forms;

import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.model.Account;
import com.sample.model.Address;
import com.sample.ui.handlers.base.BaseHandler;
import com.sample.ui.pages.forms.AddressForm;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class AddressFormHandler extends BaseHandler {

    @Autowired
    AddressForm addressForm;

    public void fillForm( Account account ) {
        this.waitForElementDisplayed( addressForm.formContainer );

        Address address = account.getAddress();

        log.info( "Type '{}' into 'First name' input field.", account.getFirstName() );
        addressForm.firstNameInput.sendKeys( account.getFirstName() );

        log.info( "Type '{}' into 'Last name' input field.", account.getLastName() );
        addressForm.lastNameInput.sendKeys( account.getLastName() );

        log.info( "Type '{}' into 'Address' input field.", address.getAddress() );
        addressForm.addressInput.sendKeys( address.getAddress() );

        log.info( "Type '{}' into 'City' input field.", address.getCity() );
        addressForm.cityInput.sendKeys( address.getCity() );

        log.info( "Select '{}' in 'State' dropdown.", address.getCity() );
        new Select( addressForm.stateDropdown ).selectByVisibleText( address.getState() );

        log.info( "Type '{}' into 'Zip/Postal Code' input field.", address.getPostalCode() );
        addressForm.postalCodeInput.sendKeys( address.getPostalCode() );

        log.info( "Type '{}' into 'Mobile phone' input field.", address.getMobilePhone() );
        addressForm.mobilePhoneInput.sendKeys( address.getMobilePhone() );

        log.info( "Type '{}' into 'Assign an address alias for future reference.' input field.", address.getAlias() );
        addressForm.aliasInput.sendKeys( address.getAlias() );

        //TODO fill missing fields
    }
}
