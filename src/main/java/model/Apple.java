package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {

    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price,true);
        this.colour = colour;
    }
    @Override
    public double getDiscount(){
        if(colour.equals(Colour.RED)){
            return Discount.RED_APPLE_DISCOUNT;
        }
        else
            return 0;
    }
}
