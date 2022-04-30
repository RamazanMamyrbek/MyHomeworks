package javafx_media;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;

public class Ex1624 extends Application {
    MediaPlayer mediaPlayer;
    Slider slider;
    String str;
    int a;
    Label totalsec;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        File video = new File("src/video5294242964137055563.mp4");

        Media media = new Media(video.toURI().toString());
         mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);
        mediaPlayer.setAutoPlay(true);

        mediaPlayer.setOnReady(new Runnable() {

            @Override
            public void run() {

                System.out.println("Duration: "+ media.getDuration().toSeconds());


                // play if you want
                mediaPlayer.play();
            }
        });

        totalsec = new Label(media.getDuration().toSeconds() + "");


        Button pause = new Button(">");
        pause.setOnAction(e -> {
            if(pause.getText().equals(">")){
                mediaPlayer.pause();
                pause.setText("||");
            }
            else if(pause.getText().equals("||")){
                mediaPlayer.play();
                pause.setText(">");
            }
        });

        Slider volume = new Slider();
        volume.setShowTickLabels(false);
        volume.setShowTickMarks(false);
        volume.setValue(50);
        mediaPlayer.volumeProperty().bind(volume.valueProperty().divide(100));


         slider = new Slider();
        slider.setShowTickLabels(false);
        slider.setShowTickMarks(false);
        Double time = mediaPlayer.getTotalDuration().toSeconds();
        mediaPlayer.currentTimeProperty().addListener((ObservableValue<? extends Duration> observable, Duration oldValue, Duration newValue)  -> {
            slider.setValue(newValue.toSeconds());
        });
        initialize();





        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(pause, new Label("Time"), slider,totalsec,new Label("Volume"), volume);

        BorderPane pane = new BorderPane();
        pane.setCenter(mediaView);
        pane.setBottom(hbox);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise 16_24");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    private void initialize() {
        if (mediaPlayer.getStatus() == MediaPlayer.Status.UNKNOWN) {
            mediaPlayer.statusProperty().addListener((obs, oldStatus, newStatus) -> {
                if (newStatus == MediaPlayer.Status.READY) {
                    initializeSlider();
                }

            });
        } else {
            initializeSlider();
        }
    }
    private void initializeSlider() {
        slider.setMax(mediaPlayer.getTotalDuration().toSeconds());
        mediaPlayer.currentTimeProperty().addListener((obs, oldTime, newTime) ->
                slider.setValue(newTime.toSeconds()));
        slider.setOnMouseDragged(e -> {
            mediaPlayer.seek(Duration.seconds(slider.getValue()));
        });
        slider.setOnMousePressed(e -> mediaPlayer.seek(Duration.seconds(slider.getValue())));
    }

    private void setTimeForLabel(){

    }
}
