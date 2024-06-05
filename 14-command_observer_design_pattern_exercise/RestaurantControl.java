import java.util.ArrayList;
import java.util.List;

public class RestaurantControl {
    private List<ICommand> orderCommands;

    public RestaurantControl()
    {
        orderCommands = new ArrayList<ICommand>();
    }

    public void TakeOrder(ICommand command)
    {
        orderCommands.add(command);
    }

    public void PlaceOrders()
    {
        for (int i =0; i<orderCommands.size();i++){
            orderCommands.get(i).Execute();
            ThreadSleepWaiting(1);
        }
        orderCommands.clear();
    }
    public static void ThreadSleepWaiting(int number){
        try
        {
            Thread.sleep(number * 1500);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
