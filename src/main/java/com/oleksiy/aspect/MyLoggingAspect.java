package com.oleksiy.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {
    Logger logger= LoggerFactory.getLogger(MyLoggingAspect.class);
    @Pointcut("@annotation(com.oleksiy.annotation.MyLoggingAnnotation)")
    //@Pointcut("execution(* com.oleksiy.tryaspect.Runner.printSomething(..))")
   // @Pointcut("execution(* com.oleksiy.tryaspect.Runner.*(..))")
    public void logIt(){};

    @Before("logIt()")
    public void doMyLogging(JoinPoint joinPoint){

        logger.warn("This AOP Logging is working for "+joinPoint.getSignature().toShortString());
    }
    @After("logIt()")
    public void doMyLoggingAfter(JoinPoint joinPoint){

        logger.warn("Method " +joinPoint.getSignature().toShortString() +" is done!");
    }


}
