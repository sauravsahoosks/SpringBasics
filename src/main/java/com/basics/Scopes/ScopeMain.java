package com.basics.Scopes;

import com.basics.context.BeanConfig;
import com.basics.context.Manager;
import com.basics.context.Reception;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeMain {
    public static void main(String args[]){
        System.out.println( "Hello World!" );
        ApplicationContext context= new AnnotationConfigApplicationContext(BeanConfig.class);

        Reception reception=(Reception) context.getBean(Reception.class);
        reception.setTelephone("Mobile");
        System.out.println(reception);
        Reception reception1=(Reception) context.getBean(Reception.class);

        System.out.println(reception1.hashCode()+"  "+reception.hashCode());
    }
}
