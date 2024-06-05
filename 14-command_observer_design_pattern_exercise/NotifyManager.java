import java.util.ArrayList;
import java.util.List;

abstract class NotifyManager {
    private List<IObserver> notifiedPeople;

    public NotifyManager(){
        notifiedPeople = new ArrayList<IObserver>();
    }
    public void addPeople(IObserver observerUser){
        notifiedPeople.add(observerUser);
    }
    public void NotifyObserver()
    {
        notifiedPeople.forEach((n) -> n.sendNotification());
    }
}
