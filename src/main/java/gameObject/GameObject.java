package gameObject;

import gameObject.Kartu.Kartu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameObject {

    private List<String> cords;
    private List<Kartu> kartu_hewan;
    private List<Kartu> kartu_tanaman;
    private List<Kartu> kartu_item;
    private List<Kartu> kartu_produk;


    public void initCords(){
        this.cords = new ArrayList<String>(Arrays.asList("A1","A2","A3","A4","A5","B1","B2","B3","B4","B5","C1","C2","C3","C4","C5","D1","D2","D3","D4","D5"));
    }

    public void initHewan(){
        this.kartu_hewan = new ArrayList<Kartu>();
        
    }







    public List<String> getCords(){
        return cords;
    }

    public List<Kartu> getHewan(){
        return kartu_hewan;
    }

    public List<Kartu> getTanaman(){
        return kartu_tanaman;
    }

    public List<Kartu> getItem(){
        return kartu_item;
    }

    public List<Kartu> getProduk(){
        return kartu_produk;
    }
        
}
