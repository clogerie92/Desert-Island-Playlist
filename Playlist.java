// import ArrayList
import java.util.ArrayList;
import java.util.*;
// create Playlist class
class Playlist {
    // shuffle playlist method
    public static void shufflePlaylist() {
        // ArrayList of strings
            // not dry
                // ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
                // songs for playlist
                // desertIslandPlaylist.add("Through The Late Night");
                // desertIslandPlaylist.add("Carousel");
                // desertIslandPlaylist.add("Never Catch Me");
                // desertIslandPlaylist.add("I Can Tell");
                // desertIslandPlaylist.add("Motorcycle Patches");
                // desertIslandPlaylist.add("Skeletons");
        List<String> desertIslandPlaylist = Arrays.asList("Through The Late Night", "Carousel", "Never Catch Me", "I Can Tell", "Motorcycle Patches", "Skeletons");
        // print playlist to console
        System.out.println("Original playlist: " + desertIslandPlaylist);
        // print size of playlist to console
        int playlistSize = desertIslandPlaylist.size();
        System.out.println("The playlist size is: " + playlistSize);
        // shuffle playlist
        Collections.shuffle(desertIslandPlaylist);
        System.out.println("Shuffled playlist: " + desertIslandPlaylist);
    }
    // reverse playlist method

    // create main method
    public static void main(String[] args) {
        shufflePlaylist();
    }
}