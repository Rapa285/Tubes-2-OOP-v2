package gameObject.States;

import gameObject.Pemain.Ladang;
import gameObject.Toko;

public interface GameState {
    GameState start_state();
    GameState next_state();
    Ladang ladang_lawan();
    Integer currentTurn();
    void store(Toko toko);
    void load();
    void plugin();
    void save();
}
