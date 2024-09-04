package RentABook.classes;

public class User {
   private String name ;
    private String lastName;
    private String email;
    private int id;
    private int rentId;
    private String books;

    //Constructor
    public User (String name, String lastName , String email , int id, int rentId,String books){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.id = id;
        this.rentId = rentId;
        this.books = books
    }

    //Methods

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


}
