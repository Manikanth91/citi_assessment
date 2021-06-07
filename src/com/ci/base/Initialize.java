package com.ci.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Initialize extends BasePage {

    public void InitializeBrowser(BrowserType browserType) {

        WebDriver driver = null;

        switch (browserType) {
            case Chrome: {
                System.setProperty("webdriver.chrome.driver", "src/test/com/ci/test/drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            }
            case firefox: {
                System.setProperty("webdriver.firefox.geckodriver", "src/test/com/ci/test/drivers/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            }
            case ie: {
                System.setProperty("webdriver.iexplorer.geckodriver", "src/test/com/ci/test/drivers/internetexplorer.exe");
                DriverContext.Driver = new InternetExplorerDriver();
                break;
            }
        }
        //Set the driver
        DriverContext.setDriver(driver);
        //Browser
        DriverContext.Browser = new Browser(driver);
    }
}
