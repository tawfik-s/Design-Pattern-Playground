package com.tawfeek.behavioral.strategy;

public class PaymentByPaypal implements PaymentStrategy {

    private String email;
    private String password;

    @Override
    public void collectPaymentDetails() {
        email = "<EMAIL>";
        password = "<PASSWORD>";
    }

    @Override
    public boolean validatePaymentDetails() {
        return false;
    }

    @Override
    public void pay(int amount) {
        System.out.println("paying "+amount+" using Paypal");
    }
}
