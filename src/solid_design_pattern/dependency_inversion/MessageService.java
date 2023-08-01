package solid_design_pattern.dependency_inversion;

class MessageService {
    private MessageSender sender;

    public MessageService(MessageSender sender) {
        this.sender = sender;
    }

    public void sendMessage(String message) {
        sender.sendMessage(message);
    }
}
