package MId_Solve;

class Shape {
    protected String className = "Shape";
    String getClassName() {
        return className;
    }
}

class Rectangle extends Shape {
    double width, height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.className = "Rectangle";
    }
    protected double getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }
    @Override
    String getClassName() {
        return "Square";
    }
}