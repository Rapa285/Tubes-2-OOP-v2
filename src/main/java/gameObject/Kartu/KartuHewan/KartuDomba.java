package gameObject.Kartu.KartuHewan;

import gameObject.Kartu.JenisHewan;
import gameObject.Kartu.KartuProduk.KartuDagingDomba;
import gameObject.Kartu.KartuProduk.KartuProduk;

public class KartuDomba extends KartuHewan{
    // private attributes

    // public methods
    public KartuDomba() {
        super("Domba", 0, 12, "", "file:src/gameobject_resource/Hewan/sheep.png");
    }

    public KartuProduk getProduct() {
        return new KartuDagingDomba();
    }
}
