// Complex Java Program Example
import java.util.*;

abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void displayInfo();
}

class Student extends Person {
    int rollNo;
    double marks;

    Student(String name, int age, int rollNo, double marks) {
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    void displayInfo() {
        System.out.println("Student: " + name + ", Age: " + age +
                           ", Roll No: " + rollNo + ", Marks: " + marks);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayInfo() {
        System.out.println("Teacher: " + name + ", Age: " + age +
                           ", Subject: " + subject);
    }
}

public class ManagementSystem {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Student("Adarsh", 20, 101, 89.5));
        people.add(new Student("Riya", 19, 102, 92.0));
        people.add(new Teacher("Mr. Sharma", 40, "Java Programming"));

        for (Person p : people) {
            p.displayInfo(); // Polymorphism in action
        }
    }
}
