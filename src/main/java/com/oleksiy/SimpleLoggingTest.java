package com.oleksiy;

import com.oleksiy.annotation.MyLoggingAnnotation;


public class SimpleLoggingTest {
    public static void main(String[] args) {

        System.out.println(printSomething("Hello!"));
    }

    @MyLoggingAnnotation
    private static String printSomething(String s) {
        return s;
    }

}
