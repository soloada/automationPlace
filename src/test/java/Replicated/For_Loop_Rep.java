package Replicated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class For_Loop_Rep {
    WebDriver driver;

    @Test
    public void ForLoop() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://drivers//d//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 15);

        driver.get("https://automationteststore.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationteststore.com/");
        Assert.assertEquals(driver.getTitle(), "A place to practice your automation skills!");
        Assert.assertTrue(driver.findElement(By.cssSelector(".welcome_msg")).isDisplayed());

        String data = "FRAGRANCE";
        driver.findElement(By.linkText(data)).click();

        List<WebElement> list = driver.findElements(By.xpath("/html/body/div/div[2]/div/div/div/div/div[3]/div"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getText());
            if (list.get(i).getText().contains("CK ONE SHOCK FOR HIM DEODORANT"))
                //list.get(3).click(); //index method
                list.get(i).click();
            break;
        }

        driver.quit();
    }

    @Test
    public void ForLoop2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://drivers//d//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 15);

        driver.get("https://automationteststore.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationteststore.com/");
        Assert.assertEquals(driver.getTitle(), "A place to practice your automation skills!");
        Assert.assertTrue(driver.findElement(By.linkText("MEN")).isDisplayed());
        String dataOutPut = "MEN";
        driver.findElement(By.linkText(dataOutPut)).click();

        List<WebElement> list = driver.findElements(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div"));
        for (int i = 0; i<list.size(); i++); {
        System.out.println(list.get(3).getText());
        if (list.get(3).getText().contains("MEN+CARE CLEAN COMFORT DEODORANT"));
        list.get(3).click();


        }
    }
}