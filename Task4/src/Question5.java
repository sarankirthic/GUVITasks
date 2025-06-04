import java.util.Scanner;
import java.util.Stack;

class IntegerStack {
    private final Stack<Integer> numbers = new Stack<>();

    public void pushElement(int x) {
        numbers.push(x);
    }

    public int popElement() {
        return numbers.pop();
    }

    public boolean isEmpty() {
        return numbers.isEmpty();
    }

    public Stack<Integer> displayStack() {
        return numbers;
    }
}

public class Question5 {
    public static void main(String[] args) {
        IntegerStack numbers = new IntegerStack();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Push element");
            System.out.println("2. Pop element");
            System.out.println("3. Check stack is empty?");
            System.out.println("4. Display stack");
            System.out.println("5. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    numbers.pushElement(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Element poped: " + numbers.popElement());
                    break;
                case 3:
                    System.out.println(numbers.isEmpty());
                case 4:
                    System.out.println(numbers.displayStack());
                    break;
                case 5:
                    System.exit(0);
            }
        } while(choice != 5);
    }
}
