package player;

/**
 * Created by Vlado on 15.08.2017.
 */
public abstract class PlayListPlayer extends Player {

    protected String [] songList = {"song1", "song2", "song3"};


    public PlayListPlayer(int price) {
        super(price);
    }
    public void playAllSongs() {
        for (String song : songList) {
            System.out.println("Playing: " + song);
        }
    }
    public void playSong() {
        System.out.println("Playing: " + songList[0]);
    }
}
