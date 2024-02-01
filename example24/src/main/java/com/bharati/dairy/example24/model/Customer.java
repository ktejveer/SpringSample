package com.bharati.dairy.example24.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name="customer_data")
public class Customer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="customer_id")
    private int customerId;

    @Column(name="customer_code")
    private int customerCode;
    @Column(name = "customer_name")
    private String name;
    @Column(name = "mobile_number")
    private String mobileNumber;
    @Column(name = "customer_status")
    private String status;
}
