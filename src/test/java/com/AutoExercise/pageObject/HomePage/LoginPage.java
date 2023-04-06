package com.AutoExercise.pageObject.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){this.driver = driver;     //Constructor
        PageFactory.initElements(driver, this);}

    @FindBy(css = "[href='\\/login']")
    public WebElement signRegBtn;
    public void isSignBtbDisplayed () {Assert.assertTrue(this.signRegBtn.isDisplayed());}
    //public void isSignBtbDEnabled () {Assert.assertTrue(this.cartBtn.isEnabled());}
    public void clickSignBtn () {this.signRegBtn.click();}

    public void enterUser () {driver.findElement(By.cssSelector("[action='\\/login'] [type='email']")).sendKeys("goodman@gmail.com");}
    public void enterPwd () {driver.findElement(By.cssSelector("[type='password']")).sendKeys("123456789");}
    @FindBy (css = "[action='\\/login'] .btn-default")
    public WebElement loginBtn;
    public void isLoginBtnDisplayed() {Assert.assertTrue(this.loginBtn.isDisplayed());}
    public void isLoginBtnEnabled() {Assert.assertTrue(this.loginBtn.isEnabled());}
    public void clickLoginBtn() {this.loginBtn.click();}

}
