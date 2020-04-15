package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

import java.util.Random;

/**
 * Created by Chaitanya
 */
//register page class extends utility class to use properties of utility class
public class RegisterPage extends Utility {
    //locators for each elements on register page
    By welcomeRegisterText = By.xpath("//strong[contains(text(),'Your Personal Details')]");
    By clickOnRadio = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By dayOfBirth = By.name("DateOfBirthDay");
    By dateOfBirthMonth = By.name("DateOfBirthMonth");
    By dateOfBirthYear = By.name("DateOfBirthYear");
    By email = By.id("Email");
    By companyName = By.id("Company");
    By newsLetterCheckBox = By.id("Newsletter");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By confirmRegistrationMessage = By.className("result");

    //below all methods for each elements and doing actions on that each elements
    public String getRegisterMessage() {
        return getTextFromElement(welcomeRegisterText);
    }

    public void clickOnRadioButton() {
        clickOnElement(clickOnRadio);
    }

    public void enterFirstName(String firstName1) {
        sendTextToElement(firstName, firstName1);
    }

    public void enterLastName(String lastName1) {
        sendTextToElement(lastName, lastName1);
    }

    public void selectDayOfBirth(int index) {

        selectByIndexFromDropDown(dayOfBirth, index );
    }

    public void selectDateOfBirthMonth(String month) {
        sendTextToElement(dateOfBirthMonth,month);
    }

    public void selectDateOfBirthYear(String year) {
        selectByVisibleTextFromDropDown(dateOfBirthYear, year);
    }

    public void enterEmailId(String email1) {
      sendTextToElement(email,email1);
    }

    public void enterCompanyName(String companyName1) {

        sendTextToElement(companyName, companyName1);
    }

    public void selectCheckBoxOfNewsLetter() {
        clickOnElement(newsLetterCheckBox);
    }

    public void enterPassword(String password1) {

        sendTextToElement(password, password1);
    }

    public void enterConfirmPassword(String confirmPassword1) {

        sendTextToElement(confirmPassword, confirmPassword1);
    }

    public void ClickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public String registrationCompletedMessage() {
        return getTextFromElement(confirmRegistrationMessage);
    }



}
