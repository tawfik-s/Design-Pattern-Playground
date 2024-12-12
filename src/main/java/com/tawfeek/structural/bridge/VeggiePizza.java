package com.tawfeek.structural.bridge;

public class VeggiePizza extends Pizza {
    @Override
    public void assemble() {
        System.out.println("Adding Sauce: +sause ");
        System.out.println("Toppings: ");
        System.out.println("Adding Veggie Pizza ");
    }

    @Override
    public void qualityCheck() {
        System.out.println("curst is "+crust);
    }
}
