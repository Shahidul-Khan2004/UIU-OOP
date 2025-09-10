package Mid_Practice;

public class Demo {
    public static void main(String[] args) {
        Figure[] f = new Figure[3];
        f[0] = new Square();
        f[1] = new Oval();
        f[2] = new Polygon();
        for (Figure figure : f) {
            figure.render();
        }
    }

}
class Figure {
    void render() {
        System.out.println("rendering...");
    }
}
class Square extends Figure {
    void render() {
        System.out.println("rendering square...");
    }
}
class Oval extends Figure {
    void render() {
        System.out.println("rendering oval...");
    }
}
class Polygon extends Figure {
    void render() {
        System.out.println("rendering polygon...");
    }
}