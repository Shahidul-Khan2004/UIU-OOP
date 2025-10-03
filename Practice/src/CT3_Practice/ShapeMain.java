package CT3_Practice;

abstract class Shape {
    public abstract double area();
}

interface Drawable {
    void draw();
}

class circle extends Shape implements Drawable {
    private final double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        circle circle = new circle(5.0);
        circle.draw();
        System.out.println("Area: " + circle.area());
    }
}
