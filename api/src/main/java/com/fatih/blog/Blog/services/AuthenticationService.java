package com.fatih.blog.Blog.services;

import com.fatih.blog.Blog.model.UserModel;
import com.fatih.blog.Blog.model.data.request.SignInRequest;
import com.fatih.blog.Blog.model.data.request.SignupRequest;
import com.fatih.blog.Blog.model.data.response.JwtAuthenticationResponse;
import com.fatih.blog.Blog.model.data.response.RefreshTokenRequest;

public interface AuthenticationService {
    UserModel signUp(SignupRequest signupRequest);
    JwtAuthenticationResponse signIn(SignInRequest signupRequest);
    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}