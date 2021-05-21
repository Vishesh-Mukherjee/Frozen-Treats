package com.gdgu.icecream.flavor;

public final class MangoIceCream implements IceCream {

    private String description = "MangoIceCream";
    private float cost = 189.99F;

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public float getCost() {
        return this.cost;
    }

}
