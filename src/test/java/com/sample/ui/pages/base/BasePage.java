package com.sample.ui.pages.base;

import org.springframework.stereotype.Component;

import com.sample.ui.pages.interfaces.Page;

@Component
public abstract class BasePage extends BasePageComponent implements Page {

    @Override
    public String getTitle() {
        return webDriver.getTitle();
    }

}
