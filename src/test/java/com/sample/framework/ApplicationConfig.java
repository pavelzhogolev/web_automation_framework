package com.sample.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
@ComponentScan(basePackages = "com.sample")
public class ApplicationConfig {

    @Bean(name = "webDriver")
    public WebDriver webDriver() {
        System.setProperty("webdriver.chrome.driver", "D:/projects/qa_automation/web_automation_framework/src/test/resources/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        return webDriver;
    }
}
