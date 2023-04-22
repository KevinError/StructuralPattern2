package Proxy;

public class Song {
    private String songTitle;
    private String songArtist;
    private String songAlbum;
    private int songDuration;

    public Song(String songTitle, String songArtist,String songAlbum, int songDuration){
        this.songTitle = songTitle;
        this.songArtist = songArtist;
        this.songAlbum = songAlbum;
        this.songDuration = songDuration;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public String getSongAlbum() {
        return songAlbum;
    }

    public int getSongDuration() {
        return songDuration;
    }
}
