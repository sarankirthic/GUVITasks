//import java.util.Scanner;
//
//class AgeNotWithisRangeException extends Exception {
//    public AgeNotWithisRangeException(String message) {
//        super(message);
//    }
//}
//
//class NameNotValidException extends Exception {
//    public NameNotValidException(String message) {
//        super(message);
//    }
//}
//
//
//class Student {
//    private int rollNo;
//    private String name;
//    private int age;
//    private String Course;
//
//    Student (int rollNo, String name, int age, String course) {
//        this.rollNo = rollNo;
//        this.name = name;
//        this.age = age;
//        this.Course = course;
//    }
//
//    @Override
//    public String toString() {
//        return "[" + rollNo + ", " + name + ", " + age + ", " + Course + "]";
//    }
//}
//
//public class Question1 {
//    public static void validateAge(int age)
//    throws AgeNotWithisRangeException {
//        if (age < 15 || age > 21) {
//            throw new AgeNotWithisRangeException("Age must be between 21 and 15");
//        }
//    }
//
//    public static void validateName(String name)
//    throws NameNotValidException {
//        for (int i = 0; i< name.length(); i++) {
//            if (!Character.isLetter(name.charAt(i))) {
//                throw new NameNotValidException("Name must contain only letters");
//            }
//        }
//    }
//
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter roll no: ");
//        System.out.println("Enter name: ");
//        int rollNo = scanner.nextInt();
//        String name = scanner.nextLine();
//        System.out.println("Enter age: ");
//        System.out.println("Enter Course: ");
//        int age = scanner.nextInt();
//        String Course = scanner.nextLine();
//        try {
//            validateAge(age);
//            validateName(name);
//        } catch (AgeNotWithisRangeException | NameNotValidException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("Unable to process student details");
//            System.exit(0);
//        }
//
//        Student student = new Student(rollNo, name, age, Course);
//        System.out.println(student);
//    }
//}
