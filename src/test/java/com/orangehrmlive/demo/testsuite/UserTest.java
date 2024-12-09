package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class UserTest extends BaseTest {

    LoginPage loginPage;
    HomePage homePage;
    AdminPage adminPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        loginPage = new LoginPage();
        adminPage = new AdminPage();
        homePage = new HomePage();

    }
    @Test
    public void adminShouldAddUserSuccessFully(){



        //Login to Application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLoginButton();

        //click On "Admin" Tab
        homePage.clickAdminTab();





    }
}
