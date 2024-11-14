package com.paymentapp.system.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@DiscriminatorValue("CreditCard")
@Entity
@EqualsAndHashCode(callSuper = false)
public class CreditCard extends Payments{

    private Long accountNumber;
    private String cardHolderName;
    private String expiryDate;
    private Integer ccv;
}
