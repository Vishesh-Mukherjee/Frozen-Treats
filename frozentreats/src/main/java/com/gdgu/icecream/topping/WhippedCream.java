package com.gdgu.icecream.topping;

import com.gdgu.icecream.flavor.IceCream;

public final class WhippedCream implements ToppingDecorator{

    private IceCream iceCream;

    public WhippedCream(IceCream iceCream) {
        this.iceCream = iceCream;
    } 

    public String getDescription() {
        return iceCream.getDescription() + " + WhippedCream";
    }

    public float getCost() {
        return iceCream.getCost() + 20;
    }
    
}
