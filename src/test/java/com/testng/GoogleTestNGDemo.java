package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleTestNGDemo {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.co.in");
    }

    @Test(priority = 1, groups = "Display Test") // Priority will handle the test cases first
    public void googleTitleTest() {

        String title = driver.getTitle();
        System.out.println(title);
    }

    @Test(priority = 2, groups = "Display Test")
    public void googleLogoTest() {

        boolean value = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
        System.out.println(value);
    }

    @Test
    public void mailLinkTest() {

        boolean value2 = driver.findElement(By.xpath("//a[normalize-space()='Gmail']")).isDisplayed();
        System.out.println(value2);
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }

}