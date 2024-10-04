module org.example.colorchooser {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.colorchooser to javafx.fxml;
    exports org.example.colorchooser;
}