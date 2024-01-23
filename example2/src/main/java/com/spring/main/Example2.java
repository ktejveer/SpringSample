package com.spring.main;

import com.spring.beans.Vehicle;
import com.spring.config.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Configuration.class);
        var veh1 = context.getBean("vehicle1", Vehicle.class);
        System.out.println(veh1.getVehicleName());

        var veh2 = context.getBean("vehicle2", Vehicle.class);
        System.out.println(veh2.getVehicleName());

        var veh3 = context.getBean("vehicle3", Vehicle.class);
        System.out.println(veh3.getVehicleName());
    }
}
