package com.sample.ui.handler.forms;

import com.sample.ui.pages.forms.SignInForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignInFormHandler {

    @Autowired
    SignInForm signInForm;

    public void fillForm( String email, String password ) {
        signInForm.emailAddressInput.sendKeys( email );
        signInForm.passwordInput.sendKeys( password );
    }

    public void submit() {
        signInForm.signInButton.click();
    }
}
