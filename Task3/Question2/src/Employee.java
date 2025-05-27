public class Employee implements Taxable {
    private int employeeId;
    private String name;
    private double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calculateTax() {
        return salary * incomeTax;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
    }
}
