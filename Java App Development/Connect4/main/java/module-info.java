module com.vishal.connect4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.vishal.connect4 to javafx.fxml;
    exports com.vishal.connect4;
}