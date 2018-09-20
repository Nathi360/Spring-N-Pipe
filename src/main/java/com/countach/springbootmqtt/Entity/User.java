package com.countach.springbootmqtt.Entity;

import java.math.BigDecimal;

public class User {

    private String username;
    private BigDecimal accessCode;

    public User(String username, BigDecimal accessCode) {
        this.username = username;
        this.accessCode = accessCode;
    }

    public String getUsername() {
        return username;
    }

    public BigDecimal getAccessCode() {
        return accessCode;
    }
}
