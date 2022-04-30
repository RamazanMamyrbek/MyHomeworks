package networking;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Ex3104Server extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    public static int clientnomer = 0;
    @Override
    public void start(Stage primaryStage) {
        TextArea text = new TextArea();

        primaryStage.setScene(new Scene(new ScrollPane(text), 400, 200));
        primaryStage.show();

        new Thread(() -> {
            try{
                ServerSocket server = new ServerSocket(8081);
                Platform.runLater(() -> {
                    text.setText("Exercise 31_04. Server started at:  " + new Date() + "\n");
                });

                while(true){
                    Socket socket = server.accept();

                    new DataOutputStream(socket.getOutputStream()).writeInt(++clientnomer);



                    Platform.runLater(() -> {text.appendText("Starting thread " + clientnomer  + "\n");
                        InetAddress address = socket.getInetAddress();
                        text.appendText("Client IP: " + address.getHostAddress()  + "\n");

                    });

                }

            }catch (IOException ex){
                ex.printStackTrace();
            }


        }).start();
    }
    public static void setNomer(int nomer){
        Ex3104Server.clientnomer  = nomer;
    }
    public static int getNomer(){
        return clientnomer;
    }
}
