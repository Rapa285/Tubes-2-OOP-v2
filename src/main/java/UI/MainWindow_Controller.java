package UI;

import gameObject.GameManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;


public class MainWindow_Controller {

    private GameManager manager;

    public Button butt_next;
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

//    @FXML
//    private void dragDetected(javafx.scene.input.MouseEvent event, ImageView source) {
//        Dragboard dragboard = source.startDragAndDrop(TransferMode.COPY);
//        ClipboardContent content = new ClipboardContent();
//        content.putImage(source.getImage());
//        dragboard.setContent(content);
//        event.consume();
//    }

//    @FXML
//    private void dragOver(DragEvent event) {
//        if (event.getGestureSource() != event.getSource() &&
//                event.getDragboard().hasImage()) {
//            event.acceptTransferModes(TransferMode.COPY);
//        }
//        event.consume();
//    }
//
//    @FXML
//    private void dragDropped(DragEvent event, ImageView target) {
//        Dragboard dragboard = event.getDragboard();
//        boolean success = false;
//        if (dragboard.hasImage()) {
//            target.setImage(dragboard.getImage());
//            success = true;
//        }
//        event.setDropCompleted(success);
//        event.consume();
//    }
//
//    @FXML
//    void imageviewDragOver(DragEvent event){
//        Dragboard dragboard = event.getDragboard();
//        if (dragboard.hasImage()) {
//            event.acceptTransferModes(TransferMode.COPY);
//        }
//        System.out.println("drag over");
//    }

//    @FXML
//    void imageviewDragDropped(DragEvent event){
//        Dragboard dragboard = event.getDragboard();
//        dragboard.
//        if (dragboard.hasImage()) {
//            imageview.setImage(new Image(dragboard.getImage().toString()));
//        }
//        System.out.println("Dropped");
//    }

    @FXML
    public void next(){
        this.manager.next_turn();
        setTurn(manager.getTurn());
    }
}
