package com.budgetm.view;

import java.util.Scanner;

public class AuthView {

	private Scanner scanner;

    public AuthView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public String getInput(String prompt) {
        System.out.print(prompt + " ");
        return scanner.nextLine();
    }
}
