package gameObject.Kartu.KartuTanaman;

import gameObject.Kartu.KartuProduk;

public class KartuBijiStroberi extends KartuTanaman{

    public KartuBijiStroberi(){
        super(0,4,"Biji Stroberi","","@../../../gameobject_resource/Tanaman/strawberry seeds.png");

    }

    @Override
    public KartuProduk getProduct() {
        return new KartuProduk();
    }
}
