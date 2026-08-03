package NotificationSystem;


public class Client {

    public static void main(String[] args) {

        NotificationRepository repository = new NormalSave();

        NotificationSenderFactory factory = new NotificationSenderFactoryImpl();

        NotificationService service =
                new NotificationService(repository, factory);

        Notification notification = new TimeStampNotification(new SimpleNotification("This is Email "));

        service.sendAndSaveNotification(notification, "EMAIL");
    }
}