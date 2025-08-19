package CT1_Practice.Lab_Practice_Sheet;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3,4);
        Circle c = new Circle(p1, 6);
        System.out.println(c.pointInsideCircle(p2));
        Circle c1 = new Circle(p1, 3);
        System.out.println(c.circleInsideCircle(c1));
    }
}
