package Problem3;

public class Ellipse extends Shape {
    protected double a;  // major axis
    protected double b;  // minor axis

    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        // assign largest to a, smallest to b
        if (axis1 >= axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        // Using the formula: P = π * sqrt(2(a^2 + b^2) - ((a - b)^2)/2)
        return Math.PI * Math.sqrt(2 * (a * a + b * b) - ((a - b) * (a - b)) / 2);
    }
}

