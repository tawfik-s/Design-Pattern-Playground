package com.tawfeek.structural.composite;

public class VideoGame extends Product {

    public VideoGame(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
