package player;

/**
 * Created by Vlado on 15.08.2017.
 */
public abstract class Player {
    private final int PRISE;
    public Player(int price){
        PRISE = price;
    }
    public abstract void playSong();

    public int getPRICE(){
        return PRISE;
    }

}
