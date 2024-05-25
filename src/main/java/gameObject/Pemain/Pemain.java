package gameObject.Pemain;

public class Pemain {
    private int id;
    private String nama;
    private int uang;
    private Ladang ladang;
    private Deck deck;

    public Pemain(String nama,int id){
        this.nama = nama;
        this.id = id;
        this.deck = new Deck();
        this.ladang = new Ladang();
        this.uang = 0;
    }
    // Constructor
    public Pemain(int id, String nama, int uang, Ladang ladang, Deck deck_active) {
        this.id = id;
        this.nama = nama;
        this.uang = uang;
        this.ladang = ladang;
        this.deck = deck_active;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUang() {
        return uang;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }

    public Ladang getLadang() {
        return ladang;
    }

    public void setLadang(Ladang ladang) {
        this.ladang = ladang;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Deck getDeck_active() {
        return (Deck) deck.getActive_deck();
    }

    public void setDeck_active(Deck deck_active) {
        this.deck.setActive_deck(deck_active.getActive_deck()) ;
    }


}