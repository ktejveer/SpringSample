package com.bharati.dairy.example19.services;

import com.bharati.dairy.example19.services.interfaces.IDemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@Slf4j
@RequestScope
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
