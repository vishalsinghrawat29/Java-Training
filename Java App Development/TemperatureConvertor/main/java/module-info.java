module com.vishal.example.temperatureconvertor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.vishal.example.temperatureconvertor to javafx.fxml;
    exports com.vishal.example.temperatureconvertor;
}