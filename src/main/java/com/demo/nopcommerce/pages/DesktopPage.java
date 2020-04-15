package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Chaitanya
 */
//desktop page class extends utility class to use properties of utility class
public class DesktopPage extends Utility {
    //locators for each elements on desktop page
    By clickOnDesktopFeature = By.xpath("//h2[@class='title']//a[contains(text(),'Desktops')]");
    By sortByPosition = By.id("products-orderby");
    By aTOzSorting = By.xpath("//option[contains(text(),'Name: A to Z')]");


    //below all methods for each elements and doing actions on that each elements
    public void ClickOnDesktopButton() {

        clickOnElement(clickOnDesktopFeature);
    }

    public void clickOnPosition() {
        clickOnElement(sortByPosition);
    }

    public void atozSort() {
        clickOnElement(aTOzSorting);


    }
}
