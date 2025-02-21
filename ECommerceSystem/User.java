package Exercitii.ECommerceSystem;

import java.util.Set;

public class User {
    private String username;
    private String password;
    private boolean loggedIn;
    private Set<String> purchasedProducts;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.loggedIn = false;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public Set<String> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(Set<String> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }
}
