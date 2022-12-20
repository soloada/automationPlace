package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AnotherOne {


    @Test
    public void firstTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://drivers//d//chromedriver.exe");

        //Creating an object of ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        //driver.manage().deleteAllCookies();

        //WebElement   AppareAccessorie = driver.findElement(By.linkText("APPAREL & ACCESSORIES"));


}
}
