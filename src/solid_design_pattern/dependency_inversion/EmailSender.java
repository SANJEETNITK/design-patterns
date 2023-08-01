package solid_design_pattern.dependency_inversion;

class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        // Code to send an email
        System.out.println("Sending email: " + message);
    }
}
