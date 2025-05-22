import java.util.Scanner;

class Product {
    String pid;
    private long price;
    private int quantity;

    public Product(String pid, long price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public long getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void display() {
        System.out.println("Displaying product details:");
        System.out.println("PID: " + pid);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

public class Question2 {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for 5 products:");
        System.out.println("Answer for Question A");
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter Product ID: ");
            String pid = scanner.next();
            System.out.println("Enter Product Price: ");
            long price = scanner.nextLong();
            System.out.println("Enter Product Quantity: ");
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        // Printing Product Details
        for ( Product product : products) {
            product.display();
        }

        System.out.println();
        System.out.println("Answer for Part B");
        findProductWithMaxPrice(products);

        System.out.println();
        System.out.println("Answer for Part C");
        totalAmount(products);
    }

    public static void findProductWithMaxPrice(Product[] products) {
        long max = 0;
        String pid = "";
        for (Product product : products) {
            long price = product.getPrice();
            if (max < price) {
                max = price;
                pid = product.pid;
            }
        }
        System.out.println("Product with maximum price is: " + pid);
    }

    public static void totalAmount(Product[] products) {
        long total = 0;
        for (Product product : products) {
            total += product.getPrice() * product.getQuantity();
        }
        System.out.println("Total amount is: " + total);
    }
}
