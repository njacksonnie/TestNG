package com.testng;

import org.testng.annotations.Test;

public class InvocationCountTest {

    @Test(invocationCount = 10) // Number of times the test will be executed
    public void sum(){

        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }
}
