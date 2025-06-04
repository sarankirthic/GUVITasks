import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}

class Voter {
    private String votersId;
    private String name;
    private int age;

    public Voter(String votersId, String name, int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be greater than 18");
        }
        this.votersId = votersId;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "[" + votersId + ", " + name + ", " + age + "]";
    }
}

public class Question2 {
    public static void main(String[] args) {
        try {
            System.out.print("Enter voter's ID: \n");
            System.out.print("Enter voter's name: \n");
            System.out.print("Enter voter's age: \n");
            Scanner scanner = new Scanner(System.in);
            String votersId = scanner.nextLine();
            String name = scanner.nextLine();
            int age = scanner.nextInt();

            Voter voter = new Voter(votersId, name, age);
            System.out.println(voter);

            scanner.close();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Not processing voter");
        }
    }
}
