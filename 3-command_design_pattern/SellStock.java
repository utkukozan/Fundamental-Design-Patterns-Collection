public class SellStock implements Order
{
    Stock sellStock = new Stock();
    public SellStock(Stock sellStock){
        this.sellStock = sellStock;
    }
    @Override
    public void execute()
    {
        sellStock.sell();
    }
}
