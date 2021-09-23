package com.testng;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

    @Test(timeOut = 2000, expectedExceptions = NumberFormatException.class)
    public void infiniteLoopTest() {

        int i = 1;
        while (true) {
            System.out.println(i);
        }
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void test(){

        String x = "100A";
        Integer.parseInt(x);
    }
}
