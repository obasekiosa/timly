package mlh.hackathon;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ResultsWin {
    
    public static void resultsWin(Stage stage) {
        Stage resultsStage = new Stage();
        StackPane stackPane = new StackPane();
        Scene scene = new Scene(stackPane, 1080, 820);

        resultsStage.setMinHeight(700);
        resultsStage.setMinWidth(900);  

        VBox vbox = new VBox();

        /*Label label = new Label("some text");
        TextField textField = new TextField();

        stackPane.getChildren().addAll(vbox);
        vbox.getChildren().addAll(label, textField);*/

        vbox.setSpacing(20);

       // textField.setText(label.getText());

        resultsStage.setTitle("Timly Results");
        resultsStage.setScene(scene);
        resultsStage.show();
    }
}
