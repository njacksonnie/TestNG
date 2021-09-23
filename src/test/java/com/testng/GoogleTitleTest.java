package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleTitleTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver","/Users/niloymazumder/Documents/IdeaProjects/WebDriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.co.in");
    }

    @Test // Priority will handle the test cases first
    public void googleTitleTest() {

        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Google", "Mismatched Title");
    }

    @Test
    public void googleLogoTest() {

        boolean value = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
        Assert.assertTrue(value, "Logo Mismatched");
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}
