package com.parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestNG {

    WebDriver driver;

    @Test
    @Parameters({"url", "emailId"})
    public void yahooLoginTest(String url, String emailId){

        System.setProperty("webdriver.chrome.driver","/Users/niloymazumder/Documents/IdeaProjects/WebDriver/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);

        driver.get("https://in.yahoo.com");
        driver.findElement(By.xpath("//span[@class='_yb_jneyd _yb_fcnop']")).click();
        driver.findElement(By.id("login-username")).clear();
        driver.findElement(By.id("login-username")).sendKeys("test@yahoo.com");
        driver.findElement(By.id("login-signin")).click();
    }
}

