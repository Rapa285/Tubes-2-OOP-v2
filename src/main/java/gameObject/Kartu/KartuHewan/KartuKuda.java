package gameObject.Kartu.KartuHewan;

import gameObject.Kartu.JenisHewan;
import gameObject.Kartu.KartuProduk.KartuDagingKuda;
import gameObject.Kartu.KartuProduk.KartuProduk;

public class KartuKuda extends KartuHewan{
    // private attributes

    // public methods
    public KartuKuda() {
        super("Kuda", 0, 14, "","file:src/gameobject_resource/Hewan/horse.png");
    }

    public KartuProduk getProduct() {
        return new KartuDagingKuda();
    }
}
