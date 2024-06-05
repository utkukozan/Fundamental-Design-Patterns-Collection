public class Courier implements ICommand, IObserver {
    private Restaurant restaurant;
    String name;
    Courier(String name, Restaurant restaurant){
        this.name = name;
        this.restaurant = restaurant;
    }

    public void Execute() {
        restaurant.Courier(name);
    }

    @Override
    public void sendNotification() {
        System.out.print("Courier was notified. In demo program, courier will be received this message: ");
        System.out.println("Go to the client's home to bring the food !");
    }
}
