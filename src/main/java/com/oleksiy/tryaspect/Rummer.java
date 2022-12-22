package com.oleksiy.tryaspect;

import com.oleksiy.annotation.MyLoggingAnnotation;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Rummer implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        printSomething("Hello!");
    }

    @MyLoggingAnnotation
    private void printSomething(String s) {
        System.out.println(s);
    }
}
