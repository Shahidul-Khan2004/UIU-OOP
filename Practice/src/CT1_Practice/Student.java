package CT1_Practice;

public class Student {
    String name;          // instance variable
    int id;               // instance variable
    static int nextId = 1; // static variable, shared by all objects

    // Constructor
    public Student(String name) {
        this.name = name;
        this.id = nextId;  // assign current ID
        nextId++;          // prepare ID for the next student
    }

    // Instance method
    public void showInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    // Static method
    public static void showNextId() {
        System.out.println("Next available ID: " + nextId);
    }

}
