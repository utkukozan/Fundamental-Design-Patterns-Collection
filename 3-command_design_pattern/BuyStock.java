public class BuyStock implements Order
{
    Stock buyStock = new Stock();
    public BuyStock(Stock buyStock){
        this.buyStock = buyStock;
    }
    @Override
    public void execute()
    {
        buyStock.buy();
    }
}
