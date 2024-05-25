package gameObject;


import gameObject.Pemain.Pemain;
import gameObject.States.FreeState;
import gameObject.States.GameState;
import gameObject.States.ShuffleState;


public class GameManager{
    private Pemain p1;
    private Pemain p2;
    private Pemain currPlayer;
    private Integer turn;
    private Toko toko;
    private GameState gameState;

    public GameManager(Pemain p1,Pemain p2){
        this.p1 = p1;
        this.p2 = p2;
        this.currPlayer = p1;
        this.turn = 1;
        this.toko = new Toko();
        this.gameState = new ShuffleState(turn,p1,p2);
    }

    public Integer getTurn(){
        return turn;
    }
    public GameState getGameState(){
        return gameState;
    }
    public Pemain getCurrPlayer(){
        if (turn%2 == 1){
            return p1;
        }else{
            return p2;
        }

    }

    public void start_turn(){
        if(!(gameState instanceof FreeState)) {
            this.gameState = this.gameState.start_state();
        }
    }
    public void next_turn(){ // dipanggil saat menekan next turn saat freestate
        this.gameState = gameState.next_state();
        turn++;
    }
    public void store(){
        gameState.store(toko);
    }
    public void  save(){
        gameState.save();
    }

    public void load(){
        gameState.load();
    }

    public void plugin(){
        gameState.plugin();
    }
}
