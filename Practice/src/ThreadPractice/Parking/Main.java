package ThreadPractice.Parking;

class Car extends Thread {
    int id;
    Car(int id) {
        this.id = id;
    }
    @Override
    synchronized public void run() {

        System.out.println(this.getName() + " " + this.id + " trying to park");

        if (Main.AvailableSpots > 0) {
            Main.AvailableSpots--;
            System.out.println(this.getName() + " " + this.id + " parked Successfully");
        }
        else {
            System.out.println(this.getName() + " " + this.id + " didn't park Successfully");
        }
    }
}

public class Main {
    static int AvailableSpots;
    Main(int AvailableSpots) {
        this.AvailableSpots = AvailableSpots;
    }

    public static void main(String[] args) {
        new Main(2);
        Car c1 = new Car(1);
        Car c2 = new Car(2);
        Car c3 = new Car(3);
        Car c4 = new Car(4);
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        try {
            c1.join();
            c2.join();
            c3.join();
            c4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(AvailableSpots);
    }
}
