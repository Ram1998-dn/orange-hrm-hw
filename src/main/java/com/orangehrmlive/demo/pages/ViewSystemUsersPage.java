package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ViewSystemUsersPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='System Users']")
    WebElement systemUsersText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement userNameField;

    @CacheLookup
    @FindBy(xpath = "(//div[@class='oxd-select-text-input'][normalize-space()='Admin'])[1]")
    WebElement userRoleDropdown;


    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeNameField;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-select-wrapper']//*[contains(text(), 'Status')]//following::div[@class = 'oxd-select-text--after']")
    WebElement statusDropdown;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement resetButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement addButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Delete']")
    WebElement deleteButton;

    public String getSystemUsersText(){
        return systemUsersText.getText();
    }

    public void enterUsername(String username){
        userNameField.sendKeys(username);
    }

    public void selectUserRole(String role) {

    }

    public void enterEmployeeName(String employeeName) {
        employeeNameField.sendKeys(employeeName);
    }

    public void selectStatus(String status) {

    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickResetButton() {
        resetButton.click();
    }

    public void clickAddButton() {
        addButton.click();
    }

    public void clickDeleteButton() {
        deleteButton.click();
    }


}
