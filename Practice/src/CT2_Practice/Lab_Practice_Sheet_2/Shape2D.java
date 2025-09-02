package CT2_Practice.Lab_Practice_Sheet_2;

public class Shape2D {
    int length;
    int width;
    Shape2D(int length, int width) {
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
    double perimeter() {
        return 2 * (length + width);
    }
}
