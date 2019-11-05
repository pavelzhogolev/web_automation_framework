package com.sample.ui.pages;

import com.sample.framework.ec.PageLoaded;
import com.sample.ui.pages.forms.CreateAccountForm;
import com.sample.ui.pages.forms.SignInForm;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class SignInPage extends BasePage {

    @Autowired
    private CreateAccountForm createAccountForm;

    @Autowired
    private SignInForm signInForm;

    private String pageUrl = "?controller=authentication&back=my-account";
}
