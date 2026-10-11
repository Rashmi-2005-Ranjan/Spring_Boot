package org.example;

import org.example.notification.EmailService;
import org.example.notification.FakeEmailService;
import org.example.notification.NotificationService;

public class Main{
    public static void main(String[] args){
        NotificationService notificationService = new FakeEmailService ();
        OrderService orderService = new OrderService (  );
        orderService.setNotificationService ( notificationService );
        orderService.placeOrder ();
    }
}

// A class should ask what it needs and not build everything itself.