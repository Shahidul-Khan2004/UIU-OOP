package CT3_Practice;

abstract class Animal{
    // instance variables
    String name, color;  double weight;

    // Constructors
    Animal(){ }

    Animal(String name, String color){
        this(name,color, 0.0);
    }

    Animal(String name, String color, double weight){  this.name = name;
        this.color = color;  this.weight = weight;
    }

    // Concrete methods
    public void eat(){
        System.out.println(name + " eats.");
    }
}


public class Main {
    public static void main(String[] args) {
        // Animal a = new Animal(); // Error: Cannot instantiate the abstract class
        Animal dog = new Dog("Buddy", "Brown", 30.0);
        dog.eat();
        dog.sound();
    }
}
