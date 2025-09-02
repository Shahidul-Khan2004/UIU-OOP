public class Sphere extends Shape3D{
    Sphere(int radius) {
        super(radius, radius, radius);
    }
    double volume() {
        return Math.PI * super.volume() * 4 / 3;
    }
    double surfaceArea() {
        return super.surfaceArea() * Math.PI / 3 * 2;
    }
}
