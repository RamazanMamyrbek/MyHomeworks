package networking;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;
import java.util.Date;

public class Ex3104Client extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    Text txt = new Text();
    @Override
    public void start(Stage primaryStage) {

        primaryStage.setScene(new Scene(new StackPane(txt), 250, 250));
        primaryStage.show();

        new Thread(() -> {
            try{
            Socket socket = new Socket("localhost", 8081);

                DataInputStream input = new DataInputStream(socket.getInputStream());

                Platform.runLater(() -> {
                    try{
                        txt.setText("You are visitor: " + input.readInt());
                    }catch(Exception e){

                    }
                });
            }catch(Exception EX){
                EX.printStackTrace();
            }

        }).start();
    }
}
