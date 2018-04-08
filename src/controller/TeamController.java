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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class TeamController implements Initializable {

	int screenWidth = (int) Screen.getPrimary().getBounds().getWidth();
	int screenHeight = (int) Screen.getPrimary().getBounds().getHeight();

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
		System.out.println("Here" + currentTeamId);
		Team cur = Tournament.getInstance().getTeams()[currentTeamId];
		for (int i = 0; i < 20; i++) {
			Player p = cur.getPlayers().get(i);
			Text pName = new Text(p.getName());
			Text pPosition = new Text(p.getPosition());
			Text pOverall = new Text(String.valueOf(p.getOverall()));
			Text pFoot = new Text(p.getFoot() + "");
			Text pSalary = new Text(String.valueOf(p.getSalary()));
			Text pValue = new Text(cur.getPlayers().get(i).getValue() / 1000000 + "m €");

			File nationImg = new File("img/flags/" + p.getNationality().toLowerCase().trim() + ".png");
			ImageView flag = new ImageView(new Image(nationImg.toURI().toString()));
			flag.setFitHeight(20);
			flag.setFitWidth(40);

			playerGrid.add(pName, 0, i);
			playerGrid.add(pPosition, 1, i);
			playerGrid.add(pOverall, 2, i);
			playerGrid.add(pFoot, 3, i);
			playerGrid.add(pSalary, 5, i);
			playerGrid.add(pValue, 6, i);
			playerGrid.add(flag, 4, i);

		}

		// Team Logo
		String st = cur.getName().toLowerCase().trim();
		st = st.replaceAll("\\s+", "");
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

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 20; j++) {
				addPane(i, j);
			}
		}

	}

	// Taken from https://code.i-harness.com/en/q/2b1fed4
	private int[] addPane(int colIndex, int rowIndex) {
		Pane pane = new Pane();
		int[] res = new int[2];
		pane.setOnMouseClicked(e -> {
			PlayerController.setPlayerID(rowIndex);
			PlayerController.setTeamID(currentTeamId);
			try {
				changeToPlayerView();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		playerGrid.add(pane, colIndex, rowIndex);
		return res;
	}

	public void changeToPlayerView() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/PlayerView.fxml"));
		Main.getMainStage().setScene(new Scene(root));
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
		root.setScaleX(screenWidth / 1400.0);
		root.setScaleY(screenHeight / 900.0);
		root.setLayoutX(335);
		root.setLayoutY(100);
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
		root.setScaleX(screenWidth / 1400.0);
		root.setScaleY(screenHeight / 900.0);
		root.setLayoutX(335);
		root.setLayoutY(100);
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
		root.setScaleX(screenWidth / 1400.0);
		root.setScaleY(screenHeight / 900.0);
		root.setLayoutX(335);
		root.setLayoutY(100);
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
		root.setScaleX(screenWidth / 1400.0);
		root.setScaleY(screenHeight / 900.0);
		root.setLayoutX(335);
		root.setLayoutY(100);
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
		root.setScaleX(screenWidth / 1400.0);
		root.setScaleY(screenHeight / 900.0);
		root.setLayoutX(335);
		root.setLayoutY(100);
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
		root.setScaleX(screenWidth / 1400.0);
		root.setScaleY(screenHeight / 900.0);
		root.setLayoutX(335);
		root.setLayoutY(100);
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
		root.setScaleX(screenWidth / 1400.0);
		root.setScaleY(screenHeight / 900.0);
		root.setLayoutX(335);
		root.setLayoutY(100);
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
		root.setScaleX(screenWidth / 1400.0);
		root.setScaleY(screenHeight / 900.0);
		root.setLayoutX(335);
		root.setLayoutY(100);
		Stage m = Main.getMainStage();
		Scene t = Main.getMainStage().getScene();
		t.setRoot(root);
		m.setScene(t);
		m.setFullScreen(true);
		Main.setMainStage(m);
	}

}
