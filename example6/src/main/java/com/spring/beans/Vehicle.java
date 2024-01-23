package com.spring.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String vehicleName;

    @PostConstruct
    public void setName(){
        this.vehicleName = "TVS Sport";
    }

    @PreDestroy
    public void destroyVehicle(){
        System.out.println("Destroying Vehicle object!!");
    }

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
