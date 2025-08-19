package CT1_Practice.Lab_Practice_Sheet;

public class Point {
    int x;
    int y;
    public double distance(Point p) {
        return Math.sqrt(Math.pow((x - p.x), 2) + Math.pow((y - p.y), 2));
    }
}
