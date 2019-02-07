package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public abstract class Board extends Application{
    public static void makeBoard(Stage primaryStage) {
        double sceneWidth = 300;
        double sceneHeight = 300;
        double gridWidth = sceneWidth / 8;
        double gridHeight = sceneHeight / 8;
        String occupied = "";
        Spaces[][] board = new Spaces[8][8];
        Group root = new Group();
        for(int x=0; x < board.length; x++) {
            for(int y = 0; y < board[x].length; y++) {
                Spaces node = new Spaces(x, y, occupied, x * gridWidth, y * gridHeight, gridWidth, gridHeight);
                root.getChildren().add(node);
                board[x][y] = node;
            }
        }

        Scene scene = new Scene(root, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
