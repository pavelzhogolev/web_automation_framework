package com.sample.ui.handler.forms;

import com.sample.ui.pages.forms.CreateAccountForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateAccountFormHandler {

    @Autowired
    private CreateAccountForm createAccountForm;

    public void fillForm( String email ) {
        createAccountForm.emailAddressInput.sendKeys( email );
    }

    public void submit() {
        createAccountForm.createAccountButton.click();
    }
}
