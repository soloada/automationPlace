package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Before_And_After_method {
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
        driver.get("https://automationteststore.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationteststore.com/");
        wait.until(ExpectedConditions.titleContains("A place to practice your automation skills!"));

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();

    }


    @Test
    public void loginPage() {

        WebElement loginOrRegisterLink = driver.findElement(By.linkText("Login or register"));
        wait.until(ExpectedConditions.visibilityOf(loginOrRegisterLink)).click();
        WebElement loginNameBox = driver.findElement(By.id("loginFrm_loginname"));
        wait.until(ExpectedConditions.elementToBeClickable(loginNameBox)).sendKeys("selenium2022");
        driver.findElement(By.id("loginFrm_password")).sendKeys("selenium2022");
        driver.findElement(By.cssSelector("[title='Login']")).click();

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




}
