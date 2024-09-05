package RentABook.classes;

public class Book {
    String name;
    String author;
    String date;
    int id;
    int userId;

    public Book(String name, String author,String date,int id, int userId){

        this.name = name;
        this.author = author;
        this.date = date;
        this.id = id;
        this.userId = id ;
    }
    
}