package player;


/**
 * Created by Vlado on 15.08.2017.
 */
public class Main {
    public static void main (String [] args) {
        Player1 player1 = new Player1(10);
        player1.playSong();
        System.out.println();

        Player2 player2 = new Player2(15);
        player2.playSong();
        System.out.println();

        Player3 player3 = new Player3(20);
        player3.playSong();
        System.out.println();

        player3.playAllSongs();
        System.out.println();

        Player4 player4 = new Player4(70);
        player4.playSong();
        System.out.println();

        player4.playAllSongs();
        System.out.println();

        Player5 player5 = new Player5(85);
        player5.playSong();
        System.out.println();
        player5.playAllSongs();
        System.out.println();

        Player6 player6 = new Player6(95);
        player6.playSong();
        System.out.println();
        player6.playAllSongs();
        System.out.println();
        player6.shuffle();

    }
}
