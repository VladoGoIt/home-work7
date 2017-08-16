package player;
import java.util.*;

/**
 * Created by Vlado on 15.08.2017.
 */
public class Player6 extends PlayListPlayer {
    public Player6(int price) {
        super(price);
    }

    public void shuffle(){
        List<Integer> indexes = new ArrayList<Integer>();
        for (int i=0; i<songList.length; i++) indexes.add(i);
        Collections.shuffle(indexes);
        for (int i : indexes)
            System.out.println("Playing: " + songList[i]);
    }

}
