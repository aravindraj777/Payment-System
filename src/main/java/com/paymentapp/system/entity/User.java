package com.paymentapp.system.entity;

import com.paymentapp.system.enums.Role;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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


    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Payments> payments  = new ArrayList<>();
}
