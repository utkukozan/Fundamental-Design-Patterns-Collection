public class SerialProduction implements Strategy {
    @Override
    public Mercedes produce() {
        return new Mercedes("Serial Production");
    }
}
