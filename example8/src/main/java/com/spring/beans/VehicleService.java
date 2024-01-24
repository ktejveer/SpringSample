package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {

    @Autowired
    private Tyres tyres;

    @Autowired
    private Speakers speakers;

    public void rotateTyres(){
        System.out.println(tyres.rotate());
    }

    public void playMusic(){
        System.out.println(speakers.makeSound());
    }

}
