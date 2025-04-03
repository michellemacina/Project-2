package sandbox;

class Notification{
    String message;

    Notification(String message){
        this.message = message;
    }

    void send(){
        System.out.println("Message Sending"+ message);
    }
}

class EmailNotification extends Notification{
    @Override
    void send(){
        System.out.println("Email Sending" + message);
    }
}
class SMSNotification extends Notification{
    @Override
    void send(){
        System.out.println("SMS Sending"+ message);
    }
}
class PushNotification extends Notification{
    @Override
    void send(){
        System.out.println("Push Sending" + message);
    }
}

public class ExerciseB {
    
}
