package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//img[@alt='client brand banner']")
    WebElement orangeHRMLogo;

    @CacheLookup
    @FindBy(xpath = "//li[1]//a[1]//span[1]")
    WebElement adminTab;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='PIM']")
    WebElement pimTab;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Leave']")
    WebElement leaveTab;

    @CacheLookup
    @FindBy(xpath = "//span[text() = 'Dashboard']")
    WebElement dashboardTab;

    public boolean isLogoDisplayed(){
        return orangeHRMLogo.isDisplayed();
    }

    public void clickAdminTab(){
        adminTab.click();
    }

    public void clickOnPimTab(){
        pimTab.click();
    }

    public void clickOnLeaveTab(){
        leaveTab.click();
    }

    public void clickOnDashboardTab(){
        dashboardTab.click();

    }




}
