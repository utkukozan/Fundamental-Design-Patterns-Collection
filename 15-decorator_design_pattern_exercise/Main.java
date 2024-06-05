public class Main {
    public static void main(String[] args) {
        Pizza pizza = new ThinCrust();
        System.out.println(pizza.getDesc() + " " + pizza.getPrice());
        pizza = new MeatProducts(pizza);
        System.out.println(pizza.getDesc() + " " + pizza.getPrice());
        pizza = new Cheese(pizza);
        System.out.println(pizza.getDesc() + " " + pizza.getPrice());
    }
}
