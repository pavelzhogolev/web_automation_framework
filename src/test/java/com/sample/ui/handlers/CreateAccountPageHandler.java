package com.sample.ui.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.model.Account;
import com.sample.ui.handlers.base.BaseHandler;
import com.sample.ui.handlers.forms.AddressFormHandler;
import com.sample.ui.handlers.forms.PersonalInformationFormHandler;
import com.sample.ui.handlers.forms.SignInFormHandler;
import com.sample.ui.handlers.forms.SignUpFormHandler;
import com.sample.ui.pages.CreateAccountPage;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class CreateAccountPageHandler extends BaseHandler {

    @Autowired
    CreateAccountPage createAccountPage;

    @Autowired
    private PersonalInformationFormHandler personalInfoFormHandler;

    @Autowired
    private AddressFormHandler addressFormHandler;

    public void registerAccount( Account account ) {
        this.waitForPageLoaded();
        personalInfoFormHandler.fillForm( account );
        addressFormHandler.fillForm( account );

        createAccountPage.registerButton.click();
    }

}
