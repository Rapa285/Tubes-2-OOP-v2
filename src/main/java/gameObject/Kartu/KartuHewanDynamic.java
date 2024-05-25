package gameObject.Kartu;

import gameObject.Kartu.KartuHewan.KartuHewan;
import gameObject.Kartu.KartuProduk.KartuProduk;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KartuHewanDynamic extends KartuHewan {
    // private attributes
    private Map<String, Map<String, Method>> specificTypeMethods = new HashMap<>();

    // public methods
    public KartuHewanDynamic(String nama, int berat, int berat_harvest, String kategori, String imagePath, List<KartuItem> items) {
        super(nama, berat, berat_harvest, kategori, imagePath,items);
    }

    public void addSpecificTypeMethod(String cardType, String methodName, Method method) {
        Map<String, Method> temp = new HashMap<String, Method>();
        temp.putIfAbsent(methodName, method);
        this.specificTypeMethods.putIfAbsent(cardType, temp);
    }

    public Object invokeMethod(String cardType, String methodName, Object... args) throws Exception {
        Map<String, Method> methods = this.specificTypeMethods.get(cardType);
        if (methods != null) {
            Method method = methods.get(methodName);
            if (method != null) {
                return method.invoke(this, args);
            }
        }
        throw new NoSuchMethodException("No method found with name: " + methodName + " for card type: " + cardType);
    }

    public void feedKarnivora(KartuProduk produk) {
        if (produk.getType() == JenisHewan.karnivora) {
            super.add_weight(produk.getBerat());
            System.out.println("makan " + produk.getNama());
        } else {
            System.out.println("tidak bisa makan itu");
        }
    }

    public void feedHerbivora(KartuProduk produk) {
        if (produk.getType() == JenisHewan.herbivora) {
            super.add_weight(produk.getBerat());
            System.out.println("makan " + produk.getNama());
        } else {
            System.out.println("tidak bisa makan itu");
        }

    }

    public void feedOmnivora(KartuProduk produk) {
        super.add_weight(produk.getBerat());
        System.out.println("makan " + produk.getNama());

    }
}
