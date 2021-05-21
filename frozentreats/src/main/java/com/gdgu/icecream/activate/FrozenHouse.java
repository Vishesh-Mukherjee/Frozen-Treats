package com.gdgu.icecream.activate;

import com.gdgu.icecream.flavor.ChocolateIceCream;
import com.gdgu.icecream.flavor.IceCream;
import com.gdgu.icecream.flavor.MangoIceCream;
import com.gdgu.icecream.flavor.VanillaIceCream;
import com.gdgu.icecream.topping.ChocoChips;
import com.gdgu.icecream.topping.WhippedCream;

public class FrozenHouse {
    public static void main(String args[]) {
        // Possible Combinations
        // ChocoIceCream
        // MangoIceCream
        // VanillaCream
        // ChocoIceCream + WhippedCream
        // MangoIceCream + WhippedCream
        // VanillaIceCream + WhippedCream
        // ChocoIceCream + WhippedCream + ChocoChips
        // MangoIceCream + WhippedCream + ChocoChips
        // VanillaIceCream + WhippedCream + ChocoChips

        IceCream order1 = new ChocolateIceCream();
        System.out.println(order1.getDescription());
        System.out.println(order1.getCost());

        IceCream order2 = new ChocoChips(new VanillaIceCream());
        System.out.println(order2.getDescription());
        System.out.println(order2.getCost());

        IceCream order3 = new WhippedCream(new ChocoChips(new MangoIceCream()));
        System.out.println(order3.getDescription());
        System.out.println(order3.getCost());
    }
}
