package ArrayListBasic;
import java.util.ArrayList;

class Book{
    String bookName, authorName, studentName, publisher;
    int quantityOfBook, studentId;
    public Book(int quantityOfBook, int studentId,
                String bookName, String authorName,
                String studentName, String publisher){
        this.quantityOfBook = quantityOfBook;
        this.studentId = studentId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.studentName = studentName;
        this.publisher = publisher;
    }
}

public class CreateYourOwnArrayList {
    public static void main(String [] args) {
        ArrayList<Book> bookName = new ArrayList<>();
        Book book1 = new Book(5, 102, "Software Engineering",
                "Mosh Hamedani", "Paul Lee", "Simon & Schuster");

        Book book2 = new Book(4, 601, "Harry Potter",
                "JK Rolling", "Mosh ", "HarperCollins");

        Book book3 = new Book(6, 102, "Discrete Mathematics",
                "George R. R. Martin", "Mike Dane", "Hachette Book Group");
        bookName.add(book1);
        bookName.add(book2);
        bookName.add(book3);

        for (Book b : bookName) {
            System.out.println(b.quantityOfBook + " " +b.studentId + " " +b.bookName +" "
                    +b.authorName + " " +b.studentName+ " " +b.publisher);
        }
    }
}
