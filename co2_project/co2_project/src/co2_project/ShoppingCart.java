package co2_project;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ShoppingCart {
    
    static class Product {
        private String name;
        private double price;
        private String category;

        public Product(String name, double price, String category) {
            this.name = name;
            this.price = price;
            this.category = category;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public String getCategory() {
            return category;
        }

        @Override
        public String toString() {
            return "Product [name=" + name + ", price=" + price + ", category=" + category + "]";
        }
    }

    private class Cart {
        private List<Product> products = new ArrayList<>();

        public void addProduct(Product product) {
            products.add(product);
        }
        public void removeProduct(Product product) {
            products.remove(product);
        }

        public void displayProducts() {
            products.forEach(product -> System.out.println(product));
        }

        public double calculateTotal() {
            return products.stream()
                    .mapToDouble(Product::getPrice) // lambda expression
                    .sum();
        }

        public void filterProducts(Predicate<Product> condition) {
            products.stream()
                    .filter(condition)  
                    .forEach(product -> System.out.println(product));
        }
    }

    public void start() {
        Cart cart = new Cart();

        cart.addProduct(new Product("Laptop", 120000.00, "Electronics"));
        cart.addProduct(new Product("Shoes", 800.00, "Footwear"));
        cart.addProduct(new Product("Phone", 70000.00, "Electronics"));

        System.out.println("All Products:");
        cart.displayProducts();

        System.out.println("\nTotal Price: ₹" + cart.calculateTotal());

        System.out.println("\nFiltered Products (Category: Electronics):"); 
        cart.filterProducts(product -> product.getCategory().equals("Electronics"));
    }

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.start();
    }
}