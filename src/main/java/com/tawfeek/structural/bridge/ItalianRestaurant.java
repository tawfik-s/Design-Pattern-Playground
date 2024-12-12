package com.tawfeek.structural.bridge;

public class ItalianRestaurant extends Restaurant {
    protected ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.setToppings("tomato");
    }

    @Override
    void addToppings() {
        pizza.setToppings(null);
    }

    @Override
    void makeCrust() {
        pizza.setCrust("thin");
    }
}
