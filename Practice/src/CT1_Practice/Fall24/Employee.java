package CT1_Practice.Fall24;

public class Employee{
    public String name;
    //changed to public as private is not included in CT1 syllabus
    public int employee_id;
    public double salary;

    // Write constructor to initialize name, employee
    // id and salary with this reference keyword

    Employee (String name, int employee_id, double salary) {
        this.name = name;
        this.employee_id = employee_id;
        this.salary = salary;
    }

    // Write getter method for salary
    // not included in CT1 syllabus
    // Write setter method for salary
    // not included in CT1 syllabus
    public static void main(String[] args) {
        Employee e1 = new Employee("Prof. Albert Einstein", 19, 2000.50 );
        System.out.println(e1.name);
    }
}

