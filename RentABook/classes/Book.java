package RentABook.classes;

import java.util.ArrayList;

public class Book {
    private String name;
    private String author;
    private String date;
    private int id;

    private User rentedBy; 
    private int rentId; 
    private Boolean rented;

    public static ArrayList<Book> booksList = new ArrayList<>();  // Liste de tous les livres

    // constructor
    public Book(String name, String author, String date, int id) {
        this.name = name;
        this.author = author;
        this.date = date;
        this.id = id;
        this.rentedBy = null;
        this.rentId = this.id; 
        this.rented= false; 
        booksList.add(this);  
    }

    
    

    // Methods
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public User getRentedBy() {
        return rentedBy;
    }

    public int getRentId() {
        return rentId;
    }
    public Boolean isRented(){
        return rented;
    }


    

    public static void getBooksList() {
        for(Book book : booksList){
             System.out.println("Book : " +book.getId()   +" " +"Title : " +  book.getName()+" Author : "+book.getAuthor()+" Release date : "+book.getDate()+" "+ "Rented : "+ book.isRented());
        }
    }
}
