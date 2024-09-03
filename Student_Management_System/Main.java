/* This program was made by Dreeeems 
   Github page : https://github.com/Dreeeems
*/
package Student_Management_System;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
   static ArrayList <Student> students =  new ArrayList<Student>();
    static Boolean running =true;
   static Scanner  scanner  = new Scanner(System.in);
        public static void management(int response){
            // Switch will check the value of respone 
            switch (response) {

                //check all students
                case 1:
                for(Student student : students){
                    System.out.println("");
                    System.out.println(student.getName() + " is " + student.getAge() + " years old." +" id is: " + student.getId() +"and email is: " +student.getEmail() );
                }
                    break;
                    //create a new student
                case 2:
                System.out.println("Name");
               String name= scanner.next();
               System.out.println("Email");
               String email= scanner.next();
               System.out.println("Age");
               int age= scanner.nextInt();
               int id = students.size()+1;
                    Student newStudent = new Student(name,email,age,id);
                    students.add(newStudent);
                    break;
                    //delete a student
                case 3:
                System.out.println("Wich student need to be remove ? ");
                for(Student student : students){
                    System.out.println("");
                    System.out.println(student.getName() + " is " + student.getAge() + " years old." +" id is: " + student.getId() +"and email is: " +student.getEmail());
                    
                    
                }
                int res= scanner.nextInt();
                students.remove(res-1);
                    break;
                    //quit the program
                case 4:
                    running = false;
                    break;
                default:
                    break;
            }

            
        }
    public static void main(String[] args) {
        Student student1 = new Student("Alica", "alica.doe@gmail.com", 17,1);
        Student student2 = new Student("John", "John.doe@gmail.com", 21,2);
        Student student3 = new Student("Alex", "alex.doe@gmail.com", 19,3);
       
        students.add(student1);
        students.add(student2);
        students.add(student3);

        while (running) {
            System.out.println("");
            System.out.println("What do you want to do ?");
            System.out.println("Check all students : 1");
            System.out.println("Create student : 2");
            System.out.println("Delete student : 3");
            System.out.println("Quit : 4");
    
           
           int  response = scanner.nextInt();
           management(response);
        }
       
        
        
    }
}
