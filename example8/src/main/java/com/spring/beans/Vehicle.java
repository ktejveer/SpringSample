package com.spring.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String vehicleName = "TVS SPORT";

    @Autowired
    private VehicleService vehicleService;
	
    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void playMusic(){
        vehicleService.playMusic();
    }

    public void rotate(){
        vehicleService.rotateTyres();
    }
}
