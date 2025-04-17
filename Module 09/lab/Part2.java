package lab;

import java.util.ArrayList;
import java.util.Collections;

public class Part2 {
        public static void main(String[] args) {
            // create array list with 4 movies
            ArrayList<Movie> movies = new ArrayList<>();
            movies.add(new Movie("Ice Age", 9));
            movies.add(new Movie("Despicable Me 4", 8));
            movies.add(new Movie("Snow White 2025", 1));
            movies.add(new Movie("The Brutalist", 10));
        
    
        // sort the list
        Collections.sort(movies);

        //print the List 
        for (Movie movie : movies){
            System.out.println(movie);
        }
    }
}

