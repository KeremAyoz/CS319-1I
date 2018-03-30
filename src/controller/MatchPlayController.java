/**
 * 
 */
package controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import model.*;

/**
 * @author kerem
 *
 */
public class MatchPlayController implements Initializable {
	/*
	 * @FXML private Text hGK;
	 * 
	 * @FXML private Text hRB;
	 * 
	 * @FXML private Text hLB;
	 * 
	 * @FXML private Text hCB1;
	 * 
	 * @FXML private Text hCB2;
	 * 
	 * @FXML private Text hCM1;
	 * 
	 * @FXML private Text hCM2;
	 * 
	 * @FXML private Text hCM3;
	 * 
	 * @FXML private Text hLW;
	 * 
	 * @FXML private Text hRW;
	 * 
	 * @FXML private Text hST;
	 * 
	 * @FXML private Text aGK;
	 * 
	 * @FXML private Text aRB;
	 * 
	 * @FXML private Text aLB;
	 * 
	 * @FXML private Text aCB1;
	 * 
	 * @FXML private Text aCB2;
	 * 
	 * @FXML private Text aCM1;
	 * 
	 * @FXML private Text aCM2;
	 * 
	 * @FXML private Text aCM3;
	 * 
	 * @FXML private Text aLW;
	 * 
	 * @FXML private Text aRW;
	 * 
	 * @FXML private Text aST;
	 */
	@FXML
	private Text homeName;
	@FXML
	private Text awayName;

	@FXML
	private Text scoreHome;
	@FXML
	private Text scoreAway;

	@FXML
	private GridPane eventGrid;
	@FXML
	private ScrollPane scrollEvent;
	@FXML
	private Text timer;
	
	@FXML
	private ImageView homeLineup;
	@FXML
	private ImageView awayLineup;

	private Match currentMatch;
	private boolean paused;
	private int actionCount = 0;

	private final Integer START_TIME = 0;
	private Integer seconds = START_TIME;

	@FXML
	private Label label;

	ArrayList<Action> actions;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Tournament t = Tournament.getInstance();
		paused = false;
		label.setTextFill(Color.BLACK);
		for (int i = 0; i < 12; i++) {
			if (t.getGroups()[t.getMyGroupId()].getMatch(t.getMyGroupMatchIds()[i]).getAway().getName().equals(t.getTeams()[t.getMyTeamId()].getName()) ||
					t.getGroups()[t.getMyGroupId()].getMatch(t.getMyGroupMatchIds()[i]).getHome().getName().equals(t.getTeams()[t.getMyTeamId()].getName())) {
				currentMatch = t.getGroups()[t.getMyGroupId()].getMatch(t.getMyGroupMatchIds()[i]);
				break;
			}

		}
		
		if (currentMatch != null) {
			Team home = currentMatch.getHome();
			Team away = currentMatch.getAway();

			homeName.setText(home.getName());
			awayName.setText(away.getName());
			
			File tactic = new File("img/tactics/" + home.getTactic() + ".png");
			Image tacticImage = new Image(tactic.toURI().toString(), 456, 454, false, false);
			homeLineup.setImage(tacticImage);
			
			File tactic2 = new File("img/tactics/" + away.getTactic() + ".png");
			Image tacticImage2 = new Image(tactic2.toURI().toString(), 456, 454, false, false);
			awayLineup.setImage(tacticImage2);
			
			
			
			doTime();
			System.out.println("Match is over");

		}
	}

	public void doTime() {
		Timeline timeline = new Timeline();
		timeline.setCycleCount(Timeline.INDEFINITE);
		KeyFrame frame = new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				actions = new ArrayList<Action>();
				// TODO Auto-generated method stub
				if (!paused) {
					Action a = currentMatch.actionGenerator(seconds, ((int) (Math.random() * 100)));
					if (a != null)
						actions.add(a);
					seconds++;
					label.setText(seconds.toString() + "'");
					if (actions != null)
						updateActionView();
					if (seconds > 89)
						timeline.stop();
				}
			}

		});
		timeline.getKeyFrames().add(frame);
		timeline.playFromStart();
	}

	public void updateActionView() {
		for (int i = 0; i < actions.size(); i++) {
			eventGrid.add(new Text(actions.get(i).toString()), 1, actionCount++);
			String actionName = actions.get(i).getClass().getName().toLowerCase().substring(6) ;
			File nationImg = new File("img/actions/" + actionName + ".png");
			ImageView act = new ImageView(new Image(nationImg.toURI().toString()));
			act.setFitHeight(30);
			act.setFitWidth(30);
			eventGrid.add(act, 0, actionCount-1);
			if (actionName.equals("goal")) {
				if (currentMatch.getHome().contains(((Goal)(actions.get(i))).getScored())) 
					scoreHome.setText(String.valueOf(Integer.parseInt(scoreHome.getText()) + 1));
				else 
					scoreAway.setText(String.valueOf(Integer.parseInt(scoreAway.getText()) + 1));
			}
		}

	}

	@FXML
	public void teamClicked() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/TeamView.fxml"));
		Main.getMainStage().setScene(new Scene(root));
	}

	@FXML
	public void tacticClicked() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/TacticView.fxml"));
		Main.getMainStage().setScene(new Scene(root));
	}

	@FXML
	public void groupClicked() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/GroupView.fxml"));
		Main.getMainStage().setScene(new Scene(root));
	}

	@FXML
	public void knockoutClicked() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/KnockoutView.fxml"));
		Main.getMainStage().setScene(new Scene(root));
	}

	@FXML
	public void statClicked() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/StatisticView.fxml"));
		Main.getMainStage().setScene(new Scene(root));
	}

	@FXML
	public void calendarClicked() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/CalendarView.fxml"));
		Main.getMainStage().setScene(new Scene(root));
	}

	@FXML
	public void saveClicked() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/HomeScreen.fxml"));
		Main.getMainStage().setScene(new Scene(root));
	}

	@FXML
	public void continueClicked() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/MatchPlayView.fxml"));
		Main.getMainStage().setScene(new Scene(root));
	}

	@FXML
	public void pauseClicked() {
		paused = true;
	}

	@FXML
	public void playClicked() {
		paused = false;
	}

}
