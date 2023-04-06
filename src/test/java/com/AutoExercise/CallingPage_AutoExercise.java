/*
package com.AutoExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CallingPage_AutoExercise {
    WebDriver driver;
    WebDriverWait wait;

    public CallingPage_AutoExercise (WebDriver driver){this.driver = driver;     //Constructor
        PageFactory.initElements(driver, this);}


    public void getUrl () {driver.get("https://automationexercise.com/");}
    public void verifyUrl () {Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");}


    @FindBy (css = "img[alt='Website for automation practice']")
    public WebElement coy_logo;
    public void isLogoDisplayed (){Assert.assertTrue(this.coy_logo.isDisplayed());}
    public void isLogoEnabled (){Assert.assertTrue(this.coy_logo.isEnabled());}
    public void clickOnLogo (){this.coy_logo.click();}
    @FindBy  (linkText = "Home")
    public WebElement homeBtn;
    public void isHomeBtnDisplayed () {Assert.assertTrue(this.homeBtn.isDisplayed());}
    public void isHomeBtnEnabled () {Assert.assertTrue(this.homeBtn.isDisplayed());}
    public void clickHomeBtn () {this.homeBtn.click();}
    @FindBy (css = "[href='\\/products']")
    public WebElement productBtn;
    public void isProdBtnDisplayed () {Assert.assertTrue(this.productBtn.isDisplayed());}
    public void isProdBtnEnabled () {Assert.assertTrue(this.productBtn.isEnabled());}
    public void clickProdBtn () {this.productBtn.click();}

    public void naviBackToUrl () {driver.navigate().to("https://automationexercise.com/");}
    @FindBy (linkText = "Cart")
    public WebElement cartBtn;
    public void isCartBtbDisplayed () {Assert.assertTrue(this.cartBtn.isDisplayed());}
    public void isCartBtbDEnabled () {Assert.assertTrue(this.cartBtn.isEnabled());}
    public void clickCartBtn () {this.cartBtn.click();}
    @FindBy (css = "[href='\\/login']")
    public WebElement signRegBtn;
    public void isSignBtbDisplayed () {Assert.assertTrue(this.signRegBtn.isDisplayed());}
    public void isSignBtbDEnabled () {Assert.assertTrue(this.cartBtn.isEnabled());}
    public void clickSignBtn () {this.signRegBtn.click();}

    public void enterUser () {driver.findElement(By.cssSelector("[action='\\/login'] [type='email']")).sendKeys("goodman@gmail.com");}
    public void enterPwd () {driver.findElement(By.cssSelector("[type='password']")).sendKeys("123456789");}
    @FindBy (css = "[action='\\/login'] .btn-default")
    public WebElement loginBtn;
    public void isLoginBtnDisplayed () {Assert.assertTrue(this.loginBtn.isDisplayed());}
    public void isLoginBtnEnabled() {Assert.assertTrue(this.loginBtn.isEnabled());}
    public void clickLoginBtn () {this.loginBtn.click();}








}
*/
