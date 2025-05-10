import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;


public class Library {
    public static void main(String[] args) {
        // create a file
        File file = new File("bookList.txt");
        // arrayList to store books
        List<Book> bookList = loadBooks(file); // changed so you load a persisted list instad -Z
        // scanner for user input
        Scanner scanner = new Scanner(System.in);
        // declare the variable outside the do/while
        int x = 0;
        // do/while so that the program keeps running until the user selects to exit
        do {
            System.out.println(
                    // menu switch case options
                    "Menu: (1) Add a new Book (2) Remove a book by ISBN (3) Display all books (4) Search for a book by title (5) exit the program");
            // sets the user input for each switch case

            // This is for error handling for if the user enters something that is not a int 1-5 -Z
            String optionLine = scanner.nextLine();
            try {
                 x = Integer.parseInt(optionLine);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number between 1 and 5.");
                continue; 
            }

            // switch statement for the choices of the library
            switch (x) {
                // adding book
                case 1:
                    System.out.println("Enter Book genre: 'fiction' 'textbook' or 'book' ");
                    String genre = scanner.nextLine();

                    System.out.println("Enter Book Title: ");
                    String title = scanner.nextLine();

                    System.out.println("Enter Book Author: ");
                    String author = scanner.nextLine();

                    System.out.println("Enter Book Year: ");
                    int year;
                    // Error checking for year to make sure a num is the value -Z
                    try {
                        year = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Not a valid year. Book will not be added.");
                        break;
                    }

                    System.out.println("Enter Book ISBN: ");
                    String ISBN = scanner.nextLine();

                    // adds the option of genre for the subclasses
                    Book newBooks = addBook(genre, title, author, year, ISBN);
                    bookList.add(newBooks);
                    saveBooks(file, bookList); // Saving to a file -Z
                    System.out.println("Book added:");
                    newBooks.displayInfo();
                    break;

                // remove book

                case 2: // Cleaning up the code a bit -Z
                    System.out.println("Enter the ISBN of the book you wish to remove: ");
                    String removeISBN = scanner.nextLine();
                    boolean removed = false;
                    for (Iterator<Book> it = bookList.iterator(); it.hasNext();) {
                        Book book = it.next();
                        if (book.getISBN().equalsIgnoreCase(removeISBN)) {
                            it.remove();
                            removed = true;
                            System.out.println("Book removed: " + book);
                            saveBooks(file, bookList); // persist after removal
                            break;
                        }
                    }

                    // if its not removed then there was no book with that matching ISBN found
                    if (!removed) {
                        System.out.println("Book with ISBN " + removeISBN + " not found"); // Almost missed this but added spaces between the ISBN - Z
                    }
                    break;
                // display books sorted by either title or author
                case 3:
                    System.out.println("Would you like to sort by (1) title or (2) author ? ");
                    String sortLine = scanner.nextLine(); // I change this to a string so that to avoid Input Mismatch exception - Z
                    int choice;
                    try {
                        choice = Integer.parseInt(sortLine);
                    } catch (NumberFormatException e) {
                        System.out.println("Choose 1 or 2, your input was invalid.");
                        break;
                    }
                    if (choice == 1) {
                        // print sorted with comparable
                        Collections.sort(bookList);
                        System.out.println("Books sorted by title: ");

                    } else if (choice == 2) {
                        Collections.sort(bookList, Book.BY_AUTHOR); // This is how you sort by author, I added a static constant field in Book.java -Z
                        System.out.println("Books sorted by author: ");
                        // print alphabetically (DONT KNOW HOW TO DO THIS SO THAT IT ALLOWS FOR IT TO
                        // SORT BY AUTHOR)

                    } else {
                        System.out.println("Invalid Input");
                        break;
                    }
                    for (Book book : bookList) {
                        book.displayInfo();

                    }
                    break;
                case 4:
                    System.out.println("Enter book title you wish to search for: ");
                    String searchTitle = scanner.nextLine();
                    searchByTitle(bookList, searchTitle, 0, bookList.size() - 1);
                    break;

                case 5:
                    saveBooks(file, bookList);
                    System.out.println("Exit the program");
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } while (x != 5);
        scanner.close();
    }

    // recursion method (a method that calls a method in itself)
    public static void searchByTitle(List<Book> bookList, String searchForTitle, int startIndex, int endIndex) {
        // base case: there is no books to serch for
        if (bookList.isEmpty()) {
            System.out.println("There are no books in the list.");
            return;
        }

        // need to add recursion method
        // check book at the start
        Book startBook = bookList.get(startIndex);
        if (startBook.getTitle().equalsIgnoreCase(searchForTitle)) {
            System.out.println("Book " + searchForTitle + " was found");
            startBook.displayInfo();
            return;
        }
        // check for book at the end
        Book endBook = bookList.get(endIndex);
        if (endBook.getTitle().equalsIgnoreCase(searchForTitle)) {
            System.out.println("Book " + searchForTitle + " was found");
            endBook.displayInfo();
            return;
        }

        // base case: no book was found
        if (startIndex > endIndex) {
            System.out.println("No book with the title " + searchForTitle + " was found.");
            return;
        }

        // recursion seach again but narrow the window
        searchByTitle(bookList, searchForTitle, startIndex + 1, endIndex - 1);
    }

    public static Book addBook(String genre, String title, String author, int year,
            String ISBN) {
        // Pick the appropriate concrete class
        Book book;
        if ("fiction".equalsIgnoreCase(genre)) {
            book = new FictionBook(title, author, year, ISBN);
        } else if ("textbook".equalsIgnoreCase(genre)) {
            book = new Textbook(title, author, year, ISBN);
        } else {
            book = new Book(title, author, year, ISBN);
        }
        return book;
    }

    private static List<Book> loadBooks(File f) {
        List<Book> list = new ArrayList<>();
        if (!f.exists()) return list;
        try (Scanner in = new Scanner(f)) {
            while (in.hasNextLine()) {
                Book b = Book.parse(in.nextLine());
                if (b != null) list.add(b);
            }
        } catch (IOException e) {
            System.out.println("Could not read " + f.getName());
        }
        return list;
    }
    
    private static void saveBooks(File f, List<Book> list) {
        try (PrintWriter out = new PrintWriter(f)) {
            for (Book b : list) out.println(b.toFileString());
        } catch (IOException e) {
            System.out.println("Could not write " + f.getName());
        }
    }
}