package gameObject.States;


import gameObject.Kartu.Kartu;
import gameObject.Pemain.Deck;
import gameObject.Pemain.Ladang;
import gameObject.Pemain.Pemain;
import gameObject.Toko;

import java.util.List;

public class ShuffleState implements GameState {
    private Integer turn;
    private Pemain p1;
    private Pemain p2;
    private Ladang ladang;


    public ShuffleState(Integer turn, Pemain player1, Pemain player2){
        this.turn = turn;
        this.p1 = player1;
        this.p2 = player2;
        if (turn%2 == 1){
            this.ladang = p1.getLadang();
        }else{
            this.ladang = p2.getLadang();
        }
    }

    public GameState start_state(){
        Pemain currentPlayer = getCurrentPlayer();
        Deck deck = currentPlayer.getDeck();
        while(true){
            deck.shuffle();
            List<Kartu> draw = deck.drawKartu();
            if (draw == null){
                break;
            }else{
                break;
            }

        }

        return next_state();


    }

    public GameState next_state(){
        return new State_SeranganBeruang(turn,p1,p2);
    }

    public Ladang ladang_lawan(){
        if (turn%2 == 1){
            return p2.getLadang();
        }else{
            return p1.getLadang();
        }
    }

    public void store(){
        throw new UnsupportedOperationException("Can't open store in this state");
    }

    public void load(){
        throw new UnsupportedOperationException("Can't load in this state");
    }


    public void plugin(){
        throw new UnsupportedOperationException("Can't insert plugin in this state");
    }
    public void save(){
        throw new UnsupportedOperationException("Can't save in this state");
    }

    @Override
    public Integer currentTurn() {
        return this.turn;
    }

    @Override
    public void store(Toko toko) {
//        ok
    }

    public Pemain getCurrentPlayer() {
        if (turn%2 == 1){
            return p1;
        }else{
            return p2;
        }
    }

    public Kartu chooseDraw(List<Kartu> draw){
//        for (Kartu kartu : draw){
//
//        }
        return null;
    }
}
