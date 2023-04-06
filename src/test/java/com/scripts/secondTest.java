package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class secondTest {


    @Test
    public void firstTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://drivers//d//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 20);


        driver.get("https://www.automationteststore.com");
        wait.until(ExpectedConditions.titleContains("A place to practice your automation skills!"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.automationteststore.com/");
        Assert.assertEquals(driver.getTitle(), "A place to practice your automation skills!");
        WebElement login_Register = driver.findElement(By.linkText("LoginPage or register"));
        wait.until(ExpectedConditions.visibilityOf(login_Register));
        Assert.assertTrue(login_Register.isDisplayed());
        login_Register.click();

        WebElement returningCustomerText = driver.findElement(By.cssSelector(".col-sm-6.returncustomer > .heading2"));
        wait.until(ExpectedConditions.visibilityOf(returningCustomerText));
        Assert.assertEquals(returningCustomerText.getText(), "RETURNING CUSTOMER");
        driver.findElement(By.cssSelector("#loginFrm_loginname")).sendKeys("webdriverio2");
        driver.findElement(By.cssSelector("#loginFrm_password")).sendKeys("webdriverio2");
        driver.findElement(By.linkText("Forgot your password?")).isDisplayed();
        driver.findElement(By.linkText("Forgot your login?")).isDisplayed();
        driver.findElement(By.cssSelector("[title='LoginPage']")).click();
        wait.until(ExpectedConditions.titleContains("My Account"));

        WebElement welcomeUserMsg = driver.findElement(By.cssSelector("#customer_menu_top .menu_text"));
        wait.until(ExpectedConditions.visibilityOf(welcomeUserMsg));
        WebElement logOffLink = driver.findElement(By.cssSelector(".side_account_list > li:nth-of-type(10) > a"));
        Assert.assertTrue(logOffLink.isDisplayed());
        logOffLink.click();
        WebElement accLogout = driver.findElement(By.cssSelector(".maintext"));
        wait.until(ExpectedConditions.visibilityOf(accLogout));
        WebElement continueBtn = driver.findElement(By.linkText("Continue"));
        Assert.assertTrue(continueBtn.isDisplayed());
        continueBtn.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://automationteststore.com/");
        Assert.assertEquals(driver.getTitle(), "A place to practice your automation skills!");

        driver.close();


    }

    @Test
    public void secondTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://drivers//d//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 20);

        driver.get("https://www.automationteststore.com");
        wait.until(ExpectedConditions.titleContains("A place to practice your automation skills!"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.automationteststore.com/");
        Assert.assertEquals(driver.getTitle(), "A place to practice your automation skills!");
        WebElement login_Register = driver.findElement(By.linkText("LoginPage or register"));
        wait.until(ExpectedConditions.visibilityOf(login_Register));
        Assert.assertTrue(login_Register.isDisplayed());
        login_Register.click();

        WebElement returningCustomerText = driver.findElement(By.cssSelector(".col-sm-6.returncustomer > .heading2"));
        wait.until(ExpectedConditions.visibilityOf(returningCustomerText));
        Assert.assertEquals(returningCustomerText.getText(), "RETURNING CUSTOMER");
        driver.findElement(By.cssSelector("#loginFrm_loginname")).sendKeys("webdriverio2");
        driver.findElement(By.cssSelector("#loginFrm_password")).sendKeys("webdriverio2");
        driver.findElement(By.linkText("Forgot your password?")).isDisplayed();
        driver.findElement(By.linkText("Forgot your login?")).isDisplayed();
        driver.findElement(By.cssSelector("[title='LoginPage']")).click();
        wait.until(ExpectedConditions.titleContains("My Account"));

        WebElement welcomeUserMsg = driver.findElement(By.cssSelector("#customer_menu_top .menu_text"));
        wait.until(ExpectedConditions.visibilityOf(welcomeUserMsg));
        WebElement logOffLink = driver.findElement(By.cssSelector(".side_account_list > li:nth-of-type(10) > a"));
        Assert.assertTrue(logOffLink.isDisplayed());
        logOffLink.click();
        WebElement accLogout = driver.findElement(By.cssSelector(".maintext"));
        wait.until(ExpectedConditions.visibilityOf(accLogout));
        WebElement continueBtn = driver.findElement(By.linkText("Continue"));
        Assert.assertTrue(continueBtn.isDisplayed());
        continueBtn.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://automationteststore.com/");
        Assert.assertEquals(driver.getTitle(), "A place to practice your automation skills!");

        driver.close();


    }

}
