package gameObject.Kartu.KartuHewan;

import gameObject.Kartu.JenisHewan;
import gameObject.Kartu.KartuProduk.KartuProduk;
import gameObject.Kartu.KartuProduk.KartuSiripHiu;

public class KartuHiuDarat extends KartuHewan{
    // private attributes

    // public methods
    public KartuHiuDarat() {
        super("Hiu Darat", 0, 20, "","file:src/gameobject_resource/Hewan/hiu darat.png");
    }

    public KartuProduk getProduct() {
        return new KartuSiripHiu();
    }
}
