package com.tawfeek.structural.decorator;

public class WhatsAppDecorator extends BaseNotifierDecorator{
    public WhatsAppDecorator(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        String phoneNumber = "1237880"; //get from database;
        System.out.println("sending "+message +"by wattsapp on"+phoneNumber);
    }
}
