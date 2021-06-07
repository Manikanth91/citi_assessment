package com.ci.test.pages;

import com.ci.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

    //Locating the email address text box
    @FindBy(how = How.NAME, using = "email")
    public WebElement txtUserName;
    //Locating the password text box
    @FindBy (how = How.XPATH, using = "//*[@id='password']")
    public WebElement txtPassword;
    //Locating the SignIn button
    @FindBy (how = How.CSS, using = "button[type='submit']")
    public WebElement btnSignIn;

    /**
     * Method that performs login action using the web elements
     * @param uName
     * @param pwd
     */
    public void LogIn(String uName, String pwd){
        txtUserName.sendKeys(uName);
        txtPassword.sendKeys(pwd);
        btnSignIn.click();
    }
}
