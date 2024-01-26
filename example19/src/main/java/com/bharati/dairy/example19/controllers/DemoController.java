package com.bharati.dairy.example19.controllers;

import com.bharati.dairy.example19.services.interfaces.IDemoService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class DemoController {

    @Autowired
    IDemoService demoService;

    @GetMapping("/logParams")
    public String logParameters(@RequestParam(required = false) String name){
        log.info("Name {}", name);

        //Logic to call Demo Service
        demoService.logServiceMethod();
        return name;
    }

}
