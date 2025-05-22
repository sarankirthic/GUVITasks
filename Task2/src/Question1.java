class Person {
    String name;
    int age = 18; // Answer for part A

    public Person(String name) {
        this.name = name;
    }

    // Answer for part B
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Answer for part C
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Question1 {
    public static void main(String[] args) {
        // Takes in default age
        Person person1 = new Person("Saran");
        person1.display();

        // Assigns age and prints the same
        Person person2 = new Person("Saran", 23);
        person2.display();
    }
}
