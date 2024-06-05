public class CustomProduction implements Strategy {
    @Override
    public Mercedes produce() {
        return new Mercedes("Custom Production");
    }
}
