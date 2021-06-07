package com.ci.test.drivertest;

import com.ci.base.*;
import com.ci.config.ConfigReader;
import com.ci.config.Settings;
import com.ci.test.pages.HomePage;
import com.ci.test.pages.LoginPage;
import com.ci.utils.LogUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

import java.io.IOException;


public class LoginTest extends Initialize {
    //Log instance
    LogUtil logUtil = new LogUtil();

    @Before
    public void Initialize() throws IOException {
        ConfigReader.PopulateSettings();

        logUtil.CreateLogFile();
        logUtil.Write("Framework Initialize");

        //Open the browser
        InitializeBrowser(Settings.BrowserType);
        logUtil.Write("Browser instance launch");

        //Maximize browser window
        DriverContext.Browser.Maximize();

        //Launch application URL
        DriverContext.Browser.GoToUrl(Settings.AUT);
        logUtil.Write("Application under test");
    }

    @Test
    public void Login() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        homePage.ClickAccount();
        logUtil.Write("Click account link");
        homePage.ClickSignIn();
        loginPage.LogIn("test", "test");
        logUtil.Write("Login successful");
    }

    @After
    public void clean() {
        DriverContext.Driver.close();
    }
}
