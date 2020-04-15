package com.demo.nopcommerce.testbase;

import com.demo.nopcommerce.basepage.BasePage;
import com.demo.nopcommerce.browserselector.BrowserSelector;
import com.demo.nopcommerce.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Chaitanya
 */
//test base class extends with base page class
public class TestBase extends BasePage {

    //object created for browser selector
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String browser = loadProperty.getProperty("browser");
    String baseUrl = loadProperty.getProperty("baseUrl");


    //before method of testNG
    @BeforeMethod(groups = {"sanity","smoke","regression"})
    //browser opening
    public void openBrowser(){
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);

     //after method of testNG
    }@AfterMethod(groups = {"sanity","smoke","regression"})
    //browser closing
    public void tearDown(){
        driver.quit();
    }
}
