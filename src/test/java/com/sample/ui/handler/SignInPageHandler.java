package com.sample.ui.handler;

import com.sample.framework.ec.PageLoaded;
import com.sample.ui.handler.base.BaseHandler;
import com.sample.ui.handler.forms.CreateAccountFormHandler;
import com.sample.ui.handler.forms.SignInFormHandler;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SignInPageHandler extends BaseHandler {

    @Autowired
    private CreateAccountFormHandler createAccountFormHandler;

    @Autowired
    private SignInFormHandler signInFormHandler;

    public void createNewAccount(String email ) {
        this.waitForPageLoaded();
        log.info( "Choose to create a new account." );
        createAccountFormHandler.fillForm( email );
        createAccountFormHandler.submit();
    }

    public void signInWithExistingAccount( String email, String password ) {
        this.waitForPageLoaded();
        log.info( "Choose to sign in with an existing account." );
        signInFormHandler.fillForm( email, password );
        signInFormHandler.submit();
    }
}
