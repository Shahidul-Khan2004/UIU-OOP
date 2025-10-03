package CT3_Practice;

abstract class vehicle{
    String name;
    vehicle(String name){
        this.name=name;
    }
}

class Car extends vehicle{
    Car(String name){
        super(name);
    }
}

class  Bike extends vehicle{
    Bike(String name){
        super(name);
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        vehicle v1 = new Car("BMW");
        vehicle v2 = new Bike("Ducati");

        System.out.println("Vehicle 1: " + v1.name);
        System.out.println("Vehicle 2: " + v2.name);
    }
}
