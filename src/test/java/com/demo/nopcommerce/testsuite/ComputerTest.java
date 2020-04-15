package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.ComputersPage;
import com.demo.nopcommerce.pages.DesktopPage;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Chaitanya
 */
//computers test class extends with test base
public class ComputerTest extends TestBase {
    //object created
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    ComputersPage computersPage = new ComputersPage();


    @Test(groups = {"sanity","regression"}, priority = 0)
    public void verifyUserShouldNavigateToComputersPage() {
        //below methods calling from pages package
        homePage.clickOnComputersFeature();
        //compare expected with actual result
        String expectedResult = "Computers";
        String actualResult = computersPage.getComputerTextMessage();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test(groups = {"smoke","regression"}, priority = 1)
    public void verifyUserShouldAddProductToCartSuccessfully() {
        //below all methods calling from pages package
        homePage.clickOnComputersFeature();
        desktopPage.ClickOnDesktopButton();
        desktopPage.clickOnPosition();
        desktopPage.atozSort();
        computersPage.clickOnBuildComputer();
        computersPage.clickOnRadioButtonFeature();
        computersPage.clickOnAddToCartButton();
        //compare expected with actual result
        String expectedResult = "The product has been added to your shopping cart";
        String actualResult = computersPage.getAddToCartMessage();
        Assert.assertEquals(expectedResult, actualResult);


    }@Test(groups = {"regression"}, priority = 2)
    public void verifyUserShouldNotAddProductToCartSuccessfully() {
        //below all methods calling from pages package
        homePage.clickOnComputersFeature();
        desktopPage.ClickOnDesktopButton();
        desktopPage.clickOnPosition();
        desktopPage.atozSort();
        computersPage.clickOnBuildComputer();
        computersPage.clickOnRadioButtonFeature();
        computersPage.clickOnAddToCartButton();
        //compare expected with actual result
        String expectedResult = "The product has been added to your shopping";
        String actualResult = computersPage.getAddToCartMessage();
        Assert.assertEquals(expectedResult, actualResult);

    }
}

