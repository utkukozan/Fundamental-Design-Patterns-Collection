
public class Main {
    public static void main(String[] args) {
        MessageSender messageSender = new MessageSender();
        messageSender.addSubscriber(new Authorized());
        messageSender.addSubscriber(new Customer());
        messageSender.notifySubscribers();
    }
}
