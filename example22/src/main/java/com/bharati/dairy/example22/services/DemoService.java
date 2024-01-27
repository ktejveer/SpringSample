package com.bharati.dairy.example22.services;

import com.bharati.dairy.example22.services.interfaces.IDemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.SessionScope;

@Slf4j
@ApplicationScope
@Service
public class DemoService implements IDemoService {

    private int instances = 0;

    public DemoService(){
        log.info("DemoService instance created!!");
    }

    @Override
    public void logServiceMethod() {
        log.info("This is DemoService logMethod");
        instances++;
        log.info("{} instances created", instances);
    }
}
