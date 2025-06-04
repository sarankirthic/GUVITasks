import java.util.Arrays;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        System.out.println("Non empty string in the list:");
        for (String string : strings) {
            if(!string.isEmpty()) {
                System.out.println(string);
            }
        }
    }
}
