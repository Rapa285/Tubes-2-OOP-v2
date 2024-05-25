package group;

import UI.MainWindow_Controller;
import gameObject.GameManager;
import gameObject.Pemain.Pemain;
import gameObject.States.GameState;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Pemain p1 = new Pemain("Player1",1);
        Pemain p2 = new Pemain("Player2",2);
        MainWindow_Controller MWcon = new MainWindow_Controller(new GameManager(p1,p2));




        while (MWcon.getManager().getGameState() != null){
            MWcon.getManager().start_turn();

        }
    }
}