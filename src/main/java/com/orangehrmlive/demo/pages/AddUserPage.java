package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends Utility {
    // User Role Dropdown
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-select-wrapper'][1]")
    WebElement userRoleDropdown;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeNameField;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-form-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement userName;

    // Status Dropdown
    @CacheLookup
    @FindBy(xpath ="" )
    WebElement statusDropdown;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement passwordFields;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement saveButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    WebElement cancelButton;


    public void selectUserRole(String role){
        selectByVisibleTextFromDropDown(userRoleDropdown,role);
    }

    public void enterEmployeeName(String employeeName) {
        getTextFromElement(employeeNameField,employeeName);
    }

    public void selectStatus(String status) {
       selectByVisibleTextFromDropDown(statusDropdown, status);
    }

    public void enterPassword(String password) {
      getTextFromElement(passwordFields,password);
    }

    public void enterConfirmPassword(String confirmPassword){
        getTextFromElement(confirmPasswordField,confirmPassword);
    }

    public void clickOnButton(){
        clickOnElement(saveButton);
    }

    public void clickOnCancelButton(){
        clickOnElement(cancelButton);
    }










}
