public class RectangleFactory implements ShapeAbstractFactory{
    public Shape createShape() {
        return new Rectangle();
    }
}
