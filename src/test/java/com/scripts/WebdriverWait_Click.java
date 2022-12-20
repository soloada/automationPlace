package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class WebdriverWait_Click {
    WebDriver driver;

    @Test
    public void WebdriverWait_Click() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://drivers//d//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,15);

        driver.get("https://automationteststore.com/");

        Assert.assertEquals(driver.getCurrentUrl(),"https://automationteststore.com/");
        Assert.assertEquals(driver.getTitle(),"A place to practice your automation skills!");
        WebElement ele = driver.findElement(By.linkText("Login or register"));
        Assert.assertTrue(ele.isDisplayed());
        Assert.assertTrue(driver.findElement(By.linkText("Login or register")).isDisplayed());
        wait.until(ExpectedConditions.visibilityOf(ele)).click();

        driver.findElement(By.cssSelector("input#loginFrm_loginname")).sendKeys("webdriverio2");
        driver.findElement(By.cssSelector("input#loginFrm_password")).sendKeys("webdriverio2");
        WebElement eleLoginBtn = driver.findElement(By.cssSelector("button[title='Login']"));
        wait.until(ExpectedConditions.visibilityOf(eleLoginBtn)).click();
        wait.until(ExpectedConditions.titleContains("My Account"));
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationteststore.com/index.php?rt=account/account");
        Assert.assertTrue(driver.findElement(By.cssSelector("#customer_menu_top .menu_text")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("#customer_menu_top .menu_text")).isEnabled());

        WebElement eleLogoffLink = driver.findElement(By.cssSelector(".side_account_list > li:nth-of-type(10) > a"));
        wait.until(ExpectedConditions.visibilityOf(eleLogoffLink)).click();

        }


    }


