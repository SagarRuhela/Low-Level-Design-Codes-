package NotificationSystem;

public class NotificationService {

    private NotificationRepository notificationRepository;
    private NotificationSenderFactory notificationSenderFactory;

    public NotificationService(NotificationRepository notificationRepository,
                               NotificationSenderFactory notificationSenderFactory) {

        this.notificationRepository = notificationRepository;
        this.notificationSenderFactory = notificationSenderFactory;
    }

    public void sendAndSaveNotification(Notification notification, String type) {

        NotificationSender sender = notificationSenderFactory.getSender(type);

        sender.sendNotification(notification);

        notificationRepository.save(notification);
    }
}
