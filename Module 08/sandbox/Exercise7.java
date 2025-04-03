package sandbox;

class Book {
    String title;

    // initializing
    Book(String title) {
        this.title = title;
    }

    // explain this
    @Override
    public String toString() {
        return "Book[ title='" + title + '\'' + ']';
    }

    @Override
    public boolean equals(Object obj) {
        Book book = null;
        if (obj instanceof Book) {
            book = (Book) obj;
        } else if (obj instanceof String) {
            book = new Book((String) obj);
        } else {
            return false;
        }
        return title.equals(book.title);
    }
}

public class Exercise7 {
    public static void main (String[] args){
    // put an array here to add books and their name
    Book[] books = new Book[5];
    books[0]=new Book("Book 1");
    books[1]=new Book("Book 2");
    books[2]=new Book("Book 1");
    books[3]=new Book("Book 4");
    books[4]=new Book("Book 5");

    for(
    Book book:books)
    {
        System.out.println(book);
    }

    // check if two books are equal
    System.out.println(books[0].equals(books[1]));System.out.println(books[0].equals(books[2]));
}
}
