package javafx_media;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex1601 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();
        RadioButton rb1 = new RadioButton("Red");
        RadioButton rb2 = new RadioButton("Yellow");
        RadioButton rb3 = new RadioButton("Black");
        RadioButton rb4 = new RadioButton("Orange");
        RadioButton rb5 = new RadioButton("Green");
        ToggleGroup group = new ToggleGroup();
        rb1.setToggleGroup(group);
        rb2.setToggleGroup(group);
        rb3.setToggleGroup(group);
        rb4.setToggleGroup(group);
        rb5.setToggleGroup(group);

        Pane panel = new Pane();
        Text lbl = new Text("Programming is fun");
        lbl.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20) );
        lbl.setY(40);
        panel.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        panel.getChildren().add(lbl);



        Button btnLeft = new Button("<=");
        Button btnRight = new Button("=>");




        HBox hbox1 = new HBox(10);

        hbox1.getChildren().addAll(rb1, rb2, rb3, rb4, rb5);
        HBox hbox2 = new HBox(10);
        hbox2.setAlignment(Pos.CENTER);
        hbox2.getChildren().addAll(btnLeft, btnRight);

        btnLeft.setOnAction(e -> {
            if(lbl.getX() >= 5)
            lbl.setX(lbl.getX()-10);
        });
        btnRight.setOnAction(e -> {
            if(lbl.getX() <= 125)
            lbl.setX(lbl.getX()+10);
        });

        rb1.setOnAction(e -> {
            lbl.setFill(Color.RED);
        });
        rb2.setOnAction(e -> {
            lbl.setFill(Color.YELLOW);
        });
        rb3.setOnAction(e -> {
            lbl.setFill(Color.BLACK);
        });
        rb4.setOnAction(e -> {
            lbl.setFill(Color.ORANGE);
        });
        rb5.setOnAction(e -> {
            lbl.setFill(Color.GREEN);
        });
        pane.setTop(hbox1);
        pane.setCenter(panel);
        pane.setBottom(hbox2);
        primaryStage.setScene(new Scene(pane, 300, 100));
        primaryStage.show();
    }
}
