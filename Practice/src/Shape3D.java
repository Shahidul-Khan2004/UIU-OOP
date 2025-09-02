public class Shape3D extends Shape2D {
    int height;
    Shape3D (int length,int  width,int  height) {
        super(length, width);
        this.height = height;
    }
    double volume() {
        return height * super.area();
    }
    double surfaceArea() {
        return 2 * super.area() + height * super.perimeter();
    }
}
