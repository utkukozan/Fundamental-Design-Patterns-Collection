public class Main {
    public static void main(String[] args)
    {
        Shape circle = new Circle();


        System.out.println("Circle with normal border");
        circle.draw();

        circle = new RedShapeDecorator(circle);
        System.out.println("\nCircle of red border");
        circle.draw();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
