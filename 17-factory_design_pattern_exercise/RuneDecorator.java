public class RuneDecorator extends Market{
    public Market market;
    public RuneDecorator(Market addRune){
        this.market = addRune;
        this.price = 25.00;
    }

    @Override
    public String getDescription() {
        return market.getDescription() + " with %15 Health Stealing";
    }

    @Override
    public double getPrice() {
        return (this.market.getPrice() + this.price);
    }
}
