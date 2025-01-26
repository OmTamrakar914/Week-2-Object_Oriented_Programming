package com.practiceproblems.ecommerceplatform;

public class Electronics extends Product implements Taxable {
    //private attributes
    private double discount;
    private double tax;

     //Electronics constructor
     Electronics(int productId, String name, double price,double discount,double tax){
        super(productId,name,price);
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
      return ("The Tax on Electronics : "+tax);
    }
    public double displayFinalPrice(){
         double finalPrice = getPrice()+calculateTax()-calculateDiscount();
         return finalPrice;
    }
}
