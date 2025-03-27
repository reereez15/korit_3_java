package ch13_abstraction.notification;

public class SMSNotification extends NotificationSystem{

    public SMSNotification(String message, int priority, String recipient, String sender) {
        super(message, priority, recipient, sender);
    }

    @Override
    public void send() {

    }

    @Override
    public void validateRecipient() {

    }

    @Override
    public void formatMessage() {

    }
}
