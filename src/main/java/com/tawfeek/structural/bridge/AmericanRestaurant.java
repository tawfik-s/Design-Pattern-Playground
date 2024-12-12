package com.tawfeek.structural.bridge;

public class AmericanRestaurant extends Restaurant {
    protected AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.setToppings("everything");
    }

    @Override
    void addToppings() {
        pizza.setSauce("super secret");
    }

    @Override
    void makeCrust() {
        pizza.setCrust("Thick");
    }
}
