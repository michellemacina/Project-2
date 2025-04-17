package sandbox;


public class Book implements Comparable<Book> {
    String title;
    String author;
    int year;

    // constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public int compareTo(Book other) {
        return this.year - other.year;
    }

    @Override
    public String toString(){
        return "Book{" + "Title='" + title + '\'' +
        ", Author=" + author + '\'' +
        ", Year=" + year + '}';
    }

}
