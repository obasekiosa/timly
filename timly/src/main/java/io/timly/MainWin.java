package io.timly;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import java.time.*;
import java.time.chrono.*;
public class MainWin extends Application {

	// launch the application
	public void start(Stage s)
	{
		// set title for the stage
		s.setTitle("creating date picker");

		// create a tile pane
		TilePane r = new TilePane();

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
		r.getChildren().add(d);
		r.getChildren().add(l);

		// create a scene
		Scene sc = new Scene(r, 200, 200);

		// set the scene
		s.setScene(sc);

		s.show();
	}

	public static void main(String args[])
	{
		// launch the application
		launch(args);
	}
}
