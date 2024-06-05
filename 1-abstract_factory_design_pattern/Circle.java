public class Circle implements Shape{
    private double radius;
    @Override
    public double getArea() {
        return 2;
    }

    @Override
    public double getSize() {
        return 5;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
