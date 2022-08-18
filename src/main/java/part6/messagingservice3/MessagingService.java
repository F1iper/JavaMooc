package part6.messagingservice3;

import java.util.ArrayList;

public class MessagingService {
    
    ArrayList<Message> messages = new ArrayList<>();
    
    public MessagingService() {
    }
    
    public void add(Message message) {
        messages.add(message);
    }
    
    public ArrayList<Message> getMessages() {
        return messages;
    }
}
