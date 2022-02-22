package com.example.w22st200352106assign1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

// Extends application means we'll be making our own application
public class Main extends Application {

    @Override
    //  Stage is the main window (set the stage of a play for example)
    public void start(Stage stage) throws IOException {

        //  Chooses what file we want to load
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("studentcard-view.fxml"));

        //  A scene that is a part of the Stage
        Scene scene = new Scene(fxmlLoader.load());

        //  Title of the stage (Top left of window)
        stage.setTitle("Student Card");

        //
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}