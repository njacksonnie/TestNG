package com.testng;

import org.testng.annotations.*;

public class TestNGBasics {

    // Pre-conditions annotation starts with @Before
    @BeforeSuite
    public void setUp() {

        System.out.println("Setup System Properties for Browser");
    }

    @BeforeTest
    public void launchBrowse() {

        System.out.println("Launching Browser");
    }

    @BeforeClass
    public void login() {

        System.out.println("Login Method");
    }

    @BeforeMethod
    public void enterURL() {

        System.out.println("Enter URL");
    }

    // Test cases starts with @Test
    @Test(priority = 1) // Priority will handle the test cases first
    public void googleTitle() {

        System.out.println("Google Title Test");
    }

    @Test
    public void searchTest(){

        System.out.println("Search Test");
    }

    @Test
    public void googleLogoTest(){

        System.out.println("Get Google Logo");
    }

    // Post-conditions starts with @After
    @AfterMethod
    public void logout() {

        System.out.println("Logout Method");
    }

    @AfterClass
    public void closeBrowse() {

        System.out.println("Close Browser");
    }

    @AfterTest
    public void deleteAllCookies() {

        System.out.println("Delete Cookies");
    }

    @AfterSuite
    public void generateTestReport() {

        System.out.println("Generate Test Report");
    }
}
