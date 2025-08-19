package CT1_Practice.Lab_Practice_Sheet;

public class BangladeshiFlag {
    Rectangle R;
    Circle C;

    public boolean isBalanced() {
        return R.bottomLeft.distance(R.topRight) / 2 == R.bottomLeft.distance(C.center) && R.circleInsideRectangle(C);
    }
}
