module com.example.demo5 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.Zagoskin_Java_GUI to javafx.fxml;
    exports com.example.Zagoskin_Java_GUI;
}