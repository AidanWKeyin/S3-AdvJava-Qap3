package Problem4;

public class Circle extends Ellipse {

    public Circle(String name, double radius) {
        super(name, radius, radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * a;
    }

    @Override
    public double getArea() {
        return Math.PI * a * a;
    }

    @Override
    public void scale(double factor) {
        a *= factor; // a and b always equal, so just scale a
        b = a;
    }
}

