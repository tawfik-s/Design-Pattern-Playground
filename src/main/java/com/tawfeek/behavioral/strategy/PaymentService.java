package com.tawfeek.behavioral.strategy;

public class PaymentService {
    private int cost;
    private boolean includeDelivery;
    private PaymentStrategy paymentStrategy;

    public void processOrder() {
        paymentStrategy.collectPaymentDetails();
        if (paymentStrategy.validatePaymentDetails()) {
            paymentStrategy.pay(cost);
        }
    }

    private int getTotal() {
        return includeDelivery ? cost + 50 : cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setIncludeDelivery(boolean includeDelivery) {
        this.includeDelivery = includeDelivery;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.setPaymentStrategy(new PaymentByCreditCard());
        paymentService.processOrder();
    }


}
