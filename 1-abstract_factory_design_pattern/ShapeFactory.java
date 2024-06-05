public class ShapeFactory {
        public static Shape getShape(ShapeAbstractFactory factory){
            return factory.createShape();
    }
}
