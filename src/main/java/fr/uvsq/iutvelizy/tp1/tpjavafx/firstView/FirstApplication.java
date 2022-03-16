package fr.uvsq.iutvelizy.tp1.tpjavafx.firstView;

import javafx.application.Application;
import javafx.stage.Stage;

public class FirstApplication extends Application {

    public void start(Stage stage)   {
        stage.setTitle("Hello JavaFX");
        stage.setWidth(400);
        stage.setHeight(150);
        stage.centerOnScreen();
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch();
    }

}