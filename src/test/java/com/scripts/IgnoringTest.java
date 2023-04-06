package com.scripts;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IgnoringTest {

    WebDriver driver;


    @Test
    public void Test1 () throws InterruptedException {

        System.out.println("Test1");


    }

    @Test @Ignore
    public void Test2 (){
        System.out.println("Test2");

    }

    @Test
    public void Test3 (){
        System.out.println("Test3");


    }

    @Test
    public void Test4 (){
        System.out.println("Test4");


    }

    @Test
    public void Test5 (){
        System.out.println("Test5");


    }
}
