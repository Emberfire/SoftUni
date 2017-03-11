package OnlineRadioDatabase;

import java.time.LocalTime;
import java.util.ArrayList;

class Playlist {
    private LocalTime totalTime;
    private ArrayList<Song> songs;

    Playlist() {
        this.songs = new ArrayList<>();
        totalTime = LocalTime.of(0, 0, 0);
    }

    void addSong(Song song) {
        this.songs.add(song);
        this.totalTime = this.totalTime.plusMinutes(song.getMinutes());
        this.totalTime = this.totalTime.plusSeconds(song.getSeconds());
    }


    int getSongsAdded() {
        return this.songs.size();
    }

    LocalTime getTotalTime() {
        return this.totalTime;
    }
}
