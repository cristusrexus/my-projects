package Exercitii.ECommerceSystem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ecommerce {

    private Map<String, User> users = new HashMap<>();
    private Map<String, Product> products = new HashMap<>();
    private Set<String> purchasedProducts = new HashSet<>();

    public void addUser(String username, String password) {
        // Added validation for empty username and password
        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            System.out.println("Username and password cannot be empty. Try again!");
            return;
        }
        // Ensured case-insensitive check for username
        if (!users.containsKey(username.toLowerCase())) {
            users.put(username.toLowerCase(), new User(username, password));
            System.out.println("User " + username + " added successfully.");
        } else {
            System.out.println("User " + username + " already exists! Try again!");
        }
    }

    public void deleteUser(String username) {
        // Ensured case-insensitive check for username
        if (users.containsKey(username.toLowerCase())) {
            users.remove(username.toLowerCase());
            System.out.println("User " + username + " removed successfully.");
        } else {
            System.out.println("User " + username + " does not exist.");
        }
    }

    public void login(String username, String password) {
        // Ensured case-insensitive check for username
        if (users.containsKey(username.toLowerCase())) {
            User user = users.get(username.toLowerCase());
            if (user != null && user.getPassword().equals(password)) {
                System.out.println("User " + username + " logged in successfully.");
                user.setLoggedIn(true);
            } else {
                System.out.println("Wrong password for user " + username);
            }
        } else {
            System.out.println("User " + username + " does not exist.");
        }
    }

    public void logout(String username) {
        // Ensured case-insensitive check for username
        if (users.containsKey(username.toLowerCase())) {
            User user = users.get(username.toLowerCase());
            if (user.isLoggedIn()) {
                System.out.println("User " + username + " logged out successfully.");
                user.setLoggedIn(false);
            } else {
                System.out.println("User " + username + " is not logged in.");
            }
        } else {
            System.out.println("User " + username + " does not exist.");
        }
    }

    public void addProduct(String id, String name, double price, int quantity) {
        // Added validation for empty or invalid product details
        if (id == null || id.isEmpty() || name == null || name.isEmpty() || price < 0 || quantity < 0) {
            System.out.println("Invalid product details. Try again!");
            return;
        }
        if (!products.containsKey(id)) {
            products.put(id, new Product(id, name, price, quantity));
            System.out.println("Product " + id + " added successfully.");
        } else {
            System.out.println("Product " + id + " already exists! Try again!");
        }
    }

    public void deleteProduct(String id) {
        if (products.containsKey(id)) {
            products.remove(id);
            System.out.println("Product " + id + " removed successfully.");
        } else {
            System.out.println("Product " + id + " does not exist.");
        }
    }

    public void listProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product p : products.values()) {
                System.out.println(p);
            }
        }
    }

    public void purchaseProduct(String username, String productId, int askedQuantity) {
        // Ensured case-insensitive check for username
        if (users.get(username.toLowerCase()) != null && users.get(username.toLowerCase()).isLoggedIn()) {
            if (products.containsKey(productId)) {
                Product product = products.get(productId);
                if (product.getQuantity() >= askedQuantity) {
                    System.out.println("The product " + product.getName() + " was purchased.");
                    product.reduceStock(askedQuantity);
                    purchasedProducts.add(productId);
                    users.get(username.toLowerCase()).setPurchasedProducts(purchasedProducts);
                } else {
                    System.out.println("Not enough stock of " + product.getName());
                }
            } else {
                System.out.println("Product " + productId + " not found");
            }
        } else {
            System.out.println("You have to login first!");
        }
    }
}
