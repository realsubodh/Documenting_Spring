package in.coderarmy.notification;

public class smsService implements NotificationService{
    @Override
    public void sendNotification(){
        System.out.println("sms notification sent");
    }
}
