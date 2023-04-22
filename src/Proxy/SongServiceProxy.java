package Proxy;

import java.util.List;
import java.util.Map;

public class SongServiceProxy implements SongService{
    private SongServiceProvider songService;
    private Map<Integer, Song> songs;

    public SongServiceProxy(Map<Integer, Song> songs) {
        this.songs = songs;
    }

    @Override
    public Song searchById(Integer songID) {
        songService = new SongServiceProvider(songs);
        return songService.searchById(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        songService = new SongServiceProvider(songs);
        return songService.searchByTitle(title);
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        songService = new SongServiceProvider(songs);
        return songService.searchByAlbum(album);
    }
}
