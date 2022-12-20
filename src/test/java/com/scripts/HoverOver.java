package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HoverOver {
    WebDriver driver;

    @Test
    public void HoverOver() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://drivers//d//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,15);

        driver.get("https://automationteststore.com/");
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationteststore.com/");
        Assert.assertEquals(driver.getTitle(),"A place to practice your automation skills!");
        Assert.assertTrue(driver.findElement(By.cssSelector(".welcome_msg")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.linkText("FRAGRANCE")).isDisplayed());
        WebElement ele = driver.findElement(By.cssSelector(".subnav > ul > li:nth-of-type(5) > a"));
        Actions action = new Actions(driver); 
        action.moveToElement(ele).perform();


        driver.quit();



        }


    }


