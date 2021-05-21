package com.gdgu.icecream.topping;

import com.gdgu.icecream.flavor.IceCream;

public final class ChocoChips implements ToppingDecorator{

    private IceCream iceCream;

    public ChocoChips(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + " + ChocoChips";
    }

    public float getCost() {
        return iceCream.getCost() + 30;
    }
    
}
