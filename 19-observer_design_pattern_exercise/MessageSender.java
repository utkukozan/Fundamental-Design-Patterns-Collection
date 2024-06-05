import java.util.ArrayList;

public class MessageSender {
    ArrayList<Subscribers> subscribers;
    
    public MessageSender() {
        this.subscribers = new ArrayList<Subscribers>();
    }
    
    public void addSubscriber(Subscribers subscriber) {
        subscribers.add(subscriber);
    }
    
    public void removeSubscriber(Subscribers subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        subscribers.forEach(Subscribers::update);
    }
}
