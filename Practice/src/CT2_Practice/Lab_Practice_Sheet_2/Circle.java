package CT2_Practice.Lab_Practice_Sheet_2;

public class Circle extends Shape2D {
    Circle(int radius) {
        super(radius, radius);
    }
    double area() {
        return Math.PI * super.area();
    }
    double perimeter() {
        return Math.PI * super.perimeter() / 2;
    }
}
