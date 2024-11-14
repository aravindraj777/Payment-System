package com.paymentapp.system.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@DiscriminatorValue("NetBanking")
@Entity
@EqualsAndHashCode(callSuper = true)
@Data
public class NetBanking extends Payments {

    private String bankName;
    private Long accountNumber;
    private String ifscCode;
}
