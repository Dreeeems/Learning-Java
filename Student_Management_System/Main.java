package Student_Management_System;
import java.util.ArrayList;
import java.util.Scanner;

import  Student_Management_System.Student;

public class Main {

        public static void management(String response){
            
            switch (response) {
                case "1":
                    
                    break;
                case "2":
                    
                    break;
                case "3":
                    
                    break;
                case "4":
                    
                    break;
                default:
                    break;
            }

            
        }
    public static void main(String[] args) {
        Student student1 = new Student("Alica", "alica.doe@gmail.com", 17);
        Student student2 = new Student("John", "John.doe@gmail.com", 21);
        Student student3 = new Student("Alex", "alex.doe@gmail.com", 19);
        ArrayList <Student> students =  new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println("What do you want to do ?");
        System.out.println("Check all students : 1");
        System.out.println("Create student : 2");
        System.out.println("Delete student : 3");
        System.out.println("Quit : 4");

        Scanner  scanner  = new Scanner(System.in);
       int  response = scanner.nextInt();
        for(Student student : students){
            System.out.println(student.getName() + " is " + student.getAge() + " years old.");
        }
        
    }
}
