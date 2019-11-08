package com.sample.ui.handlers.forms;

import com.sample.ui.handlers.base.BaseHandler;
import com.sample.ui.pages.forms.SignInForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SignInFormHandler extends BaseHandler {

    @Autowired
    SignInForm signInForm;

    public void fillForm( String email, String password ) {
        this.waitForElementDisplayed( signInForm.formContainer );

        log.info( "Type '{}' into 'Email address' input field.", email );
        signInForm.emailAddressInput.sendKeys( email );

        log.info( "Type '{}' into 'Password' input field.", password );
        signInForm.passwordInput.sendKeys( password );
    }

    public void submit() {
        log.info( "Click 'Sign In' button." );
        signInForm.signInButton.click();
    }
}
