public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",78);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new PaypalStrategy("myemailadress@example.com", "mypwd"));
        cart.pay(new CreditCardStrategy("Bla Bla", "123456789", "123", "04/22"));
         
    }
}
