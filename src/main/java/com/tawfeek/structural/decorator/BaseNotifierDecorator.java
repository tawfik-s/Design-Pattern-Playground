package com.tawfeek.structural.decorator;

public class BaseNotifierDecorator implements INotifier {

    private final INotifier notifier;
    public BaseNotifierDecorator(INotifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        notifier.send(message);
    }

    @Override
    public String getUsername() {

        System.out.println("call database to get username");
        return "ADMIN";
    }
}
