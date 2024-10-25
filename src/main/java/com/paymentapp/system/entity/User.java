package com.paymentapp.system.entity;

import jakarta.persistence.Entity;

@Entity
public class User {

    private Long id;
    private String name;
    private String email;
    private Long phoneNumber;
    private boolean isVerified;
}
