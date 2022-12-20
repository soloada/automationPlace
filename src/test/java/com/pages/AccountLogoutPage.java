package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountLogoutPage {

    // Declare Webdriver
    WebDriver driver;
    WebDriverWait wait;

    // Define webElement
    @FindBy(css = "[title='Continue']")
    public WebElement continueBtn;

    @FindBy(css = ".categorymenu [href='https\\:\\/\\/automationteststore\\.com\\/']")
    public WebElement homePagebtn;

    @FindBy (xpath = "ul#main_menu  .menu_specials.top > .menu_text")
    public WebElement specialsbtn;

    @FindBy (css = "#main_menu .menu_account .menu_text")
    public WebElement accountMenue;

    @FindBy (css = "ul#main_menu  .dropdown-menu.sub_menu  .menu_login.sub > .menu_text")
    public WebElement loginbtnhome;

    @FindBy (linkText = "Check Your Order")
    public WebElement OrderCheck;

    @FindBy (css = "ul#main_menu  .nobackground.top > .menu_text")
    public WebElement cartbtn;

    @FindBy (css = "ul#main_menu  .menu_checkout.top > .menu_text")
    public WebElement checkbtn;

    @FindBy (css = ".col-md-12.headerdetails a[title='Facebook']")
    public WebElement fbBtn;

    // Constructor
    public AccountLogoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    // Methods

    public void clickOnContinueBtn() {
        this.continueBtn.click();
    }
    public void clickOnhomePagebtn() {this.homePagebtn.click();}
    public void clickOnspecialsbtn() {this.specialsbtn.click();}
    public void clickOnaccountMenue () {this.accountMenue.click();}
    public void clickOnloginbtnhome (){this.loginbtnhome.click();}
    public void clickOnOrderCheck (){this.OrderCheck.click();}
    public void clickOncartbtn (){this.cartbtn.click();}
    public void clickOncheckbtn (){this.checkbtn.click();}
    public void clickOnFbbtn () {this.fbBtn.click();}



}
