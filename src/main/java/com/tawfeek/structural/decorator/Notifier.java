package com.tawfeek.structural.decorator;

public class Notifier implements INotifier{
    private final String username;

    public Notifier(String username) {
        this.username = username;
    }

    @Override
    public void send(String message) {
        String email = "t.shalash1@gmail.com"; //get from database;
        System.out.println("sending message via email to "+email);
    }

    @Override
    public String getUsername() {
        return username;
    }
}
