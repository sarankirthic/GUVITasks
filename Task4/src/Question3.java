import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        List<String> weekNames = new ArrayList<>();
        weekNames.add("Sunday");
        weekNames.add("Monday");
        weekNames.add("Tuesday");
        weekNames.add("Wednesday");
        weekNames.add("Thursday");
        weekNames.add("Friday");
        weekNames.add("Saturday");

        try {
            System.out.println("Enter day position: ");
            Scanner scanner = new Scanner(System.in);
            int day = scanner.nextInt();

            System.out.println(weekNames.get(day));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid day position");
        }
    }
}
