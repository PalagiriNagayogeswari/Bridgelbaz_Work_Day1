package com.bridgelabz_oops;

//association is a relationship where one class uses another class object.
class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
class Cart {
    Product[] products = new Product[10];
    int count = 0;

    void addProduct(Product p) {
        products[count++] = p;
    }

    void displayCart() {
        double total = 0;

        System.out.println("Cart Items:");

        for (int i = 0; i < count; i++) {
            System.out.println(products[i].name +
                    " - ₹" + products[i].price);

            total += products[i].price;
        }

        System.out.println("Total = ₹" + total);
    }
}
class Order {
    int orderId;
    Cart cart;

    Order(int orderId, Cart cart) {
        this.orderId = orderId;
        this.cart = cart;
    }

    void placeOrder() {
        System.out.println("\nOrder ID: " + orderId);
        cart.displayCart();
        System.out.println("Order Placed Successfully!");
    }
}

public class OnlineShoppingCart {

    public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop", 50000);
        Product p2 = new Product(102, "Mouse", 1000);
        Product p3 = new Product(103, "Keyboard", 2000);

        Cart cart = new Cart();

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        Order order = new Order(1001, cart);

        order.placeOrder();
    }
}
