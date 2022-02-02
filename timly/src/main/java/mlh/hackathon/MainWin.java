package mlh.hackathon;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainWin {
    
    public static void mainWin(Stage stage) {
        Stage mainStage = new Stage();
        StackPane stackPane = new StackPane();
        Scene scene = new Scene(stackPane, 1080, 820);

        mainStage.setMinHeight(700);
        mainStage.setMinWidth(900);  

        VBox vbox = new VBox();

        Label label = new Label("some text");
        TextField textField = new TextField();

        stackPane.getChildren().addAll(vbox);
        vbox.getChildren().addAll(label, textField);

        vbox.setSpacing(20);

        textField.setText(label.getText());

        mainStage.setTitle("Timly");
        mainStage.setScene(scene);
        mainStage.show();
    }
}
