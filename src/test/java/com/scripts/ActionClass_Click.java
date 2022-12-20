package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ActionClass_Click {
    WebDriver driver;

    @Test
    public void ActionClass_Click() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://drivers//d//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,15);

        driver.get("https://automationteststore.com/");

        Assert.assertEquals(driver.getCurrentUrl(),"https://automationteststore.com/");
        Assert.assertEquals(driver.getTitle(),"A place to practice your automation skills!");
        WebElement ele = driver.findElement(By.linkText("Login or register"));
        Assert.assertTrue(ele.isDisplayed());
        wait.until(ExpectedConditions.visibilityOf(ele)).click();

        //WebElement ele = driver.findElement(By.linkText("HOME"));

        //Actions action = new Actions(driver);
        //action.moveToElement(ele).click().build().perform();
        //action.moveToElement(ele).perform();


        //driver.quit();



        }


    }


