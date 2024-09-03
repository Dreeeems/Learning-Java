package Student_Management_System;

/**
 * Student
 */
public class Student {

    private String name;
    private String email;
    private int age;
    private int id;

    //Constructor

    public Student(String name, String email, int age, int id){
        this.name = name;
        this.email = email;
        this.age = age;
        this.id = id;
    }
    // Methods
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    public int getAge(){
        return age;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;   
    }
    public void setEmail(String email){
        this.email = email;   
    }
    public void setAge(int age){
        this.age = age;   
    }
    public void setId(int id){
        this.id = id;   
    }
}