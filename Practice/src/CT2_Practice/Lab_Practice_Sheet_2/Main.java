package CT2_Practice.Lab_Practice_Sheet_2;

public class Main {
    public static void main(String[] args) {
        // ===== 2D SHAPES =====
        System.out.println("=== 2D Shapes ===");

        Rectangle rect = new Rectangle(4, 5);
        System.out.println("CT2_Practice.Lab_Practice_Sheet_2.Rectangle Area: " + rect.area());
        System.out.println("CT2_Practice.Lab_Practice_Sheet_2.Rectangle Perimeter: " + rect.perimeter());
        System.out.println("CT2_Practice.Lab_Practice_Sheet_2.Rectangle Diagonal: " + rect.diagonal());

        Circle circle = new Circle(7);
        System.out.println("\nCT2_Practice.Lab_Practice_Sheet_2.Circle Area: " + circle.area());
        System.out.println("CT2_Practice.Lab_Practice_Sheet_2.Circle Perimeter: " + circle.perimeter());

        Triangle triangle = new Triangle(4, 4);
        System.out.println("\nCT2_Practice.Lab_Practice_Sheet_2.Triangle Area: " + triangle.area());
        System.out.println("CT2_Practice.Lab_Practice_Sheet_2.Triangle Perimeter: " + triangle.perimeter());

        // ===== 3D SHAPES =====
        System.out.println("\n=== 3D Shapes ===");

        Cuboid cuboid = new Cuboid(2, 3, 4);
        System.out.println("CT2_Practice.Lab_Practice_Sheet_2.Cuboid Volume: " + cuboid.volume());
        System.out.println("CT2_Practice.Lab_Practice_Sheet_2.Cuboid Surface Area: " + cuboid.surfaceArea());

        Sphere sphere = new Sphere(5);
        System.out.println("\nCT2_Practice.Lab_Practice_Sheet_2.Sphere Volume: " + sphere.volume());
        System.out.println("CT2_Practice.Lab_Practice_Sheet_2.Sphere Surface Area: " + sphere.surfaceArea());

        // ===== POLYMORPHISM DEMO =====
        System.out.println("\n=== Polymorphism Demo ===");
        Shape2D[] shapes2D = {
                new Rectangle(6, 8),
                new Circle(10),
                new Triangle(5, 12)
        };

        for (Shape2D s : shapes2D) {
            System.out.println(s.getClass().getSimpleName() +
                    " -> Area: " + s.area() +
                    ", Perimeter: " + s.perimeter());
        }

        Shape3D[] shapes3D = {
                new Cuboid(3, 4, 5),
                new Sphere(6)
        };

        for (Shape3D s : shapes3D) {
            System.out.println(s.getClass().getSimpleName() +
                    " -> Volume: " + s.volume() +
                    ", Surface Area: " + s.surfaceArea());
        }
    }
}

