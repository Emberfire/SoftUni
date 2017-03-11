package OnlineRadioDatabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(console.readLine());

        Playlist playlist = new Playlist();
        for (int i = 0; i < n; i++) {
            String[] tokens = console.readLine().split(";");
            if (tokens.length != 3) {
                System.out.println("Invalid song.");
                continue;
            }

            String artistName = tokens[0];
            String songName = tokens[1];

            String[] time = tokens[2].split(":");
            if (time.length != 2) {
                System.out.println("Invalid song length.");
                continue;
            }

            int minutes = Integer.parseInt(time[0]);
            int seconds = Integer.parseInt(time[1]);

            try {
                Song song = new Song(artistName, songName, minutes, seconds);
                playlist.addSong(song);

                System.out.println("Song added.");
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }

        System.out.printf("Songs added: %d%n", playlist.getSongsAdded());
        System.out.printf("Playlist length: %dh %dm %ds%n",
                playlist.getTotalTime().getHour(),
                playlist.getTotalTime().getMinute(),
                playlist.getTotalTime().getSecond());
    }
}
