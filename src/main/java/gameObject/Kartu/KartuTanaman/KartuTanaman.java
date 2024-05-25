package gameObject.Kartu.KartuTanaman;

import gameObject.Kartu.Kartu;
import gameObject.Kartu.KartuItem;
import gameObject.Kartu.KartuProduk.KartuProduk;

import java.util.ArrayList;
import java.util.List;

public abstract class KartuTanaman extends Kartu {
    // private attributes
    private int umur;
    private int umur_harvest;
    private List<KartuItem> items;

    // public methods

    KartuTanaman(int umur, int umur_harvest, String nama, String kategori, String imagePath) {
        super(nama, kategori, imagePath);
        this.umur = umur;
        this.umur_harvest = umur_harvest;
        this.items = new ArrayList<KartuItem>();
    }

    public void age_up() {
        umur += 1;
    }

    public void addItem(KartuItem item){
        items.add(item);
    }

    public int getUmur() {
        return umur;
    }

    public int getUmur_harvest(){
        return umur_harvest;
    }

    public abstract KartuProduk getProduct();
}
