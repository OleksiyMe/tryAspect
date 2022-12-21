package com.oleksiy.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class MyLoggingAspect {
    Logger logger= LoggerFactory.getLogger(MyLoggingAspect.class);
    @Pointcut("@annotation(com.oleksiy.annotation.MyLoggingAnnotation )")
    public void logIt(){};

    @Before("logIt()")
    public void doMyLogging(){

        logger.warn("This AOP Logging is working! :)");

    }



}
