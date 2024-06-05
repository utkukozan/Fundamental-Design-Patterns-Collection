public class Cheese extends ContentDecorator {
    Pizza pizza;

    public Cheese(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + " with extra cheese";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 3;
    }
}
