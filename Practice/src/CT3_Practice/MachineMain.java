package CT3_Practice;

public abstract class Machine {
    protected int id;

    public Machine(int id) {
        this.id = id;
    }

    public abstract void start();
}

class Computer extends Machine {
    public Computer(int id) {
        super(id);
    }

    @Override
    public void start() {
        System.out.println("Computer " + id + " started.");
    }
}

class Printer extends Machine {
    public Printer(int id) {
        super(id);
    }

    @Override
    public void start() {
        System.out.println("Printer " + id + " started.");
    }
}

public class  MachineMain {
    public static void main(String[] args) {
        Machine comp = new Computer(1);
        Machine print = new Printer(2);

        comp.start();
        print.start();
    }
}
