package com.basics.context;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "singleton")
public class Reception implements Staff{

    private String telephone;

    @Override
    public String toString() {
        return "Reception{" +
                "telephone='" + telephone + '\'' +
                '}';
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public void assist() {
        System.out.println("Reception is assisting with room number");
    }
}
