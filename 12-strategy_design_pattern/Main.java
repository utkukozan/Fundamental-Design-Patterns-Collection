public class Main {
    // Here we will use the Strategy Pattern to produce vehicles from a Mercedes factory based on the production type.
    // The Strategy class should be abstract or an interface to create strategies.
    public static void main(String[] args) {
        // Let's create instances of classes that implement the Strategy interface for production.
        SerialProduction serialProduction = new SerialProduction();
        CustomProduction customProduction = new CustomProduction();
        OrderBasedProduction orderBasedProduction = new OrderBasedProduction();
        
        // Let's create instances of the Producer class with different production strategies.
        Producer producer1 = new Producer(serialProduction);
        Producer producer2 = new Producer(customProduction);
        Producer producer3 = new Producer(orderBasedProduction);
    }
}
