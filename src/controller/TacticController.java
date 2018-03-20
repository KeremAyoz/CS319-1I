package controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import model.*;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
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
		teamName.setText(t.getName());
		gk.setText(t.getPlayers().get(0).getName());
		this.rb.setText(t.getPlayers().get(1).getName());
		cb1.setText(t.getPlayers().get(2).getName());
		cb2.setText(t.getPlayers().get(3).getName());
		lb.setText(t.getPlayers().get(4).getName());
		cm1.setText(t.getPlayers().get(5).getName());
		cm3.setText(t.getPlayers().get(6).getName());
		cm2.setText(t.getPlayers().get(7).getName());
		rw.setText(t.getPlayers().get(8).getName());
		st.setText(t.getPlayers().get(9).getName());
		lw.setText(t.getPlayers().get(10).getName());

		File file = new File("img/galatasaray.png");
		Image image = new Image(file.toURI().toString());
		logo.setImage(image);
		
		for (int i = 0; i < 19; i++) {
			Text playerName = new Text(t.getPlayers().get(i).getName());
			Text position = new Text(t.getPlayers().get(i).getPosition());
			if (i > 10)
				position.setText("SUB");
			Text overall = new Text(t.getPlayers().get(i).getOverall() + "");
			Text nation = new Text(t.getPlayers().get(i).getNationality());
			Text value = new Text(t.getPlayers().get(i).getValue()/1000000 + "m €");
			System.out.println(gridPlayer == null);
			gridPlayer.add(playerName, 1, i);
			gridPlayer.add(position, 0, i);
			gridPlayer.add(overall, 2, i);
			gridPlayer.add(nation, 3, i);
			gridPlayer.add(value, 4, i);
			
		}
	}
	

}
