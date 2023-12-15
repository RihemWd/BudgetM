package main;

import java.sql.Connection;

import com.budgetm.controller.AuthController;
import com.budgetm.database.DbConnection;
import com.budgetm.service.AuthService;
import com.budgetm.view.AuthView;

public class Main {
    public static void main(String[] args) {
        // Call the connect method from DbConnection
        Connection connection = DbConnection.connect();

        // Check if the database connection is established
        if (isDatabaseConnected(connection)) {
            System.out.println("Database connection is established!");

            // Create instances of AuthService, AuthView, and AuthController
            AuthService authService = new AuthService();
            AuthView authView = new AuthView(); // Update class name
            AuthController authController = new AuthController(authService, authView); // Update parameter name

            // Use the AuthController to authenticate the user
            authController.authenticateUser();
        } else {
            System.out.println("Failed to establish a database connection.");
        }
    }

    // Method to check if the database connection is established
    private static boolean isDatabaseConnected(Connection connection) {
        return connection != null;
    }
}
