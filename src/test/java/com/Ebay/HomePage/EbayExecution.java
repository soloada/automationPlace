package com.Ebay.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EbayExecution {

    WebDriver driver;


    @Test

    public void codeExecution () {
        System.setProperty("webdriver.chrome.driver", "C://drivers//d//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 15);

        CreateEbayAcc createEbayAcc = new CreateEbayAcc(driver);
        Purchase purchase = new Purchase(driver);


        driver.get("https://www.ebay.co.uk/");
        createEbayAcc.verifyThatLogoIsDisplayed();
        //createEbayAcc.clickCoyLogo();
        /*createEbayAcc.clickSignIn();
        //createEbayAcc.clickOnSwitch();
        createEbayAcc.clickCreateAcc();
        createEbayAcc.enterFirstName();
        createEbayAcc.enterLastName();
        createEbayAcc.enterUserEmail();
        createEbayAcc.setPassword();
        createEbayAcc.clickRegistration();
*/
        purchase.productSearch();
        purchase.clickSearch();
    }
}
