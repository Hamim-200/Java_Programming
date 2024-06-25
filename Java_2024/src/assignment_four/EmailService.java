package assignment_four;

public class EmailService extends MessagingService {

    @Override
    public void sendMessage() {
        System.out.println("Email Send");

    }

    @Override
    public void receiveMessage() {
        System.out.println("Email Received");
    }
}
