package lab;

public class Movie implements Comparable<Movie> {
    String title;
    int rating;

    // constructor
    public Movie(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    // implement compareTo() to sort by decending
    @Override
    public int compareTo(Movie other) {
        return other.rating - this.rating;

    }
    //to print the response 
    @Override
    public String toString(){
        return "Movie: " + title + " Rating: " + rating;
    }

}
