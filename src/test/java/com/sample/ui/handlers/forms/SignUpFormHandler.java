package com.sample.ui.handlers.forms;

import com.sample.ui.handlers.base.BaseHandler;
import com.sample.ui.pages.forms.SignUpForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SignUpFormHandler extends BaseHandler {

    @Autowired
    private SignUpForm signUpForm;

    public void fillForm( String email ) {
        this.waitForElementDisplayed( signUpForm.formContainer );

        log.info( "Type '{}' into 'Email address' input field.", email );
        signUpForm.emailAddressInput.sendKeys( email );
    }

    public void submit() {
        log.info( "Click 'Sign In' button." );
        signUpForm.createAccountButton.click();
    }
}
