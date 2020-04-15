package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.RegisterPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.demo.nopcommerce.utility.Utility.getRandomString;

/**
 * Created by Chaitanya
 */
//registration test class extends with Test base class
public class RegistrationTest extends TestBase {
    //object created

    String emailId = null;
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @BeforeClass(groups = {"smoke", "sanity", "regression"})
    public void setUpEmail() {
        emailId = "dhanno" + getRandomString(2) + "@gmail.com";
    }

    @Test(groups = {"sanity","regression"}, priority = 0)
    public void verifyUserShouldNavigateToRegisterPage() {
        //below methods calling from pages package
        homePage.clickOnRegisterFeature();
        //compare expected with actual result
        String expectedResult = "Your Personal Details";
        String actualResult = registerPage.getRegisterMessage();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test(groups = {"smoke","regression"}, priority = 1)
    public void verifyUserShouldRegisterSuccessfullyWithValidCredentials() {
        //below all methods calling from pages package
        homePage.clickOnRegisterFeature();
        registerPage.clickOnRadioButton();
        registerPage.enterFirstName("dhannoRun");
        registerPage.enterLastName("run");
        registerPage.selectDayOfBirth(4);
        registerPage.selectDateOfBirthMonth("may");
        registerPage.selectDateOfBirthYear("1985");
        registerPage.enterEmailId(emailId);
        registerPage.enterCompanyName("dhanno limited");
        registerPage.selectCheckBoxOfNewsLetter();
        registerPage.enterPassword("dhannorun123@");
        registerPage.enterConfirmPassword("dhannorun123@");
        registerPage.ClickOnRegisterButton();
        //compare expected with actual result
        String expectedResult = "Your registration completed";
        String actualResult = registerPage.registrationCompletedMessage();
        Assert.assertEquals(expectedResult, actualResult);


    }

    @Test(groups = {"regression"}, priority = 2)
    public void verifyUserShouldNotRegisterSuccessfullyWithInvalidValidCredentials() {
        //below all methods calling from pages package
        homePage.clickOnRegisterFeature();
        registerPage.clickOnRadioButton();
        registerPage.enterFirstName("dhannoRun");
        registerPage.enterLastName("run");
        registerPage.selectDayOfBirth(4);
        registerPage.selectDateOfBirthMonth("may");
        registerPage.selectDateOfBirthYear("1985");
        registerPage.enterEmailId(emailId);
        registerPage.enterCompanyName("dhanno limited");
        registerPage.selectCheckBoxOfNewsLetter();
        registerPage.enterPassword("dhannorun123@");
        registerPage.enterConfirmPassword("dhannorun123@");
        registerPage.ClickOnRegisterButton();
        //compare expected with actual result
        String expectedResult = "Your registration";
        String actualResult = registerPage.registrationCompletedMessage();
        Assert.assertEquals(expectedResult, actualResult);

    }
}



