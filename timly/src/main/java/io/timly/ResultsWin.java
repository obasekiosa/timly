package io.timly;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ResultsWin {

    public static String timezone;
    public static String timeGap;
    public static String convTimeGap;
    
    public static void resultsWin(Stage stage, Intersections inter) {
        Stage resultsWin = new Stage();
        StackPane stackPane = new StackPane();
        Scene scene = new Scene(stackPane, 1080, 820);

        resultsWin.setMinHeight(700);
        resultsWin.setMinWidth(900);  

        VBox mainVBox = new VBox();
        VBox convVBox = new VBox();
        HBox buttonHBox = new HBox();
        HBox convHBox = new HBox();

        timezone = "UTC";
        timeGap = "some TimeGap returned from a backend method";
        convTimeGap = "select a timezone to make a convertion to";

        Label mainLabel = new Label("Overlaping time gaps in timezone " + timezone);
        mainLabel.setFont(Font.font("Courier New", FontWeight.BOLD, FontPosture.REGULAR, 28));

        Label resultslabel = new Label(timeGap);
        resultslabel.setFont(Font.font("verdana", FontWeight.NORMAL, FontPosture.REGULAR, 16));
        
        Button convertButton = new Button("Convert");
        convertButton.setFont(Font.font("verdaba", FontWeight.NORMAL, FontPosture.REGULAR, 16));
        convertButton.setPrefSize(100.0, 40.0);
        convertButton.setTextAlignment(TextAlignment.CENTER);

        Label toLabel = new Label("Convert To");
        toLabel.setFont(Font.font("verdana", FontWeight.NORMAL, FontPosture.REGULAR, 16));

        ComboBox<String> timezoneCombo = new ComboBox<String>();
        timezoneCombo.getItems().addAll("IST", "GMT", "EST", "WAT", "UTC");
        timezoneCombo.getSelectionModel().select(4);
        timezoneCombo.setStyle("-fx-font-size: 16");

        Label convertResLabel = new Label(convTimeGap);
        convertResLabel.setFont(Font.font("verdana", FontWeight.NORMAL, FontPosture.REGULAR, 16));

        Button backButton = new Button("Back");
        backButton.setFont(Font.font("verdaba", FontWeight.NORMAL, FontPosture.REGULAR, 16));
        backButton.setPrefSize(100.0, 40.0);
        backButton.setTextAlignment(TextAlignment.CENTER);

        stackPane.getChildren().addAll(mainVBox);
        mainVBox.getChildren().addAll(mainLabel, resultslabel ,convVBox, buttonHBox);
        convVBox.getChildren().addAll(convHBox, convertResLabel);
        convHBox.getChildren().addAll(toLabel, timezoneCombo);
        buttonHBox.getChildren().addAll(convertButton, backButton);

        mainVBox.setSpacing(50);
        convVBox.setSpacing(20);
        convHBox.setSpacing(15);
        buttonHBox.setSpacing(15);

        mainVBox.setAlignment(Pos.CENTER);
        convVBox.setAlignment(Pos.CENTER);
        buttonHBox.setAlignment(Pos.CENTER);
        convHBox.setAlignment(Pos.CENTER);

        stackPane.setPadding(new Insets(10, 10, 10, 10));

        resultsWin.setTitle("Timly Results");
        resultsWin.setScene(scene);
        resultsWin.show();

        convertButton.setOnMouseClicked(new EventHandler<Event>() {

            @Override
            public void handle(Event event) {
                if(timezone.equals(timezoneCombo.getValue())){
                    Alert alert = new Alert(AlertType.WARNING);
	                alert.initModality(Modality.APPLICATION_MODAL);
	                alert.initOwner(resultsWin);
	                alert.setTitle("Timezone warning");
	                alert.setHeaderText("Timezones are the same");
	                alert.setContentText("You need to select a different timezone");
	                alert.showAndWait();
                }
                else{
                    convTimeGap = "some convTimeGap returned from a backend method";
                    convertResLabel.setText(convTimeGap);
                }
            }    
        });

        backButton.setOnMouseClicked(new EventHandler<Event>() {

            @Override
            public void handle(Event event) {
                MainWin.mainWin(stage);
                resultsWin.close();
            }
            
        });

    }
}
