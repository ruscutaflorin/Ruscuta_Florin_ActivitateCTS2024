package cts.ruscuta.florin.g1095.observer;

public class SMSNotificationService implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("Am trimis notificare prin SMS!");
    }
}
