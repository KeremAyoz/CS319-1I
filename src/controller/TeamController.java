package controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.ResourceBundle;
import javax.swing.plaf.synth.SynthSpinnerUI;
import javafx.fxml.FXML;
import model.*;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Labeled;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class TeamController implements Initializable {

	@FXML
	private GridPane playerGrid;
	@FXML
	private ImageView teamImage;
	@FXML
	private Text name;
	@FXML
	private Text stadium;
	@FXML
	private Text history;
	@FXML
	private Text nation;
	@FXML
	private Text nick;
	@FXML
	private Text stars;

	private static int currentTeamId;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Team cur = Tournament.getInstance().getTeams()[currentTeamId];
		for (int i = 0; i < 20; i++) {
			Player p = cur.getPlayers().get(i);
			Text pName = new Text(p.getName());
			Text pPosition = new Text(p.getPosition());
			Text pOverall = new Text(String.valueOf(p.getOverall()));
			Text pFoot = new Text(p.getFoot() + "");
			Text pSalary = new Text(String.valueOf(p.getSalary()));
			Text pValue = new Text(String.valueOf(p.getValue()));
 
			
			File nationImg = new File("img/flags/" + p.getNationality().toLowerCase().trim() + ".png");
			ImageView flag = new ImageView(new Image(nationImg.toURI().toString()));
			flag.setFitHeight(20);
			flag.setFitWidth(40);

			playerGrid.add(pName, 0, i);
			playerGrid.add(pPosition, 1, i);
			playerGrid.add(pOverall, 2, i);
			playerGrid.add(pFoot, 3, i);
			playerGrid.add(pSalary, 4, i);
			playerGrid.add(pValue, 5, i);
			playerGrid.add(flag, 6, i);			
		}
		
		//Team Logo
		String st = cur.getName().toLowerCase().trim();
		st = st.replaceAll("\\s+","");
		System.out.println(st);
		File file = new File("img/logos/" + st + ".png");
		Image image = new Image(file.toURI().toString());
		teamImage.setImage(image);
		
		name.setText(cur.getName());
		stadium.setText(cur.getStadium());
		history.setText(cur.getHistory());
		nation.setText(cur.getNationality());
		nick.setText(cur.getNick());
		stars.setText(String.valueOf(cur.getStars()));
		
	}

	/**
	 * @return the currentTeamId
	 */
	public static int getCurrentTeamId() {
		return currentTeamId;
	}

	/**
	 * @param currentTeamId
	 *            the currentTeamId to set
	 */
	public static void setCurrentTeamId(int currentTeamId2) {
		currentTeamId = currentTeamId2;
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
		Parent root = FXMLLoader.load(getClass().getResource("/view/Knockout.fxml"));
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

}
