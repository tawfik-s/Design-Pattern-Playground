package com.tawfeek.creational.factorymethod;

public class VeggieBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Veggie Burger prepare");
    }
}
