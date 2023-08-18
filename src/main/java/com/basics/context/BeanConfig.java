package com.basics.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.basics.context")
public class BeanConfig {

    @Bean
    public Manager getManager(){
        return new Manager();
    }
}
