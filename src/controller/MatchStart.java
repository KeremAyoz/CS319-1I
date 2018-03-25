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

import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.*;
import java.time.*;

/**
 * @author kerem
 *
 */
public class MatchStart implements Initializable {
	@FXML
	private Text hGK;
	@FXML
	private Text hRB;
	@FXML
	private Text hLB;
	@FXML
	private Text hCB1;
	@FXML
	private Text hCB2;
	@FXML
	private Text hCM1;
	@FXML
	private Text hCM2;
	@FXML
	private Text hCM3;
	@FXML
	private Text hLW;
	@FXML
	private Text hRW;
	@FXML
	private Text hST;
	@FXML
	private Text aGK;
	@FXML
	private Text aRB;
	@FXML
	private Text aLB;
	@FXML
	private Text aCB1;
	@FXML
	private Text aCB2;
	@FXML
	private Text aCM1;
	@FXML
	private Text aCM2;
	@FXML
	private Text aCM3;
	@FXML
	private Text aLW;
	@FXML
	private Text aRW;
	@FXML
	private Text aST;
	@FXML
	private Text homeName;
	@FXML
	private Text awayName;
	@FXML
	private Text referee;
	@FXML
	private Text weather;
	@FXML
	private Text stadium;

	@Override
	public void initialize(URL url, ResourceBundle rb) {

		Team home = Main.getFirstTeam();
		Team away = Main.getSecondTeam();
		ArrayList<Action> actions = new ArrayList<Action>();
		Match match = new Match(0 , 0 , 0 , home, away, "Pierluigi Collina", "Sunny", actions);
		try {
			actions = match.matchSimulation();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Match Score: " + match.getGoalHome() + " / " + match.getGoalAway());
		for (int i = 0; i < actions.size(); i++) {
			Action action = actions.get(i);
			if (action.getClass() == Goal.class) {
				Goal goal = (Goal) action;
				System.out.println("Goal: " + goal.getTimeHappened() + " / " + goal.getScored().getName() + " / "
						+ goal.getAssisted().getName());
			} else if (action.getClass() == YellowCard.class) {
				YellowCard yellowCard = (YellowCard) action;
				System.out.println(
						"Yellow Card: " + yellowCard.getTimeHappened() + " / " + yellowCard.getPlayer().getName());
			} else if (action.getClass() == RedCard.class) {
				RedCard redCard = (RedCard) action;
				System.out.println("Red Card: " + redCard.getTimeHappened() + " / " + redCard.getPlayer().getName());
			} else {
				Injury injury = (Injury) action;
				System.out.println("Injury: " + injury.getTimeHappened() + " / " + injury.getInjured().getName());
			}
		}

		homeName.setText(home.getName());
		awayName.setText(away.getName());

		hGK.setText(home.getPlayers().get(0).getName());
		hRB.setText(home.getPlayers().get(1).getName());
		hCB1.setText(home.getPlayers().get(2).getName());
		hCB2.setText(home.getPlayers().get(3).getName());
		hLB.setText(home.getPlayers().get(4).getName());
		hCM1.setText(home.getPlayers().get(5).getName());
		hCM2.setText(home.getPlayers().get(6).getName());
		hCM3.setText(home.getPlayers().get(7).getName());
		hRW.setText(home.getPlayers().get(8).getName());
		hST.setText(home.getPlayers().get(9).getName());
		hLW.setText(home.getPlayers().get(10).getName());

		aGK.setText(away.getPlayers().get(0).getName());
		aRB.setText(away.getPlayers().get(1).getName());
		aCB1.setText(away.getPlayers().get(2).getName());
		aCB2.setText(away.getPlayers().get(3).getName());
		aLB.setText(away.getPlayers().get(4).getName());
		aCM1.setText(away.getPlayers().get(5).getName());
		aCM2.setText(away.getPlayers().get(6).getName());
		aCM3.setText(away.getPlayers().get(7).getName());
		aRW.setText(away.getPlayers().get(8).getName());
		aST.setText(away.getPlayers().get(9).getName());
		aLW.setText(away.getPlayers().get(10).getName());

		weather.setText(match.getWeather());
		referee.setText(match.getReferee());
		stadium.setText(home.getStadium());

	}

}
