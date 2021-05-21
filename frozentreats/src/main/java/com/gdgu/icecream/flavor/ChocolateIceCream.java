package com.gdgu.icecream.flavor;

public final class ChocolateIceCream implements IceCream {

    private String description = "ChocolateIceCream";
    private float cost = 199.99F;

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public float getCost() {
        return this.cost;
    }

}
