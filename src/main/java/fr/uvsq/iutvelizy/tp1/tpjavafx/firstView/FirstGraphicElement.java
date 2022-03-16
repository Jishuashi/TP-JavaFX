package fr.uvsq.iutvelizy.tp1.tpjavafx.firstView;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;


public class FirstGraphicElement extends Application {
    public void start(Stage stage){
        VBox root = new VBox();
        Scene scene = new Scene(root, 300, 80);
        File css = new File("src/main/CSS" + File.separator+"firstStyle.css");
        scene.getStylesheets().add(css.toURI().toString());

        Label labelHello = new Label("Hello");
        root.getChildren().add(labelHello);
        Label labelHelloBis = new Label("HelloJavaFX");
        root.getChildren().add(labelHelloBis);


        stage.setScene(scene);
        stage.setTitle("Hello Java FX");
        stage.show();
    }
}
