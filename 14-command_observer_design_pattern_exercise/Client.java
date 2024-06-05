public class Client implements IObserver {
    String userName;
    public Client(String userName) {
        this.userName = userName;
    }

    @Override
    public void sendNotification() {
        System.out.print("Client was notified. In demo program, client will be received this message: ");
        System.out.println("Your order is on its way !");
    }
}
