package CT1_Practice.Lab_Practice_Sheet;

public class Rectangle {
    Point bottomLeft, topRight;
    Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }
    public boolean circleInsideRectangle(Circle R) {
        return R.center.y + R.radius < topRight.y && R.center.y + R.radius > bottomLeft.y && R.center.x + R.radius < topRight.x && R.center.x + R.radius > bottomLeft.x;
    }
    public boolean RectangleInsideRectangle(Rectangle R) {
        return R.topRight.x < topRight.x && R.topRight.y < topRight.y && R.bottomLeft.x > bottomLeft.x && R.bottomLeft.y > bottomLeft.y;
    }
}
