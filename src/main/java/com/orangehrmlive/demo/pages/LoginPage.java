package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement usernameField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='Login']")
    WebElement loginPanelText;


    public void enterUserName(String username){
        sendTextToElement(usernameField, username );
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password );
    }

    public void clickLoginButton(){
         loginButton.click();
    }





}
