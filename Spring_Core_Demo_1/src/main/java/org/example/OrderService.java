package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;

public class OrderService {

    NotificationService notificationService;

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public OrderService(){

    }

    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void placeOrder(){
        System.out.println("Order placed successfully!");
        notificationService.sendNotification ();
    }
}
