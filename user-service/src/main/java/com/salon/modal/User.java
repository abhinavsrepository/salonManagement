package com.salon.modal;

import java.time.LocalDateTime;

public class User {

    private String fullName;
    private String email;
    private String phone ;
    private  String role;
    private LocalDateTime createdAt;//for creation

    private LocalDateTime updateAt;//for updation

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    //no args constructor
    public User(){
    }

    public User(String fullName, String email, String role, String phone, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.fullName = fullName;
        this.email = email;
        this.role = role;
        this.phone = phone;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }
}
