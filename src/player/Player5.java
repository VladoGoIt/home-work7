package player;

/**
 * Created by Vlado on 15.08.2017.
 */
public class Player5 extends PlayListPlayer {
    public Player5(int price) {
        super(price);
    }
    @Override
    public void playAllSongs(){
        for(int i = songList.length; i > 0; i--){
            System.out.println("Playing: " + songList[i-1]);
        }
    }

}
