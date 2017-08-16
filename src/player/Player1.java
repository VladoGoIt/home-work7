package player;

/**
 * Created by Vlado on 15.08.2017.
 */
public class Player1 extends OneSongPlayer {

    public Player1(int price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + songName );
    }


}
