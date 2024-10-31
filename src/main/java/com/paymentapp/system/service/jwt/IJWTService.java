package com.paymentapp.system.service.jwt;

import com.paymentapp.system.entity.User;
import io.jsonwebtoken.Claims;

import io.jsonwebtoken.impl.lang.Function;
import org.springframework.security.core.userdetails.UserDetails;

public interface IJWTService {

    String extractUsername(String token);
    <T> T extractClaims(String token, Function<Claims,T> resolver);
    boolean isValid(String token, UserDetails userDetails);
    String generateToken(User user);

    <T> T extractClaims(String token, Function<Claims, T> resolver);

    boolean isTokenExpired(String token);
}
