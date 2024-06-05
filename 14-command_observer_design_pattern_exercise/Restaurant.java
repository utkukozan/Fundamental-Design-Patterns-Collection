public class Restaurant extends NotifyManager {
    public Restaurant() { }

    public void getOrder(String clientName)
    {
        System.out.println("Order from " + clientName + " will be received");
    }

    public void Cook()
    {
        System.out.println("The meal was cooked !");
    }

    public void Courier(String name)
    {
        System.out.println("The courier -> " + name + " is on his way to bring the food");
        NotifyObserver();
    }
}
