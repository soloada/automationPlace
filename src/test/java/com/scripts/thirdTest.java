package com.scripts;

import com.pages.AccountCreatePage;
import com.pages.AccountLoginPage;
import com.pages.AccountLogoutPage;
import com.pages.AccountPage;
import com.pages.HomePage.TopMenuPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class thirdTest {
    WebDriver driver;

    @Test
    public void firstTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://drivers//d//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 15);

        TopMenuPage topMenuPage = new TopMenuPage(driver);
        AccountLoginPage accountLoginPage = new AccountLoginPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AccountLogoutPage accountLogoutPage = new AccountLogoutPage(driver);
        AccountCreatePage accountCreatePage = new AccountCreatePage(driver);

        topMenuPage.gotHomePage();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.automationteststore.com/");
        Assert.assertEquals(driver.getTitle(), "A place to practice your automation skills!");
        topMenuPage.clickOnCompanyLogo();
        Assert.assertTrue(topMenuPage.verifyCoyLogoIsEnabled());
        Assert.assertTrue(topMenuPage.verifyLoginOrRegisterLinkIsDisplayed());
        topMenuPage.clickOnLoginOrRegister();
        accountLoginPage.enterLoginName();
        accountLoginPage.enterPassword();

        accountLoginPage.clickOnLogin();
        accountPage.clickOnLogoffLink();
        accountLogoutPage.clickOnContinueBtn();
        topMenuPage.hoverOverHomeBtn();
        topMenuPage.clickAccountSubMenuOnHomeBtn();
        accountLoginPage.clickOnContinueBtn();
        accountCreatePage.enterFirstName();
        accountCreatePage.enterLastName();
        accountCreatePage.enterEmail();
        accountCreatePage.enterTelephone();
        accountCreatePage.enterCompanyName();
        accountCreatePage.enterAddress1();
        accountCreatePage.enterAddress2();
        accountCreatePage.enterCity();
        accountCreatePage.enterZipOrPostCode();
        accountCreatePage.selectRegionOrState();
        accountCreatePage.enterLoginName();
        accountCreatePage.enterPassword();
        accountCreatePage.confirmPassword();
        accountCreatePage.tickOnNoSubscribeNewsletter();
        accountCreatePage.clickOnAgree();
        accountCreatePage.clickOnSubmit();
        accountPage.clickOnLogoffLink();
        accountLogoutPage.clickOnContinueBtn();

        //driver.quit();



    }


}
