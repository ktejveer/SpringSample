package com.spring.main;

import com.spring.beans.Vehicle;
import com.spring.config.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
        var vehicle = new Vehicle();
        vehicle.setVehicleName("XCD");
        System.out.println(vehicle.getVehicleName());

        var context = new AnnotationConfigApplicationContext(Configuration.class);
        var veh = context.getBean(Vehicle.class);
        System.out.println(veh.getVehicleName());

        var str = context.getBean(String.class);
        System.out.println(str);

        var num = context.getBean(Integer.class);
        System.out.println(num);
    }
}
