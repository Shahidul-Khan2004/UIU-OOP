package Mid_Practice;

class Vehicle {
    void start(){
        System.out.println("Vehicle is starting");
    }
    final void move(){
        System.out.println("Vehicle is moving");
    }
}

class Cycle extends Vehicle {
    void pedal(){
        System.out.println("Pedal the cycle");
    }
}
class Bus extends Vehicle{
    void move(){
        System.out.println("Bus is moving");
    }
    void needFuel(){
        System.out.println("Bus needs fuel");
    }
    void start(){
        System.out.println("Bus is starting");
    }
}
public class VehicleTest{
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        bus.start();
        (Bus)bus.needFuel();
        Vehicle cycle = new Cycle();
        cycle.move();
        cycle.pedal();
    }
}