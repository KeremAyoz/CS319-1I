package controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.event.ChangeEvent;

import javafx.animation.Animation;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.MouseButton;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.*;

public class Main extends Application {
	private static Stage mainStage;

	private int screenWidth = (int) Screen.getPrimary().getBounds().getWidth();
	private int screenHeight = (int) Screen.getPrimary().getBounds().getHeight();

	private static String OS = null;

	private static MediaPlayer musicplayer;

	
	public static String getOsName() {
		if (OS == null) {
			OS = System.getProperty("os.name");
		}
		return OS;
	}

	public static boolean isWindows() {
		return getOsName().startsWith("Windows");
	}

	public static boolean isMacos() {
		return getOsName().startsWith("Mac");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		mainStage = primaryStage;
		mainStage.setTitle("Stars League");
		mainStage.setResizable(true);
		Parent root = FXMLLoader.load(getClass().getResource("/view/HomeScreen.fxml"));

		mainStage.setFullScreenExitHint("");

		int screenWidth = (int) Screen.getPrimary().getBounds().getWidth();
		int screenHeight = (int) Screen.getPrimary().getBounds().getHeight();

		root.setScaleX(screenWidth / 1400.0);
		root.setScaleY(screenHeight / 900.0);
		if (isWindows()) {
			root.setLayoutX(301);
			root.setLayoutY(98);
		}
		if (isMacos()) {
			root.setLayoutX(20);
		}

		{
			String filePath = "file:///" + new java.io.File("").getAbsolutePath() + "/data/sounds/entrance.mp3";
			filePath = filePath.replace("\\", "/");
			System.out.println(filePath);
			Media mp3MusicFile = new Media(filePath);
			musicplayer = new MediaPlayer(mp3MusicFile);
			musicplayer.setAutoPlay(true);
			musicplayer.setVolume(0.9); // from 0 to 1

			// ***************** loop (repeat) the music ******************
			musicplayer.setOnEndOfMedia(new Runnable() {
				public void run() {
					musicplayer.seek(Duration.ZERO);
				}
			});
		}

		Scene scene = new Scene(root, screenWidth, screenHeight);

		mainStage.setScene(scene);
		mainStage.setFullScreen(true);
		mainStage.show();

	}

	public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException {
		Tournament c = Tournament.getInstance();
		Database.saveCurrentGame(c);
		launch(args);
	}

	public static void setMainStage(Stage mainStage) {
		Main.mainStage = mainStage;
	}

	public static Stage getMainStage() {
		return mainStage;
	}

	public static void pauseMusic() {
		musicplayer.pause();
	}
	public static void playMusic() {
		musicplayer.play();
	}
	
}
