package Student_Management_System;
import java.util.ArrayList;

import  Student_Management_System.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alica", "alica.doe@gmail.com", 17);
        Student student2 = new Student("John", "John.doe@gmail.com", 21);
        Student student3 = new Student("Alex", "alex.doe@gmail.com", 19);
        ArrayList <Student> students =  new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        for(Student student : students){
            System.out.println(student.getName() + " is " + student.getAge() + " years old.");
        }
        
    }
}
