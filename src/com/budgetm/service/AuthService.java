package com.budgetm.service;

import com.budgetm.model.User;

public class AuthService {

    public String authenticate(String username, String password) {
        // Here, you would typically check the provided username and password against your database
        // For simplicity, let's assume a hardcoded user for demonstration purposes
        User user = new User();
        user.setUsername("demo");
        user.setPassword("password");

        if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
            return "Authentication successful!";
        } else {
            return "Authentication failed. Invalid username or password.";
        }
    }
}
