package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class firstTest {


    @Test
    public void firstTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://drivers//d//chromedriver.exe");

        //Creating an object of ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.manage().deleteAllCookies();


        //launching the specified URL
        //driver.navigate().to("https://www.google.com");
        //driver.navigate().to("https://www.automationteststore.com/");
        //driver.navigate().back();
        //driver.navigate().forward();
        //driver.navigate().refresh();
        driver.get("https://www.automationteststore.com");
       //System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl());
//        Assert.assertEquals(driver.getCurrentUrl(), "https://www.automationteststore.com/");
//        wait.until(ExpectedConditions.titleContains("A place to practice your automation skills!"));
//        WebElement facebookIcon = driver.findElement(By.cssSelector(".col-md-12.headerdetails a[title='Facebook']"));
//        wait.until(ExpectedConditions.visibilityOf(facebookIcon));
//        Assert.assertEquals(facebookIcon.getText(),"Facebook");
//        Assert.assertTrue( facebookIcon.getText().contains("Facebook"));
        //facebookIcon.click();
        /*WebElement ele = driver.findElement(By.cssSelector(".subnav > ul > li:nth-of-type(3) > a"));
        wait.until(ExpectedConditions.visibilityOf(ele));
        ele.click();*/

        List<WebElement> listMenu = driver.findElements(By.xpath("/html/body/div/div[1]/div[1]/section/nav/ul/li/a"));
        System.out.println("This is the Menu List: " +listMenu.get(3).getText() );
        listMenu.get(4).click();

/*
       List<WebElement> listMenu = driver.findElements(By.xpath("/html/body/div/div[1]/div[1]/section/nav/ul/li/a"));
        for(int i=0; i<=listMenu.size()-1; i++)
        {
            if(listMenu.get(i).getText().contains("Book"))
            {
                listMenu.get(2).click();
            }
            System.out.println("This is the Menu List: " +listMenu.get(i).getText() );
        }*/



        //driver.navigate().to("https://www.automationteststore.com/");
        //wait.until(ExpectedConditions.titleContains("A place to practice your automation skills!"));
//        WebElement CheckIfTwitIsDisplayed = driver.findElement(By.cssSelector(".col-md-12.headerdetails a[title='Twitter']"));
//        wait.until(ExpectedConditions.visibilityOf(CheckIfTwitIsDisplayed));
//        Assert.assertEquals(CheckIfTwitIsDisplayed.getText(),"Twitter");
//        CheckIfTwitIsDisplayed.click();
//        WebElement SeeIfLinkdinIsDisplayed = driver.findElement(By.cssSelector(".col-md-12.headerdetails a[title='Linkedin']"));
//        wait.until(ExpectedConditions.visibilityOf(SeeIfLinkdinIsDisplayed));
//        Assert.assertEquals(SeeIfLinkdinIsDisplayed.getText(),"Linkedin");
//        SeeIfLinkdinIsDisplayed.click();






        //string url = "driver(httpsutomationteststore.com");
       // wait.until(ExpectedConditions.titleContains("A place to practice your automation skills!"));
        //Assert.assertEquals(driver.getCurrentUrl(), "https://automationteststore.com/");
        //Assert.assertEquals(driver.getTitle(), "A place to practice your automation skills!");

        //Thread.sleep(2000);
        //driver.navigate().to("https://automationteststore.com/index.php?rt=product/category&path=68");
        //Thread.sleep(2000);
        //driver.navigate().back();
        //Thread.sleep(2000);
        //driver.findElement(By.id("customer_menu_top")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.linkText("Login or register")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.id("loginFrm_loginname")).sendKeys("selenium2022");
        //Thread.sleep(2000);
        //driver.findElement(By.id("loginFrm_password")).sendKeys("selenium2022");
        //driver.findElement(By.cssSelector("button[title='Login']")).click();
        //driver.findElement(By.cssSelector(".btn.btn-orange.pull-right")).click(); // continue button
        //driver.findElement(By.linkText("Logoff")).click();
        //driver.findElement(By.xpath("//form[@id='accountFrm']//button[@title='Continue']")).click();
        //driver.findElement(By.id("AccountFrm_firstname")).sendKeys("Buga");
        //driver.findElement(By.id("AccountFrm_lastname")).sendKeys("Man");
        //driver.findElement(By.id("AccountFrm_email")).sendKeys("soloadasong@mail.com");
        //driver.findElement(By.id("AccountFrm_telephone")).sendKeys("02097657852");
        //driver.findElement(By.id("AccountFrm_fax")).sendKeys("02089765785");
        //driver.findElement(By.id("AccountFrm_company")).sendKeys("Best Tester 2023");
        //driver.findElement(By.id("AccountFrm_address_1")).sendKeys("3 Faithful Lord house, Jesus road");
        //driver.findElement(By.id("AccountFrm_city")).sendKeys("London");
        //driver.findElement(By.xpath("//select[@id='AccountFrm_zone_id']/option[@value='3553']")).click();
        //driver.findElement(By.id("AccountFrm_postcode")).sendKeys("GJ23 3SO");
        //driver.findElement(By.id("AccountFrm_loginname")).sendKeys("bugaman101");
        //driver.findElement(By.id("AccountFrm_password")).sendKeys("Goodhasblessme");
        //driver.findElement(By.id("AccountFrm_confirm")).sendKeys("Goodhasblessme");
        //driver.findElement(By.id("AccountFrm_newsletter0")).click();
        //driver.findElement(By.id("AccountFrm_agree")).click();
        //driver.findElement(By.xpath("/html//form[@id='AccountFrm']//button[@title='Continue']")).click();
        //driver.findElement(By.linkText("Continue")).click();


        // to print to console
        //System.out.println("I am in the website home page");
        //System.out.println(" And I want to do automation magic");

       //driver.quit();



    }

}
