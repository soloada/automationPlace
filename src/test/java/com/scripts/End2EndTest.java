package com.scripts;

import com.AutoExercise.pageObject.HomePage.LoginPage;
import com.AutoExercise.pageObject.HomePage.ProductPage;
import com.AutoExercise.pageObject.HomePage.TopMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class End2EndTest {
    WebDriver driver;

    @Test
    public void End2EndTest() {
        System.setProperty("webdriver.chrome.driver", "C://drivers//d//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        TopMenu topMenu = new TopMenu(driver);
        LoginPage loginPage  = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);

        topMenu.gotoLandingPage();
        topMenu.verifyUrl();
        topMenu.verifyTitle();
        topMenu.isLogoDisplayed();
        topMenu.isLogoEnabled();
        topMenu.clickOnLogo();
        topMenu.isHomeBtnDisplayed();
        topMenu.isHomeBtnEnabled();
        topMenu.clickHomeBtn();
        productPage.isProdBtnDisplayed();
        productPage.isProdBtnEnabled();
        productPage.clickProdBtn();
        //productPage.clickAlertDismiss();

        //driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]/div/span")).click();
        //productPage.clickAlertAccept();







    }
}
