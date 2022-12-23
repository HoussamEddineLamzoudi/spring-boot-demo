package com.yamidev.springbootdemo.Response;

import java.io.Serializable;
import java.util.Objects;

public class UserResponse {
    private String username;
    private String email;

//    public UserResponse(String username, String email) {
//        this.username = username;
//        this.email = email;
//    }

    public UserResponse() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserResponse that)) return false;
        return Objects.equals(username, that.username) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email);
    }
}
