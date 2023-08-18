package com.basics.aspectj;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointcutAspect {

    @Pointcut("execution(* com.basics.aspectj.*.getQuantity())")
    public void afterReturningPointcut(){

    }

    @AfterReturning(pointcut = "afterReturningPointcut()",returning = "retVal")
    public void afterReturning(int retVal){
        System.out.println("After Returning "+ retVal);
    }

}
