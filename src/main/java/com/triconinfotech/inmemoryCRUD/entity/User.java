package com.triconinfotech.inmemoryCRUD.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;

@Component
public class User {
    private String userName;
    private String userEmail;
    private Long phoneNo;

    public User() {
    }

    public User(String userName, String userEmail, Long phoneNo) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.phoneNo = phoneNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userEmail=" + userEmail +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
