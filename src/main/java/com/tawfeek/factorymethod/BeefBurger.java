package com.tawfeek.factorymethod;

public class BeefBurger implements Burger{
    @Override
    public void prepare() {
        System.out.print("prepare beef burger");
    }
}
