module MainWindow {
    requires javafx.fxml;
    requires javafx.controls;

    opens UI to javafx.fxml;
    exports UI;
    exports gameObject;
}