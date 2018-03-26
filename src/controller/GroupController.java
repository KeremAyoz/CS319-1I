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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class GroupController implements Initializable {
	@FXML
	private Text t1;
	@FXML
	private Text t2;
	@FXML
	private Text t3;
	@FXML
	private Text t4;

	@FXML
	private Text t1p;
	@FXML
	private Text t2p;
	@FXML
	private Text t3p;
	@FXML
	private Text t4p;

	@FXML
	private Text t1w;
	@FXML
	private Text t2w;
	@FXML
	private Text t3w;
	@FXML
	private Text t4w;

	@FXML
	private Text t1d;
	@FXML
	private Text t2d;
	@FXML
	private Text t3d;
	@FXML
	private Text t4d;

	@FXML
	private Text t1l;
	@FXML
	private Text t2l;
	@FXML
	private Text t3l;
	@FXML
	private Text t4l;

	@FXML
	private Text t1s;
	@FXML
	private Text t2s;
	@FXML
	private Text t3s;
	@FXML
	private Text t4s;

	@FXML
	private Text t1c;
	@FXML
	private Text t2c;
	@FXML
	private Text t3c;
	@FXML
	private Text t4c;

	@FXML
	private Text t1pts;
	@FXML
	private Text t2pts;
	@FXML
	private Text t3pts;
	@FXML
	private Text t4pts;

	@FXML
	private ComboBox<String> groupName;
	@FXML
	private Text gName;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		groupName.getItems().addAll("A", "B", "C", "D", "E", "F", "G", "H");
		setup("A");
	}

	public void setup(String group) {
		char c = group.charAt(0);
		int num = (int) c - 65;
		gName.setText("GROUP " + c);
		Group cur = Tournament.getInstance().getGroups()[num];
		t1.setText(cur.getTeam(0).getName());
		t2.setText(cur.getTeam(1).getName());
		t3.setText(cur.getTeam(2).getName());
		t4.setText(cur.getTeam(3).getName());
		
		t1p.setText(String.valueOf(cur.getStatistics()[0][0]));
		t2p.setText(String.valueOf(cur.getStatistics()[1][0]));
		t3p.setText(String.valueOf(cur.getStatistics()[2][0]));
		t4p.setText(String.valueOf(cur.getStatistics()[3][0]));

		t1w.setText(String.valueOf(cur.getStatistics()[0][1]));
		t2w.setText(String.valueOf(cur.getStatistics()[1][1]));
		t3w.setText(String.valueOf(cur.getStatistics()[2][1]));
		t4w.setText(String.valueOf(cur.getStatistics()[3][1]));
		
		t1d.setText(String.valueOf(cur.getStatistics()[0][2]));
		t2d.setText(String.valueOf(cur.getStatistics()[1][2]));
		t3d.setText(String.valueOf(cur.getStatistics()[2][2]));
		t4d.setText(String.valueOf(cur.getStatistics()[3][2]));

		t1l.setText(String.valueOf(cur.getStatistics()[0][3]));
		t2l.setText(String.valueOf(cur.getStatistics()[1][3]));
		t3l.setText(String.valueOf(cur.getStatistics()[2][3]));
		t4l.setText(String.valueOf(cur.getStatistics()[3][3]));

		t1s.setText(String.valueOf(cur.getStatistics()[0][4]));
		t2s.setText(String.valueOf(cur.getStatistics()[1][4]));
		t3s.setText(String.valueOf(cur.getStatistics()[2][4]));
		t4s.setText(String.valueOf(cur.getStatistics()[3][4]));

		t1c.setText(String.valueOf(cur.getStatistics()[0][5]));
		t2c.setText(String.valueOf(cur.getStatistics()[1][5]));
		t3c.setText(String.valueOf(cur.getStatistics()[2][5]));
		t4c.setText(String.valueOf(cur.getStatistics()[3][5]));

		t1pts.setText(String.valueOf(cur.getStatistics()[0][6]));
		t2pts.setText(String.valueOf(cur.getStatistics()[1][6]));
		t3pts.setText(String.valueOf(cur.getStatistics()[2][6]));
		t4pts.setText(String.valueOf(cur.getStatistics()[3][6]));

	}

	@FXML
	public void groupChange() {
		String group = groupName.getValue();
		setup(group);
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
		Parent root = FXMLLoader.load(getClass().getResource("/view/TacticView.fxml"));
		Main.getMainStage().setScene(new Scene(root));
	}

	@FXML
	public void continueClicked() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/MatchPlayView.fxml"));
		Main.getMainStage().setScene(new Scene(root));
	}

}
