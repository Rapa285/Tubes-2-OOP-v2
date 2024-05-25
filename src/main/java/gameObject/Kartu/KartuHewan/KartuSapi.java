package gameObject.Kartu.KartuHewan;

import gameObject.Kartu.JenisHewan;
import gameObject.Kartu.KartuProduk.KartuProduk;
import gameObject.Kartu.KartuProduk.KartuSusu;

public class KartuSapi extends KartuHewan{
    // private attributes

    // public methods
    public KartuSapi() {
        super("Sapi", 0, 10, "","@../../../gameobject_resource/Hewan/cow.png");
    }

    public KartuProduk getProduct() {
        return new KartuSusu();
    }
}
