package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javafx.scene.image.ImageView;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
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
        root.getChildren().add((Node) FXMLLoader.load(getClass().getResource("sample.fxml")));
        primaryStage.setTitle("Checkers");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
