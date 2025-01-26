package com.practiceproblems.ecommerceplatform;

public class Clothing extends Product implements Taxable{

    //private attributes
    private double discount;
    private double tax;

    //Constructor
    public Clothing(int productId, String name, double price,double discount, double tax) {
        super(productId, name, price);
        this.discount = discount;
        this.tax = tax;
    }

    @Override
    public double calculateDiscount() {
        return (getPrice()*discount)/100;
    }

    @Override
    public double calculateTax() {
        return (getPrice()*tax)/100;
    }

    @Override
    public String getTaxDetails() {
        return("The Tax on Clothing : "+tax);
    }
   //final price calculation
    public double displayFinalPrice(){
        double finalPrice = getPrice()+calculateTax()-calculateDiscount();
        return finalPrice;
    }
}
