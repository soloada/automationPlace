package com.scripts;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ManagingDependancies {
    WebDriver driver;
    WebDriverWait wait;


    @BeforeClass
    public void BeforeClassAnnotation () {
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

    @AfterClass
    public void AfterClassAnnotation () {
        driver.quit();

    }


    @Test
    public void loginPage() {

        WebElement login = driver.findElement(By.linkText("Login or register"));
        wait.until(ExpectedConditions.visibilityOf(login)).click();
        driver.findElement(By.id("loginFrm_loginname")).sendKeys("selenium2022");
        driver.findElement(By.id("loginFrm_password")).sendKeys("selenium2022");
        driver.findElement(By.cssSelector("[title='Login']")).click();
    }
    @Test (dependsOnMethods = {"test3","test4"}, alwaysRun = true) //always run makes the code run all, regardless if any fail
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
