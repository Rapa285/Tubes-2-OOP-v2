package UI;

import gameObject.GameManager;
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

//    private List<ImageView> deck_images;
//    private List<ImageView> imagesviews;
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

        ImageView2.setImage(new Image("file:src/gameobject_resource/Hewan/chicken.png"));
        ImageView1.setImage(new Image("file:src/gameobject_resource/Hewan/cow.png"));
        gulden_1.setImage(new Image("file:src/gameobject_resource/Other/gulden.png"));
        gulden_2.setImage(new Image("file:src/gameobject_resource/Other/gulden.png"));

        List<ImageView> deck_imv = new ArrayList<ImageView>(Arrays.asList(
                ImageView1, ImageView2, ImageView3, ImageView4, ImageView5, ImageView6
        ));

        List<ImageView> ladang_imv = new ArrayList<ImageView>(Arrays.asList(
                ImageViewLadang1, ImageViewLadang2, ImageViewLadang3, ImageViewLadang4, ImageViewLadang5,
                ImageViewLadang6, ImageViewLadang7, ImageViewLadang8, ImageViewLadang9, ImageViewLadang10,
                ImageViewLadang11, ImageViewLadang12, ImageViewLadang13, ImageViewLadang14, ImageViewLadang15,
                ImageViewLadang16, ImageViewLadang17, ImageViewLadang18, ImageViewLadang19, ImageViewLadang20
        ));
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
                Dragboard db = event.getDragboard();
                boolean success = false;
                if (imv.getImage() == null) {
                    // If target ImageView is empty, just set the new image
                    imv.setImage(db.getImage());
                    sourceImageView.setImage(null);
                    success = true;
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
    }
}
