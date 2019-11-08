package com.sample.ui.pages;

import org.springframework.stereotype.Component;

import com.sample.ui.pages.base.BasePage;

import lombok.Getter;

@Getter
@Component
public class AccountDetailsPage extends BasePage {

    private String pageUrl = "?controller=my-account";
}
