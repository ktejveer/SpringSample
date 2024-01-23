package com.spring.config;

import com.spring.beans.Vehicle;
import org.springframework.context.annotation.Bean;
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setVehicleName("XCD");
        return veh;
    }

    @Bean
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setVehicleName("TVS SPORT");
        return veh;
    }

    @Bean
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setVehicleName("Rider");
        return veh;
    }
}
