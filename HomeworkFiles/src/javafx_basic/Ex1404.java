package javafx_basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex1404 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
    GridPane pane = new GridPane();
    pane.setAlignment(Pos.CENTER);
    pane.setHgap(10);
    pane.setVgap(10);

    for(int i = 0; i < 5; i++){
        Text text = new Text("JAVA");
        Color color = Color.color(Math.random() ,Math.random() ,Math.random(), Math.random());
        text.setFill(color);
        text.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
        text.setRotate(90);

        pane.add(text, i, 0);
    }

    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Exercise14_04");
    primaryStage.show();

    }
}
