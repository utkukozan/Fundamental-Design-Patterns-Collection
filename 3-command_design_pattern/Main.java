public class Main {
    public static void main(String[] args) {
        // The Command pattern encapsulates a code structure that performs user requests,
        // allowing them to be stored as objects and executed later.

        Stock stock = new Stock();

        Order buyOrder = new BuyStock(stock);
        Order sellOrder = new SellStock(stock);

        OrderList orderList = new OrderList();
        orderList.takeOrder(buyOrder);
        orderList.takeOrder(buyOrder);
        orderList.takeOrder(buyOrder);
        orderList.takeOrder(sellOrder);
        orderList.placeOrder();
    }
}
