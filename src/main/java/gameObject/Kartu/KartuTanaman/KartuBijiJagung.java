package gameObject.Kartu.KartuTanaman;

import gameObject.Kartu.KartuProduk.KartuJagung;
import gameObject.Kartu.KartuProduk.KartuProduk;

public class KartuBijiJagung extends KartuTanaman{

    public KartuBijiJagung(){
        super(0,3,"Biji Jagung","","@../../../gameobject_resource/Tanaman/corn seeds.png");
    }


    public KartuProduk getProduct() {
        return new KartuJagung();
    }
}

