/**
 * 
 */
package controller;

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
	private ImageView img0;
	@FXML
	private ImageView img1;
	@FXML
	private ImageView img2;
	@FXML
	private ImageView img3;
	@FXML
	private ImageView img4;
	@FXML
	private ImageView img5;
	@FXML
	private ImageView img6;
	@FXML
	private Text score;

	@FXML
	private GridPane eventGrid;
	@FXML
	private ScrollPane scrollEvent;
	@FXML
	private Text timer;
	
	private Match currentMatch;
	private boolean paused;
	private int currentTime;
	private int actionCount = 0;
	
	private final Integer START_TIME = 0;
	private Integer seconds = START_TIME;
	
	@FXML
	private Label label;
	
	
	ArrayList<Action> actions;
	
	
	
	public void doTime() {
		Timeline timeline = new Timeline();
		timeline.setCycleCount(Timeline.INDEFINITE);
		if (timeline == null) {
			timeline.stop();
		} 
		KeyFrame frame = new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				actions = new ArrayList<Action>();
				// TODO Auto-generated method stub
				if (!paused) {
					Action a = currentMatch.actionGenerator(seconds, ((int)(Math.random()*100)));
					if (a != null)
						actions.add(a);
					System.out.println("NOTHINGGG");
					seconds++;
					label.setText(seconds.toString() + "'");
					if (actions != null)
						updateActionView();
					 if (seconds > 89)
						 timeline.stop(); 
				}
				System.out.println("NOTHINGGG");
			}
			
		}) ;
		timeline.getKeyFrames().add(frame); 
		timeline.playFromStart();
	}
	
	public void updateActionView() {
		//eventGrid.getChildren().clear();
		for (int i = 0; i < actions.size(); i++) {
			eventGrid.add(new Text(actions.get(i).toString()), 1, actionCount++);
		}
		
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Tournament t = Tournament.getInstance();
		currentTime = 0;
		paused = false;
		label.setTextFill(Color.BLACK);
		
		currentMatch = t.getGroups()[0].getMatch(0);
		
		if (currentMatch != null) {
			Team home = currentMatch.getHome();
			Team away = currentMatch.getAway();
			
			homeName.setText(home.getName());
			awayName.setText(away.getName());
			
			doTime();
			
		}
		
		
		
		
		
		/*
		try {
			actions = currentMatch.matchSimulation();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 1; i < 91; i++) 
			actions.add(currentMatch.actionGenerator(i, 5));
		
		//currentMatch.updateData();
		/*
		ArrayList<String> actionList = new ArrayList<String>();

		for (int i = 0; i < actions.size(); i++) {
			Action action = actions.get(i);
			if (action.getClass() == Goal.class) {
				Goal goal = (Goal) action;
				actionList.add("GOAL: " + goal.getTimeHappened() + " - " + goal.getScored().getName() + " (Assist: "
						+ goal.getAssisted().getName() + ")");
			} else if (action.getClass() == YellowCard.class) {
				YellowCard yellowCard = (YellowCard) action;
				actionList
						.add("Yellow Card: " + yellowCard.getTimeHappened() + " - " + yellowCard.getPlayer().getName());
			} else if (action.getClass() == RedCard.class) {
				RedCard redCard = (RedCard) action;
				actionList.add("Red Card: " + redCard.getTimeHappened() + " - " + redCard.getPlayer().getName());
			} else {
				Injury injury = (Injury) action;
				actionList.add("Injury: " + injury.getTimeHappened() + " - " + injury.getInjured().getName());
			}
		}

		for (int i = 0; i < actions.size(); i++) {
			if (actionList.get(i).charAt(0) == 'G') {
				Image goal = new Image("File:/img/goal.png");
				img0.setImage(goal);
				img0.setFitHeight(5);
				img0.setFitWidth(5);
				//eventGrid.add(img0, 0, i);
			} 
			else if (actionList.get(i).charAt(0) == 'Y') {
				Image yellow = new Image("File:/img/yellow.png");
				ImageView yellowV = new ImageView(yellow);
				yellowV.setFitHeight(5);
				yellowV.setFitWidth(5);
				eventGrid.add(yellowV, 0, i);
			} 
			else if (actionList.get(i).charAt(0) == 'R') {
				Image red = new Image("File:/img/red.png");
				ImageView redV = new ImageView(red);
				redV.setFitHeight(5);
				redV.setFitWidth(5);
				eventGrid.add(redV, 0, i);
			} 
			else if (actionList.get(i).charAt(0) == 'I') {
				Image injury = new Image("File:/img/injury.png");
				ImageView injuryV = new ImageView(injury);
				injuryV.setFitHeight(5);
				injuryV.setFitWidth(5);
				eventGrid.add(injuryV, 0, i);
			}
			Text t = new Text(actionList.get(i));
			eventGrid.add(t, 1, i);
		}
		
		score.setText(currentMatch.getGoalHome() + " - " + currentMatch.getGoalAway());*/
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
