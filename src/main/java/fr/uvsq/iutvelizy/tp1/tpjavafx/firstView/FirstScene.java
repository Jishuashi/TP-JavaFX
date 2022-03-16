package fr.uvsq.iutvelizy.tp1.tpjavafx.firstView;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FirstScene extends Application{
    public void start(Stage stage){
        VBox root = new VBox();
        Scene scene = new Scene(root, 400, 150);
        stage.setScene(scene);
        stage.setTitle("Hello JavaFX");
        stage.show();
    }

}
