package com.basics.context;

import org.springframework.stereotype.Component;

//@Component
//Removed Just to show functionality of @Bean
public class Manager implements Staff{
    public void assist() {
        System.out.println("Manager is helping");
    }
}
