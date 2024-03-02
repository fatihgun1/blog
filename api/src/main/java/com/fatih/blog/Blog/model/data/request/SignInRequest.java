package com.fatih.blog.Blog.model.data.request;

import lombok.Data;

@Data
public class SignInRequest {
    private String email;
    private String password;
}