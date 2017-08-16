package player;

/**
 * Created by Vlado on 15.08.2017.
 */
public abstract class Player {
    private final int PRICE;
    public Player(int price){
        PRICE = price;
    }
    public abstract void playSong();

    public int getPRICE(){
        return PRICE;
    }

}
