package com.spring.main;

import com.spring.beans.Person;
import com.spring.beans.Vehicle;
import com.spring.config.ConfigurationFile;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example7 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ConfigurationFile.class);
        var veh1 = context.getBean(Vehicle.class);
        var person = context.getBean(Person.class);
        System.out.println("Vehicle name : " +veh1.getVehicleName());
        System.out.println("Person Name : " + person.getPersonName());
        System.out.println("Person owns : " +person.getVehicle().getVehicleName());
    }
}
