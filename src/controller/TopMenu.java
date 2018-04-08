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
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class TopMenu implements Initializable {
	
	int screenWidth = (int) Screen.getPrimary().getBounds().getWidth();
	int screenHeight = (int) Screen.getPrimary().getBounds().getHeight();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	@FXML
	public void teamClicked() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/TeamView.fxml"));
		root.setScaleX(screenWidth/1400.0);
		root.setScaleY(screenHeight/900.0);
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
		root.setScaleX(screenWidth/1400.0);
		root.setScaleY(screenHeight/900.0);
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
		root.setScaleX(screenWidth/1400.0);
		root.setScaleY(screenHeight/900.0);
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
		root.setScaleX(screenWidth/1400.0);
		root.setScaleY(screenHeight/900.0);
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
		root.setScaleX(screenWidth/1400.0);
		root.setScaleY(screenHeight/900.0);
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
		root.setScaleX(screenWidth/1400.0);
		root.setScaleY(screenHeight/900.0);
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
		root.setScaleX(screenWidth/1400.0);
		root.setScaleY(screenHeight/900.0);
		root.setLayoutX(301);
		root.setLayoutY(98);
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
		root.setScaleX(screenWidth/1400.0);
		root.setScaleY(screenHeight/900.0);
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
