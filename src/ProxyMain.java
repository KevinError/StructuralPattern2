import Proxy.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProxyMain {

    public static void main(String[] args){
        Song song1 = new Song("Song1", "Arist1", "Album2", 3);
        Song song2 = new Song("Song2", "Arist2", "Album2", 3);
        Song song3 = new Song("Song3", "Arist3", "Album3", 3);
        Song song4 = new Song("Song4", "Arist4", "Album3", 3);
        Song song5 = new Song("Song5", "Arist5", "Album3", 3);
        Map<Integer, Song> songs = new HashMap<>();
        songs.put(0,song1);
        songs.put(1,song2);
        songs.put(2,song3);
        songs.put(3,song4);
        songs.put(4,song5);

        SongService service = new SongServiceProxy(songs);
        Song result1 = service.searchById(0);
        System.out.println("Search by 0:" + result1.getSongTitle() + result1.getSongAlbum());
        List<Song> result2 = service.searchByTitle("Song2");
        System.out.println("Search by title Song2:");
        for (Song song: result2){
            System.out.println(song.getSongTitle() + ", " + song.getSongAlbum());
        }
        List<Song> result3 = service.searchByAlbum("Album3");
        System.out.println("Search by album3: ");
        for (Song song: result3){
            System.out.println(song.getSongTitle() + ", " + song.getSongAlbum());
        }
    }
}
