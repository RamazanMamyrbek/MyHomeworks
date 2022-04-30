package eventDriven;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Ex1529 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Line line = new Line(0, 40, 300, 40);
        line.setVisible(false);

        Rectangle rec1 = new Rectangle(10, 10);
        rec1.setFill(Color.DARKBLUE);
        rec1.setX(25);
        rec1.setY(25);
        Rectangle rec2 = new Rectangle(50, 10);
        rec2.setFill(Color.BLUE);
        rec2.setX(5);
        rec2.setY(35);
        Circle c1 = new Circle(5);
        c1.setCenterX(20);
        c1.setCenterY(50);
        Circle c2 = new Circle(5);
        c2.setCenterX(40);
        c2.setCenterY(50);
        Pane pane = new Pane();
        Button btn = new Button("||");
        PathTransition PathTransition = new PathTransition(Duration.millis(4000), line, pane);
        PathTransition.setCycleCount(Timeline.INDEFINITE);
        PathTransition.play();
        btn.setOnMouseClicked(e -> {
            if(btn.getText() == "||"){
          PathTransition.pause();
          btn.setText(">");}
            else{
                PathTransition.play();
            btn.setText("||");}
        });
            Pane pane2 = new Pane();



        pane.getChildren().addAll(rec1, rec2, c1, c2, btn);
        pane2.getChildren().addAll(pane, btn);

        pane2.setOnKeyPressed(e -> {
            if(e.getCode() == KeyCode.DOWN){
                PathTransition.setRate(PathTransition.getRate()-2);
            }
            else if(e.getCode() == KeyCode.UP){
                PathTransition.setRate(PathTransition.getRate()+2);
            }

        });




        primaryStage.setScene((new Scene(pane2, 300, 60)));
        primaryStage.setTitle("Ex15_29");
        primaryStage.show();
    }
}
