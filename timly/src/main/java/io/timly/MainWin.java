package io.timly;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.time.*;
public class MainWin extends Application {

	// launch the application
	public void start(Stage s)
	{
        StackPane st= new StackPane();
		// set title for the stage
       // Label description_label =
        //new Label("This is a combo box example ");

// Weekdays
String from[] =
      { "0:00", "1:00", "2:00",
                       "3:00", "4:00", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00","12:00",
					   "13:00","14:00","15:00","16:00","17:00","18:00","19:00","20:00","21:00" ,"22:00","23:00"};
					   String to[] =
					   {  "1:00", "2:00",
                       "3:00", "4:00", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00","12:00",
					   "13:00","14:00","15:00","16:00","17:00","18:00","19:00","20:00","21:00" ,"22:00","23:00","0:00"};
String timezones[] =
      { "IST", "GMT", "EST",
                       "UTC" };

// Create a combo box
ComboBox combo_box =
        new ComboBox(FXCollections
                    .observableArrayList(from));

                    ComboBox combo_box2 =
        new ComboBox(FXCollections
                    .observableArrayList(to));

					ComboBox combo_box3 =
        new ComboBox(FXCollections
                    .observableArrayList(timezones));


					ComboBox combo_boxn =
        new ComboBox(FXCollections
                    .observableArrayList(from));

                    ComboBox combo_box2n =
        new ComboBox(FXCollections
                    .observableArrayList(to));

					ComboBox combo_box3n =
        new ComboBox(FXCollections
                    .observableArrayList(timezones));


					ComboBox combo_boxnn =
        new ComboBox(FXCollections
                    .observableArrayList(from));

                    ComboBox combo_box2nn =
        new ComboBox(FXCollections
                    .observableArrayList(to));

					ComboBox combo_box3nn =
        new ComboBox(FXCollections
                    .observableArrayList(timezones));

					ComboBox combo_boxnx =
        new ComboBox(FXCollections
                    .observableArrayList(from));

                    ComboBox combo_box2nx =
        new ComboBox(FXCollections
                    .observableArrayList(to));

					ComboBox combo_box3nx =
        new ComboBox(FXCollections
                    .observableArrayList(timezones));

	Button resultButton = new Button("Result");
	resultButton.setFont(Font.font("verdaba", FontWeight.NORMAL, FontPosture.REGULAR, 16));
		
VBox v1= new VBox();
HBox h1= new HBox();
HBox h2= new HBox();
HBox h3= new HBox();
HBox h4= new HBox();
HBox h5= new HBox();
h1.getChildren().addAll(combo_box,combo_box2,combo_box3);
h2.getChildren().addAll(resultButton);
h3.getChildren().addAll(combo_boxn,combo_box2n,combo_box3n);
h4.getChildren().addAll(combo_boxnn,combo_box2nn,combo_box3nn);
h5.getChildren().addAll(combo_boxnx,combo_box2nx,combo_box3nx);
v1.getChildren().addAll(h1,h3,h4,h5,h2);
st.getChildren().addAll(v1);
v1.setAlignment(Pos.CENTER);
		
		Scene sc = new Scene(st, 200, 200);

       
		s.setScene(sc);
     

		s.show();
	}

	public static void main(String args[])
	{
		// launch the application
		launch(args);
	}

    public static void mainWin(Stage stage) {
    }
}
