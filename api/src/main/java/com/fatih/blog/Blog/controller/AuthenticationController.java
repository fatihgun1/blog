package com.fatih.blog.Blog.controller;

import com.fatih.blog.Blog.model.UserModel;
import com.fatih.blog.Blog.model.data.request.SignInRequest;
import com.fatih.blog.Blog.model.data.request.SignupRequest;
import com.fatih.blog.Blog.model.data.response.JwtAuthenticationResponse;
import com.fatih.blog.Blog.model.data.response.RefreshTokenRequest;
import com.fatih.blog.Blog.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthenticationController {
    @Autowired(required = true)
    private AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<UserModel> signup(@RequestBody SignupRequest signupRequest){
        return ResponseEntity.ok(authenticationService.signUp(signupRequest));
    }
    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signIn(@RequestBody SignInRequest signInRequest){
        return ResponseEntity.ok(authenticationService.signIn(signInRequest));
    }

    @PostMapping("/refresh")
    public ResponseEntity<JwtAuthenticationResponse> refresh(@RequestBody RefreshTokenRequest refreshTokenRequest){
        return ResponseEntity.ok(authenticationService.refreshToken(refreshTokenRequest));
    }

}