package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMac() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("Regular")
                .burgerPatties(2)
                .sauce("bbq")
                .toppings("lettuce")
                .toppings("onion")
                .toppings("bacon")
                .toppings("cucumber")
                .toppings("peppers")
                .toppings("shrimp")
                .toppings("cheese")
                .toppings("mushrooms")
                .build();
        System.out.println(bigMac);

        //When
        int toppingsNumber = bigMac.getToppings().size();
        int pattiesNumber = bigMac.getBurgerPatties();

        //Then
        Assert.assertEquals(8, toppingsNumber);
        Assert.assertEquals(2, pattiesNumber);
    }
}
