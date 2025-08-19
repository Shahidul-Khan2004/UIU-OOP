package CT1_Practice.Lab_Practice_Sheet;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(0, 0);
        Point p1 = new Point(3,4);
        Point p2 = new Point(6,8);
        Circle c = new Circle(p1, 2);
        Rectangle r = new Rectangle(p, p2);
        System.out.println(r.circleInsideRectangle(c));
        System.out.println(r.RectangleInsideRectangle(new Rectangle(new Point(1,2), p1)));
    }
}
