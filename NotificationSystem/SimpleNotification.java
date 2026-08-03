package NotificationSystem;

public class SimpleNotification implements Notification{
    String text;
    @Override
    public String getContext() {
        return this.text;
    }

    public SimpleNotification(String text){
        this.text=text;
    }

}
