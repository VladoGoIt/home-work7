package player;

/**
 * Created by Vlado on 15.08.2017.
 */
public class Player4 extends PlayListPlayer{

    public Player4(int price) {
        super(price);
    }

    @Override
    public void playSong() {
        int lastSong = songList.length - 1;
        System.out.println("Playing: " + songList[lastSong]);
    }

   }
