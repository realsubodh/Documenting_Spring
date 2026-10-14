package in.coderarmy;

import in.coderarmy.notification.EmailService;

public class orderService {

    // creating a simple obj
    EmailService notification = new EmailService();

    public void placeOrder(){
        System.out.println("Customer order got placed.");
        notification.sendNotification();
    }


}

