package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class For_Loop_Index {
    WebDriver driver;

    @Test
    public void For_Loop_Index() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://drivers//d//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,15);

        driver.get("https://automationteststore.com/");
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationteststore.com/");
        Assert.assertEquals(driver.getTitle(),"A place to practice your automation skills!");
        Assert.assertTrue(driver.findElement(By.cssSelector(".welcome_msg")).isDisplayed());

        String data = "FRAGRANCE";
        driver.findElement(By.linkText(data)).click();

        List<WebElement> list = driver.findElements(By.xpath("/html/body/div/div[2]/div/div/div/div/div[3]/div"));
        for (int i = 0; i<list.size(); i++) {
           System.out.println(list.get(i).getText());

           list.get(3).click(); //index method
                break;
            }

        driver.quit();
        }


    }


