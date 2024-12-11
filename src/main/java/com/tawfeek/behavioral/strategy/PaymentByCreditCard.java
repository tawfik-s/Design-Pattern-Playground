package com.tawfeek.behavioral.strategy;

public class PaymentByCreditCard implements PaymentStrategy {
    private String cardNumber;

    @Override
    public void collectPaymentDetails() {
        cardNumber="2132345973248937";
    }

    @Override
    public boolean validatePaymentDetails() {
        return false;
    }

    @Override
    public void pay(int amount) {
        System.out.println("paying "+amount+" using Credit Card");
    }
}
