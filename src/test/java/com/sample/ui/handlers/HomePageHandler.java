package com.sample.ui.handlers;

import com.sample.ui.handlers.base.BaseHandler;
import com.sample.ui.pages.HomePage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HomePageHandler extends BaseHandler {

    @Autowired
    private HomePage homePage;

    public HomePageHandler() {
        System.out.println( "Init handler..." );
    }

    public void openPage() {
        super.openPage( homePage.pageUrl );
    }


}
