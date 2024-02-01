package com.bharati.dairy.example24.controllers;

import com.bharati.dairy.example24.model.Customer;
import com.bharati.dairy.example24.services.interfaces.IDemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class DemoController {

    @Autowired
    IDemoService demoService;

    @PostMapping("/saveCustomer")
    public String saveMessage(@RequestBody Customer customer){
        demoService.saveMessageDetails(customer);
        return "User Saved!";
    }

    @GetMapping("/getAllCustomer")
    public Iterable<Customer> getAllContact() throws Exception {
        Iterable<Customer> contactMessageList = demoService.getAllContacts();
        if(!contactMessageList.iterator().hasNext()){
            throw new Exception("No user found");
        }
        return contactMessageList;
    }

}
