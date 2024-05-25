package gameObject.Kartu;

enum jenisHewan {
    karnivora,
    herbivora,
    omnivora;
}

public class KartuProduk extends Kartu{
    // private attributes
    private jenisHewan jenis;
    private String name;
    private int berat_tambahan;

    public KartuProduk(){

    }
    // public methods
    public KartuProduk(jenisHewan jenis, String name, int berat, String nama, String kategori, String imagePath) {
        super(nama, kategori, imagePath);
        this.jenis = jenis;
        this.name = name;
        this.berat_tambahan = berat;
    }

    public jenisHewan getType() {
        return this.jenis;
    }

    public String getName() {
        return this.name;
    }

    public int getBerat() {
        return this.berat_tambahan;
    }
}

