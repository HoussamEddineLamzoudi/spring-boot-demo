package com.yamidev.springbootdemo.Dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public final class UserDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 0L;

    private int id;
    private String userId;
    private String username;
    private String email;
    private String password;
    private String encryptedPassword;
    private String emailVerifivationToken;
    private Boolean emailVerifivationStatus;

//    public UserDto(int id, String userId, String username, String email, String password, String encryptedPassword, String emailVerifivationToken, Boolean emailVerifivationStatus) {
//        this.id = id;
//        this.userId = userId;
//        this.username = username;
//        this.email = email;
//        this.password = password;
//        this.encryptedPassword = encryptedPassword;
//        this.emailVerifivationToken = emailVerifivationToken;
//        this.emailVerifivationStatus = emailVerifivationStatus;
//    }

    public UserDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public String getEmailVerifivationToken() {
        return emailVerifivationToken;
    }

    public void setEmailVerifivationToken(String emailVerifivationToken) {
        this.emailVerifivationToken = emailVerifivationToken;
    }

    public Boolean getEmailVerifivationStatus() {
        return emailVerifivationStatus;
    }

    public void setEmailVerifivationStatus(Boolean emailVerifivationStatus) {
        this.emailVerifivationStatus = emailVerifivationStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserDto userDto)) return false;
        return Objects.equals(id, userDto.id) && Objects.equals(userId, userDto.userId) && Objects.equals(username, userDto.username) && Objects.equals(email, userDto.email) && Objects.equals(password, userDto.password) && Objects.equals(encryptedPassword, userDto.encryptedPassword) && Objects.equals(emailVerifivationToken, userDto.emailVerifivationToken) && Objects.equals(emailVerifivationStatus, userDto.emailVerifivationStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, username, email, password, encryptedPassword, emailVerifivationToken, emailVerifivationStatus);
    }
}
