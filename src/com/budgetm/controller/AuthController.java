package com.budgetm.controller;

import com.budgetm.service.AuthService;
import com.budgetm.view.AuthView;

public class AuthController {

	private AuthService authService;
    private AuthView authView;

    public AuthController(AuthService authService, AuthView authView) {
        this.authService = authService;
        this.authView = authView;
    }

    public void authenticateUser() {
        String username = authView.getInput("Enter username:");
        String password = authView.getInput("Enter password:");

        String result = authService.authenticate(username, password);

        authView.displayMessage(result);
    }
}
