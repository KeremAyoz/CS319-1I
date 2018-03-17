package controller;

import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import model.*;

public class Main extends Application {
	private static Stage mainStage;

	private static final int DIFF_SCORE = 10;
	private static final int MIN_SCORE = 90;
	private static final int MAX_SCORE = 100;

	private static final int NUMBER_OF_PLAYERS = 11;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		mainStage = primaryStage;
		mainStage.setTitle("Stars League");
		mainStage.setResizable(false);
		// Opening scene
		Parent root = FXMLLoader.load(getClass().getResource("/view/HomeScreen.fxml"));
		mainStage.setScene(new Scene(root, 1400, 900));
		mainStage.show();
	}

	public static int getOverall() {
		return MIN_SCORE + (int) (Math.random() * DIFF_SCORE + 1);
	}

	public static int[] getAttributes() {
		int[] attributes = new int[8];
		for (int i = 0; i < 8; i++)
			attributes[i] = MIN_SCORE + (int) (Math.random() * DIFF_SCORE + 1);
		return attributes;
	}

	// Real-Madrid
	public static Team getSecondTeam() {
		// Initialization
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Keylor Navas", 30, 180, 70, "Costa Rica", "GK", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF
		players.add(new Player("Sergio Ramos", 30, 180, 70, "Spain", "DF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Marcelo", 30, 180, 70, "Brazil", "DF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Daniel Carvajal", 30, 180, 70, "Spain", "DF", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Jesus Vallejo", 30, 180, 70, "Spain", "DF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Luka Modric", 30, 180, 70, "Crotia", "MF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Gareth Bale", 30, 180, 70, "Wales", "MF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Toni Kroos", 30, 180, 70, "Germany", "MF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Cristiano Ronaldo", 30, 180, 70, "Portugal", "FW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Karim Benzema", 30, 180, 70, "France", "FW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Marco Asensio", 30, 180, 70, "Spain", "FW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Nacho", 30, 180, 70, "Spain", "DF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Raphael Varane", 30, 180, 70, "France", "DF", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Kiko Casilla", 30, 180, 70, "Spain", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Casemiro", 30, 180, 70, "Brazil", "MF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Theo Hernandez", 30, 180, 70, "France", "DF", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Lucas Vazquez", 30, 180, 70, "Spain", "DF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Marcos Llorente", 30, 180, 70, "Spain", "MF", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Borja Mayoral", 30, 180, 70, "Spain", "FW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Isco", 30, 180, 70, "Spain", "MF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Mateo Kovacic", 30, 180, 70, "Crotia", "MF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Dani Ceballos", 30, 180, 70, "Spain", "MF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Ruben Yanez", 30, 180, 70, "Spain", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Zinedine Zidane", 45, 180, 70, "France", getOverall(), 2);
		// President
		President president = new President("Florentino Perez", 71, 180, 70, "Spain");
		// Team
		Team team = new Team("Real Madrid", "Purple-Blue", "433", "Santiago Bernabeu", "2nd 4ever", "Spain", "RMC", 5.0,
				0, 0, manager, president, players);
		return team;
	}

	// Barcelona
	public static Team getFirstTeam() {
		// Initialization
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Marc-Andre ter Stegen", 30, 180, 70, "Germany", "GK", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// DF
		players.add(new Player("Nelson Semedo", 30, 180, 70, "Portugal", "DF", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Gerard Pique", 30, 180, 70, "Spain", "DF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Jordi Alba", 30, 180, 70, "Spain", "DF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Lucas Digne", 30, 180, 70, "France", "DF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Ivan Rakitic", 30, 180, 70, "Crotia", "MF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Sergio Busquets", 30, 180, 70, "Spain", "MF", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Denis Suarez", 30, 180, 70, "Spain", "MF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Andres Iniesta", 30, 180, 70, "Spain", "MF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Luis Suarez", 30, 180, 70, "Uruguay", "FW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Lionel Messi", 30, 180, 70, "Argentina", "FW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// Others
		players.add(new Player("Ousmane Dembele", 30, 180, 70, "France", "FW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Jasper Cillessen", 30, 180, 70, "Netherlands", "GK", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		players.add(new Player("Philippe Coutinho", 30, 180, 70, "Brazil", "MF", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Paulinho", 30, 180, 70, "Brazil", "MF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Paco Alcacer", 30, 180, 70, "Spain", "FW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Sergi Roberto", 30, 180, 70, "Spain", "MF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Andre Gomes", 30, 180, 70, "Portugal", "MF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Alex Vidal", 30, 180, 70, "Spain", "MF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Samuel Umtiti", 30, 180, 70, "France", "DF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Yerry Mina", 30, 180, 70, "Colombia", "DF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Thomas Vermaelen", 30, 180, 70, "Belgium", "DF", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Ernesto Valverde", 54, 180, 70, "Spain", getOverall(), 2);
		// President
		President president = new President("Josep Maria Bartomeu", 55, 180, 70, "Spain");
		// Team
		Team team = new Team("Barcelona", "Purple-Blue", "442", "Camp Nou", "1st 4ever", "Spain",
				"Blaugranes or Azulgranas", 5.0, 0, 0, manager, president, players);
		return team;
	}

	public static void main(String[] args) {
		launch(args);
		Team team1 = getFirstTeam();
		Team team2 = getSecondTeam();
		ArrayList<Action> actions = new ArrayList<Action>();
		Match match = new Match(team1, team2, "Pierluigi Collina", "Sunny", actions);
		actions = match.matchSimulation();
		System.out.println("Match Score: " + match.getGoalHome() + " / " + match.getGoalAway());
		for (int i = 0; i < actions.size(); i++) {
			Action action = actions.get(i);
			if (action.getClass() == Goal.class) {
				Goal goal = (Goal) action;
				System.out.println("Goal: " + goal.getTimeHappened() + " / " + goal.getScored().getName() + " / "
						+ goal.getAssisted().getName());
			} else if (action.getClass() == YellowCard.class) {
				YellowCard yellowCard = (YellowCard) action;
				System.out.println(
						"Yellow Card: " + yellowCard.getTimeHappened() + " / " + yellowCard.getPlayer().getName());
			} else if (action.getClass() == RedCard.class) {
				RedCard redCard = (RedCard) action;
				System.out.println("Red Card: " + redCard.getTimeHappened() + " / " + redCard.getPlayer().getName());
			} else {
				Injury injury = (Injury) action;
				System.out.println("Injury: " + injury.getTimeHappened() + " / " + injury.getInjured().getName());
			}
		}
		
		// Match Played
		System.out.println( "Match Played" );
		// home
		System.out.print("Barcelona: ");
		for( int i = 0 ; i < team1.getPlayers().size() ; i++ )
			System.out.print( team1.getPlayers().get(i).getCntMatch() + " " );
		System.out.println();
		// away
		System.out.print("Real Madrid: ");
		for( int i = 0 ; i < team2.getPlayers().size() ; i++ )
			System.out.print( team2.getPlayers().get(i).getCntMatch() + " " );
		System.out.println();
		
		// Goals
		System.out.println( "Goals" );
		// home
		System.out.print("Barcelona: ");
		for( int i = 0 ; i < team1.getPlayers().size() ; i++ )
			System.out.print( team1.getPlayers().get(i).getCntGoal() + " " );
		System.out.println();
		// away
		System.out.print("Real Madrid: ");
		for( int i = 0 ; i < team2.getPlayers().size() ; i++ )
			System.out.print( team2.getPlayers().get(i).getCntGoal() + " " );
		System.out.println();
		
		// Assists
		System.out.println( "Assists" );
		// home
		System.out.print("Barcelona: ");
		for( int i = 0 ; i < team1.getPlayers().size() ; i++ )
			System.out.print( team1.getPlayers().get(i).getCntAssist() + " " );
		System.out.println();
		// away
		System.out.print("Real Madrid: ");
		for( int i = 0 ; i < team2.getPlayers().size() ; i++ )
			System.out.print( team2.getPlayers().get(i).getCntAssist() + " " );
		System.out.println();
		
		// Yellow Cards
		System.out.println( "Yellow Cards" );
		// home
		System.out.print("Barcelona: ");
		for( int i = 0 ; i < team1.getPlayers().size() ; i++ )
			System.out.print( team1.getPlayers().get(i).getCntYellowCard() + " " );
		System.out.println();
		// away
		System.out.print("Real Madrid: ");
		for( int i = 0 ; i < team2.getPlayers().size() ; i++ )
			System.out.print( team2.getPlayers().get(i).getCntYellowCard() + " " );
		System.out.println();
		
		// Red Cards
		System.out.println( "Red Cards" );
		// home
		System.out.print("Barcelona: ");
		for( int i = 0 ; i < team1.getPlayers().size() ; i++ )
			System.out.print( team1.getPlayers().get(i).getCntRedCard() + " " );
		System.out.println();
		// away
		System.out.print("Real Madrid: ");
		for( int i = 0 ; i < team2.getPlayers().size() ; i++ )
			System.out.print( team2.getPlayers().get(i).getCntRedCard() + " " );
		System.out.println();
	}

	public static void setMainStage(Stage mainStage) {
		Main.mainStage = mainStage;
	}

	public static Stage getMainStage() {
		return mainStage;
	}

}
