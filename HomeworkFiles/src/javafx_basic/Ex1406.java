package javafx_basic;

import com.sun.scenario.effect.impl.prism.ps.PPSOneSamplerPeer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ex1406 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(0);
        pane.setVgap(0);
        boolean b = true;
        for(int i = 0; i < 8; i++){
            b = !b;
            for(int j = 0; j < 8; j++){

                Rectangle rectangle = new Rectangle(30, 30);
                rectangle.setStroke(Color.BLACK);
                if(!b)
                rectangle.setFill(Color.WHITE);
                else
                    rectangle.setFill(Color.BLACK);
                b = !b;
                pane.add(rectangle, j, i);
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise14_06");
        primaryStage.show();
    }
}
