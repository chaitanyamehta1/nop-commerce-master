package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Chaitanya
 */
//computers page class extends utility to use utilities property
public class ComputersPage extends Utility {
    //locators for each elements on computer page
    By computerTextMessage = By.xpath("//h1[contains(text(),'Computers')]");
    By buildYourComputer = By.linkText("Build your own computer");
    By clickOnRadioButton = By.id("product_attribute_3_7");
    By addToCartButton = By.id("add-to-cart-button-1");
    By addToCartConfirmMessage = By.className("content");




    //below all methods for each elements and doing actions on that each elements
    public String getComputerTextMessage() {

        return getTextFromElement(computerTextMessage);
    }

    public void clickOnBuildComputer() {

        clickOnElement(buildYourComputer);
    }

    public void clickOnRadioButtonFeature() {
        clickOnElement(clickOnRadioButton);

    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String getAddToCartMessage() {
        return getTextFromElement(addToCartConfirmMessage);
    }


}
