package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {
    private final String bun;
    private final int burgerPatties;
    private final String sauce;
    private final List<String> toppings;

    public static class BigMacBuilder {
        private String bun;
        private int burgerPatties;
        private String sauce;
        private List<String> toppings = new ArrayList<>();

        public BigMacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder burgerPatties(int burgerPatties) {
            this.burgerPatties = burgerPatties;
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder toppings(String topping) {
            toppings.add(topping);
            return this;
        }

        public BigMac build() {
            return new BigMac(bun, burgerPatties, sauce, toppings);
        }
    }

    private BigMac(String bun, int burgerPatties, String sauce, List<String> toppings) {
        this.bun = bun;
        this.burgerPatties = burgerPatties;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgerPatties() {
        return burgerPatties;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgerPatties=" + burgerPatties +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
