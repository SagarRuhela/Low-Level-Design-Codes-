package NotificationSystem;

public interface NotificationSenderFactory {
    public NotificationSender getSender(String type);
}
