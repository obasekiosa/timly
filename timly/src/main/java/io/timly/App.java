package io.timly;

import javafx.application.Application;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {

        MainWin.mainWin(stage);
    }

    public static void main(String[] args) {
        launch();
    }

}