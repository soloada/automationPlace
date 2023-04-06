package com.AutoExercise.pageObject.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TopMenu{
        WebDriver driver;
        WebDriverWait wait;

        public TopMenu (WebDriver driver){
            this.driver = driver;     //Constructor
            PageFactory.initElements(driver, this);
            wait = new WebDriverWait(driver, 15);
        }

    public String  url = "https://automationexercise.com/";
    public void gotoLandingPage() {driver.get(url);}
    public void verifyUrl() {Assert.assertEquals(driver.getCurrentUrl(),url);}
    public void verifyTitle() {Assert.assertEquals(driver.getTitle().toLowerCase(),"Automation Exercise".toLowerCase());}



    @FindBy (css = "img[alt='Website for automation practice']")
    public WebElement coy_logo;
    public void isLogoDisplayed (){
        Assert.assertTrue(this.coy_logo.isDisplayed());
    }
    public void isLogoEnabled (){
        Assert.assertTrue(this.coy_logo.isEnabled());
    }
    public void clickOnLogo () {wait.until(ExpectedConditions.visibilityOf(coy_logo)).click();}

    @FindBy  (linkText = "Home")
    public WebElement homeBtn;
    public void isHomeBtnDisplayed () {Assert.assertTrue(this.homeBtn.isDisplayed());}
    public void isHomeBtnEnabled () {Assert.assertTrue(this.homeBtn.isDisplayed());}
    public void clickHomeBtn () {this.homeBtn.click();}

    @FindBy (linkText = "Cart")
    public WebElement cartBtn;
    public void isCartBtbDisplayed () {
        Assert.assertTrue(this.cartBtn.isDisplayed());}
    public void isCartBtbDEnabled () {
        Assert.assertTrue(this.cartBtn.isEnabled());}
    public void clickCartBtn () {this.cartBtn.click();}

    public void naviBackToUrl () {driver.navigate().to("https://automationexercise.com/");}


}


