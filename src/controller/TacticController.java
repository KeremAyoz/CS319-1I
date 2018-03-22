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

public class TacticController implements Initializable {

	@FXML
	private Text teamName;
	@FXML
	private Text st;
	@FXML
	private Text lw;
	@FXML
	private Text rw;
	@FXML
	private Text cm1;
	@FXML
	private Text cm2;
	@FXML
	private Text cm3;
	@FXML
	private Text lb;
	@FXML
	private Text cb1;
	@FXML
	private Text cb2;
	@FXML
	private Text rb;
	@FXML
	private Text gk;
	@FXML
	private ComboBox<String> tacticBox;
	@FXML
	private ComboBox<String> styleBox;
	@FXML
	private ComboBox<String> tempoBox;
	@FXML
	private GridPane gridPlayer;
	@FXML
	private ScrollPane scrollPlayer;
	@FXML
	private ImageView logo;
	@FXML
	private ImageView tacticField;

	@FXML
	private ComboBox<String> sub1;
	@FXML
	private ComboBox<String> sub2;
	@FXML
	private ComboBox<String> sub3;
	@FXML
	private ComboBox<String> sub4;
	@FXML
	private ComboBox<String> sub5;
	@FXML
	private ComboBox<String> sub6;
	@FXML
	private ComboBox<String> sub7;
	@FXML
	private ComboBox<String> sub8;
	@FXML
	private ComboBox<String> sub9;

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

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Tournament current = Tournament.getInstance();
		Team t = current.getTeams()[current.getMyTeamId()];

		tacticFieldSetup();
		calibrateNames();

		// Team Logo
		File file = new File("img/psg.png");
		Image image = new Image(file.toURI().toString());
		logo.setImage(image);

		// ComboBox for the tactics, tempo and style
		tacticBox.getItems().addAll("4-3-3", "4-4-2", "4-2-3-1");
		styleBox.getItems().addAll("Attack", "Defensive", "Holding");
		tempoBox.getItems().addAll("Fast", "Normal", "Slow");

		// Sub-players' comboBox setup
		comboBoxSetup(t.getTactic());
		gridUpdate();
	}

	@FXML
	public void calibrateNames() {
		Tournament current = Tournament.getInstance();
		Team t = current.getTeams()[current.getMyTeamId()];
		// Names of the players as Text
		gk.setText(t.getPlayers().get(0).getName());
		rb.setText(t.getPlayers().get(1).getName());
		cb1.setText(t.getPlayers().get(2).getName());
		cb2.setText(t.getPlayers().get(3).getName());
		lb.setText(t.getPlayers().get(4).getName());
		cm1.setText(t.getPlayers().get(5).getName());
		cm3.setText(t.getPlayers().get(6).getName());
		cm2.setText(t.getPlayers().get(7).getName());
		rw.setText(t.getPlayers().get(8).getName());
		st.setText(t.getPlayers().get(9).getName());
		lw.setText(t.getPlayers().get(10).getName());

		if (t.getTactic().equals("4-3-3")) {
			gk.setLayoutX(270);
			gk.setLayoutY(96);

			rb.setLayoutX(453);
			rb.setLayoutY(370);

			cb2.setLayoutX(223);
			cb2.setLayoutY(390);

			cb1.setLayoutX(359);
			cb1.setLayoutY(390);

			lb.setLayoutX(94);
			lb.setLayoutY(370);

			//RW
			cm1.setLayoutX(280);
			cm1.setLayoutY(300);

			// Stays as midfielders
			cm2.setLayoutX(350);
			cm2.setLayoutY(235);

			cm3.setLayoutX(220);
			cm3.setLayoutY(235);

			// becomes LW
			rw.setLayoutX(425);
			rw.setLayoutY(170);

			// LW becomes LF
			lw.setLayoutX(145);
			lw.setLayoutY(170);

			// ST becomes RF
			st.setLayoutX(286);
			st.setLayoutY(110);
		}

		else if (t.getTactic().equals("4-4-2")) {
			gk.setLayoutX(286);
			gk.setLayoutY(101);

			rb.setLayoutX(453);
			rb.setLayoutY(370);

			cb2.setLayoutX(223);
			cb2.setLayoutY(390);

			cb1.setLayoutX(359);
			cb1.setLayoutY(390);

			lb.setLayoutX(94);
			lb.setLayoutY(369);
			
			//RW
			cm1.setLayoutX(435);
			cm1.setLayoutY(225);
			
			//RCM
			cm2.setLayoutX(350);
			cm2.setLayoutY(270);
			
			//LCM
			cm3.setLayoutX(220);
			cm3.setLayoutY(270);
			
			//LW
			rw.setLayoutX(120);
			rw.setLayoutY(225);

			lw.setLayoutX(240);
			lw.setLayoutY(125);

			st.setLayoutX(330);
			st.setLayoutY(125);
		} else if (t.getTactic().equals("4-2-3-1")) {
			gk.setLayoutX(270);
			gk.setLayoutY(96);

			rb.setLayoutX(450);
			rb.setLayoutY(379);

			cb2.setLayoutX(223);
			cb2.setLayoutY(390);

			cb1.setLayoutX(359);
			cb1.setLayoutY(390);

			lb.setLayoutX(94);
			lb.setLayoutY(370);
			
			//RCM
			cm1.setLayoutX(370);
			cm1.setLayoutY(285);

			cm2.setLayoutX(425);
			cm2.setLayoutY(200);
			
			//LCM
			cm3.setLayoutX(194);
			cm3.setLayoutY(285);

			rw.setLayoutX(280);
			rw.setLayoutY(220);

			lw.setLayoutX(286);
			lw.setLayoutY(115);

			st.setLayoutX(140);
			st.setLayoutY(200);
		}
	}

	@FXML
	public void tacticFieldSetup() {
		Tournament current = Tournament.getInstance();
		Team t = current.getTeams()[current.getMyTeamId()];
		teamName.setText(t.getName());
		File tactic = new File("img/tactics/" + t.getTactic() + ".png");
		Image tacticImage = new Image(tactic.toURI().toString(), 610, 490, false, false);
		tacticField.setImage(tacticImage);
	}

	@FXML
	public void sub1Change() {
		Tournament current = Tournament.getInstance();
		Team t = current.getTeams()[current.getMyTeamId()];
		// Swapping
		Collections.swap(t.getPlayers(), sub1.getSelectionModel().getSelectedIndex(), 11);
		gridUpdate();
		sub1.getSelectionModel().clearSelection();
		calibrateNames();
	}

	@FXML
	public void sub2Change() {
		Tournament current = Tournament.getInstance();
		Team t = current.getTeams()[current.getMyTeamId()];
		// Swapping
		Collections.swap(t.getPlayers(), sub2.getSelectionModel().getSelectedIndex(), 12);
		gridUpdate();
		sub2.getSelectionModel().clearSelection();
		calibrateNames();
	}

	@FXML
	public void sub3Change() {
		Tournament current = Tournament.getInstance();
		Team t = current.getTeams()[current.getMyTeamId()];
		// Swapping
		Collections.swap(t.getPlayers(), sub3.getSelectionModel().getSelectedIndex(), 13);
		gridUpdate();
		sub3.getSelectionModel().clearSelection();
		calibrateNames();
	}

	@FXML
	public void sub4Change() {
		Tournament current = Tournament.getInstance();
		Team t = current.getTeams()[current.getMyTeamId()];
		// Swapping
		Collections.swap(t.getPlayers(), sub4.getSelectionModel().getSelectedIndex(), 14);
		gridUpdate();
		sub4.getSelectionModel().clearSelection();
		calibrateNames();
	}

	@FXML
	public void sub5Change() {
		Tournament current = Tournament.getInstance();
		Team t = current.getTeams()[current.getMyTeamId()];
		// Swapping
		Collections.swap(t.getPlayers(), sub5.getSelectionModel().getSelectedIndex(), 15);
		gridUpdate();
		sub5.getSelectionModel().clearSelection();
		calibrateNames();
	}

	@FXML
	public void sub6Change() {
		Tournament current = Tournament.getInstance();
		Team t = current.getTeams()[current.getMyTeamId()];
		// Swapping
		Collections.swap(t.getPlayers(), sub6.getSelectionModel().getSelectedIndex(), 16);
		gridUpdate();
		sub6.getSelectionModel().clearSelection();
		calibrateNames();
	}

	@FXML
	public void sub7Change() {
		Tournament current = Tournament.getInstance();
		Team t = current.getTeams()[current.getMyTeamId()];
		// Swapping
		Collections.swap(t.getPlayers(), sub7.getSelectionModel().getSelectedIndex(), 17);
		gridUpdate();
		sub7.getSelectionModel().clearSelection();
		calibrateNames();
	}

	@FXML
	public void sub8Change() {
		Tournament current = Tournament.getInstance();
		Team t = current.getTeams()[current.getMyTeamId()];
		// Swapping
		Collections.swap(t.getPlayers(), sub8.getSelectionModel().getSelectedIndex(), 18);
		gridUpdate();
		sub8.getSelectionModel().clearSelection();
		calibrateNames();
	}

	@FXML
	public void sub9Change() {
		Tournament current = Tournament.getInstance();
		Team t = current.getTeams()[current.getMyTeamId()];
		// Swapping
		Collections.swap(t.getPlayers(), sub9.getSelectionModel().getSelectedIndex(), 19);
		gridUpdate();
		sub9.getSelectionModel().clearSelection();
		calibrateNames();
	}

	@FXML
	public void gridUpdate() {
		// Clear grid text fields
		for (int i = 0; i < gridPlayer.getChildren().size(); i++)
			if (gridPlayer.getChildren().get(i).getClass() == st.getClass())
				((Text) (gridPlayer.getChildren().get(i))).setText("");

		Tournament current = Tournament.getInstance();
		Team t = current.getTeams()[current.getMyTeamId()];
		for (int i = 0; i < 19; i++) {
			Text playerName = new Text(t.getPlayers().get(i).getName());
			Text overall = new Text(t.getPlayers().get(i).getOverall() + "");
			Text nation = new Text(t.getPlayers().get(i).getNationality());
			Text value = new Text(t.getPlayers().get(i).getValue() / 1000000 + "m €");

			if (i < 11) {
				overall.setStyle("-fx-font-weight: bold");
				playerName.setStyle("-fx-font-weight: bold");
				nation.setStyle("-fx-font-weight: bold");
				value.setStyle("-fx-font-weight: bold");
			}

			File nationImg = new File("img/flags/" + nation.getText().toLowerCase().trim() + ".png");
			ImageView flag = new ImageView(new Image(nationImg.toURI().toString()));
			flag.setFitHeight(20);
			flag.setFitWidth(40);

			gridPlayer.add(playerName, 1, i);
			gridPlayer.add(overall, 2, i);
			gridPlayer.add(flag, 3, i);
			gridPlayer.add(value, 4, i);
		}

		// Positions displayed according to the tactic
		String[] positions;
		if (t.getTactic().equals("4-3-3"))
			positions = new String[] { "GK", "RB", "RCB", "LCB", "LB", "CDM", "LCM", "RCM", "RW", "ST", "LW" };
		else if (t.getTactic().equals("4-4-2"))
			positions = new String[] { "GK", "RB", "RCB", "LCB", "LB", "RW", "LCM", "RCM", "LW", "RF", "LF" };
		else // 4-2-3-1
			positions = new String[] { "GK", "RB", "RCB", "LCB", "LB", "RCM", "LCM", "RW", "CAM", "LW", "ST" };

		for (int i = 0; i < 11; i++) {
			Text position = new Text(positions[i]);
			position.setStyle("-fx-font-weight: bold");
			gridPlayer.add(position, 0, i);
		}

	}

	@FXML
	public void comboBoxSetup(String tactic) {
		sub1.getItems().clear();
		sub2.getItems().clear();
		sub3.getItems().clear();
		sub4.getItems().clear();
		sub5.getItems().clear();
		sub6.getItems().clear();
		sub7.getItems().clear();
		sub8.getItems().clear();
		sub9.getItems().clear();
		
		if (tactic.equals("4-3-3")) {
			sub1.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "CDM", "LCM", "RCM", "RW", "ST", "LW");
			sub2.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "CDM", "LCM", "RCM", "RW", "ST", "LW");
			sub3.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "CDM", "LCM", "RCM", "RW", "ST", "LW");
			sub4.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "CDM", "LCM", "RCM", "RW", "ST", "LW");
			sub5.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "CDM", "LCM", "RCM", "RW", "ST", "LW");
			sub6.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "CDM", "LCM", "RCM", "RW", "ST", "LW");
			sub7.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "CDM", "LCM", "RCM", "RW", "ST", "LW");
			sub8.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "CDM", "LCM", "RCM", "RW", "ST", "LW");
			sub9.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "CDM", "LCM", "RCM", "RW", "ST", "LW");
		}

		else if (tactic.equals("4-4-2")) {
			sub1.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "RW", "LCM", "RCM", "LW", "RF", "LF");
			sub2.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "RW", "LCM", "RCM", "LW", "RF", "LF");
			sub3.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "RW", "LCM", "RCM", "LW", "RF", "LF");
			sub4.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "RW", "LCM", "RCM", "LW", "RF", "LF");
			sub5.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "RW", "LCM", "RCM", "LW", "RF", "LF");
			sub6.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "RW", "LCM", "RCM", "LW", "RF", "LF");
			sub7.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "RW", "LCM", "RCM", "LW", "RF", "LF");
			sub8.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "RW", "LCM", "RCM", "LW", "RF", "LF");
			sub9.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "RW", "LCM", "RCM", "LW", "RF", "LF");
		} else {
			sub1.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "RCM", "LCM", "RW", "CAM", "LW", "ST");
			sub2.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "RCM", "LCM", "RW", "CAM", "LW", "ST");
			sub3.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "RCM", "LCM", "RW", "CAM", "LW", "ST");
			sub4.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "RCM", "LCM", "RW", "CAM", "LW", "ST");
			sub5.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "RCM", "LCM", "RW", "CAM", "LW", "ST");
			sub6.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "RCM", "LCM", "RW", "CAM", "LW", "ST");
			sub7.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "RCM", "LCM", "RW", "CAM", "LW", "ST");
			sub8.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "RCM", "LCM", "RW", "CAM", "LW", "ST");
			sub9.getItems().addAll("GK", "RB", "RCB", "LCB", "LB", "RCM", "LCM", "RW", "CAM", "LW", "ST");
		}
	}

	@FXML
	public void tacticBoxChange() {
		Tournament current = Tournament.getInstance();
		Team t = current.getTeams()[current.getMyTeamId()];
		t.setTactic(tacticBox.getValue());
		tacticFieldSetup();
		calibrateNames();
		gridUpdate();
		comboBoxSetup(t.getTactic());
	}

	@FXML
	public void tempoBoxChange() {
		Tournament current = Tournament.getInstance();
		Team t = current.getTeams()[current.getMyTeamId()];
		t.setTempo(tempoBox.getValue());
		tempoBox.getSelectionModel().select(t.getTempo());
	}

	@FXML
	public void styleBoxChange() {
		Tournament current = Tournament.getInstance();
		Team t = current.getTeams()[current.getMyTeamId()];
		t.setStyle(styleBox.getValue());
	}

}
