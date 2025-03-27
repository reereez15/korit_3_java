package ch13_abstraction.notification;

public class NotificationMain {
    public static void main(String[] args) {
        EmailNotification emailNotification1 = new EmailNotification("가입 대기", 1,
                "user@example.com", "admin@test.com");
        emailNotification1.setPriority(8);

    }
}
