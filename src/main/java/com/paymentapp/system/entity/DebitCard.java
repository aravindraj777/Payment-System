package com.paymentapp.system.entity;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Entity
@Data
@DiscriminatorValue("DebitCard")
public class DebitCard extends Payments{

    private Long accountNumber;
    private String cardHolderName;
    private String expiryDate;
    private Integer ccv;
}
