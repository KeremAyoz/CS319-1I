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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class KnockoutController implements Initializable {

	@FXML
	private Text t1;
	@FXML
	private Text t2;
	@FXML
	private Text t3;
	@FXML
	private Text t4;
	@FXML
	private Text t5;
	@FXML
	private Text t6;
	@FXML
	private Text t7;
	@FXML
	private Text t8;
	@FXML
	private Text t9;
	@FXML
	private Text t10;
	@FXML
	private Text t11;
	@FXML
	private Text t12;
	@FXML
	private Text t13;
	@FXML
	private Text t14;
	@FXML
	private Text t15;
	@FXML
	private Text t16;
	@FXML
	private Text t17;
	@FXML
	private Text t18;
	@FXML
	private Text t19;
	@FXML
	private Text t20;
	@FXML
	private Text t21;
	@FXML
	private Text t22;
	@FXML
	private Text t23;
	@FXML
	private Text t24;
	@FXML
	private Text t25;
	@FXML
	private Text t26;
	@FXML
	private Text t27;
	@FXML
	private Text t28;
	@FXML
	private Text t00;
	@FXML
	private Text t01;

	@FXML
	private GridPane last16Matches;

	int screenWidth = (int) Screen.getPrimary().getBounds().getWidth();
	int screenHeight = (int) Screen.getPrimary().getBounds().getHeight();
	Tournament t = Tournament.getInstance();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		buildTree();
		if (t.getStatusEliminationStage())
			fillMatches();

	}

	public void fillMatches() {
		// Last 16
		Match[] all = t.getKnockout().getKnockout().getMatches();
		for (int i = 28; i > 12; i--) {
			last16Matches.add(new Text(all[i].getHome().getName()), 0, i);
			last16Matches.add(new Text(all[i].getGoalHome() + "-" + all[i].getGoalAway()), 1, i);
			last16Matches.add(new Text(all[i].getAway().getName()), 2, i);
		}
		
	}

	public void buildTree() {
		t1.setText("");
		t2.setText("");
		t3.setText("");
		t4.setText("");
		t5.setText("");
		t6.setText("");
		t7.setText("");
		t8.setText("");
		t9.setText("");
		t10.setText("");
		t11.setText("");
		t12.setText("");
		t13.setText("");
		t14.setText("");
		t15.setText("");
		t16.setText("");
		t17.setText("");
		t18.setText("");
		t19.setText("");
		t20.setText("");
		t21.setText("");
		t22.setText("");
		t23.setText("");
		t24.setText("");
		t25.setText("");
		t26.setText("");
		t27.setText("");
		t28.setText("");
		t00.setText("");
		t01.setText("");
		if (t.getStatusEliminationStage()) {
			// Last 16
			t13.setText(t.getKnockout().getKnockout().getMatches()[13].getHome().getName());
			t14.setText(t.getKnockout().getKnockout().getMatches()[14].getHome().getName());
			t15.setText(t.getKnockout().getKnockout().getMatches()[15].getHome().getName());
			t16.setText(t.getKnockout().getKnockout().getMatches()[16].getHome().getName());
			t17.setText(t.getKnockout().getKnockout().getMatches()[17].getHome().getName());
			t18.setText(t.getKnockout().getKnockout().getMatches()[18].getHome().getName());
			t19.setText(t.getKnockout().getKnockout().getMatches()[19].getHome().getName());
			t20.setText(t.getKnockout().getKnockout().getMatches()[20].getHome().getName());
			t21.setText(t.getKnockout().getKnockout().getMatches()[21].getHome().getName());
			t22.setText(t.getKnockout().getKnockout().getMatches()[22].getHome().getName());
			t23.setText(t.getKnockout().getKnockout().getMatches()[23].getHome().getName());
			t24.setText(t.getKnockout().getKnockout().getMatches()[24].getHome().getName());
			t25.setText(t.getKnockout().getKnockout().getMatches()[25].getHome().getName());
			t26.setText(t.getKnockout().getKnockout().getMatches()[26].getHome().getName());
			t27.setText(t.getKnockout().getKnockout().getMatches()[27].getHome().getName());
			t28.setText(t.getKnockout().getKnockout().getMatches()[28].getHome().getName());

			if (t.getKnockout().getKnockout().getMatches()[5].getHome() != null) {
				// Quarter Final
				t5.setText(t.getKnockout().getKnockout().getMatches()[5].getHome().getName());
				t6.setText(t.getKnockout().getKnockout().getMatches()[6].getHome().getName());
				t7.setText(t.getKnockout().getKnockout().getMatches()[7].getHome().getName());
				t8.setText(t.getKnockout().getKnockout().getMatches()[7].getHome().getName());
				t9.setText(t.getKnockout().getKnockout().getMatches()[9].getHome().getName());
				t10.setText(t.getKnockout().getKnockout().getMatches()[10].getHome().getName());
				t11.setText(t.getKnockout().getKnockout().getMatches()[11].getHome().getName());
				t12.setText(t.getKnockout().getKnockout().getMatches()[12].getHome().getName());
			}

			if (t.getKnockout().getKnockout().getMatches()[1].getHome() != null) {
				// Semi Final
				t1.setText(t.getKnockout().getKnockout().getMatches()[1].getHome().getName());
				t2.setText(t.getKnockout().getKnockout().getMatches()[2].getHome().getName());
				t3.setText(t.getKnockout().getKnockout().getMatches()[3].getHome().getName());
				t4.setText(t.getKnockout().getKnockout().getMatches()[4].getHome().getName());
			}
			if (t.getKnockout().getKnockout().getMatches()[0].getHome() != null) {
				// Final
				t00.setText(t.getKnockout().getKnockout().getMatches()[0].getAway().getName());
				t01.setText(t.getKnockout().getKnockout().getMatches()[0].getHome().getName());
			}
		}
	}

}
