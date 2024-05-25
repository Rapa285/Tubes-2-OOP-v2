package gameObject.Pemain;

import gameObject.Kartu.Kartu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Kartu> main_deck;
    private List<Kartu> active_deck;

    // constructor

    public Deck() {
        this.main_deck = new ArrayList<>();
        this.active_deck = new ArrayList<>();
    }

    public Deck(List<Kartu> main_deck, List<Kartu> active_deck) {
        this.main_deck = main_deck;
        this.active_deck = active_deck;
    }

    // Getter dan Setter
    public List<Kartu> getMain_deck() {
        return main_deck;
    }

    public void setMain_deck(List<Kartu> main_deck) {
        this.main_deck = main_deck;
    }

    public List<Kartu> getActive_deck() {
        return active_deck;
    }

    public void setActive_deck(List<Kartu> active_deck) {
        this.active_deck = active_deck;
    }

    public Integer getDeckCount(){
        return main_deck.size();
    }

    // Method untuk mengocok kartu
    public void shuffle() {
        Collections.shuffle(main_deck);
    }

    public void mainToActive(Kartu kartu) {
        main_deck.remove(kartu);
        active_deck.add(kartu);
    }

    public List<Kartu> drawKartu() {
        int generate_n = 4;
        int space = 6- active_deck.size();
        int remainder = main_deck.size();

        generate_n = Math.min(generate_n, Math.min(remainder, space));

        if (generate_n == 0){
            return null;
        }
        List<Kartu> kartuList = new ArrayList<Kartu>();
        for (int i = 0; i < generate_n; i++) {
            kartuList.add(main_deck.get(i));
        }

        return kartuList;
    }
}
