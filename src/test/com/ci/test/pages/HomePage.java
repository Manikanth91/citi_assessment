package com.ci.test.pages;

import com.ci.base.BasePage;
import com.ci.base.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class HomePage extends BasePage {

    //Locating the Account link
    @FindBy (how = How.ID, using = "hf-account-flyout")
    public WebElement lnkAccount;
    //Locating SignIn link
    @FindBy (how = How.CSS, using = "a[title='Sign In']")
    public WebElement lnkSignIn;

    /**
     * Method to click on Account link
     */
    public void ClickAccount() {
        if (lnkAccount.isDisplayed()) {
            lnkAccount.click();
        }
        else{System.out.println("Account link is not displayed");}
    }
    /**
     * Method to click on SignIn link
     */
    public void ClickSignIn() {
        if (lnkSignIn.isDisplayed()) {
            lnkSignIn.click();
        }
        else{System.out.println("Sign In link is not displayed");
        }
    }


    public void AccessApp(){
        DriverContext.Driver.navigate().to("https://www.walmart.com/");
    }
}
