package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/niloymazumder/Documents/IdeaProjects/WebDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.any.do/");
        driver.findElement(By.xpath("//a[contains(@class,'get-started-btn')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Continue with Email or Apple')]")).click();
        driver.findElement(By.xpath("//input[contains(@placeholder,'your@email.com')]")).sendKeys("neeloy.mazumder29@gmail.com");
        driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
        driver.wait(5000);

        boolean password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).isDisplayed();
        System.out.println("Password row is visible: " + password);
    }
}

