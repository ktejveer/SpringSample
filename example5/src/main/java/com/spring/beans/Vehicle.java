package com.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String vehicleName;

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String sayHello(){
        return "Hello welcome to the Spring World!!";
    }
}
