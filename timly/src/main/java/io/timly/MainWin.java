package io.timly;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.time.*;
public class MainWin extends Application {

	// launch the application
	public void start(Stage s)
	{
        StackPane st= new StackPane();
		// set title for the stage
        Label description_label =
        new Label("This is a combo box example ");

// Weekdays
String week_days[] =
      { "IST", "GMT", "EST",
                       "UTC" };

// Create a combo box
ComboBox combo_box =
        new ComboBox(FXCollections
                    .observableArrayList(week_days));

                    ComboBox combo_box2 =
        new ComboBox(FXCollections
                    .observableArrayList(week_days));

// Create a tile pane





		s.setTitle("creating date picker");

		// create a tile pane
		

		// label to show the date
		Label l = new Label("no date selected");

		// create a date picker
		DatePicker d = new DatePicker();

		// action event
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e)
			{
				// get the date picker value
				LocalDate i = d.getValue();

				// get the selected date
				l.setText("Date :" + i);
			}
		};

		// show week numbers
		d.setShowWeekNumbers(true);

		// when datePicker is pressed
		d.setOnAction(event);

		// add button and label
		//r.getChildren().add(d);
		//r.getChildren().add(l);
VBox v1= new VBox();
HBox h1= new HBox();
h1.getChildren().addAll(combo_box,combo_box2);

v1.getChildren().addAll(h1);
st.getChildren().addAll(v1);
		// create a scene
		Scene sc = new Scene(st, 200, 200);

       // Scene sc2 = new Scene(tile_pane, 200, 200);

		// set the scene
		s.setScene(sc);
      //  s.setScene(sc2);

		s.show();
	}

	public static void main(String args[])
	{
		// launch the application
		launch(args);
	}
}
