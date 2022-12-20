package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountLoginPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(css = "input#loginFrm_loginname")
    public WebElement userName;

    @FindBy(css = "input#loginFrm_password")
    public WebElement password;

    @FindBy(css = "button[title='Login']")
    public WebElement loginBtn;

    @FindBy(css = "[title='Continue']")
    public WebElement continueRegistrationBtn;

    //ConstructorMethod
    public AccountLoginPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void enterLoginName() {
        this.userName.sendKeys("webdriverio2");
    }

    public void enterPassword() {
        this.password.sendKeys("webdriverio2");
    }

    public void clickOnLogin() {
        this.loginBtn.click();
    }

    public void clickOnContinueBtn() {
        this.continueRegistrationBtn.click();
    }




}
