import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student {
    private HashMap<String,Integer> students = new HashMap<>();

    public void addStudent(String name, int grade) {
        students.put(name, grade);
    }

    public void removeStudent(String name) {
        students.remove(name);
    }

    public void displayStudents() {
        for (Map.Entry<String, Integer> student : students.entrySet()) {
            String studentName = student.getKey();
            int grade = student.getValue();
            System.out.println("Student Name: " + studentName + "\nGrade : " + grade);
        }
        if (students.isEmpty()) {
            System.out.println("No students in database.");
        }
    }
}

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        int choice;
        do {
            System.out.println("1. Do you want to add student?");
            System.out.println("2. Do you want to delete student?");
            System.out.println("3. Do you want to display student details?");
            System.out.println("4. Exit");
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter student name: ");
                    String addName = scanner.next();
                    System.out.println("Enter student grade: ");
                    int grade = scanner.nextInt();
                    student.addStudent(addName, grade);
                    break;
                case 2:
                    System.out.println("Enter student name: ");
                    String deleteName = scanner.next();
                    student.removeStudent(deleteName);
                    break;
                case 3:
                    student.displayStudents();
            }
        } while (choice != 4);
    }
}
