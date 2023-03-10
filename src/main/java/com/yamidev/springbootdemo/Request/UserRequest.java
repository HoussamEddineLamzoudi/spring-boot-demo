package com.yamidev.springbootdemo.Request;

import java.util.Objects;

public class UserRequest {
    private String username;
    private String email;
    private String password;

//    public UserRequest(String username, String email, String password) {
//        this.username = username;
//        this.email = email;
//        this.password = password;
//    }

    public UserRequest() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserRequest that)) return false;
        return Objects.equals(username, that.username) && Objects.equals(email, that.email) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email, password);
    }
}

