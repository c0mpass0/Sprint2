package service;

import model.Food;

public class ShoppingCart {

    private final Food[] foods;

    public ShoppingCart(Food[] foods){
        this.foods = foods;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Food food : this.foods) {
            totalPrice += food.getPositionPriceWithoutDiscount();
        }
        return totalPrice;
    }

    public double getTotalPriceWithDiscount(){
        double totalPrice = 0;
        for (Food food : this.foods) {

            totalPrice += food.getPositionPriceWithoutDiscount() - (food.getPositionPriceWithoutDiscount()*food.getDiscount())/100;
        }
        return totalPrice;
    }

    public double getVegetarianTotalPriceWithoutDiscount(){
        double totalPrice =0;
        for (Food food : this.foods) {
            if(food.isVegetarian()){
            totalPrice += food.getPositionPriceWithoutDiscount();}
            else totalPrice += 0;
        }
        return totalPrice;
    }

}
