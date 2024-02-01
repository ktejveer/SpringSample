package com.bharati.dairy.example23.model;

import lombok.Data;

@Data
public class Contact extends BaseEntity{
    private int contactId;
    private String name;
    private String mobileNumber;
    private String email;
    private String subject;
    private String message;
    private String status;
}
