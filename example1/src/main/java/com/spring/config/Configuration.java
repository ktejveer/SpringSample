package com.spring.config;

import com.spring.beans.Vehicle;
import org.springframework.context.annotation.Bean;
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setVehicleName("TVS SPORT");
        return veh;
    }

    @Bean
    String hello(){
        return "Hello Spring";
    }

    @Bean
    Integer num(){
        return 99;
    }
}
