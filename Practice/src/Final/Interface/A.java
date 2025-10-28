package Final.Interface;

interface Computable {
    int compute(int a, int b);
}
abstract class Processor {
    protected String id;
    public Processor(String id) {
        this.id = id;
    }
    public abstract void process();

    public void printId() {
        System.out.println("Processor ID: " + id);
    }
}

interface AdvancedComputable extends Computable {
    abstract int max(int a, int b);
}

class Adder extends Processor implements AdvancedComputable {
    public Adder(String id) {
        super(id);
    }

    public void process() {
        System.out.println("Processing addition");
    }

    public int compute(int a, int b) {
        process();
        return a + b;
    }

    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}

public class A {
}
