package com.practiceproblems.ecommerceplatform;

abstract class Product {
    private final int productId;
    private String name;
    private double price;

    //constructor
    Product(int productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    //abstract method
    abstract double  calculateDiscount();

    //getter
    public int getProductId() {
        return productId;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }
    //getter
    public String getName() {
        return name;
    }
    //setter
    public void setPrice(double price) {
        this.price = price;
    }
    //getter
    public double getPrice() {
        return price;
    }
}
