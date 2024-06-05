public class OrderBasedProduction implements Strategy {
    @Override
    public Mercedes produce() {
        return new Mercedes("Order-based Production");
    }
}
