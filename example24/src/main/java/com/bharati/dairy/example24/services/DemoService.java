package com.bharati.dairy.example24.services;

import com.bharati.dairy.example24.constants.BharatiDairtConstants;
import com.bharati.dairy.example24.model.Customer;
import com.bharati.dairy.example24.repository.CustomerRepository;
import com.bharati.dairy.example24.services.interfaces.IDemoService;
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
    private CustomerRepository contactRepository;

    @Override
    public void saveMessageDetails(Customer customer) {
        customer.setStatus(BharatiDairtConstants.OPEN);
        customer.setCreatedBy(BharatiDairtConstants.ANONYMOUS);
        customer.setCreatedDate(LocalDateTime.now());
        contactRepository.save(customer);
    }

    @Override
    public Iterable<Customer> getAllContacts() {

        return contactRepository.findAll();
    }
}
