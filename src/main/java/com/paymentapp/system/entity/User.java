package com.paymentapp.system.entity;

import com.paymentapp.system.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String name;
    private String password;
    private String email;
    private Long phoneNumber;
    private boolean isVerified;

    @Enumerated(EnumType.STRING)
    private Role roles;

    private String otp;
    private LocalDateTime expiryTime;
}
