package com.AutoExercise.pageObject.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;

    public ProductPage (WebDriver driver){this.driver = driver;     //Constructor
        PageFactory.initElements(driver, this);}

    @FindBy(css = "[href='\\/products']")
    public WebElement productBtn;
    public void isProdBtnDisplayed () {Assert.assertTrue(this.productBtn.isDisplayed());}
    public void isProdBtnEnabled () {Assert.assertTrue(this.productBtn.isEnabled());}
    public void clickProdBtn () {
        this.productBtn.click();

    }

    public void clickAlertDismiss() {
        driver.switchTo().alert().dismiss();

    }

    public void clickAlertAccept() {
        driver.switchTo().alert().accept();
    }


}
