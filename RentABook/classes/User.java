package RentABook.classes;

import java.util.ArrayList;

public class User {
   
   private String name ;
    private String lastName;
    private String email;
    private int id;
    private int rentId;
    private String books;
    public static ArrayList<User> userList = new ArrayList<>();
    //Constructor
    public User (String name, String lastName , String email , int id, int rentId,String books){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.id = id;
        this.rentId = rentId;
        this.books = books;
        updateUserList(this);
        
    }

    //Methods
    public static void displayUsers(){
      System.out.println("List of user");
      for(User user : userList){
         System.out.println(user.getName()+ " "+user.getLastName()+" "+user.getEmail()+" "+user.getRentId());
      }
    }


     public String getName(){
        return name;
     }

     public String getLastName(){
        return lastName;
     }




     public String getEmail(){
        return email;
     }

     public int getId(){
        return id;
     }

     public int getRentId(){
        return rentId;
     }

     public String getAllBook(){
        return books;
     }
       public void updateUserList(User user) {
        
        userList.add(user);
        System.out.println("User added");
    }





}
