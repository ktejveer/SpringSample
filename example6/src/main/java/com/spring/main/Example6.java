package com.spring.main;

import com.spring.beans.Vehicle;
import com.spring.config.ConfigurationFile;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example6 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ConfigurationFile.class);
        var veh1 = context.getBean(Vehicle.class);
        System.out.println(veh1.getVehicleName());
        System.out.println(veh1.sayHello());
        context.close();
    }
}
