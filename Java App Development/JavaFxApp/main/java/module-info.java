module com.vishal.example.javafxapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.vishal.example.javafxapp to javafx.fxml;
    exports com.vishal.example.javafxapp;
}