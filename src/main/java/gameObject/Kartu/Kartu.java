package gameObject.Kartu;

public class Kartu {
    protected String nama;
    protected String kategori;
    protected String imagePath;


    // Konstruktor
    public Kartu(){
        this.nama = "";
        this.kategori = "";
        this.imagePath = "";
    }

    public Kartu(String nama,String kategori,String imagePath){
        this.nama = nama;
        this.kategori = kategori;
        this.imagePath = imagePath;
    }
    
    // Getters

    public String getNama(){
        return nama;
    }

    public String getKategori(){
        return kategori;
    }

    public String getImagePath(){
        return imagePath;
    }

    // Setters

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setKategori(String kategori){
        this.kategori = kategori;
    }

    public void setImagePath(String imagePath){
        this.imagePath = imagePath;
    }
    
}
