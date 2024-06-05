public class Vegetables extends ContentDecorator {
    Pizza pizza;

    public Vegetables(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + " with olives, peppers, mushrooms";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 4;
    }
}
