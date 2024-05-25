package gameObject.Kartu.KartuHewan;

import gameObject.Kartu.Kartu;
import gameObject.Kartu.KartuItem;

import java.util.ArrayList;
import java.util.List;

public abstract class KartuHewan extends Kartu {
    // private attributes
    private int berat;
    private int berat_harvest;
    private List<KartuItem> items;

    // public methods
    public KartuHewan(String nama, int berat, int berat_harvest, String kategori, String imagePath,List<KartuItem> items) {
        super(nama, kategori, imagePath);
        this.berat = berat;
        this.berat_harvest = berat_harvest;
        this.items = items;
    }

    public KartuHewan(String nama, int berat, int berat_harvest, String kategori, String imagePath) {
        super(nama, kategori, imagePath);
        this.berat = berat;
        this.berat_harvest = berat_harvest;
        this.items = new ArrayList<>();
    }

    public int getBerat() {
        return this.berat;
    }

    public void add_weight(int weight) {
        this.berat += weight;
    }

    public void addItem(KartuItem item) {
        this.items.add(item);
    }
}
