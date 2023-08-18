package com.basics.aspectj;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkOut(){
        //Logging
        //Authentication and Authorization
        //Sanitize data
        System.out.println("Checkout method from shopping cart called");
    }
    public int getQuantity(){
        return 10;
    }
}
