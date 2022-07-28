package com.example.javafxapp2;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Contoller implements Initializable {

    @FXML
    public Pane myPane;

    @FXML
    public Button myButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Circle circle = new Circle();
        circle.setRadius(20);
        circle.setFill(Color.RED);
        circle.setTranslateX(50); // Move the circle 50 pixel along the posititve X Axis
        circle.setTranslateY(75); // Move the circle 50 pixel along the posititve Y Axis

        myPane.getChildren().add(circle);

        myButton.setOnAction(actionEvent -> {
            startAnimation(circle);
        });

    }

    private void startAnimation(Circle circle) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(0.5),circle);
        transition.setToX(300);
        transition.play();
    }

}
