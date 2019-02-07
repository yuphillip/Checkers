package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        String color = "";
        double sceneWidth = 300;
        double sceneHeight = 300;
        double gridWidth = sceneWidth / 8;
        double gridHeight = sceneHeight / 8;
        Spaces[][] board = new Spaces[8][8];
        Group root = new Group();
        for(int x=0; x < board.length; x++) {
            for(int y = 0; y < board[x].length; y++) {
                if((x+y)%2 == 0 && y <= 3)
                {
                     color = "black";
                }
                else if(y >= 4 && y <= 5)
                {
                    color = "";
                }
                else
                {
                    color = "red";
                }
                CheckerPiece piece = new CheckerPiece(color, x, y);
                Spaces node = new Spaces(x, y, piece, x * gridWidth, y * gridHeight, gridWidth, gridHeight);
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
