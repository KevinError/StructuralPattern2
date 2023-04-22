package Proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SongServiceProvider implements SongService{
    private Map<Integer, Song> songs;

    public SongServiceProvider(Map<Integer, Song> songs) {
        this.songs = songs;
    }

    @Override
    public Song searchById(Integer songID) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return songs.get(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<Song> songByTitle = new ArrayList<>();
        for (int i = 0; i < songs.size(); i++){
            if (songs.get(i).getSongTitle().equals(title)){
                songByTitle.add(songs.get(i));
            }
        }
        return songByTitle;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<Song> songByAlbum = new ArrayList<>();
        for (int i = 0; i < songs.size(); i++){
            if (songs.get(i).getSongAlbum().equals(album)){
                songByAlbum.add(songs.get(i));
            }
        }
        return songByAlbum;
    }


}
