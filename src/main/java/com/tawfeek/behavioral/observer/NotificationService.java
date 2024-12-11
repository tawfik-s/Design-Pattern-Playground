package com.tawfeek.behavioral.observer;


import java.util.ArrayList;
import java.util.List;

//publisher
public class NotificationService {

    private final List<EmailMsgListener> customers;


    public NotificationService() {
        this.customers = new ArrayList<>();
    }

    public void subscribe(EmailMsgListener emailMsgListener) {
        customers.add(emailMsgListener);
    }

    public void unsubscribe(EmailMsgListener emailMsgListener) {
        customers.remove(emailMsgListener);
    }

    public void notifySubscribers() {
        customers.forEach(emailMsgListener -> emailMsgListener.update());
    }
}
