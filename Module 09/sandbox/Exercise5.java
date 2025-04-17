package sandbox;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise5 {
    public static void main(String[] args) {
  // Create Array List
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Green Eggs and Ham", "Dr. Suess", 1960));
        books.add(new Book("The Lorax", "Dr. Suess", 1971));
        books.add(new Book("The Cat in the Hat", "Dr. Suess", 1957));


        //Sort Books by year 
        Collections.sort(books);

        // print sorted books
        for (Book book : books){
            System.out.println(book);
        }
}
    
}
