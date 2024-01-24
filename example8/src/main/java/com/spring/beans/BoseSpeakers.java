package com.spring.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class BoseSpeakers implements Speakers {
    @Override
    public String makeSound() {
        return "This is BOSE Speakers!";
    }
}
