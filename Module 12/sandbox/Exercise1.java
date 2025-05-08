package sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        //create playllist 
        List<String> playList = new LinkedList();
        //adding songs to the list all at once 
        playList.addAll(Arrays.asList("Song A", "Song B", "Song C", "Song D", "Song E"));

        System.out.println("Original Playlist: " + playList);
        // Move song from index 1 to index 3
        moveSong(playList, 1, 3);
        System.out.println("Updated Playlist: " + playList);
    }

    //move song method 
    private static void moveSong(List<String> playList, int fromIndex, int toIndex) {
        // Check if the fromIndex and toIndex are within the bounds of the playlist
        if (fromIndex < 0 || fromIndex >= playList.size() || toIndex < 0 || toIndex >= playList.size()) {
            System.out.println("Invalid indices");
            return;
        }

        // Get the song at the fromIndex
        String song = playList.get(fromIndex);

        // Remove the song from the fromIndex
        playList.remove(fromIndex);

        // Add the song to the toIndex
        playList.add(toIndex, song);
    }
}

