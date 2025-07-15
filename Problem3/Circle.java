package Problem3;

public class Circle extends Ellipse {

    public Circle(String name, double radius) {
        super(name, radius, radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * a; // since a = b = radius
    }

    @Override
    public double getArea() {
        return Math.PI * a * a;
    }
}
