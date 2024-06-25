package assignment_four;

public class main {

    public static void main(String[] args) {
        EmailService e = new EmailService();
        SMSService s = new SMSService();

        e.sendMessage();
        s.sendMessage();

        e.receiveMessage();
        s.receiveMessage();

    }

}
