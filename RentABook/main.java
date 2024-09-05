package RentABook;
import RentABook.classes.User;
import java.util.Scanner;
import RentABook.classes.Book;

public class Main {
    public static Boolean  running = true;
    public static Scanner scanner = new Scanner(System.in);

     public static void handleChoice(String choice){
        switch(choice){
            case "1" :
            System.out.println("Name:");
            String name = scanner.nextLine();
            System.out.println("LastName:");
            String lastName = scanner.nextLine();
            System.out.println("Email :");
            String email = scanner.nextLine();
            System.out.println("Id:");
            int id = User.userList.size()+ 1;
            int rentId = User.userList.size() + 1;
            User newUser = new User(name,lastName,email,id,rentId,"");
            System.out.println("User created !");
            break;
            case "2" :
            User.displayUsers();
            break;
            case "3" :
            
            System.out.println("Title:");
            String title = scanner.nextLine();
            
            System.out.println("Author:");
            String author = scanner.nextLine();
            
            System.out.println("date:");
            String date = scanner.nextLine();
            int bookId = Book.booksList.size()+ 1;
            Book newBook = new Book(title, author,date,bookId);
            System.out.println("Book created:");
            break;
            case "4":
            Book.getBooksList();
            break;
            case "5" :
            break;
            case "6" :
            running = false;
            break;
            default : 
            break;
        }
    }


     public static void main(String[] args) {
    User user1 = new User("Alice","Cooper","alice.cooper@gmail.com",1,1,null);
    Book book1 = new Book("Java for Beginners", "John Doe", "2022", 101);
    
   
    
    while( running){
        System.out.println("What do you want to do ? ");
        System.out.println(" Create user 1");
        System.out.println("Check all users 2 ");
        System.out.println("Create book 3 ");
        System.out.println("Check all books");
        System.out.println("Rent 5 ");
        System.out.println("Quit 6");
        String choice = scanner.nextLine();
        handleChoice(choice);
    }
     }
}
