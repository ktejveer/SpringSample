package com.bharati.dairy.example23.services;

import com.bharati.dairy.example23.constants.BharatiDairtConstants;
import com.bharati.dairy.example23.model.Contact;
import com.bharati.dairy.example23.repository.ContactRepository;
import com.bharati.dairy.example23.services.interfaces.IDemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@ApplicationScope
@Service
public class DemoService implements IDemoService {


    @Autowired
    private ContactRepository contactRepository;


    @Override
    public void logServiceMethod() {
        log.info("This is DemoService logMethod");
        log.info("Instances created");
    }

    @Override
    public int saveMessageDetails(Contact contact) {
        contact.setStatus(BharatiDairtConstants.OPEN);
        contact.setCreatedBy(BharatiDairtConstants.ANONYMOUS);
        contact.setCreatedDate(LocalDateTime.now());
        int updatedRecordCount = contactRepository.saveContactMessage(contact);
        return updatedRecordCount;
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.getAllContacts();
    }


}
