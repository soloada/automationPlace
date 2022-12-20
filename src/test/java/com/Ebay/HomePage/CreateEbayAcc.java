package com.Ebay.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateEbayAcc {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(css = "#gh-logo")
    public WebElement CoyLogo;


    @FindBy (css = "span#gh-ug > a")
    public WebElement SigninBtn;

    @FindBy (css = "a#switch-account-anchor")
    public WebElement switchAcc;

    @FindBy (css = "#create-account-link")
    public WebElement createAcc;

    @FindBy (css = "input#firstname")
    public WebElement firstName;

    @FindBy (css = "input#lastname")
    public WebElement lastName;

    @FindBy (css = "input#Email")
    public WebElement userEmail;

    @FindBy (css = "input#password")
    public WebElement password;

    @FindBy (id = "EMAIL_REG_FORM_SUBMIT")
    public WebElement registration;

    public CreateEbayAcc (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean verifyThatLogoIsDisplayed ()
    {return this.CoyLogo.isDisplayed();}

    public void clickCoyLogo ()
    {this.CoyLogo.click();}

    public void clickSignIn ()
    {this.SigninBtn.click();}

    public void clickOnSwitch ()
    {this.switchAcc.click();}

    public void clickCreateAcc ()
    {this.createAcc.click();}

    public void enterFirstName ()
    {this.firstName.sendKeys("Bold");}

    public void enterLastName ()
    {this.lastName.sendKeys("Man");}

    public void enterUserEmail ()
    {this.userEmail.sendKeys("buccaman231@gmail.com");}

    public void setPassword ()
    {this.password.sendKeys("Bucca101231");}

    public void clickRegistration ()
    {this.registration.click();}









}
