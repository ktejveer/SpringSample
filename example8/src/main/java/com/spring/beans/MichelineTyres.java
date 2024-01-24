package com.spring.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MichelineTyres implements Tyres{
    @Override
    public String rotate() {
        return "Micheline Tyres Rotating!";
    }
}
