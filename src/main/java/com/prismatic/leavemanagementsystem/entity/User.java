package com.prismatic.leavemanagementsystem.entity;

import org.springframework.stereotype.Component;

@Component
public class User {

    private String emailAddress;

    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}