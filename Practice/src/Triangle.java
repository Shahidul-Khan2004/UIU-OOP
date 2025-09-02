public class Triangle extends Shape2D {
    Triangle(int base, int height) {
        super(base, height);
    }
    double area() {
        return 0.5 * super.area();
    }
    double perimeter() {
        return super.perimeter() - super.length;
    }
}
