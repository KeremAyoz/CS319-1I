package controller;

import java.io.File;
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
		Tournament tour = Tournament.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date startDate;
			startDate = formatter.parse("2018-10-29");
			Date endDate = formatter.parse("2019-05-31");
			String cur = "" + Tournament.getInstance().getCurrentYear() + "-" + Tournament.getInstance().getCurrentMonth() + "-" + Tournament.getInstance().getCurrentDay();
			Date todayDate = formatter.parse(cur);
			Calendar start = Calendar.getInstance();
			start.setTime(startDate);
			Calendar end = Calendar.getInstance();
			end.setTime(endDate);
			// Get today
			todayDate = formatter.parse(tour.getCurrentYear() + "-" + tour.getCurrentMonth() + "-" + tour.getCurrentDay());
			Calendar today = Calendar.getInstance();
			today.setTime(todayDate);
			int rowInd = 0;
			int colInd = 0;

			for (Date date = start.getTime(); start.before(end); start.add(Calendar.DATE, 1), date = start.getTime()) {
				
				//Shorten the date and change the font
				Text t = new Text(date.toString().substring(4, 10));
				t.setFont(Font.font("Gill Sans", FontWeight.BOLD, 15));
				t.setFill(Color.DARKRED);
				
				//Variables to test the existence of the match
				boolean matchVar = false;
				Team opponent = null;
				String currentDay = formatter.format(date);
				for (int i = 0; i < 12 && !matchVar; i++) {
					String matchDay = Tournament.getGroupMatchYears()[i] + "-" + Tournament.getGroupMatchMonths()[i] + "-";
					if (Tournament.getGroupMatchDays()[i] < 10)
						matchDay += "0";
					matchDay += "" + Tournament.getGroupMatchDays()[i];
					System.out.println(currentDay + "\n" + matchDay + "\n\n");
					if (currentDay.equals(matchDay)) {
						Match m = tour.getGroups()[tour.getMyGroupId()].getMatches()[i];
						// Opponent is away
						if (m.getHome().getName().equals(tour.getTeams()[tour.getMyTeamId()].getName())) {
							opponent = m.getAway();
							matchVar = true;
						}
						// Opponent is home
						else if (m.getAway().getName().equals(tour.getTeams()[tour.getMyTeamId()].getName())) {
							opponent = m.getHome();
							matchVar = true;
						}
					}
				}
				if (matchVar) {
					String st = opponent.getName().toLowerCase().trim();
					st = st.replaceAll("\\s+", "");
					File file = new File("img/logos/" + st + ".png");
					Image image = new Image(file.toURI().toString());
					ImageView im = new ImageView(image);
					im.setFitWidth(40);
					im.setFitHeight(40);
					gridCalendar.add(im, rowInd++, colInd);
					System.out.println("MAÇ VAR");
				}
				else {
					gridCalendar.add(t, rowInd++, colInd);
				}
				///////////////////////////////////////
				if (rowInd == 7) {
					rowInd = 0;
					colInd++;
				}
				if (start.before(today)) {
					if (gridCalendar.getChildren().get(colInd * 7 + rowInd).getClass().getName().equals("javafx.scene.text.Text")) {
						t.setFill(Color.GRAY);
					}
				}

			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
