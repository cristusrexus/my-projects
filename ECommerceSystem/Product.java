package Exercitii.ECommerceSystem;

public class Product {

    private String id;
    private String name;
    private double price;
    private int quantity;

    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Improved toString method for better readability
    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Price: $" + price + ", Stock: " + quantity;
    }

    public void reduceStock(int quantity) {
        this.quantity -= quantity;
    }
}
