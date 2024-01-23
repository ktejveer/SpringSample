package com.spring.config;

import com.spring.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@org.springframework.context.annotation.Configuration
public class
Configuration {

    @Bean(name = "vehicleOne")
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setVehicleName("XCD");
        return veh;
    }

    @Primary
    @Bean(value = "vehicleTwo")
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setVehicleName("TVS SPORT");
        return veh;
    }

    @Bean("vehicleThree")
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setVehicleName("Rider");
        return veh;
    }
}
