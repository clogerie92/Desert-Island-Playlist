// import ArrayList
import java.util.ArrayList;
import java.util.*;
// create Playlist class
class Playlist {
    // shuffle playlist method
    public static void shufflePlaylist() {
        // ArrayList of strings
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
    public static void reversePlaylist() {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        // songs for playlist
        desertIslandPlaylist.add("Through The Late Night");
        desertIslandPlaylist.add("Carousel");
        desertIslandPlaylist.add("Never Catch Me");
        desertIslandPlaylist.add("I Can Tell");
        desertIslandPlaylist.add("Motorcycle Patches");
        desertIslandPlaylist.add("Skeletons");        
        // remove a song
        desertIslandPlaylist.remove("Skeletons");
        // print updated size and playlist
        System.out.println(desertIslandPlaylist.size());
        System.out.println(desertIslandPlaylist);
        // variables to store song index
        int a = desertIslandPlaylist.indexOf("Through The Late Night");
        int b = desertIslandPlaylist.indexOf("Carousel");       
        // variable to store temporary string
        String tempA = "Through The Late Night";
        // change order of playlist
        desertIslandPlaylist.set(a, "Carousel");
        desertIslandPlaylist.set(b, tempA);
        // print updated playlist to console
        System.out.println("Playlist in order: " + desertIslandPlaylist);
        // reverse playlist
        Collections.reverse(desertIslandPlaylist);
        System.out.println("Reversed playlist: " + desertIslandPlaylist); 
    }
    // main method
    public static void main(String[] args) {
        shufflePlaylist();
        reversePlaylist();
    }
}