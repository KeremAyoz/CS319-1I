package controller;

import java.awt.Button;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.event.ActionEvent;
import model.Manager;


public class CreditsController implements Initializable {
	Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	@FXML
	public void backToMainMenuClicked() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/HomeScreen.fxml"));
		Main.getMainStage().setScene(new Scene(root));
	}

}
