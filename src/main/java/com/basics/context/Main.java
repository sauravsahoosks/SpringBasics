package com.basics.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        Doctor doctor=(Doctor)context.getBean("doctor");
        doctor.assist();
        System.out.println("Qualification of doctor is: "+doctor.getQualification());
        System.out.println("Qualification of doctor is: "+doctor.getNurse());
        System.out.println("Qualification of doctor is: "+doctor.getSpecialization());
        Staff manager=(Manager) context.getBean(Manager.class);
        manager.assist();

    }
}
