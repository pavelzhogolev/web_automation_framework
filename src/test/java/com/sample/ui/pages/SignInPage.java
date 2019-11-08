package com.sample.ui.pages;

import com.sample.ui.pages.base.BasePage;
import com.sample.ui.pages.forms.SignUpForm;
import com.sample.ui.pages.forms.SignInForm;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class SignInPage extends BasePage {

    private String pageUrl = "?controller=authentication&back=my-account";

    @Autowired
    private SignUpForm signUpForm;

    @Autowired
    private SignInForm signInForm;
}
