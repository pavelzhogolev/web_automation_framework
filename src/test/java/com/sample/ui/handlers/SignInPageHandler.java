package com.sample.ui.handlers;

import com.sample.ui.handlers.base.BaseHandler;
import com.sample.ui.handlers.forms.SignUpFormHandler;
import com.sample.ui.handlers.forms.SignInFormHandler;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SignInPageHandler extends BaseHandler {

    @Autowired
    private SignUpFormHandler signUpFormHandler;

    @Autowired
    private SignInFormHandler signInFormHandler;

    public void signUpWithEmail( String email ) {
        //TODO try to move wait for page to invocation interceptor
        this.waitForPageLoaded();
        log.info( "Choose to create a new account." );
        signUpFormHandler.fillForm( email );
        signUpFormHandler.submit();
    }

    public void signInWithAccount( String email, String password ) {
        this.waitForPageLoaded();
        log.info( "Choose to sign in with an existing account." );
        signInFormHandler.fillForm( email, password );
        signInFormHandler.submit();
    }
}
