package Problem2;

public class Demo {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        System.out.println("Before move: " + mp);
        mp.move();
        System.out.println("After move: " + mp);
    }
}