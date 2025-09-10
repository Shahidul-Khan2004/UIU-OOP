package Mid_Practice;

public class Employee{
    public String name;
    private int employee_id; private double salary;
    // Write constructor to initialize name, employee
    // id and salary with this reference keyword;
    Employee(String name, int employee_id, double salary){
        this.name = name;
        this.employee_id = employee_id;
        this.salary = salary;
    }
    // Write getter method for salary;
    public double getSalary(){
        return this.salary;
    }
    // Write setter method for salary;
    public void setSalary(double salary){
        this.salary = salary;
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("Prof. Albert Einstein", 19, 2000.50 );
        System.out.println(e1.name);
    }
}
