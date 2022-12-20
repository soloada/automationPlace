package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class generalTest {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setupBrowser(){
         //Creating an object of ChromeDriver
         System.setProperty("webdriver.gecko.driver", "C://drivers//geckodriver.exe");
         driver = new FirefoxDriver();
         driver.manage().window().maximize();
         wait = new WebDriverWait(driver, 15);
         //driver.manage().deleteAllCookies();


    }
    @Test
    public void gotoHomePage() {
        driver.get("https://automationteststore.com/");
        wait.until(ExpectedConditions.titleContains("A place to practice your automation skills!"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationteststore.com/");

    }
    @Test
    public void loginPage() {
        //System.out.println("This is test2");
        driver.findElement(By.linkText("Login or register")).click();
        driver.findElement(By.id("loginFrm_loginname")).sendKeys("selenium2022");
        driver.findElement(By.id("loginFrm_password")).sendKeys("selenium2022");
        driver.findElement(By.cssSelector("button[title='Login']")).click();
    }
    @Test
    public void test2() {
        System.out.println("good work");

    }
    @Test
    public void test3() {
        System.out.println("all is well");


    }
    @Test
    public void test4() {
        System.out.println("well done");


    }


    @AfterMethod
    public void tearDown(){
        driver.quit();

    }

}
