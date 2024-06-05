public class MeatProducts extends ContentDecorator {
    Pizza pizza;

    public MeatProducts(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + " with plenty of sausage, hot dog, and salami";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 4;
    }
}
