package com.basics.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanConfigMain {

    public static void main(String args[]){
        System.out.println( "Hello World!" );
        ApplicationContext context= new AnnotationConfigApplicationContext(BeanConfig.class);

        Reception reception=(Reception) context.getBean(Reception.class);
        reception.assist();
        Manager manager=(Manager) context.getBean(Manager.class);
        manager.assist();
    }
}
