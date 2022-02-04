package io.timly;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.time.*;
import java.util.ArrayList;
import java.util.List;
public class MainWin {


    public static List<Time> times = new ArrayList<>();

	// launch the application
	public static void mainWin(Stage stage) {

        Stage mainWinStage = new Stage();
        StackPane st = new StackPane();
        Scene sc = new Scene(st, 1080, 820);

        mainWinStage.setMinHeight(700);
        mainWinStage.setMinWidth(900); 

        String from[] = {   "0:00", "1:00", "2:00",
                            "3:00", "4:00", "5:00", 
                            "6:00", "7:00", "8:00", 
                            "9:00", "10:00", "11:00",
                            "12:00","13:00","14:00",
                            "15:00","16:00","17:00",
                            "18:00","19:00","20:00",
                            "21:00" ,"22:00","23:00"
                        };
                        
        String to[] = {     "1:00", "2:00", "3:00", 
                            "4:00", "5:00", "6:00", 
                            "7:00", "8:00", "9:00", 
                            "10:00", "11:00","12:00",
                            "13:00","14:00","15:00",
                            "16:00","17:00","18:00",
                            "19:00","20:00","21:00" ,
                            "22:00","23:00","0:00"
                        };

        String timezones[] = { "IST", "GMT", "EST", "WAT", "UTC" };

        // Create a combo box
        ComboBox<String> combo_box = new ComboBox<String>(FXCollections.observableArrayList(from));
        combo_box.getSelectionModel().select(0);

        ComboBox<String> combo_box2 = new ComboBox<String>(FXCollections.observableArrayList(to));
        combo_box2.getSelectionModel().select(22);

        ComboBox<String> combo_box3 =new ComboBox<String>(FXCollections.observableArrayList(timezones));
        combo_box3.getSelectionModel().select(0);

        ComboBox<String> combo_boxn = new ComboBox<String>(FXCollections.observableArrayList(from));
        combo_boxn.getSelectionModel().select(0);

        ComboBox<String> combo_box2n = new ComboBox<String>(FXCollections.observableArrayList(to));
        combo_box2n.getSelectionModel().select(22);

        ComboBox<String> combo_box3n = new ComboBox<String>(FXCollections.observableArrayList(timezones));
        combo_box3n.getSelectionModel().select(0);

        ComboBox<String> combo_boxnn = new ComboBox<String>(FXCollections.observableArrayList(from));
        combo_boxnn.getSelectionModel().select(0);

        ComboBox<String> combo_box2nn = new ComboBox<String>(FXCollections.observableArrayList(to));
        combo_box2nn.getSelectionModel().select(22);

        ComboBox<String> combo_box3nn = new ComboBox<String>(FXCollections.observableArrayList(timezones));
        combo_box3nn.getSelectionModel().select(3);

        ComboBox<String> combo_boxnx = new ComboBox<String>(FXCollections.observableArrayList(from));
        combo_boxnx.getSelectionModel().select(0);

        ComboBox<String> combo_box2nx = new ComboBox<String>(FXCollections.observableArrayList(to));
        combo_box2nx.getSelectionModel().select(22);

        ComboBox<String> combo_box3nx = new ComboBox<String>(FXCollections.observableArrayList(timezones));
        combo_box3nx.getSelectionModel().select(2);

        Button resultButton = new Button("Time Gap");
        resultButton.setFont(Font.font("verdaba", FontWeight.NORMAL, FontPosture.REGULAR, 16));
               
        
        GridPane gPane = new GridPane();

        

        VBox v1= new VBox();
        HBox h0= new HBox();
        HBox h1= new HBox();
        HBox h2= new HBox();
        HBox h3= new HBox();
        HBox h4= new HBox();
        HBox h5= new HBox();
        Label label0 = new Label("                                      ");
        Label fromLabel = new Label("                                                                                               FROM         ");
        Label toLabel = new Label("                      TO   ");
        Label timezoneLabel = new Label("                  TIMEZONE        ");
        Label label1 = new Label("Schezeen    ");
        Label label2 = new Label("Dhanashree");
        Label label3 = new Label("obaseki       ");
        Label label4 = new Label("Christos      ");
        h0.getChildren().addAll(label0,fromLabel,toLabel,timezoneLabel);
        h1.getChildren().addAll(label1,combo_box,combo_box2,combo_box3);
        h2.getChildren().addAll(resultButton);
        h3.getChildren().addAll(label2,combo_boxn,combo_box2n,combo_box3n);
        h4.getChildren().addAll(label3, combo_boxnn,combo_box2nn,combo_box3nn);
        h5.getChildren().addAll(label4,combo_boxnx,combo_box2nx,combo_box3nx);
        v1.getChildren().addAll(h0,h1,h3,h4,h5,h2);
        st.getChildren().addAll(v1, gPane);
        v1.setAlignment(Pos.CENTER);
        h2.setAlignment(Pos.CENTER);
        h1.setAlignment(Pos.CENTER);
        h3.setAlignment(Pos.CENTER);
        h4.setAlignment(Pos.CENTER);
        h5.setAlignment(Pos.CENTER);
        
                
               // Scene sc = new Scene(st, 200, 200);
        
                st.setPadding(new Insets(10, 10, 10, 10));
        
                v1.setSpacing(30);
                h1.setSpacing(30);
                h2.setSpacing(30);
               h3.setSpacing(30);
                h4.setSpacing(30);
                h5.setSpacing(30);
                
        mainWinStage.setScene(sc);
        mainWinStage.setTitle("Timly");
        mainWinStage.show();

        resultButton.setOnMouseClicked(new EventHandler<Event>() {

            @Override
            public void handle(Event event) {
                
                Time time1 = new Time(combo_box.getValue(), combo_box2.getValue(), combo_box3.getValue());
                Time time2 = new Time(combo_boxn.getValue(), combo_box2n.getValue(), combo_box3n.getValue());
                Time time3 = new Time(combo_boxnn.getValue(), combo_box2nn.getValue(), combo_box3nn.getValue());
                Time time4 = new Time(combo_boxnx.getValue(), combo_box2nx.getValue(), combo_box3nx.getValue());

                try {
                    times.add(time1);
                    times.add(time2);
                    times.add(time3);
                    times.add(time4);
                    Intersections inter = new Intersections(times);
                    ResultsWin.resultsWin(stage, inter);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                
                mainWinStage.close();
            }
            
        });

	}

}
