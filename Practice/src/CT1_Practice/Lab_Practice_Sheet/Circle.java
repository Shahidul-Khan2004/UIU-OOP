package CT1_Practice.Lab_Practice_Sheet;

public class Circle {
    Point center;
    double radius;
    public boolean pointInsideCircle(Point p) {
        return center.distance(p) > radius;
    }

}
