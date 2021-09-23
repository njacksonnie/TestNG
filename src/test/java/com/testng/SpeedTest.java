package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class SpeedTest {

    public static void main(String[] args) throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver", "/Users/niloymazumder/Documents/IdeaProjects/WebDriver/chromedriver");
        WebDriver driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get("https://www.speedtest.net/");
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class=\"start-text\"]")).click();
//        Thread.sleep(60000);
        String z = driver.findElement(By.xpath("//*[contains(@class,'ping-speed')]")).getText();
//        Thread.sleep(2000);
        String x = driver.findElement(By.xpath("//*[contains(@class,'download-speed')]")).getText();
//        Thread.sleep(2000);
        String y = driver.findElement(By.xpath("//*[contains(@class,'upload-speed')]")).getText();
        System.out.println("Upload Speed: " + y);
//        Thread.sleep(2000);
        System.out.println("Ping is: " + z);
        System.out.println("Download Speed: " + x);

    }
}