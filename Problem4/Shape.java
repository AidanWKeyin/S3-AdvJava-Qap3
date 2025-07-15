package Problem4;

public abstract class Shape implements Scalable {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    // Abstract scale method inherited from Scalable interface
    public abstract void scale(double factor);

    @Override
    public String toString() {
        return String.format("%s: Area = %.3f, Perimeter = %.3f", name, getArea(), getPerimeter());
    }
}

