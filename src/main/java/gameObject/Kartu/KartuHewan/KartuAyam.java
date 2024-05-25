package gameObject.Kartu.KartuHewan;

import gameObject.Kartu.JenisHewan;
import gameObject.Kartu.KartuProduk.KartuProduk;
import gameObject.Kartu.KartuProduk.KartuTelur;

public class KartuAyam extends KartuHewan{
    // private attributes

    // public methods
    public KartuAyam() {
        super("Ayam", 0, 5, "","file:src/gameobject_resource/Hewan/chicken.png");
    }

    public KartuProduk getProduct() {
        return new KartuTelur();
    }
}
