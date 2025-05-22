import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    String eid = "EMP1001";
    private int salary = 1000000;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println("#############################################");
        System.out.println("Employee ID: " + eid);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("#############################################");
    }

    // Constructor of Employee Class
    Employee(String name, int age, String eid, int salary) {
        super(name, age); // Super class to access the parent class constructor and assign value
        this.eid = eid;
        this.salary = salary;
    }
}

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the Employee : ");
        String name = scanner.nextLine();
        System.out.print("Enter the age of the Employee : ");
        int age = scanner.nextInt();
        System.out.println("Enter the employee ID : ");
        String eid = scanner.next();
        System.out.print("Enter the employee salary : ");
        int salary = scanner.nextInt();
        Employee employee = new Employee(name, age, eid, salary);

        employee.display();
    }
}
