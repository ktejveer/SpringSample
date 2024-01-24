package com.spring.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {
    @Override
    public String rotate() {
        return "BridgeStone Tyres Rotating!";
    }
}
