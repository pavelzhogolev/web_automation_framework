package com.sample.ui.pages.base;

import javax.annotation.PostConstruct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.sample.ui.pages.interfaces.PageComponent;

public abstract class BasePageComponent implements PageComponent {

    @Autowired
    protected WebDriver webDriver;

    @Override
    @PostConstruct
    public void initPage() {
        PageFactory.initElements( webDriver, this );
    }
}
