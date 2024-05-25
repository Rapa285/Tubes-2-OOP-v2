package gameObject.Kartu.KartuTanaman;

import gameObject.Kartu.KartuProduk;

public class KartuBijiJagung extends KartuTanaman{

    public KartuBijiJagung(){
        super(0,3,"Biji Jagung","","@../../../gameobject_resource/Tanaman/corn seeds.png");
    }

    @Override
    public KartuProduk getProduct() {
        return new KartuProduk();
    }
}

