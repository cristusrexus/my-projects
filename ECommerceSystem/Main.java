package Exercitii.ECommerceSystem;

import java.util.Scanner;

public class Main {

    private static Ecommerce platform = new Ecommerce();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            showMenu();
            int choice = getIntInput(); // Added input validation for menu choice
            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    removeUser();
                    break;
                case 3:
                    loginUser();
                    break;
                case 4:
                    logoutUser();
                    break;
                case 5:
                    addAProduct();
                    break;
                case 6:
                    removeProduct();
                    break;
                case 7:
                    platform.listProducts();
                    break;
                case 8:
                    purchaseProduct();
                    break;
                case 9:
                    running = false;
                    System.out.println("Thank you for using the E-Commerce Platform. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nWelcome to the E-Commerce Platform!");
        System.out.println("1. Register a new user");
        System.out.println("2. Delete an existing user");
        System.out.println("3. Log in");
        System.out.println("4. Log out");
        System.out.println("5. Add a new product");
        System.out.println("6. Delete an existing product");
        System.out.println("7. List all products");
        System.out.println("8. Purchase a product");
        System.out.println("9. Exit");
        System.out.print("Please enter your choice (1-9): ");
    }

    // Added method for integer input validation
    private static int getIntInput() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void registerUser() {
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();
        platform.addUser(username, password);
    }

    private static void removeUser() {
        System.out.print("Enter username to delete: ");
        String username = scanner.next();
        platform.deleteUser(username);
    }

    private static void loginUser() {
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();
        platform.login(username, password);
    }

    private static void logoutUser() {
        System.out.print("Enter username: ");
        String username = scanner.next();
        platform.logout(username);
    }

    private static void addAProduct() {
        System.out.print("Enter product ID: ");
        String id = scanner.next();
        System.out.print("Enter product name: ");
        String name = scanner.next();
        System.out.print("Enter price: ");
        double price = getDoubleInput(); // Added input validation for price
        System.out.print("Enter stock quantity: ");
        int quantity = getIntInput();
        platform.addProduct(id, name, price, quantity);
    }

    // Added method for double input validation
    private static double getDoubleInput() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    private static void removeProduct() {
        System.out.print("Enter product ID to delete: ");
        String id = scanner.next();
        platform.deleteProduct(id);
    }

    private static void purchaseProduct() {
        System.out.print("Enter your username: ");
        String username = scanner.next();
        System.out.print("Enter product ID: ");
        String productId = scanner.next();
        System.out.print("Enter quantity: ");
        int quantity = getIntInput();
        platform.purchaseProduct(username, productId, quantity);
    }
}
