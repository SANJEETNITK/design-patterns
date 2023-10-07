package solid_design_pattern.dependency_inversion;

class SMSSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        // Code to send an SMS
        System.out.println("Sending SMS: " + message);
    }
}
