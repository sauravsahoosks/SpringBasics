package com.basics.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[]){
        System.out.println( "Hello World!" );
        ApplicationContext context= new AnnotationConfigApplicationContext(BeanConfig.class);

        ShoppingCart shopCart=(ShoppingCart) context.getBean(ShoppingCart.class);
        shopCart.checkOut();
        System.out.println(shopCart.getQuantity());
        Mobile mobile=(Mobile) context.getBean(Mobile.class);
        System.out.println(mobile.getQuantity());
    }
}
