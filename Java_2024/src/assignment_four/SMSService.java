package assignment_four;

public class SMSService extends MessagingService {

    @Override
    public void sendMessage() {
        System.out.println("SMS Send");

    }

    @Override
    public void receiveMessage() {
        System.out.println("SMS Received");
    }

}
