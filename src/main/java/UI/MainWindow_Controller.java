package UI;

import gameObject.GameManager;
import gameObject.Kartu.Kartu;
import gameObject.Kartu.KartuHewan.KartuHewan;
import gameObject.Kartu.KartuItem.KartuItem;
import gameObject.Kartu.KartuTanaman.KartuTanaman;
import gameObject.Pemain.Deck;
import gameObject.Pemain.Ladang;
import gameObject.Pemain.Pemain;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainWindow_Controller {

    private GameManager manager;
    private boolean ladang_lawan;

    private List<ImageView> deck_imv;
    private List<ImageView> ladang_imv;
    private ImageView sourceImageView;


    @FXML
    public Button butt_next;

    @FXML
    private ImageView gulden_1;

    @FXML
    private ImageView gulden_2;


    @FXML
    private ImageView ImageView1;

    @FXML
    private ImageView ImageView2;

    @FXML
    private ImageView ImageView3;

    @FXML
    private ImageView ImageView4;

    @FXML
    private ImageView ImageView5;

    @FXML
    private ImageView ImageView6;
    @FXML
    private ImageView ImageViewLadang1;
    @FXML
    private ImageView ImageViewLadang2;
    @FXML
    private ImageView ImageViewLadang3;

    @FXML
    private ImageView ImageViewLadang4;
    @FXML
    private ImageView ImageViewLadang5;
    @FXML
    private ImageView ImageViewLadang6;

    @FXML
    private ImageView ImageViewLadang7;

    @FXML
    private ImageView ImageViewLadang8;

    @FXML
    private ImageView ImageViewLadang9;

    @FXML
    private ImageView ImageViewLadang10;

    @FXML
    private ImageView ImageViewLadang11;

    @FXML
    private ImageView ImageViewLadang12;

    @FXML
    private ImageView ImageViewLadang13;

    @FXML
    private ImageView ImageViewLadang14;

    @FXML
    private ImageView ImageViewLadang15;

    @FXML
    private ImageView ImageViewLadang16;

    @FXML
    private ImageView ImageViewLadang17;

    @FXML
    private ImageView ImageViewLadang18;

    @FXML
    private ImageView ImageViewLadang19;

    @FXML
    private ImageView ImageViewLadang20;


    @FXML
    private Label Deck_count;

    @FXML
    private Label label_turn;

    public MainWindow_Controller(GameManager manager) {
        this.manager = manager;
    }
    public void initialize(){
        ladang_lawan = false;

        this.deck_imv = new ArrayList<ImageView>(Arrays.asList(
                ImageView1, ImageView2, ImageView3, ImageView4, ImageView5, ImageView6
        ));

        this.ladang_imv = new ArrayList<ImageView>(Arrays.asList(
                ImageViewLadang1, ImageViewLadang2, ImageViewLadang3, ImageViewLadang4, ImageViewLadang5,
                ImageViewLadang6, ImageViewLadang7, ImageViewLadang8, ImageViewLadang9, ImageViewLadang10,
                ImageViewLadang11, ImageViewLadang12, ImageViewLadang13, ImageViewLadang14, ImageViewLadang15,
                ImageViewLadang16, ImageViewLadang17, ImageViewLadang18, ImageViewLadang19, ImageViewLadang20
        ));
        init_ladang_deck(deck_imv,ladang_imv);

//        ImageView2.setImage(new Image("file:src/gameobject_resource/Hewan/chicken.png"));
//        ImageView1.setImage(new Image("file:src/gameobject_resource/Hewan/cow.png"));
        gulden_1.setImage(new Image("file:src/gameobject_resource/Other/gulden.png"));
        gulden_2.setImage(new Image("file:src/gameobject_resource/Other/gulden.png"));

        for (ImageView imv : deck_imv) {
            System.out.println(imv);
            imv.setOnDragDetected(event -> {
                sourceImageView = (ImageView) event.getSource();
                Dragboard db = imv.startDragAndDrop(TransferMode.MOVE);
                ClipboardContent content = new ClipboardContent();
                content.putImage(imv.getImage());
                db.setContent(content);

                // Consume the event to prevent further handling
                event.consume();
            });

            imv.setOnDragOver(event -> {
                if (event.getDragboard().hasImage()) {
                    event.acceptTransferModes(TransferMode.MOVE);
                }

                // Consume the event to prevent further handling
                event.consume();
            });

            imv.setOnDragEntered(event -> {
                if (event.getDragboard().hasImage()) {
                    imv.setOpacity(0.7);
                }
            });
            imv.setOnDragExited(event -> {
                imv.setOpacity(1);
            });
            imv.setOnDragDropped(event -> {
                Dragboard db = event.getDragboard();
                boolean success = false;
                if (sourceImageView.getId().length() == 10){
                    if (imv.getImage() == null) {
                        // If target ImageView is empty, just set the new image
                        imv.setImage(db.getImage());
                        sourceImageView.setImage(null);
                    } else {
                        // If target ImageView already has an image, swap the images
                        Image tempImage = imv.getImage();
                        imv.setImage(db.getImage());
                        if (sourceImageView != null) {
                            sourceImageView.setImage(tempImage);
                        }
                    }
                }
                event.setDropCompleted(success);

                // Consume the event to prevent further handling
                event.consume();
            });

            // When the drag operation is done on the source ImageView
            imv.setOnDragDone(event -> {
                if (event.getTransferMode() == TransferMode.MOVE) {
                    imv.setImage(null);
                }

                // Consume the event to prevent further handling
                event.consume();
            });
        }

        for (ImageView imv : ladang_imv) {
            System.out.println(imv);
            imv.setOnDragDetected(event -> {
                sourceImageView = (ImageView) event.getSource();
                Dragboard db = imv.startDragAndDrop(TransferMode.MOVE);
                ClipboardContent content = new ClipboardContent();
                content.putImage(imv.getImage());
                db.setContent(content);

                // Consume the event to prevent further handling
                event.consume();
            });

            imv.setOnDragOver(event -> {
                if (event.getDragboard().hasImage()) {
                    event.acceptTransferModes(TransferMode.MOVE);
                }

                // Consume the event to prevent further handling
                event.consume();
            });

            imv.setOnDragEntered(event -> {
                if (event.getDragboard().hasImage()) {
                    imv.setOpacity(0.7);
                }
            });
            imv.setOnDragExited(event -> {
                imv.setOpacity(1);
            });
            imv.setOnDragDropped(event -> {
                System.out.println(sourceImageView.getId().length());
                Dragboard db = event.getDragboard();
                boolean success = false;
                if (sourceImageView.getId().length() == 10) {
                    System.out.println("Flag");
                    System.out.println(checkLadangAble(sourceImageView, imv));
                    if (checkLadangAble(sourceImageView, imv) == 1) {
                        System.out.println("FlagLA");
                        imv.setImage(db.getImage());
                        sourceImageView.setImage(null);
                        success = true;
                        SwicthDecktoLadang(sourceImageView, imv);
                    } else if (getKartuAtImv(imv,1) instanceof KartuHewan || getKartuAtImv(imv,1) instanceof KartuTanaman) {
                        sourceImageView.setImage(null);
                        success = true;
                        addItemTo(sourceImageView,imv);
                    }
                }else{
                    if (imv.getImage() == null) {
                        imv.setImage(db.getImage());
                        sourceImageView.setImage(null);
                        success = true;
                    }
                }
                event.setDropCompleted(success);

                // Consume the event to prevent further handling
                event.consume();
            });

            // When the drag operation is done on the source ImageView
            imv.setOnDragDone(event -> {
                if (event.getTransferMode() == TransferMode.MOVE) {
                    imv.setImage(null);
                }

                // Consume the event to prevent further handling
                event.consume();
            });
        }
    }
    public GameManager getManager() {
        return manager;
    }

    public void start_turn(){
        this.manager.start_turn();
    }

    @FXML
    private void setTurn(Integer turn) {
        label_turn.setText("Turn \n"+turn);
    }

    @FXML
    private void setDeck_count(Integer count) {
        label_turn.setText("Deck\n"+count+"/40");
    }


    @FXML
    public void next(){
        this.manager.next_turn();
        setTurn(manager.getTurn());
        init_ladang_deck(deck_imv,ladang_imv);
    }

    public Kartu getKartuAtImv(ImageView imv, Integer type){
        Integer id;
       if (type == 1){
           id = imv_deck_name_to_petakid(imv);
           return manager.getCurrPlayer().getDeck().getActive_deck().get(id-1);
       }else{
           id = imv_ladang_name_to_petakid(imv);
           return manager.getCurrPlayer().getLadang().getKartuAt(id);
       }

    }
    public Integer imv_ladang_name_to_petakid(ImageView imv){
        String id = imv.getId().substring(15);
        return Integer.valueOf(id);
    }

    public Integer imv_deck_name_to_petakid(ImageView imv){
        String id = imv.getId().substring(9);
        return Integer.valueOf(id);
    }

    public void SwitchPetak(ImageView imv1, ImageView imv2){
        Integer id1,id2;
        id1 = imv_ladang_name_to_petakid(imv1);
        id2 = imv_ladang_name_to_petakid(imv2);

        Pemain p = manager.getCurrPlayer();
        Ladang p_ladang = p.getLadang();
        p_ladang.swtichPetak(id1,id2);
    }

//    public void SwicthDeck(ImageView imv1,ImageView imv2){
//        Integer id1,id2;
//        id1 = imv_deck_name_to_petakid(imv1);
//        id2 = imv_deck_name_to_petakid(imv2);
//
//        Pemain p = manager.getCurrPlayer();
//        Deck p_ladang = p.getLadang();
//        p_ladang.swtichPetak(id1,id2);
//    }

    public void SwicthDecktoLadang(ImageView imv1,ImageView imv2){
        Integer id1,id2;
        id1 = imv_deck_name_to_petakid(imv1);
        id2 = imv_ladang_name_to_petakid(imv2);

        Pemain p = manager.getCurrPlayer();
        Deck p_deck = p.getDeck();

        Kartu kartu = p_deck.getActive_deck().remove(id1-1);
        Ladang p_ladang = p.getLadang();
        p_ladang.getPetak().put(id2,kartu);
    }

    public Integer checkLadangAble(ImageView imv, ImageView target){
        Integer id = imv_deck_name_to_petakid(imv);
        Pemain p = manager.getCurrPlayer();
        Deck p_deck = p.getDeck();
//        System.out.println("Flag bf");
        Kartu kartu = p_deck.getActive_deck().get(id-1);
//        System.out.println(kartu instanceof KartuHewan);
//        System.out.println(kartu instanceof KartuTanaman);
        if (kartu instanceof KartuHewan || kartu instanceof KartuTanaman){
            return 1;
        } else if (kartu instanceof KartuItem) {
            Integer id_tar = imv_deck_name_to_petakid(imv);
            Ladang p_ladang = p.getLadang();
            Kartu kartu_lad = p_ladang.getKartuAt(id_tar);
            if(kartu_lad instanceof KartuHewan || kartu_lad instanceof KartuTanaman){
                return 2;
            }
            else {
                return 0;
            }
        }
        return 0;
    }

    public void addItemTo(ImageView source,ImageView target){
        Integer id1,id2;
        id1 = imv_deck_name_to_petakid(source);
        id2 = imv_ladang_name_to_petakid(target);

        Pemain p = manager.getCurrPlayer();
        Deck p_deck = p.getDeck();

        Kartu kartu = p_deck.getActive_deck().remove(id1-1);
        Ladang p_ladang = p.getLadang();
        Kartu lad_kartu = p_ladang.getPetak().get(id2);
        if (lad_kartu instanceof KartuHewan){
            ((KartuHewan) lad_kartu).addItem((KartuItem)kartu);
        }else{
            ((KartuTanaman) lad_kartu).addItem((KartuItem)kartu);
        }
    }

    public void init_ladang_deck(List<ImageView> deck_imv,List<ImageView> ladang_imv){
        Pemain p = manager.getCurrPlayer();
        if (!p.getDeck().getActive_deck().isEmpty()){
            for (ImageView imv : deck_imv){
                Integer id = imv_deck_name_to_petakid(imv);
                if (id <= p.getDeck().getActive_deck().size()){
                    imv.setImage(new Image(p.getDeck().getActive_deck().get(id-1).getImagePath()));
                }
            }
        }else{
            for (ImageView imv : deck_imv){
                imv.setImage(null);
            }
        }
        for (ImageView imv : ladang_imv){
            Integer id = imv_ladang_name_to_petakid(imv);
            if (p.getLadang().getKartuAt(id) != null){
                imv.setImage(new Image(p.getLadang().getKartuAt(id).getImagePath()));
            }else{
                imv.setImage(null);
            }
        }

    }


}
