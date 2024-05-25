package UI;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import gameObject.Kartu.Kartu;
import gameObject.Kartu.KartuItem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InfoKartu_Controller {
    public Label label_namakartu;
    public Button butt_kembali;
    public ImageView imageview_infokartu;
    public Button butt_panen;
    public Label label_beratkartu;
    public Label label_itemkartu;

    public void setNama(Kartu kartu){
        String nama = kartu.getNama();
        label_namakartu.setText(nama);
    }

    public void setImage(Kartu kartu){
        String file = kartu.getImagePath();
        imageview_infokartu.setImage(new Image(file));
    }

    public void setBerat(Integer berat,Integer berat_harvest){
        label_beratkartu.setText("Berat : "+berat.toString()+"("+berat_harvest.toString()+")");
    }

    public void setItems(List<KartuItem> items){
        Map<KartuItem, Integer> itemFrequency = new HashMap<>();
        for (KartuItem item : items) {
            itemFrequency.put(item, itemFrequency.getOrDefault(item, 0) + 1);
        }
        StringBuilder labelitem = new StringBuilder("Item aktif : ");
        for (Map.Entry<KartuItem, Integer> entry : itemFrequency.entrySet()) {
            KartuItem item = entry.getKey();
            int frequency = entry.getValue();
            labelitem.append(item.getNama()).append("(").append(frequency).append("), ");
        }

        // Update the label
        label_itemkartu.setText(labelitem.toString().trim());
    }

    public void panen(){
        
    }


}
