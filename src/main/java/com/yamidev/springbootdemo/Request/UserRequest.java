package com.yamidev.springbootdemo.Request;

public record UserRequest (
        String username,
        String email,
        String password
){}

