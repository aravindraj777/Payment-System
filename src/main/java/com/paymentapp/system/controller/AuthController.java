package com.paymentapp.system.controller;

import com.paymentapp.system.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    public ResponseEntity<?> login(@RequestBody User user){
        return  ResponseEntity.ok(HttpStatus.OK);
    }
}
