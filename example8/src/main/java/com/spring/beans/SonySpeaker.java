package com.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class SonySpeaker implements Speakers {
    @Override
    public String makeSound() {
        return "This is SONY Speakers!";
    }
}
