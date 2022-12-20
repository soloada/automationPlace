package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountCreatePage {
    WebDriver driver;
    WebDriverWait wait;


    @FindBy (css = "[title='Continue']")
    public WebElement contBtn;

    @FindBy (css = "#AccountFrm_firstname")
    public WebElement accFirstname;

    @FindBy (css = "#AccountFrm_lastname")
    public WebElement accLasttname;

    @FindBy (css = "#AccountFrm_email")
    public WebElement useremail;

    @FindBy (css = "#AccountFrm_telephone")
    public WebElement userTel;


    @FindBy (css = "#AccountFrm_company")
    public WebElement company;

    @FindBy (css = "input[name='address_1']")
    public WebElement address1;

    @FindBy (css = "input[name='address_2']")
    public WebElement address2;

    @FindBy (css = "#AccountFrm_city")
    public WebElement userCity;

    @FindBy(css = "#AccountFrm_zone_id")
    public WebElement regionState;

    @FindBy (id = "AccountFrm_postcode")
    public WebElement postcode;

    @FindBy(css = "#AccountFrm_loginname")
    public WebElement userLogin;

    @FindBy(css = "#AccountFrm_password")
    public WebElement password;

    @FindBy(css = "#AccountFrm_confirm")
    public WebElement confirmPassword;

    @FindBy(id = "AccountFrm_newsletter0")
    public WebElement unSubscribenewsletter;

    @FindBy(css = "#AccountFrm_agree")
    public WebElement agreeToTerms;

    @FindBy (css = "[title='Continue']")
    public WebElement submitbtn;

    @FindBy (css = ".side_account_list > li:nth-of-type(10) > a")
    public WebElement logoff;


    //ConstructorMethod
    public AccountCreatePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public void clickOnRegContBtn() {
        this.contBtn.click();
    }
        public void enterFirstName() {
            this.accFirstname.sendKeys("FirstName");

        }

    public void enterLastName () {
        this.accLasttname.sendKeys("LastName");

    }

    public void enterEmail () {
        this.useremail.sendKeys("emailforever0000003@email.com");

    }

    public void enterTelephone () {
        this.userTel.sendKeys("07400000000");
    }

    public void enterCompanyName() {
        this.company.sendKeys("07400000001");
    }
    public void enterAddress1() {
        this.address1.sendKeys("31 Street Road 1");
    }
    public void enterAddress2() {
        this.address2.sendKeys("Green Zone");
    }

    public void enterCity () {
        this.userCity.sendKeys("London");
}

    public void selectRegionOrState() {
        Select select = new Select(regionState);
        select.selectByVisibleText("Greater London");
    }

    public void enterZipOrPostCode () {
        this.postcode.sendKeys("SW1 4EG");

    }

        public void enterLoginName () {
        this.userLogin.sendKeys("loginName_000000003");

    }

    public void enterPassword () {
        this.password.sendKeys("Password_101");

    }

    public void confirmPassword () {
        this.confirmPassword.sendKeys("Password_101");

    }

    public void tickOnNoSubscribeNewsletter () {
        this.unSubscribenewsletter.click();

    }

    public void clickOnAgree () {
        this.agreeToTerms.click();

    }
    public void clickOnSubmit () {
        this.submitbtn.click();

}



}





