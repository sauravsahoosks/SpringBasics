package com.basics.aspectj;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.basics.aspectj.ShoppingCart.checkOut())")
    public void beforeLogger(){
        System.out.println("Before Logger");
    }
    @After("execution(* com.basics.aspectj.*.checkOut())")
    public void afterLogger(){
        System.out.println("After Logger");
    }
}
