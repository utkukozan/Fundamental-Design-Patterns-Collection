public class CircleFactory implements ShapeAbstractFactory {
    public Shape createShape() {
        return new Circle();
    }
}
