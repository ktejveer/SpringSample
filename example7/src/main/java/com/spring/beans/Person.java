package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String personName = "Rajendra Kumar";
    @Autowired
    private Vehicle vehicle;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
