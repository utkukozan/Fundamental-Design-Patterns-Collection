import java.util.ArrayList;
import java.util.List;

public class OrderList
{
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }
    public void deleteOrder(Order order){
        orderList.remove(order);
    }
    public void placeOrder(){ // Bu fonksiyon, programı asıl çalıştıracak fonksiyondur.
        for (Order order : orderList){
            order.execute();
        }
    }
}
