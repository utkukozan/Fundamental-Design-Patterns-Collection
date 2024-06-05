public class BuffDecorator extends Market {
    public Market market;
    public BuffDecorator(Market addBuff){
        this.market = addBuff;
        this.price = 40.00;
    }

    @Override
    public String getDescription() {
        return market.getDescription() + " with +200SP Magic Buff";
    }

    @Override
    public double getPrice() {
        return (this.market.getPrice() + this.price);
    }
}
