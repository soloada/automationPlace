package com.Ebay.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Purchase {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(css = "#gh-logo")
    public WebElement CoyLogo;

    @FindBy(css = "#gh-ac")
    public WebElement search;

    @FindBy(css = "[value='Search']")
    public WebElement searchBtn;



    public Purchase(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean verifyThatLogoIsDisplayed ()
    {return this.CoyLogo.isDisplayed();}

    public void productSearch ()
    {this.search.sendKeys("laptops");}

    public void clickSearch ()
    {this.search.click();}











}
