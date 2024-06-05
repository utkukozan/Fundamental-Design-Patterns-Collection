public class Main {
    public static void main(String[] args) {
        //In this program, the restaurant will be received order from client, by the way, client will be added to notify list.
        //Restaurant will do orders(receiveorder,cookmeal,givecourier) with using Command Design Pattern
        //Courier will be added to notify list.
        //When givecourier order will be execute, client and courier will be notified at the same time using Observer Design Pattern
        Restaurant restorante = new Restaurant();

        Client client = new Client("utku");
        restorante.addPeople(client); //ADD CLIENT TO THE OBSERVER LIST

        ReceiveOrder receiveOrder = new ReceiveOrder(restorante,client.userName); //COMMAND 1
        CookMeal cookMeal = new CookMeal(restorante); //COMMAND 2
        Courier courierJohn = new Courier("John",restorante);  //COMMAND 3

        restorante.addPeople(courierJohn); //ADD COURIER TO THE OBSERVER LIST

        RestaurantControl restaurantControl = new RestaurantControl();
        restaurantControl.TakeOrder(receiveOrder);
        restaurantControl.TakeOrder(cookMeal);
        restaurantControl.TakeOrder(courierJohn);
        restaurantControl.PlaceOrders();
    }

}
