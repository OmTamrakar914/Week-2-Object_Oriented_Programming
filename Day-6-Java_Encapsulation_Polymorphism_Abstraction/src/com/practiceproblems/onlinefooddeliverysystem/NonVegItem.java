package com.practiceproblems.onlinefooddeliverysystem;

class NonVegItem extends FoodItem implements Discountable{
    private double discount;
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        discount=2;
    }

    @Override
    public double applyDiscount() {
        return (getPrice()*discount)/100;
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount % for non veg food :" + discount + "%");
    }

    @Override
    void calculateTotalPrice() {
        System.out.println("Total Price  :" +(getPrice()-applyDiscount()));
    }
}
