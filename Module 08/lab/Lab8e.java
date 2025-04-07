package lab;

//create superclass 
class Book {
    String title;
    String author;
    double price;
    boolean inStock;

    // parameterized constructor
    Book(String title, String author, double price, boolean inStock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.inStock = inStock;
    }
    // get and set for each field

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    // default constructor
    Book() {
        title = "N/A";
        author = "N/A";
        price = 0.0;
        inStock = true;
    }

    // method to print details
    void printDetails() {
        System.out.println("Title: " + title + "Author: " + author + "Price: " + price + "Is it in stock: " + inStock);
    }
}

// create Bookstore
class Bookstore {
    public static void main(String[] args) {
        // create an array
        Book[] bookstore = new Book[3];
        bookstore[0] = new Book("Pride and Prejudice", "Jane Austen", 20.00, true);
        bookstore[1] = new Book("The Outsiders", "S.E. Hinton", 10.00, true);
        bookstore[2] = new Book("The Adventures of Huckleberry Finn", "Mark Twain", 25.00, false);

        // modify one books price
        bookstore[1].setPrice(5.00);
        // set the books instock to false
        bookstore[1].setInStock(false);

        // call print details for each book (This works but a for loop is better)
        // bookstore[0].printDetails();
        // bookstore[1].printDetails();
        // bookstore[2].printDetails();
        // for loop is not capitalized!!
        for (Book book : bookstore) {
            book.printDetails();
        }

    }
}

// define a subclass Ebook
class Ebook extends Book {
    double fileSizeMB;

    // constructor for subclass
    Ebook(String title, String author, double price, boolean inStock, double fileSizeMB) {
        super(title, author, price, inStock);
        this.fileSizeMB = fileSizeMB;
    }

    // override to print details of it all including filesize
    @Override
    void printDetails() {
        super.printDetails();
        System.out.println("File Size MB: " + fileSizeMB);
    }
}

// define a subclass printed book that extends book
class Printedbook extends Book {
    double weightKg;

    // constructor for subclass
    Printedbook(String title, String author, double price, boolean inStock, double weightKg) {
        super(title, author, price, inStock);
        this.weightKg = weightKg;
    }

    // override print details to include subclass
    @Override
    void printDetails() {
        super.printDetails();
        System.out.println("Weight in kg: " + weightKg);
    }
}

public class Lab8e {
    public static void main(String[] args) {
        // create an array of both printed books and ebooks
        Book[] books = {
                new Ebook("To Kill a MockingBird", "Harper Lee", 25.00, false, 243),
                new Printedbook("Twelve Angry Men", "Reginald Rose", 2.50, true, 1.5),
                new Ebook("A Streetcar Named Desire", "Tennesee Williams", 15.50, true, 357),
                new Printedbook("Death on the Nile", "Agatha Christie", 30.00, false, 4.0)
        };
        // print out the details of the array
        // do not capitalize a for loop
        for (Book bookdetails : books) {
            bookdetails.printDetails();
        }
    }
}
