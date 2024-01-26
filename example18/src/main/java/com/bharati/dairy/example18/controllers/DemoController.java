package com.bharati.dairy.example18.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@ResponseBody
public class DemoController {

    @RequestMapping("/logParams")
    public String logParameters(@RequestParam(required = false) String name){
        log.info("Name {}", name);
        return name;
    }

}
