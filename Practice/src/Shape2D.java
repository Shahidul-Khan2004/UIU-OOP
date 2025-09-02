public class Shape2D {
    int length;
    int width;
    Shape2D(int length, int width) {
        this.length = length;
        this.width = width;
    }
    int area() {
        return length * width;
    }
    int perimeter() {
        return 2 * (length + width);
    }
}
