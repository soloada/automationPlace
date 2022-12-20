package com.scripts;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

//import java.time.Duration;

public class CodeOfHead {


    @Test
    public void CodeOfHead () {

        System.setProperty ("webdriver.chrome.driver", "C://drivers//d//chromedriver.exe");

        System.setProperty ("webdriver.chrome.driver", "C://drivers//d//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.get("https://automationteststore.com/");
        driver.findElement(By.linkText("Login or register")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationteststore.com/");
        wait.until(ExpectedConditions.titleContains("A place to practice your automation skills!"));

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         driver.quit();




        }


    }






