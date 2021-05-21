package com.gdgu.icecream;

import com.gdgu.icecream.flavor.ChocolateIceCream;
import com.gdgu.icecream.flavor.IceCream;
import com.gdgu.icecream.topping.ChocoChips;
import com.gdgu.icecream.topping.WhippedCream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    IceCream iceCream;

    @Test
    public void ChocolateIceCream_Test() {
        iceCream = new ChocolateIceCream();
        Assertions.assertEquals("ChocolateIceCream", iceCream.getDescription());
        Assertions.assertEquals(199.99F, iceCream.getCost());
    }

    @Test
    public void ChocolateIceCream_ChocoChips_Test() {
        iceCream = new ChocoChips(new ChocolateIceCream());
        Assertions.assertEquals("ChocolateIceCream + ChocoChips", iceCream.getDescription());
        Assertions.assertEquals(229.99F, iceCream.getCost());
    }

    @Test
    public void ChocoLateIceCream_ChocoChips_WhippedCream_Test() {
        iceCream = new WhippedCream(new ChocoChips(new ChocolateIceCream()));
        Assertions.assertEquals("ChocolateIceCream + ChocoChips + WhippedCream", iceCream.getDescription());
        Assertions.assertEquals(249.99F, iceCream.getCost());
    }
}
