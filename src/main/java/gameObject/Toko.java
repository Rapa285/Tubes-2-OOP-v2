package gameObject;

import gameObject.Kartu.Kartu;

import java.util.ArrayList;
import java.util.List;

public class Toko {
    private List<Kartu> items;
    private  List<Integer> quantities;

    public Toko() {
        this.items = new ArrayList<Kartu>();
        this.quantities = new ArrayList<Integer>();
    }

    public Toko(List<Kartu> items, List<Integer> quantities) {
        this.items = items;
        this.quantities = quantities;
    }

    public List<Kartu> getItems() {
        return items;
    }

    public List<Integer> getQuantities() {
        return quantities;
    }

    public void addItemsQuan(Kartu item, Integer quantity) {
        if (items.contains(item)) {
            int id = items.indexOf(item);
            quantities.add(id,quantity);
        }else{
           items.add(item);
           quantities.add(quantity);
        }
    }

    public Integer getQuantity(Kartu item) {
        return quantities.get(items.indexOf(item));
    }

    public void sellItem(int idItem, int quantity) throws Exception {
        if (quantities.get(idItem) > quantity) {
            quantities.set(idItem, quantities.get(idItem) - quantity);
        } else if (quantities.get(idItem) == quantity) {
            quantities.remove(idItem);
        }else{
            throw new Exception("not enough stock");
        }
    }




}
