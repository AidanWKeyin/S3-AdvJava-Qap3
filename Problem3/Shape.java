package Problem3;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods for subclasses to implement
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return String.format("%s: Area = %.3f, Perimeter = %.3f", name, getArea(), getPerimeter());
    }
}
