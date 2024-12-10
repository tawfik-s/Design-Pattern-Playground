package com.tawfeek.observer;

public class Store {
    private final NotificationService notificationService;

    public Store(){
        notificationService = new NotificationService();
    }

    public void newItemPromotion(){
        notificationService.notify();
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }
}
