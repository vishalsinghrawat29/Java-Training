package com.vishal.example.temperatureconvertor;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Optional;

public class MyMain extends Application {

    public static void main(String[] args){
        System.out.println("main"); //not part of javafx lifecycle
        launch(args);
    }

    @Override
    public void init() throws Exception {
        System.out.println("init"); //Initialize an application
        super.init();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        System.out.println("start"); //start an application

        FXMLLoader loader = new
                FXMLLoader(getClass().getResource("app_layout.fxml"));
        VBox rootNode = loader.load();

        MenuBar menuBar = createMenu();
        rootNode.getChildren().add(0,menuBar);

        Scene scene = new Scene(rootNode);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Temperature Convertor Tool");
        primaryStage.show();

    }

    public MenuBar createMenu(){
        //File Menu
        Menu fileMenu = new Menu("File");
        MenuItem newMenuItem = new MenuItem("New");

        newMenuItem.setOnAction(actionEvent -> System.out.println("New Menu Item Clicked"));

        SeparatorMenuItem separatorMenuItem =  new SeparatorMenuItem();
        MenuItem quitMenuItem = new MenuItem("Quit");

        quitMenuItem.setOnAction(actionEvent -> {
            Platform.exit(); //shutdown current application
            System.exit(0); // shut down current virtual machine
        });

        fileMenu.getItems().addAll(newMenuItem, separatorMenuItem, quitMenuItem);


        //Help Menu
        Menu helpMenu = new Menu("Help");
        MenuItem aboutApp = new MenuItem("About");

        aboutApp.setOnAction(actionEvent -> aboutApp());

        helpMenu.getItems().addAll(aboutApp);

        //Menu Bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu,helpMenu);

        return menuBar;
    }

    private void aboutApp() {
        Alert alertDialog =  new Alert(Alert.AlertType.INFORMATION); //ALERT CREATE
        alertDialog.setTitle("My First Desktop App");  //TITLE
        alertDialog.setHeaderText("Learning JavaFx"); //HEADERtEXT
        alertDialog.setContentText("I am just a begineer but soon I will be pro and start Developing awesome Java Games"); //DESCRIPTION

        //CUSTOM BUTTON
        ButtonType yesBtn = new ButtonType("Yes");
        ButtonType noBtn = new ButtonType("No");

        //ADDING BUTTON IN DIALOG
        alertDialog.getButtonTypes().setAll(yesBtn, noBtn);



        //GET WHICH BUTTON CLICKED BY USER
        Optional<ButtonType> clickedBtn =  alertDialog.showAndWait();

        //OPERATION ON CLICKED BUTTON
        if (clickedBtn.isPresent() && clickedBtn.get() == yesBtn ){
            System.out.println("Yes Button clicked");
        }else {
            System.out.println("No Button clicked");
        }
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop"); //called when application stopped and is about to shut down
        super.stop();
    }
}
