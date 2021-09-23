package com.testng;

import org.testng.annotations.Test;

public class TestNGFeatures {

    @Test
    public void loginTest(){

        System.out.println("Login Test");
    }

/*
    dependsOnMethods means this test totally depends on loginTest() Method
    condition is that if loginTest() is passed then homepageTest() will be considered
    if loginTest() is failed then homePageTest() will be ignored
*/

@Test(dependsOnMethods = "loginTest")
    public void homePageTest(){

        System.out.println("Home Page Test");
    }

/*
    @Test
    public void searchPageTest(){

        System.out.println("Login Test");
    }
*/
}
