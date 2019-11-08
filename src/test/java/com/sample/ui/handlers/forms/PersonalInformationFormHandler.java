package com.sample.ui.handlers.forms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.model.Account;
import com.sample.ui.handlers.base.BaseHandler;
import com.sample.ui.pages.forms.PersonalInformationForm;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class PersonalInformationFormHandler extends BaseHandler {

    @Autowired
    PersonalInformationForm personalInfoForm;

    public void fillForm( Account account ) {
        this.waitForElementDisplayed( personalInfoForm.formContainer );

        log.info( "Select '{}' gender radiobutton.", account.getGender() );
        personalInfoForm.mailRadiobutton.click();

        log.info( "Type '{}' into 'First name' input field.", account.getFirstName() );
        personalInfoForm.firstNameInput.sendKeys( account.getFirstName() );

        log.info( "Type '{}' into 'Last name' input field.", account.getLastName() );
        personalInfoForm.lastNameInput.sendKeys( account.getLastName() );

        log.info( "Type '{}' into 'Email' input field.", account.getEmail() );
        personalInfoForm.emailInput.clear();
        personalInfoForm.emailInput.sendKeys( account.getEmail() );

        log.info( "Type '{}' into 'Password' input field.", account.getPassword() );
        personalInfoForm.passwordInput.sendKeys( account.getPassword() );

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern( "dd/MM/yyyy" );
        LocalDate date = LocalDate.parse( account.getDateOfBirth(), dtf );

        log.info( "Type '{}' in 'Date of Birth' dropdowns.", account.getDateOfBirth() );
        new Select( personalInfoForm.dayDropdown ).selectByValue( String.valueOf( date.getDayOfMonth() ) );
        new Select( personalInfoForm.monthDropdown ).selectByValue( String.valueOf( date.getMonthValue() ) );
        new Select( personalInfoForm.yearDropdown ).selectByValue( String.valueOf( date.getYear() ) );
    }
}
