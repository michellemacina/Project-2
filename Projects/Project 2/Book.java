import java.util.Comparator; // Author sorting here also here is a G4G link since I know prof showed you -Z: 
// https://www.geeksforgeeks.org/java-comparator-interface/

//create a main Book Class
class Book implements Comparable<Book>{
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

    // getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    // method to display the information
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("ISBN: " + ISBN);
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + year + "), ISBN: " + ISBN;
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.title.compareToIgnoreCase(otherBook.title);
    }
    public static final Comparator<Book> BY_AUTHOR = Comparator.comparing(Book::getAuthor, String.CASE_INSENSITIVE_ORDER).thenComparing(Book::getTitle,  String.CASE_INSENSITIVE_ORDER);
    // I know it's ugly to be on one line you can change this if you want, also naming convention here for BY_AUTHOR is bc it's final meaning it's a constant -Z

    
    // Convert this Book to file
    String toFileString() {
        return getClass().getSimpleName() + "|" + title + "|" + author + "|" + year + "|" + ISBN;
        // So I intially went with CSV then realized that books can have commas in the title or author's name -Z
    }

    // helper: reconstruct book from the file
    static Book parse(String line) {
        String[] p = line.split("\\|");
        if (p.length != 5)
            return null;
        String cls = p[0];
        String t = p[1];
        String a = p[2];
        int yr = Integer.parseInt(p[3]);
        String id = p[4];

        switch (cls) {
            case "FictionBook":
                return new FictionBook(t, a, yr, id);
            case "Textbook":
                return new Textbook(t, a, yr, id);
            default:
                return new Book(t, a, yr, id);
        }
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