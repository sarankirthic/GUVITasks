import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class Question3 {
    public static void main(String[] args) {
        List<String> students = Arrays.asList(
                "Arun", "Akash", "Abi", "Anita", "Deeraj",
                "Khalid","Pooja", "Saran", "Tharun", "Zaahir");

        List<String> specialStudents = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Special Students: ");
        System.out.println(specialStudents);
    }
}
