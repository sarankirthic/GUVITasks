import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        int employeeID = scanner.nextInt();
        System.out.println("Enter Employee Name: ");
        String employeeName = scanner.next();
        System.out.println("Enter Employee Salary: ");
        double employeeSalary = scanner.nextDouble();

        Employee employee = new Employee(employeeID, employeeName, employeeSalary);
        System.out.println(employee);
        String employeeTax = String.format("%.2f", employee.calculateTax());
        System.out.println("Income Tax: " + employeeTax);

        System.out.println("Enter Product ID: ");
        int productID = scanner.nextInt();
        System.out.println("Enter Product Name: ");
        String productName = scanner.next();
        System.out.println("Enter Product Price: ");
        double productPrice = scanner.nextDouble();
        System.out.println("Enter Product Quantity: ");
        int productQuantity = scanner.nextInt();

        Product product = new Product(productID, productName, productPrice, productQuantity);
        System.out.println(product);
        String productTax = String.format("%.2f", product.calculateTax());
        System.out.println("Sales Tax for "+ product.getQuantity() + " quantity is " + productTax);
    }
}
