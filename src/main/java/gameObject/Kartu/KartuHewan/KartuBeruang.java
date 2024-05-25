package gameObject.Kartu.KartuHewan;

import gameObject.Kartu.JenisHewan;
import gameObject.Kartu.KartuProduk.KartuDagingBeruang;
import gameObject.Kartu.KartuProduk.KartuProduk;

public class KartuBeruang extends KartuHewan{
    // private attributes

    // public methods
    public KartuBeruang() {
        super("Beruang", 0, 25, "","file:src/gameobject_resource/Hewan/bear.png");
    }

    public KartuProduk getProduct() {
        return new KartuDagingBeruang();
    }
}
