package CT3_Practice;

interface PrinteR {
    default void connect() {
        System.out.println("Printer connected");
    }
    void print();
    static void name() {
        System.out.println("This is a printer interface");
    }
}

class LaserPrinter implements PrinteR {
    @Override
    public void print() {
        System.out.println("LaserPrinter is printing...");
    }
}

public class Pr1nter {
    public static void main(String[] args) {
        PrinteR printer = new LaserPrinter();
        printer.connect();
        printer.print();
    }
}