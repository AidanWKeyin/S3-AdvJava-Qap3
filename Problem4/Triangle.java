package Problem4;

public class Triangle extends Shape {
    protected double side1, side2, side3;

    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        if (!isValidTriangle(side1, side2, side3)) {
            System.out.println("Error: The sides do not form a valid triangle.");
            System.exit(1);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private boolean isValidTriangle(double s1, double s2, double s3) {
        return (s1 + s2 > s3) && (s2 + s3 > s1) && (s3 + s1 > s2);
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}

