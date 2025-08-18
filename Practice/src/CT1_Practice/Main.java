package CT1_Practice;

class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        s1.showInfo(); // ID: 1, Name: Alice
        s2.showInfo(); // ID: 2, Name: Bob
        s3.showInfo(); // ID: 3, Name: Charlie

        // Calling static method (no object needed)
        Student.showNextId(); // Next available ID: 4
    }
}
