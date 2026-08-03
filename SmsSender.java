package NotificationSystem;

public class SmsSender implements NotificationSender {

    @Override
    public void sendNotification(Notification notification) {
        System.out.println("Sending SMS: " + notification.getContext());
    }
}