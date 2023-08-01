package solid_design_pattern.dependency_inversion;

public class DependencyInversionExample {
    public static void main(String[] args) {

        MessageService smsService = new MessageService(new SMSSender());
        MessageService emailService = new MessageService(new EmailSender());

        smsService.sendMessage("This is a SMS");
        emailService.sendMessage("This is an email");
    }
}

