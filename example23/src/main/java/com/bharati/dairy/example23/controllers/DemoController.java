package com.bharati.dairy.example23.controllers;

import com.bharati.dairy.example23.model.Contact;
import com.bharati.dairy.example23.services.interfaces.IDemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class DemoController {

    @Autowired
    IDemoService demoService;

    @GetMapping("/logParams")
    public String logParameters(@RequestParam(required = false) String name){
        log.info("Name {}", name);
        demoService.logServiceMethod();
        return name;
    }

    @PostMapping("/saveMsg")
    public String saveMessage(@RequestBody Contact contact){
        int num = demoService.saveMessageDetails(contact);
        return num > 0 ? "Data Saved!": "Error!!";
    }

    @GetMapping("/getAllMessages")
    public List<Contact> getAllContact() throws Exception {
        List<Contact> contactMessageList = demoService.getAllContacts();
        if(contactMessageList.isEmpty()){
            throw new Exception("No record Found");
        }
        return contactMessageList;
    }

}
