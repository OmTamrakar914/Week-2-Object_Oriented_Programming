package com.practiceproblems.ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

public class EcommercePlatform {
    public static void calculateFinalPrice(List<Product> products) {
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = 0.0;

            if (product instanceof Taxable) {
                Taxable taxableProduct = (Taxable) product;
                tax = taxableProduct.calculateTax();
                System.out.println(taxableProduct.getTaxDetails());
            }

            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Product: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a list of products
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(101, "Laptop", 50000,25,7));
        products.add(new Clothing(202, "T-Shirt", 1000,15,5));
        products.add(new Groceries(303, "Rice", 500,20,3));

        // Calculate and print final prices
        calculateFinalPrice(products);
    }
}
