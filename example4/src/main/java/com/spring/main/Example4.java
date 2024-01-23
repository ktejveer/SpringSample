package com.spring.main;

import com.spring.beans.Vehicle;
import com.spring.config.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Configuration.class);
        var veh1 = context.getBean(Vehicle.class);
        System.out.println(veh1.getVehicleName());
    }
}
