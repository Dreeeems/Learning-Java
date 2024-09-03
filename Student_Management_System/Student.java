package Student_Management_System;

/**
 * Student
 */
public class Student {

    private String name;
    private String email;
    private int age;

    //Constructor

    public Student(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }
    // Methods
    public String getName(){
        return name;
    }
}