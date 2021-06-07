package com.ci.base;

import org.openqa.selenium.WebDriver;

public class Browser {
    private WebDriver driver;
    public Browser(WebDriver driver) {
        this.driver = driver;
    }

    public BrowserType Type;

    public void GoToUrl(String url){
        driver.get(url);
    }
    public void Maximize(){
        driver.manage().window().maximize();
    }
}
