package UI;

import gameObject.GameManager;
import gameObject.Kartu.KartuHewan.*;
import gameObject.Pemain.Pemain;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenu extends Application {
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("MainWindow.fxml")));
//        FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("DeckP1.fxml")));
        Pemain p1 = new Pemain("Player1",1);
        Pemain p2 = new Pemain("Player2",2);
        p1.getDeck_active().add(new KartuAyam());
        p1.getDeck_active().add(new KartuSapi());
        p1.getDeck_active().add(new KartuHiuDarat());
        p1.getDeck_active().add(new KartuKuda());
        p1.getDeck_active().add(new KartuBeruang());
        p1.getDeck_active().add(new KartuDomba());


        p2.getDeck_active().add(new KartuSapi());
        p2.getDeck_active().add(new KartuHiuDarat());
        p2.getDeck_active().add(new KartuBeruang());
        p2.getDeck_active().add(new KartuDomba());


        System.out.println(p1.getDeck_active());
        MainWindow_Controller MWcon= new MainWindow_Controller(new GameManager(p1,p2));
        fxmlLoader.setController(MWcon);

//        MWcon.initialize();


//        Parent root = fxmlLoader.load();
//        Parent parent = (Parent) fxmlLoader.getController();
//        Scene scene = new Scene(root, 320, 240);
        Scene scene1 = fxmlLoader.load();
        primaryStage.setTitle("test");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");
        launch(args);
    }
}
