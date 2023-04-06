package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Assertion_Url_Title_Wait {
    WebDriver driver;

    @Test
    public void Assertion_Url_Title_Wait() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://drivers//d//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,15);

        driver.get("https://automationteststore.com/");

        Assert.assertEquals(driver.getCurrentUrl(),"https://automationteststore.com/");
        Assert.assertEquals(driver.getTitle(),"A place to practice your automation skills!");
        WebElement login_or_register = driver.findElement(By.linkText("LoginPage or register"));
        Assert.assertTrue(login_or_register.isDisplayed());
        Assert.assertTrue(driver.findElement(By.linkText("LoginPage or register")).isDisplayed());
        wait.until(ExpectedConditions.visibilityOf(login_or_register)).click();

        WebElement loginName = driver.findElement(By.cssSelector("input#loginFrm_loginname"));
        WebElement password = driver.findElement(By.cssSelector("input#loginFrm_password"));
        WebElement eleLoginBtn = driver.findElement(By.cssSelector("button[title='LoginPage']"));

        /*loginName.sendKeys("");
        password.sendKeys("");
        wait.until(ExpectedConditions.visibilityOf(eleLoginBtn)).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.cssSelector(".alert.alert-danger.alert-error")).isDisplayed());
        Thread.sleep(5000);*/

        loginName.sendKeys("webdriverio2");
        password.sendKeys("webdriverio2");
        wait.until(ExpectedConditions.visibilityOf(eleLoginBtn)).click();


        wait.until(ExpectedConditions.titleContains("My Account"));
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationteststore.com/index.php?rt=account/account");
        Assert.assertTrue(driver.findElement(By.cssSelector("#customer_menu_top .menu_text")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("#customer_menu_top .menu_text")).isEnabled());
        WebElement eleLogoffLink = driver.findElement(By.cssSelector(".side_account_list > li:nth-of-type(10) > a"));
        wait.until(ExpectedConditions.visibilityOf(eleLogoffLink)).click();

        WebElement continueLogoutBtn = driver.findElement(By.cssSelector("[title='Continue']"));
        Assert.assertTrue(continueLogoutBtn.isDisplayed());
        Assert.assertTrue(continueLogoutBtn.isEnabled());
        wait.until(ExpectedConditions.visibilityOf(continueLogoutBtn)).click();


        Assert.assertEquals(driver.getCurrentUrl(),"https://automationteststore.com/");
        Assert.assertEquals(driver.getTitle(),"A place to practice your automation skills!");

        driver.quit();

        }


    }


