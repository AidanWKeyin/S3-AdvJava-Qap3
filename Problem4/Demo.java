package Problem4;

public class Demo {

    // Static method to scale all Scalable objects in an array
    public static void scaleAll(Scalable[] shapes, double factor) {
        System.out.println("Before scaling:");
        for (Scalable s : shapes) {
            System.out.println(s);
        }

        for (Scalable s : shapes) {
            s.scale(factor);
        }

        System.out.println("\nAfter scaling by factor " + factor + ":");
        for (Scalable s : shapes) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Ellipse("Ellipse", 5, 3);
        shapes[1] = new Circle("Circle", 4);
        shapes[2] = new Triangle("Triangle", 3, 4, 5);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 6);
        shapes[4] = new Ellipse("Another Ellipse", 7, 2);

        scaleAll(shapes, 2.0);
    }
}

