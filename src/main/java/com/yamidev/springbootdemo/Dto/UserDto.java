package com.yamidev.springbootdemo.Dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public final class UserDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 0L;
    private Integer id;
    private String userId;
    private String username;
    private String email;
    private String password;
    private String encryptedPassword;

    public UserDto(
            Integer id,
            String userId,
            String username,
            String email,
            String password,
            String encryptedPassword
    ) {
        this.id = id;
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.encryptedPassword = encryptedPassword;
    }

    public UserDto() {

    }

    public Integer id() {
        return id;
    }

    public String userId() {
        return userId;
    }

    public String username() {
        return username;
    }

    public String email() {
        return email;
    }

    public String password() {
        return password;
    }

    public String encryptedPassword() {
        return encryptedPassword;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (UserDto) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.userId, that.userId) &&
                Objects.equals(this.username, that.username) &&
                Objects.equals(this.email, that.email) &&
                Objects.equals(this.password, that.password) &&
                Objects.equals(this.encryptedPassword, that.encryptedPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, username, email, password, encryptedPassword);
    }

    @Override
    public String toString() {
        return "UserDto[" +
                "id=" + id + ", " +
                "userId=" + userId + ", " +
                "username=" + username + ", " +
                "email=" + email + ", " +
                "password=" + password + ", " +
                "encryptedPassword=" + encryptedPassword + ']';
    }

}
