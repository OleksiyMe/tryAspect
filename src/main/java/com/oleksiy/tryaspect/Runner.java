package com.oleksiy.tryaspect;

import com.oleksiy.annotation.MyLoggingAnnotation;
import com.oleksiy.aspect.MyLoggingAspect;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        printSomething("Hello 123!");
    }

    @MyLoggingAnnotation
    private void printSomething(String s) {
        System.out.println(s);
    }
}
