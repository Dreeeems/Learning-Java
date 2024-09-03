package Student_Management_System;
import  Student_Management_System.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alica", "alica.doe@gmail.com", 17);
        System.out.println(student1.getName() + " is " + student1.getAge() + " years old.");
    }
}
