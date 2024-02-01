package com.bharati.dairy.example24.services.interfaces;

import com.bharati.dairy.example24.model.Customer;

public interface IDemoService {
    void saveMessageDetails(Customer contact);

    Iterable<Customer> getAllContacts();
}
