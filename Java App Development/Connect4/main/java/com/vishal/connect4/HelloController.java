package com.vishal.connect4;

import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Point2D;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HelloController implements Initializable {

    private static final int COLUMNS = 7;
    private static final int ROWS = 6;
    private static final int CIRCLE_DIAMETER = 80;
    private static final String discColor1 = "#24303E";
    private static final String discColor2 = "#4CAA88";

    private static String PLAYER_ONE = "Player One";
    private static String PALYER_TWO = "Player Two";
    private boolean isPlayerOneTurn = true;

    private Disc[][] insertedDiscArray = new Disc[ROWS][COLUMNS]; //for structural changes for developers

    @FXML
    public GridPane rootGridPane;

    @FXML
    public Pane insertedDiscPane;

    @FXML
    public Label playerNameLabel;

    @FXML
    public TextField playerOneTextField , playerTwoTextField;

    @FXML
    public Button setNamesButton;

    private boolean isAllowedToInsert = true; //Flag to avoid same color disc multiple times

    public void createPlayground(){

        Shape rectangleWithHole = createGameStructuralGrid();
        rootGridPane.add(rectangleWithHole,0,1);

        List<Rectangle> rectangleList = createClickableColumns();

        for (Rectangle rectangle: rectangleList) {
            rootGridPane.add(rectangle,0,1);
        }

        setNamesButton.setOnAction(actionEvent -> {
            // Write code here
            PLAYER_ONE = playerOneTextField.getText();
            PALYER_TWO = playerTwoTextField.getText();
            playerNameLabel.setText(isPlayerOneTurn? PLAYER_ONE : PALYER_TWO);
        });


    }

    private Shape createGameStructuralGrid(){

        Shape rectangleWithHole = new Rectangle((COLUMNS + 1) * CIRCLE_DIAMETER, (ROWS + 1) * CIRCLE_DIAMETER);

        for (int row = 0 ;row<ROWS; row++){
            for (int col = 0; col<COLUMNS;col++){
                Circle circle = new Circle();
                circle.setRadius(CIRCLE_DIAMETER/2);
                circle.setCenterX(CIRCLE_DIAMETER/2);
                circle.setCenterY(CIRCLE_DIAMETER/2);
                circle.setSmooth(true);

                circle.setTranslateX(col * (CIRCLE_DIAMETER +  5) + CIRCLE_DIAMETER/4);
                circle.setTranslateY(row* (CIRCLE_DIAMETER + 5) + CIRCLE_DIAMETER/4);

                rectangleWithHole = Shape.subtract(rectangleWithHole,circle);
            }
        }

        rectangleWithHole.setFill(Color.WHITE);

        return rectangleWithHole;

    }

    private List<Rectangle> createClickableColumns() {
        List<Rectangle> rectangleList = new ArrayList<>();

        for (int col = 0; col< COLUMNS;col++){
            Rectangle rectangle = new Rectangle(CIRCLE_DIAMETER, (ROWS + 1) * CIRCLE_DIAMETER);
            rectangle.setFill(Color.TRANSPARENT);
            rectangle.setTranslateX(col * (CIRCLE_DIAMETER +  5) + CIRCLE_DIAMETER /4);

            rectangle.setOnMouseEntered(mouseEvent -> rectangle.setFill(Color.valueOf("#eeeeee26")));
            rectangle.setOnMouseExited(mouseEvent -> rectangle.setFill(Color.TRANSPARENT));
            final int column = col;
            rectangle.setOnMouseClicked(mouseEvent ->  {
                if (isAllowedToInsert){
                    isAllowedToInsert = false; //when disc os being droppped then nor more disc will be insterted
                    insertDisc(new Disc(isPlayerOneTurn), column);
                }

            });

            rectangleList.add(rectangle);
        }

        return rectangleList;
    }

    private void insertDisc(Disc disc, int column) {

        int row = ROWS -1;
        while (row >= 0){
            if (getDiscIfPresent(row,column) == null){
                break;
            }
            row--;
        }

        if (row<0){ //If it is full , we cannot return anymore disc
            return;
        }

        insertedDiscArray[row][column] = disc;//For Structural Changes : for Developers
        insertedDiscPane.getChildren().add(disc);

        disc.setTranslateX(column * (CIRCLE_DIAMETER +  5) + CIRCLE_DIAMETER /4);

        int currerntRow = row;
        TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(0.5),disc);
        translateTransition.setToY(row* (CIRCLE_DIAMETER + 5) + CIRCLE_DIAMETER/4);

        translateTransition.setOnFinished(actionEvent -> {
            isAllowedToInsert = true; //Finally when disc is dropped allow next player to insert disk
            if (gameEnded(currerntRow,column)){
                gameOver();
                return;
            }
            isPlayerOneTurn = !isPlayerOneTurn;
            playerNameLabel.setText(isPlayerOneTurn? PLAYER_ONE : PALYER_TWO);
        });

        translateTransition.play();
    }

    private void gameOver() {
        String winner = isPlayerOneTurn ? PLAYER_ONE: PALYER_TWO;
        System.out.println("Winner is " + winner);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Connect Four");
        alert.setHeaderText("The Winner is " + winner);
        alert.setContentText("Want to play again? ");

        ButtonType yesBtn = new ButtonType("Yes");
        ButtonType noBtn = new ButtonType("No, Exit");
        alert.getButtonTypes().setAll(yesBtn,noBtn);

        Platform.runLater( () -> {
            Optional<ButtonType> btnClicked =  alert.showAndWait();
            if (btnClicked.isPresent() && btnClicked.get() == yesBtn){
                //user choose Yes so Reset the game
                resetGame();
            }else {
                //user choose No so Exit the game
                Platform.exit();
                System.exit(0);
            }
        });

    }

    public void resetGame() {
        insertedDiscPane.getChildren().clear(); //Remove all Inserted Disc from Pane
        for (int row = 0 ; row< insertedDiscArray.length; row++){ //Structurely, make all elements on insertedDiscArray NULL
            for (int col = 0 ; col< insertedDiscArray[row].length; col++){
                insertedDiscArray[row][col] = null;
            }
        }
        isPlayerOneTurn = true; //Let player start the game
        playerNameLabel.setText(PLAYER_ONE);

        createPlayground(); //prepare a fresh playground

    }

    private boolean gameEnded(int row, int column) {
        //vertical points
        // a small example: player has inserted his last disc at row =2 , column = 3
        // index of each element present in column [row][column] : 0,3      1,3     2,3     4,3     5,3 --> Point2D(x,y)
        //range of row calues = 0,1,2,3,4,5

        List<Point2D> verticalPoints = IntStream.rangeClosed(row - 3,row + 3) //range of row calues = 0,1,2,3,4,5
                .mapToObj(r -> new Point2D(r,column)) //0,3      1,3     2,3     4,3     5,3 --> Point2D(x,y)
                .collect(Collectors.toList());

        List<Point2D> horizontalPoints = IntStream.rangeClosed(column - 3,column + 3)
                .mapToObj(col -> new Point2D(row,col))
                .collect(Collectors.toList());

        Point2D startPoint1 = new Point2D(row-3, column+3);
        List<Point2D> diagonal1Points = IntStream.rangeClosed(0,6)
                .mapToObj(i -> startPoint1.add(i,-i))
                .collect(Collectors.toList());

        Point2D startPoint2 = new Point2D(row-3, column-3);
        List<Point2D> diagonal2Points = IntStream.rangeClosed(0,6)
                .mapToObj(i -> startPoint2.add(i,i))
                .collect(Collectors.toList());

        boolean isEnded = checkCombinations(verticalPoints) || checkCombinations(horizontalPoints)
                || checkCombinations(diagonal1Points) || checkCombinations(diagonal2Points);
        return isEnded;
    }

    private boolean checkCombinations(List<Point2D> points) {

        int chain = 0;
        for (Point2D point: points) {

            int rowIndexOfArray = (int) point.getX();
            int columnIndexOfArray = (int) point.getY();

            Disc disc = getDiscIfPresent(rowIndexOfArray,columnIndexOfArray);
            if (disc != null && disc.isPlayerOneMove == isPlayerOneTurn){ //if the inserted Disc belong to the current Player
                chain++;
                if(chain == 4){
                    return true;
                }
            }else {
                chain = 0;
            }
        }
        return false;
    }

    private Disc getDiscIfPresent(int row, int column){ // To prevent ArrayIndexOutOfBound
        if (row >= ROWS || row < 0 || column >= COLUMNS || column < 0){ //If row and column is invalid
            return null;
        }
        return insertedDiscArray[row][column];
    }

    private static class Disc extends Circle{
        private final boolean isPlayerOneMove;
        public Disc(boolean isPlayerOneMove){
            this.isPlayerOneMove = isPlayerOneMove;
            setRadius(CIRCLE_DIAMETER/2);
            setFill(isPlayerOneMove? Color.valueOf(discColor1): Color.valueOf(discColor2));
            setCenterX(CIRCLE_DIAMETER/2);
            setCenterY(CIRCLE_DIAMETER/2);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}