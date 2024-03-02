package com.fatih.blog.Blog.services;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.HashMap;

public interface  JwtService {
    String extractUserName(String token);
    String generateToken(UserDetails userDetail);
    boolean isTokenValid(String token,UserDetails userDetails );
    String generateRefreshToken(HashMap<String, Object> extractClaims, UserDetails user);
}
