package player;

/**
 * Created by Vlado on 15.08.2017.
 */
public abstract class PlayListPlayer extends Player {

    public PlayListPlayer(int price) {
        super(price);
    }
    public abstract void playAllSongs();
}
