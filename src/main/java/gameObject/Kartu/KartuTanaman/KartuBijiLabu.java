package gameObject.Kartu.KartuTanaman;

import gameObject.Kartu.KartuProduk.KartuLabu;
import gameObject.Kartu.KartuProduk.KartuProduk;

public class KartuBijiLabu extends KartuTanaman{

    public KartuBijiLabu(){
        super(0,5,"Biji Labu","","@../../../gameobject_resource/Tanaman/pumpkin seeds.png");
    }


    public KartuProduk getProduct() {
        return new KartuLabu();
    }
}
