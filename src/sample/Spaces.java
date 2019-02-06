package sample;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Spaces extends StackPane {

    public Spaces(int x, int y, String piece, double x2, double y2, double width, double height) {

        // create rectangle
        Rectangle rectangle = new Rectangle( width, height);
        rectangle.setStroke(Color.BLACK);
        if((x+y)%2 == 0)
        {
            rectangle.setFill(Color.RED);
        }
        else
            rectangle.setFill(Color.BLACK);

        Label label = new Label();

        // set position
        setTranslateX( x2+100);
        setTranslateY( y2+100);

        getChildren().addAll( rectangle);
    }
}