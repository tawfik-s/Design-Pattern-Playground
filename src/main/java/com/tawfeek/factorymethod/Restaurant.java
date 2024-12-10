package com.tawfeek.factorymethod;

public abstract class Restaurant {

    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepare();
        System.out.println("Burger created");
        return burger;
    }

    public abstract Burger createBurger();

}
