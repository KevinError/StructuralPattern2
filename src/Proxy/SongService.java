package Proxy;

import java.util.List;

public interface SongService {
    Song searchById(Integer songID);
    List<Song> searchByTItle(String title);
    List<Song> searchByAlbum(String album);

}
