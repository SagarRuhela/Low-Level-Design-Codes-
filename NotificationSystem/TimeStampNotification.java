package NotificationSystem;

public class TimeStampNotification implements NotificationDecorator{
    Notification notification;

     public TimeStampNotification(Notification notification){
         this.notification=notification;
     }
    @Override
    public String getContext() {
        return "TimeStamp : added Notification "+ notification.getContext();
    }
}
