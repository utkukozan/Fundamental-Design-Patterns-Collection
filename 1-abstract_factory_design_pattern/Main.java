public class Main {
    // In the Factory Method, a single object is created from a single family, while in the Abstract Factory, objects are created from different product families.
    // It is used when we need to work with multiple product families to abstract the client side with the product family.
    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.getShape(new RectangleFactory());
        ((Rectangle) rectangle).setWidth(13);
        ((Rectangle) rectangle).setHeight(5);

        Shape circle = ShapeFactory.getShape(new CircleFactory());
        ((Circle) circle).setRadius(4);

        System.out.println("Rectangle area: " + rectangle.getArea() + " and size: " + rectangle.getSize());
        System.out.println("Circle area: " + circle.getArea() + " and size: " + circle.getSize());
    }
}
