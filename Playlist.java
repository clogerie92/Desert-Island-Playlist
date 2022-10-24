// import ArrayList
import java.util.ArrayList;
// create Playlist class
class Playlist {
    public static void shufflePlaylist() {
        // ArrayList of strings
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        // songs for playlist
        desertIslandPlaylist.add("Through The Late Night");
        desertIslandPlaylist.add("Carousel");
        desertIslandPlaylist.add("Never Catch Me");
        desertIslandPlaylist.add("I Can Tell");
        desertIslandPlaylist.add("Motorcycle Patches");
        desertIslandPlaylist.add("Skeletons");
        // print playlist to console
        System.out.println(desertIslandPlaylist);
        // print size of playlist to console
        System.out.println(desertIslandPlaylist.size());
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
        System.out.println(desertIslandPlaylist); 
    }
    // create main method
    public static void main(String[] args) {
        shufflePlaylist();
    }
}