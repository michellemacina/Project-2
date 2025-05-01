//create a main Book Class

import java.util.ArrayList;

class Book {
    // add fields to the Book Class
    String title;
    String author;
    int year;
    String ISBN;

    // constructor to initialize
    Book(String title, String author, int year, String ISBN) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.ISBN = ISBN;

    }

    // method to display the information
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("ISBN: " + ISBN);
    }
}

// Subclass Fictionbook
class FictionBook extends Book {

    FictionBook(String title, String author, int year, String ISBN) {
        super(title, author, year, ISBN);
    }

    // method to display the books and specify that its a FictionBook
    @Override
    void displayInfo() {
        System.out.println("Fiction Book: ");
        super.displayInfo();
    }
}

// Subclass Textbook
class Textbook extends Book {

    Textbook(String title, String author, int year, String ISBN) {
        super(title, author, year, ISBN);
    }

    // method to display the books and specify that its a Textbook
    @Override
    void displayInfo() {
        System.out.println("Textbook: ");
        super.displayInfo();
    }
}

public class Project2 {
    public static void main(String[] args) {
        // create and array list to store the books
        ArrayList<Book> books = new ArrayList<>();
        // loop for displaying books?
        // Display all books sorted by title or author.
        // add a book
        // remove a book by ISBN
        // Search for a book by title using a recursive search algorithm.

    }

}