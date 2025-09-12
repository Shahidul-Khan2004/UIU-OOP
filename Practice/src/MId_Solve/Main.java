package MId_Solve;

public class Main {
    public static void main(String[] args) {
        Shape godel = new Shape();
        Shape escher = new Rectangle(2, 3);
        Rectangle bach = new Square(4);
        System.out.println("1: " + godel.getClassName());
        System.out.println("2: " + escher.getClassName());
        System.out.println("3: " + bach.getClassName());
        System.out.println("4: " + ((Shape) escher).getClassName());
        //System.out.println("5: " + ((Square) escher).getClassName());
        System.out.println("6: " + ((Square) bach).getClassName());
        Shape[] shapeArray = {godel, escher, bach};
        printTotalArea(shapeArray);
    }
    static void printTotalArea(Shape[] shapesArray) {
        double totalArea = 0;
        for (int i = 0; i < shapesArray.length; i++) {
            if (shapesArray[i].getClassName() == "Shape") continue;
            totalArea += ((Rectangle)shapesArray[i]).getArea();
        }
        System.out.println("Total area: " + totalArea);
    }
}
