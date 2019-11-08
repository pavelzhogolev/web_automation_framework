package com.sample.ui.handlers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.ui.handlers.base.BaseHandler;
import com.sample.ui.pages.TopBar;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class TopBarHandler extends BaseHandler {

    @Autowired
    TopBar topBar;

    public void signIn() {
        log.info( "Press 'Sign In' button." );
        topBar.signInButton.click();
    }
}
