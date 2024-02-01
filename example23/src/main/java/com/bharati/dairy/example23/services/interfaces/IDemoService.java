package com.bharati.dairy.example23.services.interfaces;

import com.bharati.dairy.example23.model.Contact;

import java.util.List;

public interface IDemoService {
    void logServiceMethod();
    int saveMessageDetails(Contact contact);

    List<Contact> getAllContacts();
}
