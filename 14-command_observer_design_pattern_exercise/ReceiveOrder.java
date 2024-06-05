public class ReceiveOrder implements ICommand {
    private Restaurant restaurant;
    String clientName;

    public ReceiveOrder(Restaurant restaurant,String clientName)
    {
        this.restaurant = restaurant;
        this.clientName = clientName;
    }

    public void Execute()
    {
        restaurant.getOrder(clientName);
    }
}
