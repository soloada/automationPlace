package com.AutoExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Header {
    WebDriver driver;
    WebDriverWait wait;
    String url = "https://automationexercise.com/";

    @Test
    public void Assertion_Header () {
        System.setProperty("webdriver.chrome.driver", "C://drivers//d//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 15);

        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/");
        WebElement logo = driver.findElement(By.cssSelector("img[alt='Website for automation practice']"));
        Assert.assertTrue(logo.isDisplayed());
        Assert.assertTrue(logo.isEnabled());
        wait.until(ExpectedConditions.visibilityOf(logo));
        logo.click();
        WebElement homeBtn = driver.findElement(By.linkText("Home"));
        Assert.assertTrue(homeBtn.isDisplayed());
        Assert.assertTrue(homeBtn.isEnabled());
        wait.until(ExpectedConditions.visibilityOf(homeBtn));
        homeBtn.click();
        WebElement productBtn = driver.findElement(By.cssSelector("[href='\\/products']"));
        Assert.assertTrue(productBtn.isDisplayed());
        Assert.assertTrue(productBtn.isEnabled());
        wait.until(ExpectedConditions.visibilityOf(productBtn));
        productBtn.click();
        driver.navigate().to("https://automationexercise.com/");
        WebElement cartBtn = driver.findElement(By.linkText("Cart"));
        Assert.assertTrue(cartBtn.isDisplayed());
        Assert.assertTrue(cartBtn.isEnabled());
        wait.until(ExpectedConditions.visibilityOf(cartBtn));
        cartBtn.click();
        WebElement signRegBtn = driver.findElement(By.cssSelector("[href='\\/login']"));
        Assert.assertTrue(signRegBtn.isDisplayed());
        Assert.assertTrue(signRegBtn.isEnabled());
        wait.until(ExpectedConditions.visibilityOf(signRegBtn));
        signRegBtn.click();
        Assert.assertTrue(driver.findElement(By.cssSelector(".login-form h2")).isDisplayed());
        driver.findElement(By.cssSelector("[action='\\/login'] [type='email']")).sendKeys("goodman@gmail.com");
        driver.findElement(By.cssSelector("[type='password']")).sendKeys("123456789");
        WebElement loginBtn = driver.findElement(By.cssSelector("[action='\\/login'] .btn-default"));
        Assert.assertTrue(loginBtn.isDisplayed());
        wait.until(ExpectedConditions.visibilityOf(loginBtn));
        loginBtn.click();
        WebElement logoutBtn = driver.findElement(By.cssSelector("[href='\\/logout']"));
        Assert.assertTrue(logoutBtn.isDisplayed());
        wait.until(ExpectedConditions.visibilityOf(logoutBtn));
        logoutBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/login");
        WebElement testCase = driver.findElement(By.cssSelector(".navbar-nav [href='\\/test_cases']"));
        Assert.assertTrue(testCase.isDisplayed());
        testCase.click();
        WebElement apiTesting = driver.findElement(By.cssSelector("[href='\\/api_list']"));
        Assert.assertTrue(apiTesting.isDisplayed());
        wait.until(ExpectedConditions.visibilityOf(apiTesting));
        apiTesting.click();
        WebElement videoTutorial = driver.findElement(By.linkText("Video Tutorials"));
        Assert.assertTrue(videoTutorial.isDisplayed());
        Assert.assertTrue(videoTutorial.isEnabled());
        WebElement contactUs = driver.findElement(By.cssSelector("[href='\\/contact_us']"));
        Assert.assertTrue(contactUs.isDisplayed());
        wait.until(ExpectedConditions.visibilityOf(contactUs));
        contactUs.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/contact_us");
        Assert.assertEquals(driver.getTitle(), "Automation Exercise - Contact Us");

        driver.quit();



    }

}
