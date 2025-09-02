package CT2_Practice.Lab_Practice_Sheet_2;

public class Rectangle extends Shape2D {
    Rectangle(int length, int width) {
        super(length, width);
    }
    double diagonal() {
        return Math.sqrt(length * length + width * width);
    }
}
