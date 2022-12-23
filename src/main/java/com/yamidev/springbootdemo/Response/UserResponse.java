package com.yamidev.springbootdemo.Response;

import java.io.Serializable;
import java.util.Objects;

public class UserResponse {
    private Integer id;
    private String username;
    private String email;

    public UserResponse(
            Integer id,
            String username,
            String email

    ) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public UserResponse() {
    }

    public Integer id() {
        return id;
    }

    public String username() {
        return username;
    }

    public String email() {
        return email;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (UserResponse) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.username, that.username) &&
                Objects.equals(this.email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, email);
    }

    @Override
    public String toString() {
        return "UserResponse[" +
                "id=" + id + ", " +
                "username=" + username + ", " +
                "email=" + email + ']';
    }
}
