package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage {

    // Declare Webdriver
    WebDriver driver;
    WebDriverWait wait;

    // Define webElement
    @FindBy(css = ".side_account_list > li:nth-of-type(10) > a")
    public WebElement Logoff;

    // Constructor
    public AccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    // Methods

    public void clickOnLogoffLink() {
        this.Logoff.click();
    }

}
