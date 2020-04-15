package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

/**
 * Created by Chaitanya
 */
//login test class extends with test base class
public class LoginTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    //object created
    @Test(groups = {"sanity","regression"}, priority = 0)
    public void verifyUserShouldNavigateToLoginFeature() {
        //below methods calling from pages package
        homePage.clickOnLoginFeature();
        //compare expected with actual result
        String expectedResult = "Welcome, Please Sign In!";
        String actualResult = loginPage.getWelcomeMessage();
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test(groups = {"smoke","regression"}, priority = 1)
    public void verifyUserShouldLoginWithValidCredentialsSuccessfully() {
        //below methods calling from pages package
        homePage.clickOnLoginFeature();
        loginPage.waitForVisibilityToSeeElement();
        loginPage.enterEmailId("dhanno@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.setClickOnLoginButton();
        //compare expected with actual result
        String expectedResult = "Welcome to our store";
        String actualResult = loginPage.welcomeToStore();
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test(groups = {"regression"}, priority = 2)
    public void verifyUserShouldNotLoginWithInvalidCredentialsSuccessfully() {
        //below methods calling from pages package
        homePage.clickOnLoginFeature();
        loginPage.waitForVisibilityToSeeElement();
        loginPage.enterEmailId("dhanno@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.setClickOnLoginButton();
        //compare expected with actual result
        String expectedResult = "Welcome";
        String actualResult = loginPage.welcomeToStore();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
