package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;
import model.Tournament;

public class EliminatedController implements Initializable {

	@FXML
	private Text managerName;
	
	int screenWidth = (int) Screen.getPrimary().getBounds().getWidth();
	int screenHeight = (int) Screen.getPrimary().getBounds().getHeight();

	
	@FXML
	public void backMenuClicked() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/HomeScreen.fxml"));
		root.setScaleX(screenWidth / 1400.0);
		root.setScaleY(screenHeight / 900.0);
		if (Main.isWindows()) {
			root.setLayoutX(360);
			root.setLayoutY(108);
		}
		if (Main.isMacos()) {
			root.setLayoutX(20);
		}
		Stage m = Main.getMainStage();
		Scene t = Main.getMainStage().getScene();
		t.setRoot(root);
		m.setScene(t);
		m.setFullScreen(true);
		Main.setMainStage(m);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Tournament t = Tournament.getInstance();
		managerName.setText(t.getTeams()[t.getMyTeamId()].getManager().getName().toUpperCase());
	}

}
