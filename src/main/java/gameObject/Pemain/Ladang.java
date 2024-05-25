package gameObject.Pemain;

import gameObject.Kartu.Kartu;
import gameObject.Kartu.KartuHewan;
import gameObject.Kartu.KartuItem;
import gameObject.Kartu.KartuTanaman.KartuTanaman;

import java.util.HashMap;
import java.util.Map;

public class Ladang {
    private Map<Integer, Kartu> petak; // Menggunakan KartuTanaman sebagai tipe data petak
    // kordinat 1-20 dari kiri atas ke kanan baru kebawah

    // constructor
    public Ladang() {
        this.petak = new HashMap<Integer, Kartu>();
    }

    public Ladang(Map<Integer, Kartu> petak) {
        this.petak = petak;
    }

    // Getter dan Setter
    public Map<Integer, Kartu> getPetak() {
        return petak;
    }

    public void setPetak(Map<Integer, Kartu> petak) {
        this.petak = petak;
    }

    public Kartu getKartuAt(int petakId){
        return petak.get(petakId);
    }

    public boolean isPetakFilled(int petakId){
        return petak.containsKey(petakId);
    }

    public void addKartu(Kartu kartu,int petakId) {
        petak.put(petakId, kartu);
    }

    public void addItemToKartuAt(int petakId, KartuItem item){
        Kartu kartu = getKartuAt(petakId);
        if (kartu instanceof KartuHewan){
            ((KartuHewan)kartu).addItem(item);
        }else if (kartu instanceof KartuTanaman){
            ((KartuTanaman)kartu).addItem(item);
        }
    }

    // Method untuk memanen hewan/tanaman dari petak ladang
    public Kartu harvest(int petakId) {
        return petak.remove(petakId);
    }





    // Method untuk menambah umur semua tanaman di ladang
    public void addTime() {
        for (Kartu tanaman : petak.values()) {
            if (tanaman instanceof KartuTanaman) {
                ((KartuTanaman) tanaman).age_up();
                if (((KartuTanaman) tanaman).getUmur() == ((KartuTanaman) tanaman).getUmur_harvest()) {

                }
            }
        }
    }

    // Method untuk menampilkan petak-petak ladang beserta isinya
//     public void display() {
//     for (Map.Entry<Integer, Kartu> entry : petak.entrySet()) {
//         System.out.println("Petak " + entry.getKey() + ": " +
//         entry.getValue().getNama());
//        }
//     }

    // Method untuk menampilkan detail informasi hewan/tanaman pada petak tertentu
    public void info(int petakId) {
        Kartu kartu = petak.get(petakId);
        if (kartu instanceof KartuHewan) {
            KartuHewan hewan = (KartuHewan) kartu;
            System.out.println("Detail Petak " + petakId + ":");
            System.out.println("Nama: " + hewan.getNama());
            System.out.println("Berat: " + hewan.getBerat());
            // System.out.println("Berat Efek Accelerate: " + //hewan.getEfekAccelerate() +;
            // System.out.println("Berat Efek Delay: " + //hewan.getEfekDelay());
            // System.out.println("Item Aktif: " + //hewan.getJumlahItem());
            // System.out.println("Jumlah Item: " + //hewan.getJumlahItem());
            // if (hewan.isBisaPanen()) {
            // System.out.println("Tombol Panen Aktif");
            // }
        } else if (kartu instanceof KartuTanaman) {
            KartuTanaman tanaman = (KartuTanaman) kartu;
            System.out.println("Detail Petak " + petakId + ":");
            System.out.println("Nama: " + tanaman.getNama());
            // System.out.println("Umur: " + tanaman.getUmur());
            // System.out.println("Umur Efek Accelerate: " + //hewan.getEfekAccelerate() +;
            // System.out.println("Umur Efek Delay: " + //hewan.getEfekDelay());
            // System.out.println("Item Aktif: " + //hewan.getJumlahItem());
            // System.out.println("Jumlah Item: " + tanaman.getItems().size());
            // if (tanaman.isBisaPanen()) {
            // System.out.println("Tombol Panen Aktif");
            // }
        } else {
            System.out.println("Petak " + petakId + " tidak ditemukan.");
        }
    }

}