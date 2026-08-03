package NotificationSystem;

public class NotificationSenderFactoryImpl implements NotificationSenderFactory{


    @Override
    public NotificationSender getSender(String type) {
        if(type.equals("SMS")){
            return new SmsSender();
        }
        else {
            return new EmailSender();
        }
    }
}
