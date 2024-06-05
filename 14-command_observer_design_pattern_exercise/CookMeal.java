public class CookMeal implements ICommand {
    private Restaurant restaurant;

    public CookMeal(Restaurant restaurant)
    {
        this.restaurant = restaurant;
    }

    public void Execute()
    {
        restaurant.Cook();
    }
}
