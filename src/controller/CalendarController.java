package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import model.*;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.image.*;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.*;
import java.time.*;

public class CalendarController implements Initializable {

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
