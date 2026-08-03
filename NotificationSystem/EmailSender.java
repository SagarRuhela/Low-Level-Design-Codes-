package NotificationSystem;

public class EmailSender implements NotificationSender {

    @Override
    public void sendNotification(Notification notification) {
        System.out.println("Sending Email: " + notification.getContext());
    }
}