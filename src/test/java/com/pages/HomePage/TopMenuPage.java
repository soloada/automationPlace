package com.pages.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TopMenuPage {
    static WebDriver driver;
    WebDriverWait wait;

    @FindBy(css = ".logo > img[alt='Automation Test Store']")
    public WebElement coyLogo;

    @FindBy(css = ".menu_home")
    public WebElement subMenuHomeBtn;

    @FindBy(css = "#main_menu .menu_account .menu_text")
    public WebElement accountSubMenuOfHomeBtn;

    @FindBy(linkText= "Login or register")
    public WebElement loginOrRegister;

    @FindBy(css = "ul#main_menu_top  .menu_specials.top > .menu_text")
    public WebElement special;

    @FindBy(css = "#main_menu_top .menu_account .menu_text")
    public WebElement account;

    @FindBy(css = "ul#main_menu_top  .nobackground.top > .menu_text")
    public WebElement cart;

    @FindBy(css = "ul#main_menu_top  .menu_checkout.top > .menu_text")
    public WebElement checkout;

    public TopMenuPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnCompanyLogo() {
        coyLogo.click();
    }

    public boolean verifyCoyLogoIsDisplayed() {
        return this.coyLogo.isDisplayed();
    }

    public boolean verifyCoyLogoIsEnabled() {
        return this.coyLogo.isEnabled();
    }


    public void clickOnLoginOrRegister() {
        this.loginOrRegister.click();
    }

    @FindBy(css = "/html/body/div/div[1]/div[1]/section/nav/ul/li/a")
    public List<WebElement> topMenuElements;


    public boolean verifyLoginOrRegisterLinkIsDisplayed() {
        return this.loginOrRegister.isDisplayed();
    }

    public WebElement getSpecial() {
        return this.special;
    }

    public WebElement getAccount() {
        return this.account;
    }

    public WebElement getCart() {
        return this.cart;
    }

    public void clickCartBtn() {
        this.cart.click();
    }

    public WebElement getCheckout() {
        return this.checkout;
    }

    public void hoverOverHomeBtn() {
        Actions action = new Actions(driver);
        action.moveToElement(subMenuHomeBtn).perform();
    }

    public void clickAccountSubMenuOnHomeBtn() {
        accountSubMenuOfHomeBtn.click();
    }

    public void gotHomePage() {
        driver.get("https://www.automationteststore.com");
    }

    public String getHomeUrl() {
        return driver.getCurrentUrl();
    }

    public static String getHomeTitle() {
        return driver.getTitle();
    }


}


