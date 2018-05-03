package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
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
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.image.*;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.*;
import java.time.*;

public class CalendarController implements Initializable {
	
	
	int screenWidth = (int) Screen.getPrimary().getBounds().getWidth();
	int screenHeight = (int) Screen.getPrimary().getBounds().getHeight();

	@FXML
	private GridPane gridCalendar;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date startDate;
			startDate = formatter.parse("2018-11-05");
			Date endDate = formatter.parse("2019-05-31");
			String cur = "" + Tournament.getInstance().getCurrentYear() + "-"
					+ Tournament.getInstance().getCurrentMonth() + "-" + Tournament.getInstance().getCurrentDay();
			Date todayDate = formatter.parse(cur);

			Calendar start = Calendar.getInstance();
			start.setTime(startDate);
			Calendar end = Calendar.getInstance();
			end.setTime(endDate);
			todayDate = formatter.parse("2019-01-01");
			Calendar today = Calendar.getInstance();
			today.setTime(todayDate);
			int rowInd = 0;
			int colInd = 0;

			for (Date date = start.getTime(); start.before(end); start.add(Calendar.DATE, 1), date = start.getTime()) {
				Text t = new Text(date.toString().substring(4, 10));
				t.setFont(Font.font("Gill Sans", FontWeight.BOLD, 15));
				t.setFill(Color.DARKRED);
				gridCalendar.add(t, rowInd++, colInd);
				if (rowInd == 7) {
					rowInd = 0;
					colInd++;
				}
				if (start.before(today)) {
					if (gridCalendar.getChildren().get(colInd * 7 + rowInd).getClass().getName()
							.equals("javafx.scene.text.Text")) {
						// Maç kimle ise onu getir ve buraya onu ekle
						Tournament tour = Tournament.getInstance();
						// setFill(Color.GRAY);
					}
				}

			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
