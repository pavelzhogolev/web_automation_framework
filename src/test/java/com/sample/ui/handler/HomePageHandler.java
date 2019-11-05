package com.sample.ui.handler;

import com.sample.ui.pages.HomePage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HomePageHandler {

    @Autowired
    private HomePage homePage;

    public void signIn() {
        log.info( "Press 'Sign In' button." );
        homePage.signInButton.click();
    }
}
