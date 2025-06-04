import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birthdate (yyyy-mm-dd) : ");

        String birthdate = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(birthdate);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);

        System.out.println("Your age is: " + age.getYears());
    }
}
