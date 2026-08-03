package NotificationSystem;

import java.util.ArrayList;
import java.util.List;

public class NormalSave implements NotificationRepository{
    private List<Notification> notifications = new ArrayList<>();
    @Override
    public void save(Notification notification) {
        notifications.add(notification);
        System.out.println("Notification is saved successfully");
    }
}
