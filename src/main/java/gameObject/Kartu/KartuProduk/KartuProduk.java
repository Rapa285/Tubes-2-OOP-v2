package gameObject.Kartu.KartuProduk;


import gameObject.Kartu.JenisHewan;
import gameObject.Kartu.Kartu;

public class KartuProduk extends Kartu {
    // private attributes
    private JenisHewan jenis;
    private int berat_tambahan;
    private int harga;

    // public methods
    public KartuProduk(JenisHewan jenis, int berat_tambahan, int harga, String nama, String kategori, String imagePath) {
        super(nama, kategori, imagePath);
        this.jenis = jenis;
        this.harga = harga;
        this.berat_tambahan = berat_tambahan;
    }

    public JenisHewan getType() {
        return this.jenis;
    }


    public int getBerat() {
        return this.berat_tambahan;
    }
}

