
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner {
  public static void main(String[] arg) {
    Library library = new Library();
    ArrayList<Book> childrensBooks = library.getChildrensBooks();
    // Finds title of books that are L. Frank Baum
    String authorToFind = "L. Frank Baum";
    for (Book book : childrensBooks) {
      if (book.getAuthor().equals(authorToFind)) {
        System.out.println(book.getTitle());
      }
    }
    // Finds rating of book Sky Island
    String bookToFind = "Sky Island";
    double minimumRating = 0.0;
    for (Book book : childrensBooks) {
      if (book.getTitle().equals(bookToFind)) {
        minimumRating = book.getRating();
        break;
      }
    }
    System.out.println("Rating: " + minimumRating);
    // Finds books+authors with at least a rating of minimumRating
    for (Book book : childrensBooks) {
      if (book.getRating() >= minimumRating) {
        System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
      }
    }
  }
}