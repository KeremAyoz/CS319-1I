package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import model.*;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.image.*;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.*;
import java.time.*;

public class CalendarController implements Initializable {
	@FXML
	public void teamClicked() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/TeamView.fxml"));
        Stage m = Main.getMainStage();
        Scene t = Main.getMainStage().getScene();
		t.setRoot(root);
        m.setScene(t);
        m.setFullScreen(true);
        Main.setMainStage(m);
	}

	@FXML
	public void tacticClicked() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/TacticView.fxml"));
		Stage m = Main.getMainStage();
        Scene t = Main.getMainStage().getScene();
		t.setRoot(root);
        m.setScene(t);
        m.setFullScreen(true);
        Main.setMainStage(m);  
	}

	@FXML
	public void groupClicked() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/GroupView.fxml"));
		Stage m = Main.getMainStage();
        Scene t = Main.getMainStage().getScene();
		t.setRoot(root);
        m.setScene(t);
        m.setFullScreen(true);
        Main.setMainStage(m);
	}

	@FXML
	public void knockoutClicked() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/KnockoutView.fxml"));
		Stage m = Main.getMainStage();
        Scene t = Main.getMainStage().getScene();
		t.setRoot(root);
        m.setScene(t);
        m.setFullScreen(true);
        Main.setMainStage(m); 
	}

	@FXML
	public void statClicked() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/StatisticView.fxml"));
		Stage m = Main.getMainStage();
        Scene t = Main.getMainStage().getScene();
		t.setRoot(root);
        m.setScene(t);
        m.setFullScreen(true);
        Main.setMainStage(m);  
	}

	@FXML
	public void calendarClicked() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/CalendarView.fxml"));
		Stage m = Main.getMainStage();
        Scene t = Main.getMainStage().getScene();
		t.setRoot(root);
        m.setScene(t);
        m.setFullScreen(true);
        Main.setMainStage(m);  
	}

	@FXML
	public void saveClicked() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/HomeScreen.fxml"));
		Stage m = Main.getMainStage();
        Scene t = Main.getMainStage().getScene();
		t.setRoot(root);
        m.setScene(t);
        m.setFullScreen(true);
        Main.setMainStage(m);
	}

	@FXML
	public void continueClicked() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/MatchPlayView.fxml"));
		Stage m = Main.getMainStage();
        Scene t = Main.getMainStage().getScene();
		t.setRoot(root);
        m.setScene(t);
        m.setFullScreen(true);
        Main.setMainStage(m); 
	}
	
	@FXML
	private GridPane gridCalendar;
	private ScrollPane scrollCalendar;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM");

		LocalDate start = LocalDate.of( 2018 , Month.NOVEMBER , 1);
		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 7; j++) {
				String s = start.format(formatter);
				Text t = new Text(s);
				gridCalendar.add(t, j, i);
				start = start.plusDays(1);

			}
		}
	}

}
