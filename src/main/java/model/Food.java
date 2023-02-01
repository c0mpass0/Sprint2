package model;


import model.constants.Colour;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;


    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getPositionPriceWithoutDiscount(){
        return amount*price;
    }

    @Override
    public double getDiscount(){
        return 0;
    }

}
