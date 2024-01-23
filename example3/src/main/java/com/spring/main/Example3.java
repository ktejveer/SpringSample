package com.spring.main;

import com.spring.beans.Vehicle;
import com.spring.config.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Configuration.class);
        var veh1 = context.getBean("vehicleOne", Vehicle.class);
        System.out.println(veh1.getVehicleName());

        var veh2 = context.getBean("vehicleTwo", Vehicle.class);
        System.out.println(veh2.getVehicleName());

        var veh3 = context.getBean("vehicleThree", Vehicle.class);
        System.out.println(veh3.getVehicleName());
    }
}
