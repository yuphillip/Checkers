package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javafx.scene.image.ImageView;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Checkers");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        Spaces[][] board = new Spaces[8][8];
        for (int x = 0; x<board.length; x++)
        {
            for (int y = 0; y < board[x].length; y++)
            {
                board[x][y] = new Spaces(x,y,"");
                System.out.print(board[x][y]);
            }
            System.out.println();
        }
        launch(args);
    }
}
