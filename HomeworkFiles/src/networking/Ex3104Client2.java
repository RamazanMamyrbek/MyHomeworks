package networking;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.net.Socket;

public class Ex3104Client2 extends Application {

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
