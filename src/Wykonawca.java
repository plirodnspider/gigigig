package com.company;

public class Product {
    private String name;
    private double price;
    public boolean inCart;

    Product(String name, double price){
        this.name = name;
        this.price = price;
        inCart = false;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + " " + price + "zł";
    }
}

public class Client {
    private double total;

    Client() {
        this.total = 0;
    }

    public void addToCart(Product product){
        if(product.inCart == false) {
            total += product.getPrice();
            product.inCart = true;
        }
    }

    public void removeFromCart(Product product){
        if(product.inCart == true){
            total -= product.getPrice();
            product.inCart = false;
        }
    }

    public String toString() {
        return "do zapłaty: " + total;
    }
}







}
