package gameObject.States;

import gameObject.*;
import gameObject.Pemain.Ladang;
import gameObject.Pemain.Pemain;

public class FreeState implements GameState {

    private Integer turn;
    private Pemain p1;
    private Pemain p2;
    private boolean next;

    public FreeState(Integer turn,Pemain p1, Pemain p2){
        this.turn = turn;
        this.p1 = p1;
        this.p2 = p2;
        this.next = false;
    }

    public GameState start_state(){
        if (!next){
            return new FreeState(turn, p1, p2);
        }else{
            return next_state();
        }
    }

    public GameState next_state(){
        if (turn == 20){
            return null;
        }else{
            return new ShuffleState(turn+1,p1,p2);
        }

    }

    public Ladang ladang_lawan(){
        if (turn%2 == 1){
            return p1.getLadang();
        }else {
            return p2.getLadang();
        }
    }

    public void store(Toko toko){
//        toko.displayToko();
    }

    public void load(){
        Load load = new Load();
    }


    public void plugin(){
        Plugin plug = new Plugin();
    }
    public void save(){
        Save save = new Save();
    }
    public Integer currentTurn(){
        return turn;
    }

    public void setNext(){
        next = true;
    }
}
