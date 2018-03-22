package model;

import java.io.IOException;
import java.util.ArrayList;

public class DatabaseAccess {

	private static final int DIFF_SCORE = 10;
	private static final int MIN_SCORE = 90;

	public static int getOverall() {
		return MIN_SCORE + (int) (Math.random() * DIFF_SCORE + 1);
	}

	public static int[] getAttributes() {
		int[] attributes = new int[8];
		for (int i = 0; i < 8; i++)
			attributes[i] = MIN_SCORE + (int) (Math.random() * DIFF_SCORE + 1);
		return attributes;
	}

	public static Team createBarcelona() {
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
	public static Team createGalatasaray() {
		// Galatasaray
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Muslera", 30, 180, 70, "Uruguay", "GK", 83, 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF
		players.add(new Player("Mariano", 30, 180, 70, "Brazil", "RB", 80, 'R', 1000000, 8000000, true,
				getAttributes(), actions));
		players.add(new Player("Maicon", 30, 180, 70, "Brazil", "CB", 82, 'R', 1000000, 14000000, true,
				getAttributes(), actions));
		players.add(new Player("Serdar", 30, 180, 70, "Turkey", "CB", 79, 'R', 1000000, 9000000, true,
				getAttributes(), actions));
		players.add(new Player("Nagatomo", 30, 180, 70, "Japan", "LB", 78, 'R', 1000000, 6000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Selçuk", 30, 180, 70, "Turkey", "CM", 79, 'R', 1000000, 5500000, true,
				getAttributes(), actions));
		players.add(new Player("Fernando", 30, 180, 70, "Brazil", "CM", 82, 'R', 1000000, 9000000,
				true, getAttributes(), actions));
		players.add(new Player("Belhanda", 30, 180, 70, "Morocco", "CM", 80, 'R', 1000000, 12000000,
				true, getAttributes(), actions));
		// FW
		players.add(new Player("Feghouli", 30, 180, 70, "Algeria", "RW", 81, 'R', 1000000, 14000000,
				true, getAttributes(), actions));
		players.add(new Player("Gomis", 30, 180, 70, "France", "ST", 83, 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Garry", 30, 180, 70, "Cape Verde", "LW", 79, 'R', 1000000, 16000000,
				true, getAttributes(), actions));
		// Others
		players.add(new Player("Cedric Carrosco", 30, 180, 70, "France", "GK", 78, 'R', 1000000, 3000000,
				true, getAttributes(), actions));
		players.add(new Player("Martin Linnes", 30, 180, 70, "Norway", "RB", 77, 'R', 1000000, 5000000, true,
				getAttributes(), actions));
		players.add(new Player("Ahmet Çalık", 30, 180, 70, "Turkey", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Jason Denayer", 30, 180, 70, "Belgium", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Latovlevici", 30, 180, 70, "Romania", "LB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Ryan Donk", 30, 180, 70, "Netherlands", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Eren Derdiyok", 30, 180, 70, "Switzerland", "ST", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Sinan Gümüş", 30, 180, 70, "Turkey", "RW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Koray Günter", 30, 180, 70, "Germany", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Yasin Öztekin", 30, 180, 70, "Turkey", "LW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Eray İşcan", 30, 180, 70, "Turkey", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Emrah Başsan", 30, 180, 70, "Turkey", "RW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Fatih Terim", 65, 180, 70, "Turkey", getOverall(), 2);
		// President
		President president = new President("Mustafa Cengiz", 71, 180, 70, "Turkey");
		// Team
		Team team = new Team("Galatasaray", "Red-Yellow", "4-3-3", "Ali Sami Yen", "Cimbom", "Turkey", "GAL", 5.0, 0, 0,
				manager, president, players);
		return team;
	}
	public static Team createPsg() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Trapp", 30, 180, 70, "Germany", "GK", 81, 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Meunier", 30, 180, 70, "Belgium", "RB", 81, 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Marquinhos", 30, 180, 70, "Brazil", "CB", 82, 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Silva", 30, 180, 70, "Brazil", "CB", 88, 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Kurzawa", 30, 180, 70, "France", "LB", 82, 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Verratti", 30, 180, 70, "Italy", "CM", 84, 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Rabiot", 30, 180, 70, "France", "CM", 81, 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Di Maria", 30, 180, 70, "Argentina", "CM", 84, 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Mbappe", 30, 180, 70, "France", "LW", 83, 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Cavani", 30, 180, 70, "Uruguay", "ST", 85, 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Neymar", 30, 180, 70, "Brazil", "LW", 89, 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Areola", 30, 180, 70, "France", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Draxler", 30, 180, 70, "Germany", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Pastore", 30, 180, 70, "Argentina", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Ben Arfa", 30, 180, 70, "France", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Lass", 30, 180, 70, "France", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Yuri", 30, 180, 70, "Spain", "LB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Giovani", 30, 180, 70, "Argentina", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Alves", 30, 180, 70, "Brazil", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Motta", 30, 180, 70, "Italy", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Kimpembe", 30, 180, 70, "France", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// Manager
		Manager manager = new Manager("Emery", 65, 180, 70, "Spain", getOverall(), 2);
		// President
		President president = new President("El Khalafi", 71, 180, 70, "Quatar");
		// Team
		Team team = new Team("Paris Saint Germain", "Red-Blue", "4-3-3", "Parc de Prince", "PSG", "France", "PSG", 5.0, 0,
				0, manager, president, players);
		return team;
	}
	public static Team createManu() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("De Gea", 30, 180, 70, "Spain", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Valencia", 30, 180, 70, "Ecuador", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Smalling", 30, 180, 70, "England", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Bailly", 30, 180, 70, "Ivory Coast", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Shaw", 30, 180, 70, "England", "LB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Paul Pogba", 30, 180, 70, "France", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Herrera", 30, 180, 70, "Mexico", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Matic", 30, 180, 70, "Serbia", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Rashford", 30, 180, 70, "France", "RW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Lukaku", 30, 180, 70, "Belgium", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Martial", 30, 180, 70, "France", "LW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Romero", 30, 180, 70, "Argentina", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Young", 30, 180, 70, "England", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Blind", 30, 180, 70, "Netherlands", "LB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Sanchez", 30, 180, 70, "Chile", "RW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Mata", 30, 180, 70, "Spain", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Darmian", 30, 180, 70, "Italy", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Carrick", 30, 180, 70, "England", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Ibrahimovic", 30, 180, 70, "Sweden", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Mourinho", 65, 180, 70, "Portugal", getOverall(), 2);
		// President
		President president = new President("Henry Davies", 71, 180, 70, "England");
		// Team
		Team team = new Team("Manchester United", "Red-Yellow", "433", "Old Trafford", "Red Devils", "England", "MUN",
				5.0, 0, 0, manager, president, players);
		return team;
	}
	public static Team createChelsea() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Thibaut Courtois", 30, 180, 70, "Belgium", "GK", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF
		players.add(new Player("Eduardo", 30, 180, 70, "Portugal", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Rudiger", 30, 180, 70, "Germany", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Cahill", 30, 180, 70, "England", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Marcos Alonso", 30, 180, 70, "Italy", "LB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Kante", 30, 180, 70, "France", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Fabregas", 30, 180, 70, "Spain", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Bakayoko", 30, 180, 70, "France", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Willian", 30, 180, 70, "Brazil", "RW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Morata", 30, 180, 70, "Spain", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Hazard", 30, 180, 70, "Belgium", "LW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Caballero", 30, 180, 70, "Argentina", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Luiz", 30, 180, 70, "Brazil", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Emerson", 30, 180, 70, "Brazil", "LB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Azpilicueta", 30, 180, 70, "Spain", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Barkley", 30, 180, 70, "England", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Moses", 30, 180, 70, "Nigeria", "LB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Drinkwater", 30, 180, 70, "Italy", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Christensen", 30, 180, 70, "Denmark", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Chalobah", 30, 180, 70, "England", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Conte", 65, 180, 70, "Italy", getOverall(), 2);
		// President
		President president = new President("Abramovich", 71, 180, 70, "France");
		// Team
		Team team = new Team("Chelsea F.C", "Blue-White", "433", "Stamford Bridge", "Blues", "England", "CHE", 5.0, 0,
				0, manager, president, players);
		return team;
	}
	public static Team createPorto() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Casillas", 30, 180, 70, "Spain", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Pereira", 30, 180, 70, "Portugal", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Marcano", 30, 180, 70, "Germany", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Felipe", 30, 180, 70, "Brazil", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Telles", 30, 180, 70, "Brazil", "LB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Quintero", 30, 180, 70, "Colombia", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Lucho Gonzalez", 30, 180, 70, "Argentina", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Oliver", 30, 180, 70, "Spain", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Brahimi", 30, 180, 70, "Algeria", "RW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Aboubakar", 30, 180, 70, "Cameroon", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Hernani", 30, 180, 70, "Portugal", "LW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Sa", 30, 180, 70, "Portugal", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Maxi Pereira", 30, 180, 70, "Uruguay", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Reyes", 30, 180, 70, "Mexico", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Luizao", 30, 180, 70, "Brazil", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Herrera", 30, 180, 70, "Mexico", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Moses", 30, 180, 70, "Nigeria", "LB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Osvaldo", 30, 180, 70, "Italia", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Marega", 30, 180, 70, "Ghana", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Waris", 30, 180, 70, "Ghana", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Sergio Conceicao", 65, 180, 70, "Portugal", getOverall(), 2);
		// President
		President president = new President("Reyes", 71, 180, 70, "Portugal");
		// Team
		Team team = new Team("Porto", "Blue-White", "433", "Estadio do Dragao", "Porto Kings", "Portugal", "POR", 5.0,
				0, 0, manager, president, players);
		return team;
	}
	public static Team createRoma() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Alisson", 30, 180, 70, "Brazil", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Florenzi", 30, 180, 70, "Italy", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Juan Jesus", 30, 180, 70, "England", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Manolas", 30, 180, 70, "Greece", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Peres", 30, 180, 70, "Brazil", "LB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("De Rossi", 30, 180, 70, "Italy", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Strootman", 30, 180, 70, "Italy", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Nainggolan", 30, 180, 70, "Belgium", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Cengiz", 30, 180, 70, "Turkey", "RW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Dzeko", 30, 180, 70, "Bosnia", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Perotti", 30, 180, 70, "Argentina", "LW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Skorupski", 30, 180, 70, "Argentina", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Karsdrop", 30, 180, 70, "Polonia", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("El Shaarawy", 30, 180, 70, "Egypt", "LW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Kolarov", 30, 180, 70, "Serbia", "LB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Pellegrini", 30, 180, 70, "Italy", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Gerson", 30, 180, 70, "Brazil", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Antonucci", 30, 180, 70, "Italy", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Defrel", 30, 180, 70, "France", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// Manager
		Manager manager = new Manager("Eusebio Di Francesco", 65, 180, 70, "Italy", getOverall(), 2);
		// President
		President president = new President("Pallotta", 71, 180, 70, "Italy");
		// Team
		Team team = new Team("A.S Roma", "Red-Yellow", "433", "Stadio Olimpico", "Wolfs", "Italy", "ROM", 5.0, 0, 0,
				manager, president, players);
		return team;
	}
	public static Team createLyon() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Lopes", 30, 180, 70, "Portugal", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Rafael", 30, 180, 70, "Brazil", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Diakhaby", 30, 180, 70, "France", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Marcelo", 30, 180, 70, "Brazil", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Marcal", 30, 180, 70, "Brazil", "LB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Ferri", 30, 180, 70, "France", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Cheikh", 30, 180, 70, "Spain", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Tousart", 30, 180, 70, "France", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Traore", 30, 180, 70, "Burkina Faso", "RW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Fekir", 30, 180, 70, "France", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Depay", 30, 180, 70, "Netherlands", "LW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Mocio", 30, 180, 70, "France", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Morel", 30, 180, 70, "France", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Mbiwa", 30, 180, 70, "France", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Mendy", 30, 180, 70, "France", "LB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Owusu", 30, 180, 70, "France", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Cornet", 30, 180, 70, "Ivory Coast", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Mariano", 30, 180, 70, "France", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Dzabana", 30, 180, 70, "France", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// Manager
		Manager manager = new Manager("Eusebio Di Francesco", 65, 180, 70, "Italy", getOverall(), 2);
		// President
		President president = new President("Genesio", 71, 180, 70, "Portugal");
		// Team
		Team team = new Team("Lyon", "Red-Blue", "433", "Stade de Gerland", "Les Gones", "France", "LYO", 5.0, 0, 0,
				manager, president, players);
		return team;
	}
	public static Team createLeverkusen() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Leno", 30, 180, 70, "Germany", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Tah", 30, 180, 70, "Germany", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Bender", 30, 180, 70, "Germany", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Jedvaj", 30, 180, 70, "Crotia", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Wendell", 30, 180, 70, "Brazil", "LB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Aranguiz", 30, 180, 70, "Chile", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Bender", 30, 180, 70, "Germany", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Yurchenko", 30, 180, 70, "Ukranie", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Bellerabi", 30, 180, 70, "Germany", "RW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Kiessling", 30, 180, 70, "Germany", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Volland", 30, 180, 70, "Germany", "LW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Ramazan", 30, 180, 70, "Austria", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Handwerker", 30, 180, 70, "Germany", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Atakan", 30, 180, 70, "Germany", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Brandt", 30, 180, 70, "Germany", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Pohjanpalo", 30, 180, 70, "Finland", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Brasnic", 30, 180, 70, "Crotia", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Baumgartlinger", 30, 180, 70, "Austria", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Bailey", 30, 180, 70, "Jamaica", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// Manager
		Manager manager = new Manager("Eusebio Di Francesco", 65, 180, 70, "Italy", getOverall(), 2);
		// President
		President president = new President("Genesio", 71, 180, 70, "Portugal");
		// Team
		Team team = new Team("Leverkusen", "Red-Blue", "433", "Stade de Gerland", "Les Gones", "France", "LYO", 5.0, 0, 0,
				manager, president, players);
		return team;
	}
	public static Team createRbl() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Mvogo", 30, 180, 70, "Switzerland", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Orban", 30, 180, 70, "Germany", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Franke", 30, 180, 70, "Germany", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Luiaso", 30, 180, 70, "Germany", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Klostermann", 30, 180, 70, "Germany", "LB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Sabitzer", 30, 180, 70, "Austria", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Keita", 30, 180, 70, "Nigeria", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Forsberg", 30, 180, 70, "Sweden", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Bruma", 30, 180, 70, "Portugal", "RW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Werner", 30, 180, 70, "Germany", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Kampl", 30, 180, 70, "Austria", "LW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Gulacsi", 30, 180, 70, "Hungary", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Franke", 30, 180, 70, "Germany", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Ilsanker", 30, 180, 70, "Austria", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Paulsen", 30, 180, 70, "Denmark", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Augustin", 30, 180, 70, "France", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Kuhn", 30, 180, 70, "Germany", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Schmitz", 30, 180, 70, "Germany", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Konate", 30, 180, 70, "France", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// Manager
		Manager manager = new Manager("Hasenhuttl", 65, 180, 70, "Germany", getOverall(), 2);
		// President
		President president = new President("Müller", 71, 180, 70, "Germany");
		// Team
		Team team = new Team("RB Leipzig", "Red-White", "433", "RB Arena", "Bulls", "Germany", "RBL", 5.0, 0, 0,
				manager, president, players);
		return team;
	}
	public static Team createBenfica() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Svilar", 30, 180, 70, "Belgium", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Eliseu", 30, 180, 70, "Portugal", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Jardel", 30, 180, 70, "Brazil", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Luiaso", 30, 180, 70, "Brazil", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Grimaldo", 30, 180, 70, "Spain", "LB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Fejsa", 30, 180, 70, "Serbia", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Salvio", 30, 180, 70, "Argentina", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Cervi", 30, 180, 70, "Argentina", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Jimenez", 30, 180, 70, "Mexico", "RW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Jonas", 30, 180, 70, "Brazil", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Ola John", 30, 180, 70, "Netherlands", "LW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Lopes", 30, 180, 70, "Portugal", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Douglas", 30, 180, 70, "Brazil", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Rojas", 30, 180, 70, "Paraguay", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Almeida", 30, 180, 70, "Portugal", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Rafa", 30, 180, 70, "Portugal", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Samaris", 30, 180, 70, "Greece", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Gabriel", 30, 180, 70, "Brazil", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Seferovic", 30, 180, 70, "Switzerland", "ST", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Rui Vitoria", 65, 180, 70, "Portugal", getOverall(), 2);
		// President
		President president = new President("Sergio", 71, 180, 70, "Portugal");
		// Team
		Team team = new Team("Benfica", "Red-Black", "433", "Estadio da Luz", "Eagles", "Portugal", "BEN", 5.0, 0, 0,
				manager, president, players);
		return team;
	}
	public static Team createMilan() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Donnarumma", 30, 180, 70, "Germany", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Conti", 30, 180, 70, "Italia", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Zapata", 30, 180, 70, "Ecuador", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Musacchio", 30, 180, 70, "Argentina", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Antonelli", 30, 180, 70, "Italy", "LB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Montolivo", 30, 180, 70, "Italy", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Suso", 30, 180, 70, "Spain", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Biglia", 30, 180, 70, "Argentina", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Kessie", 30, 180, 70, "Ivory Coast", "RW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Silva", 30, 180, 70, "Portugal", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Kalinic", 30, 180, 70, "Crotia", "LW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Abbiati", 30, 180, 70, "Italy", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Paletta", 30, 180, 70, "Italy", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Abate", 30, 180, 70, "Germany", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Rodriguez", 30, 180, 70, "Switzerland", "LB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Bonaventura", 30, 180, 70, "Italy", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Locatelli", 30, 180, 70, "Italy", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Borini", 30, 180, 70, "Italy", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Cutrone", 30, 180, 70, "Italy", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Gattuso", 65, 180, 70, "Italy", getOverall(), 2);
		// President
		President president = new President("Xi Yhang", 71, 180, 70, "China");
		// Team
		Team team = new Team("A.C. Milan", "Red-Black", "433", "San Siro", "Rossoneri", "Italy", "ACM", 5.0, 0, 0,
				manager, president, players);
		return team;
	}
	public static Team createBasel() {
		// Initialization
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Signori", 30, 180, 70, "Switzerland", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Lang", 30, 180, 70, "Switzerland", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Balanta", 30, 180, 70, "Colombia", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Riveros", 30, 180, 70, "Paraguay", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Goncalves", 30, 180, 70, "Switzerland", "LB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF
		players.add(new Player("Okafor", 30, 180, 70, "Switzerland", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Die", 30, 180, 70, "Ivory Coast", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Simic", 30, 180, 70, "Serbia", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("El Younoussi", 30, 180, 70, "Norway", "RW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Wolfswinkel", 30, 180, 70, "Netherlands", "ST", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Ajeti", 30, 180, 70, "Switzerland", "LW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Thurkauf", 30, 180, 70, "Switzerland", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Huser", 30, 180, 70, "Switzerland", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Okafor", 30, 180, 70, "Switzerland", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Campo", 30, 180, 70, "Switzerland", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Stocker", 30, 180, 70, "Switzerland", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Cani", 30, 180, 70, "Switzerland", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Oberlin", 30, 180, 70, "Switzerland", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Pululu", 30, 180, 70, "France", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// Manager
		Manager manager = new Manager("Wicky", 65, 180, 70, "Switzerland", getOverall(), 2);
		// President
		President president = new President("Jakob", 71, 180, 70, "Switzerland");
		// Team
		Team team = new Team("Basel FC", "Red-Blue", "433", "St Jakob-Park", "Switz", "Switzerland", "BAS", 5.0, 0, 0,
				manager, president, players);
		return team;
	}
	public static Team createSpartak() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Rebrov", 30, 180, 70, "Russia", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Petkovic", 30, 180, 70, "Serbia", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Serdar", 30, 180, 70, "Germany", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Bocchetti", 30, 180, 70, "Italy", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Kombarov", 30, 180, 70, "Russia", "LB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Bakaev", 30, 180, 70, "Russia", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Romula", 30, 180, 70, "Brazil", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Fernando", 30, 180, 70, "Brazil", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Promes", 30, 180, 70, "Netherlands", "RW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Nimely", 30, 180, 70, "Maleysia", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Kozlov", 30, 180, 70, "Russia", "LW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Antipov", 30, 180, 70, "Russia", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Tiglev", 30, 180, 70, "Russia", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Khomukha", 30, 180, 70, "Russia", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Romulo", 30, 180, 70, "Brazil", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Ananidze", 30, 180, 70, "Georgia", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Malgarejo", 30, 180, 70, "Paraguay", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Eremenko", 30, 180, 70, "Finland", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Zobnin", 30, 180, 70, "Russia", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// Manager
		Manager manager = new Manager("Carrera", 65, 180, 70, "Brazil", getOverall(), 2);
		// President
		President president = new President("Igor", 71, 180, 70, "Russia");
		// Team
		Team team = new Team("Spartak Moscow", "Red-White", "433", "Otkrytie Arena", "Spartak", "Russia", "SMO", 5.0, 0,
				0, manager, president, players);
		return team;
	}
	public static Team createSporting() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Patricio", 30, 180, 70, "Portugal", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Fokobo", 30, 180, 70, "Cameroon", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Coates", 30, 180, 70, "Uruguay", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Mathieu", 30, 180, 70, "France", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Coentrao", 30, 180, 70, "Portugal", "LB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Ruiz", 30, 180, 70, "Costa Rica", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Battaglia", 30, 180, 70, "Argentina", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Wendel", 30, 180, 70, "Peru", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Martins", 30, 180, 70, "Portugal", "RW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Dost", 30, 180, 70, "Netherlands", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Doumbia", 30, 180, 70, "Ivory Coast", "LW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Salin", 30, 180, 70, "France", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Silva", 30, 180, 70, "Portugal", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Ristovski", 30, 180, 70, "Macedonia", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Merih", 30, 180, 70, "Turkey", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Acuna", 30, 180, 70, "Argentina", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Podence", 30, 180, 70, "Portugal", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Palninha", 30, 180, 70, "Portugal", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Montero", 30, 180, 70, "Ecuador", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Jorge Jesus", 65, 180, 70, "Portugal", getOverall(), 2);
		// President
		President president = new President("Garcia", 71, 180, 70, "Portugal");
		// Team
		Team team = new Team("Sporting Lisbon", "Green-White", "433", "Sporting Arena", "Rossoneri", "Portugal", "SPL",
				5.0, 0, 0, manager, president, players);
		return team;
	}
	public static Team createLiverpool() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Loris Karius", 30, 180, 70, "Germany", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Nathaniel Clyne", 30, 180, 70, "England", "DF", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Virgil van Dijk", 30, 180, 70, "Nederlands", "DF", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Dejan Lovren", 30, 180, 70, "Crotia", "DF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Alberto Moreno", 30, 180, 70, "England", "DF", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF
		players.add(new Player("Emre Can", 30, 180, 70, "Germany", "MF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Georginio Wijnaldum", 30, 180, 70, "Netherlands", "MF", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		players.add(new Player("Adam Lallana", 30, 180, 70, "England", "MF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Alex Oxlade-Chamberlein", 30, 180, 70, "England", "FW", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		players.add(new Player("Roberto Firmino", 30, 180, 70, "Brazil", "FW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Sadio Mane", 30, 180, 70, "Senegal", "FW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Simon Mignolet", 30, 180, 70, "Belgium", "DF", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Ragnar Klavan", 30, 180, 70, "Estonia", "DF", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Jordan Henderson", 30, 180, 70, "England", "GK", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Joe Gomez", 30, 180, 70, "England", "MF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Mohamed Salah", 30, 180, 70, "Egypt", "DF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Andrew Robertson", 30, 180, 70, "Scotland", "DF", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		players.add(new Player("Ben Woodburn", 30, 180, 70, "Wales", "MF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Trent Alexander-Arnold", 30, 180, 70, "Spain", "FW", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		players.add(new Player("Joel Matip", 30, 180, 70, "Cameroon", "MF", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Danny Ward", 30, 180, 70, "Wales", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Adam Bogdan", 30, 180, 70, "Spain", "GK", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Solanke", 30, 180, 70, "England", "FW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Jurgen Klopp", 45, 180, 70, "Germany", getOverall(), 2);
		// President
		President president = new President("John Houlding", 71, 180, 70, "Spain");
		// Team
		Team team = new Team("Liverpool", "Red-White", "433", "Anfield Road", "You Will Never Walk Alone", "England",
				"LIV", 5.0, 0, 0, manager, president, players);
		return team;
	}
	public static Team createRealMadrid() {
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
	public static Team createDortmund() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1
		players.add(new Player("Roman Bürki", 27, 187, 70, "Turkey", "GK", getOverall(), 'R', 1000000, 7200000, true,
				getAttributes(), actions));
		// DF 1
		players.add(new Player("Dan-Axel Zagadou", 18, 196, 70, "France", "RB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Manuel Akanji", 22, 190, 70, "France", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 3
		players.add(new Player("Raphaël Guerreiro", 22, 190, 70, "Brasil", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 4
		players.add(new Player("Marcel Schmelzer", 22, 190, 70, "Germany", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 1
		players.add(new Player("Jadon Sancho", 17, 180, 70, "England", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 2
		players.add(new Player("Nuri Şahin", 29, 180, 70, "Turkey", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 3
		players.add(new Player("Gonzalo Castro", 30, 180, 70, "Germany", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 4
		players.add(new Player("André Schürrle", 30, 180, 70, "Germany", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 1
		players.add(new Player("Alexander Isak", 30, 180, 70, "Sweden", "RW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 2
		players.add(new Player("Maximilian Philipp", 30, 180, 70, "Germany", "ST", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 3
		players.add(new Player("Michy Batshuayi ", 30, 180, 70, "Belgium", "LW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// GK 1
		players.add(new Player("Dominik Reimann", 28, 170, 70, "Germany", "GK", getOverall(), 'R', 1000000, 7200000,
				true, getAttributes(), actions));
		// DF 1
		players.add(new Player("Erik Durm", 25, 183, 70, "Germany", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 2
		players.add(new Player("Sebastian Rode", 27, 190, 70, "Germany", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Mahmoud Dahoud", 22, 177, 70, "Syria", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 4
		players.add(new Player("Jeremy Toljan", 23, 182, 70, "Germany", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 1
		players.add(new Player("Gonzalo Castro", 30, 171, 70, "Germany", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 2
		players.add(new Player("Mario Götze", 25, 176, 70, "Germany", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 3
		players.add(new Player("Andriy Yarmolenko", 28, 190, 70, "Russia", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 4
		players.add(new Player("Marco Reus", 28, 180, 70, "Germany", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Peter Stoger", 51, 176, 70, "Austrian", getOverall(), 2);
		// President
		President president = new President("Reinhard Rauball", 71, 175, 70, "Germany");
		// Team
		Team team = new Team("Borussia Dortmund", "Yellow-Black", "442", "Camp Nou", "Der BVB", "Germany",
				"Blaugranes or Azulgranas", 5.0, 0, 0, manager, president, players);
		return team;
	}

	public static Team createCska() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1
		players.add(new Player("Ilya Pomazun", 21, 190, 70, "Russia", "GK", getOverall(), 'R', 1000000, 7200000, true,
				getAttributes(), actions));
		// DF 1
		players.add(new Player("Mário Fernandes", 27, 189, 70, "Brasil", "RB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Sergei Ignashevich", 38, 186, 70, "Russia", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Viktor Vasin", 29, 192, 70, "Russia", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 4
		players.add(new Player("Aleksei Berezutski", 35, 190, 70, "Russia", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 1
		players.add(new Player("Pontus Wernbloom", 31, 187, 70, "Sweden", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 2
		players.add(new Player("Georgi Milanov", 26, 180, 70, "Bulgaria", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Gonzalo Castro", 30, 180, 70, "Germany", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 4
		players.add(new Player("Alan Dzagoev", 27, 179, 70, "Russia", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// F 1
		players.add(new Player("Vitinho", 24, 178, 70, "Brasil", "RW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// F 2
		players.add(new Player("Ahmed Musa", 25, 170, 70, "Nigeria", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// F 3
		players.add(new Player("Fyodor Chalov ", 19, 180, 70, "Russia", "LW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// GK 1
		players.add(new Player("Igor Akinfeev", 31, 186, 70, "Russia", "GK", getOverall(), 'R', 1000000, 7200000, true,
				getAttributes(), actions));
		// DF 1
		players.add(new Player("Kirill Nababkin", 31, 184, 70, "Russia", "RB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Vasili Berezutski", 35, 189, 70, "Russia", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Georgi Shchennikov", 26, 180, 70, "Russia", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 4
		players.add(new Player("Nikita Chernov", 22, 188, 70, "Russia", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 1
		players.add(new Player("Aleksandr Golovin", 21, 180, 70, "Russia", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 2
		players.add(new Player("Kristijan Bistrović", 19, 183, 70, "Croatia", "CM", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Bibras Natkho", 30, 175, 70, "Israel", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 4
		players.add(new Player("Astemir Gordyushenko", 20, 177, 70, "Russia", "CM", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Viktor Goncharenko", 51, 176, 70, "Russia", getOverall(), 2);
		// President
		President president = new President("Andrey Vatutin", 71, 175, 70, "Russia");
		// Team
		Team team = new Team("CSKA Moscow", "Red-Blue", "442", "Camp Nou", "Armeitsy", "Russia", "Koni ", 5.0, 0, 0,
				manager, president, players);
		return team;
	}
	public static Team createSalzburg() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1
		players.add(new Player("Cican Stankovic", 21, 190, 70, "Austria", "GK", getOverall(), 'R', 1000000, 7200000,
				true, getAttributes(), actions));
		// DF 1
		players.add(new Player("Duje Ćaleta-Car", 21, 189, 70, "Croatia", "RB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Jérôme Onguéné", 20, 190, 70, "Cameroon", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 3
		players.add(new Player("André Ramalho", 26, 182, 70, "Brazil", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 4
		players.add(new Player("Andreas Ulmer", 32, 175, 70, "Austria", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 1
		players.add(new Player("Amadou Haidara", 20, 176, 70, "Mali", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 2
		players.add(new Player("Reinhold Yabo", 26, 175, 70, "Germany", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Diadie Samassékou", 22, 175, 70, "Mali", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 4
		players.add(new Player("Hannes Wolf", 18, 179, 70, "Austria", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// F 1
		players.add(new Player("Takumi Minamino", 23, 174, 70, "Japan", "RW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 2
		players.add(new Player("Hwang Hee-chan", 22, 177, 70, "South Korea", "ST", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 3
		players.add(new Player("Fredrik Gulbrandsen ", 25, 175, 70, "Norway", "LW", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// GK 1
		players.add(new Player("Alexander Walke", 34, 187, 70, "Germany", "GK", getOverall(), 'R', 1000000, 7200000,
				true, getAttributes(), actions));
		// DF 1
		players.add(new Player("Stefan Lainer", 25, 176, 70, "Austria", "RB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Marin Pongračić", 20, 189, 70, "Germany", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Asger Sørensen", 21, 191, 70, "Denmark", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 4
		players.add(new Player("Patson Daka", 19, 185, 70, "Zambia", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 1
		players.add(new Player("Valon Berisha", 25, 178, 70, "Sweden", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 2
		players.add(new Player("Dominik Szoboszlai", 17, 185, 70, "Hungary", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Christoph Leitgeb", 32, 172, 70, "Austria", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 4
		players.add(new Player("Patrick Farkas", 25, 179, 70, "Austria", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Marco Rose", 41, 187, 70, "Germany", getOverall(), 2);
		// President
		President president = new President("Andrey Vatutin", 71, 175, 70, "Russia");
		// Team
		Team team = new Team("FC Red Bull Salzburg", "Red-Blue", "442", "Red Bull Arena Salzburg", "Die Roten Bullen",
				"Austria", "__", 5.0, 0, 0, manager, president, players);
		return team;
	}

	public static Team createManchesterCity() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1
		players.add(new Player("Claudio Bravo", 34, 183, 70, "Chile", "GK", getOverall(), 'R', 1000000, 7200000, true,
				getAttributes(), actions));
		// DF 1
		players.add(new Player("Kyle Walker", 27, 178, 70, "England", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 2
		players.add(new Player("Danilo", 26, 183, 70, "Brazil", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 3
		players.add(new Player("Vincent Kompany", 31, 193, 70, "Belgium", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 4
		players.add(new Player("John Stones", 23, 188, 70, "England", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 1
		players.add(new Player("Ilkay Gundogan", 27, 180, 70, "Germany", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 2
		players.add(new Player("Kevin De Bruyne", 26, 180, 70, "Belgium", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Fabian Delph", 28, 173, 70, "England", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 4
		players.add(new Player("Hannes Wolf", 18, 179, 70, "Austria", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// F 1
		players.add(new Player("Leroy Sane", 22, 183, 70, "Germany", "RW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// F 2
		players.add(new Player("Marlos Moreno", 21, 177, 70, "Colombia", "ST", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 3
		players.add(new Player("Raheem Sterling ", 23, 170, 70, "England", "LW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// GK 1
		players.add(new Player("Sergio Aguero", 29, 173, 70, "Argentina", "GK", getOverall(), 'R', 1000000, 7200000,
				true, getAttributes(), actions));
		// DF 1
		players.add(new Player("Tyreke Wilson", 18, 176, 70, "Ireland", "RB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Tom Dele-Bashiru", 18, 189, 70, "England", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Sinan Bytyqi", 21, 191, 70, "Kosovo", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 4
		players.add(new Player("Aaron Nemane", 19, 185, 70, "England", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 1
		players.add(new Player("Joel Latibeaudiere", 25, 178, 70, "England", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 2
		players.add(new Player("Demeaco Duhaney", 17, 185, 70, "England", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Nicolas Otamendi", 30, 183, 70, "Argentina", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 4
		players.add(new Player("Tosin Adarabioyo", 20, 196, 70, "England", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Josep Guardiola", 47, 180, 70, "Spanish", getOverall(), 2);
		// President
		President president = new President("Sheikh Mansour", 47, 175, 70, "UAE");
		// Team
		Team team = new Team("Manchester City F.C.", "Blue-Blue", "442", "Etihad Stadium", "The Sky Blues",
				"United Kingdom", "__", 5.0, 0, 0, manager, president, players);
		return team;
	}

	public static Team createNapoli() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1

		players.add(new Player("Rafael Cabral", 27, 185, 70, "Brazil", "GK", getOverall(), 'R', 1000000, 7200000, true,
				getAttributes(), actions));
		// DF 1
		players.add(new Player("Salvatore Aronica", 40, 175, 70, "Italy", "RB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Mario D'Urso", 28, 183, 70, "Italy", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 3
		players.add(new Player("Juan Zuniga", 32, 170, 70, "Colombia", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 4
		players.add(new Player("Mario Rui", 26, 188, 70, "Portugal", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 1
		players.add(new Player("Alfredo Bifulco", 21, 180, 70, "Italy", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 2
		players.add(new Player("Walter Gargano", 33, 165, 70, "Uruguay", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Uruguay", 24, 188, 70, "France", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 4
		players.add(new Player("Allan", 27, 179, 70, "Allan", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// F 1
		players.add(new Player("Roberto Insigen", 23, 183, 70, "Italy", "RW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 2
		players.add(new Player("Mehdi Kabine", 21, 177, 70, "Morocco", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// F 3
		players.add(new Player("Jose Callejon", 31, 173, 70, "Spain", "LW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// GK 1
		players.add(new Player("Luigi Sepe", 26, 173, 70, "Italy", "GK", getOverall(), 'R', 1000000, 7200000, true,
				getAttributes(), actions));
		// DF 1
		players.add(new Player("Christian Maggio", 36, 183, 70, "Italy", "RB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Micheal Scarf", 18, 189, 70, "Ghana", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 3
		players.add(new Player("Hrvoje Milic", 28, 191, 70, "Croatia", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 4
		players.add(new Player("Vlad Chiriches", 28, 185, 70, "Romania", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 1
		players.add(new Player("Jorginho Frello", 26, 178, 70, "Italy", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 2
		players.add(new Player("Josip Radosevic", 23, 185, 70, "Croatia", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Marek Hamsik", 30, 183, 70, "Slovakia", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 4
		players.add(new Player("Leandrinho", 19, 196, 70, "Brazil", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Maurizio Sarri", 59, 185, 70, "Italian", getOverall(), 2);
		// President
		President president = new President("Aurelio De Laurentiis", 68, 175, 70, "Italy");
		// Team
		Team team = new Team("S.S.C. Napoli", "Azure", "442", "Stadio San Paolo", "The Little Donkeys", "Italy", "__",
				5.0, 0, 0, manager, president, players);
		return team;
	}

	public static Team createPsv() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1
		players.add(new Player("Jeroen Zoet", 27, 185, 70, "Netherlands", "GK", getOverall(), 'R', 1000000, 7200000,
				true, getAttributes(), actions));
		// DF 1
		players.add(new Player("Bram van Vlerken", 22, 175, 70, "Bram van Vlerken", "RB", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Nicholas Isimat-Mirin", 26, 185, 70, "France", "CB", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Derrick Luckassen", 22, 170, 70, "Netherlands", "CB", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// DF 4
		players.add(new Player("Santiago Arias", 26, 188, 70, "Colombia", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 1
		players.add(new Player("Kimberly DeCesare", 26, 180, 70, "USA", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 2
		players.add(new Player("Nikolai Laursen", 26, 165, 70, "Denmark", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Gaston Pereiro", 22, 188, 70, "Uruguay", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 4
		players.add(new Player("Jorrit Hendrix", 27, 179, 70, "Netherlands", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 1
		players.add(new Player("Matthias Verreth", 20, 183, 70, "Belgium", "RW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 2
		players.add(new Player("Luuk de Jong", 27, 185, 70, "Netherlands", "ST", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 3
		players.add(new Player("Hirving Lozano", 22, 173, 70, "Mexico", "LW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// GK 1
		players.add(new Player("Eloy Room", 29, 185, 70, "Curacao", "GK", getOverall(), 'R', 1000000, 7200000, true,
				getAttributes(), actions));
		// DF 1
		players.add(new Player("Daniel Schwaab", 29, 185, 70, "Germany", "RB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Joshua Brenet", 23, 175, 70, "Netherlands", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Suently Alberto", 28, 191, 70, "Netherlands", "CB", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// DF 4
		players.add(new Player("Dante Rigo", 19, 185, 70, "Belgium", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 1
		players.add(new Player("Pablo Rosario", 21, 178, 70, "Netherlands", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 2
		players.add(new Player("Bart Ramselaar", 21, 185, 70, "Netherlands", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Ramon-Pascal Lundqvist", 30, 183, 70, "Sweden", "CM", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// MF 4
		players.add(new Player("Marco van Ginkel", 25, 175, 70, "Netherlands", "CM", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Phillip Cocu", 47, 185, 70, "Netherlands", getOverall(), 2);
		// President
		President president = new President("Jan Albers", 68, 175, 70, "Netherlands");
		// Team
		Team team = new Team("PSV Eindhoven", "Azure", "442", "Philips Stadion", "Boeren", "Netherlands", "__", 5.0, 0,
				0, manager, president, players);
		return team;
	}

	public static Team createZenit() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1
		players.add(new Player("Juri Lodygin", 27, 185, 70, "Russia", "GK", getOverall(), 'R', 1000000, 7200000, true,
				getAttributes(), actions));
		// DF 1
		players.add(new Player("Aleksandr Anyukov", 35, 175, 70, "Russia", "RB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Denis Terentyev", 25, 185, 70, "Russia", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Domenico Criscito", 31, 183, 70, "Italy", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 4
		players.add(new Player("Elmir Nabiullin", 23, 188, 70, "Russia", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 1
		players.add(new Player("Artur Yusupov", 28, 180, 70, "Russia", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 2
		players.add(new Player("Leandro Paredes", 23, 165, 70, "Argentina", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Matias Kranevitter", 22, 188, 70, "Argentina", "CM", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// MF 4
		players.add(new Player("Emiliano Rigoni", 27, 179, 70, "Argentina", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 1
		players.add(new Player("Ramil Sheydaev", 20, 183, 70, "Azerbaijan", "RW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 2
		players.add(new Player("Dmitriy Poloz", 27, 185, 70, "Russia", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// F 3
		players.add(new Player("Aleksandr Kokorin", 22, 173, 70, "Russia", "LW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// GK 1
		players.add(new Player("Mikhail Kerzhakov", 29, 185, 70, "Russia", "GK", getOverall(), 'R', 1000000, 7200000,
				true, getAttributes(), actions));
		// DF 1
		players.add(new Player("Yuri Zhirkov", 29, 185, 70, "Russia", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 2
		players.add(new Player("Igor Smolnikov", 23, 175, 70, "Russia", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Miha Mevlja", 28, 191, 70, "Slovenia", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 4
		players.add(new Player("Emanuel Mammana", 19, 185, 70, "Argentina", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 1
		players.add(new Player("Daler Kuzyaev", 21, 178, 70, "Russia", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 2
		players.add(new Player("Viktor Fayzulin", 21, 185, 70, "Russia", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Alexandr Erokhin", 30, 183, 70, "Russia", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 4
		players.add(new Player("Magomed Ozdoev", 25, 175, 70, "Russia", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Roberto Mancini", 47, 185, 70, "Russia", getOverall(), 2);
		// President
		President president = new President("Sergey Fursenko", 68, 175, 70, "Russia");
		// Team
		Team team = new Team("FC Zenit Saint Petersburg", "Azure", "442", "Petrovski Stadium",
				"The Anti-aircraft Gunners", "Russia", "The Blue-White-Sky Blues", 5.0, 0, 0, manager, president,
				players);
		return team;
	}

	public static Team createBayern() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();

		players.add(new Player("Manuel Neuer", 27, 185, 70, "Germany", "GK", getOverall(), 'R', 1000000, 7200000, true,
				getAttributes(), actions));

		// DF 1
		players.add(new Player("Maxime Awoudja", 35, 175, 70, "", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 2
		players.add(new Player("Derrick Kohn", 25, 185, 70, "Germany", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 3
		players.add(new Player("Alexander Nitzl", 31, 183, 70, "Germany", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 4
		players.add(new Player("Theo Rieg", 23, 188, 70, "Germany", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 1
		players.add(new Player("Adrian Fein", 28, 180, 70, "Germany", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 2
		players.add(new Player("Maximilian Franzke", 23, 165, 70, "Germany", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Tobias Heiland", 22, 188, 70, "Germany", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 4
		players.add(new Player("Marco Hingerl", 27, 179, 70, "Germany", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 1
		players.add(new Player("Mario Crnicki", 20, 183, 70, "Germany", "RW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 2
		players.add(new Player("Franck Evina", 27, 185, 70, "Germany", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// F 3
		players.add(new Player("Sandro Wagner", 22, 173, 70, "Germany", "LW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// GK 1
		players.add(new Player("Tom Starke", 29, 185, 70, "Germany", "GK", getOverall(), 'R', 1000000, 7200000, true,
				getAttributes(), actions));
		// DF 1
		players.add(new Player("Niklas Tarnat", 29, 185, 70, "Germany", "RB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Resul Turkkalesi", 23, 175, 70, "Germany", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Niklas Sule", 28, 191, 70, "Germany", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 4
		players.add(new Player("Mats Hummels", 19, 185, 70, "Germany", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 1
		players.add(new Player("Raphael Obermair", 21, 178, 70, "Germany", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 2
		players.add(new Player("Marin Pudic", 21, 185, 70, "Germany", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 3
		players.add(new Player("Thiago Alcantara", 30, 183, 70, "Spain", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 4
		players.add(new Player("Franck Ribery", 25, 175, 70, "France", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Jupp Heynckes", 47, 185, 70, "Germany", getOverall(), 2);
		// President
		President president = new President("Uli Hoeneß", 68, 175, 70, "Germany");
		// Team
		Team team = new Team("FC Bayern Munich", "Azure", "442", "Allianz Arena", "Die Bayern", "Germany",
				"FC Hollywood", 5.0, 0, 0, manager, president, players);
		return team;
	}
	public static Team createAtletico() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1
		players.add(new Player("Jan Oblak", 27, 185, 70, "Slovenia", "GK", getOverall(), 'R', 1000000, 7200000, true,
				getAttributes(), actions));
		// DF 1
		players.add(new Player("Diego Godin", 35, 175, 70, "Uruguay", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 2
		players.add(new Player("Filipe Luis", 25, 185, 70, "Brazil", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 3
		players.add(new Player("Stefan Savic", 31, 183, 70, "Montenegro", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 4
		players.add(new Player("Thomas Partey", 23, 188, 70, "Ghana", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 1
		players.add(new Player("Koke", 28, 180, 70, "Spain", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 2
		players.add(new Player("Saul Niguez", 23, 165, 70, "Spain", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 3
		players.add(new Player("Yannick Ferreira-Carrasco", 22, 188, 70, "Belgium", "CM", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// MF 4
		players.add(new Player("Antoine Griezmann", 27, 179, 70, "France", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 1
		players.add(new Player("Fernando Torres", 20, 183, 70, "Spain", "RW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 2
		players.add(new Player("Angel Correa", 27, 185, 70, "Argentina", "ST", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 3
		players.add(new Player("Axel Werner", 22, 173, 70, "Argentina", "LW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// GK 1
		players.add(new Player("Lucas Hernandez", 29, 185, 70, "France", "GK", getOverall(), 'R', 1000000, 7200000,
				true, getAttributes(), actions));
		// DF 1
		players.add(new Player("Torres Juanfran", 29, 185, 70, "Spain", "RB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Jose Gimenez", 23, 175, 70, "Uruguay", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 3
		players.add(new Player("Sergi", 28, 191, 70, "Spain", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 4
		players.add(new Player("Gabi Fernandez", 19, 185, 70, "Spain", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 1
		players.add(new Player("Nicolas Gaitan", 21, 178, 70, "Argentina", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 2
		players.add(new Player("Vitolo", 21, 185, 70, "Spain", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 3
		players.add(new Player("Juan Moreno", 30, 183, 70, "Spain", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 4
		players.add(new Player("Olabe", 25, 175, 70, "Spain", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Diego Simeone", 47, 185, 70, "Argentine", getOverall(), 2);
		// President
		President president = new President("Enrique Cerezo", 70, 175, 70, "Spain");
		// Team
		Team team = new Team("Atlético Madrid", "Azure", "442", "Vicente Calderon", "The Red-and-Whites", "Spain",
				"Atlético Atleti", 5.0, 0, 0, manager, president, players);
		return team;
	}
	public static Team createInter() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1

		players.add(new Player("Magnus Bahne", 27, 185, 70, "Finland", "GK", getOverall(), 'R', 1000000, 7200000, true,
				getAttributes(), actions));
		// DF 1
		players.add(new Player("Joel Lehto", 35, 175, 70, "Finland", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 2
		players.add(new Player("Egzon Belica", 25, 185, 70, "Finland", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 3
		players.add(new Player("Kosta Manev", 31, 183, 70, "Finland", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 4
		players.add(new Player("Adama Tamboura", 23, 188, 70, "Mali", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 1
		players.add(new Player("Sebastian Mannstrom", 28, 180, 70, "Finland", "CM", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// MF 2
		players.add(new Player("Yoonis Muse", 23, 165, 70, "Finland", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 3
		players.add(new Player("Francis Suarez", 22, 188, 70, "Spain", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 4
		players.add(new Player("Toni Viljanen", 27, 179, 70, "Finland", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 1
		players.add(new Player("Macoumba Kandji", 20, 183, 70, "Senegal", "RW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 2
		players.add(new Player("Mikko Kuningas", 27, 185, 70, "Finland", "ST", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 3
		players.add(new Player("Serge N'Gal", 22, 173, 70, "Cameroon", "LW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// GK 1
		players.add(new Player("Jere Koponen", 29, 185, 70, "Finland", "GK", getOverall(), 'R', 1000000, 7200000, true,
				getAttributes(), actions));
		// DF 1
		players.add(new Player("Alan Henrique", 29, 185, 70, "Brazil", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 2
		players.add(new Player("Mathias Lindstrom", 23, 175, 70, "Finland", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Eric Matoukou", 28, 191, 70, "Cameroon", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 4
		players.add(new Player("Petros Kanakoudis", 19, 185, 70, "Greece", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 1
		players.add(new Player("Niko Markkula", 21, 178, 70, "Finland", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 2
		players.add(new Player("Pape Habib Sow", 21, 185, 70, "Senegal", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Niclas Forss", 30, 183, 70, "Finland", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 4
		players.add(new Player("Tuomas Happonen", 25, 175, 70, "Finland", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Luciano Spalletti", 51, 185, 70, "Finland", getOverall(), 2);
		// President
		President president = new President("Erick Thohir", 47, 175, 70, "Indonesia");
		// Team
		Team team = new Team("Inter Milan", "Azure", "442", "San Siro Stadium", "The Black and Blues", "Italy",
				"The Big Grass Snake", 5.0, 0, 0, manager, president, players);
		return team;
	}
	public static Team createFenerbahce() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1
		players.add(new Player("Volkan Demirel", 27, 185, 70, "Turkey", "GK", getOverall(), 'R', 1000000, 7200000, true,
				getAttributes(), actions));
		// DF 1
		players.add(new Player("Abdurrahman Canli", 35, 175, 70, "Turkey", "RB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));

		// DF 2
		players.add(new Player("Melih Okutan", 25, 185, 70, "Turkey", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// DF 3
		players.add(new Player("Joseph Yobo", 31, 183, 70, "Nigeria", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// DF 4
		players.add(new Player("Egemen Zengin", 23, 188, 70, "Turkey", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// MF 1
		players.add(new Player("Muhammad Akarslan", 28, 180, 70, "Turkey", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));

		// MF 2
		players.add(new Player("Mehdi Akgul", 23, 165, 70, "Turkey", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// MF 3
		players.add(new Player("Aziz Ceylan", 22, 188, 70, "Turkey", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// MF 4
		players.add(new Player("Diego", 27, 179, 70, "Turkey", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// F 1
		players.add(new Player("Semih Ergul", 20, 183, 70, "Turkey", "RW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// F 2
		players.add(new Player("Fernandao", 27, 185, 70, "Turkey", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// F 3
		players.add(new Player("Batuhan Yilmaz", 22, 173, 70, "Turkey", "LW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));

		/////
		// other

		// GK 1
		players.add(new Player("Ertugrul Taskiran", 29, 185, 70, "Turkey", "GK", getOverall(), 'R', 1000000, 7200000,
				true, getAttributes(), actions));

		// DF 1
		players.add(new Player("Hasan Kaldirim", 29, 185, 70, "Turkey", "RB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));

		// DF 2
		players.add(new Player("Mauricio Isla", 23, 175, 70, "Chile", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// DF 3
		players.add(new Player("Ismail Koybasi", 28, 191, 70, "Turkey", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));

		// DF 4
		players.add(new Player("Samed Karakoc", 19, 185, 70, "Turkey", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// MF 1
		players.add(new Player("Erdi Sehit", 21, 178, 70, "Turkey", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// MF 2
		players.add(new Player("Selcuk Sahin", 21, 185, 70, "Turkey", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// MF 3
		players.add(new Player("Mehmet Topal", 30, 183, 70, "Turkey", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// MF 4
		players.add(new Player("Ozan Tufan", 25, 175, 70, "Turkey", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// Manager
		Manager manager = new Manager("Aykut Kocaman", 52, 174, 70, "Turkey", getOverall(), 2);
		// President
		President president = new President("Aziz Yıldırım", 47, 175, 70, "Turkey");
		// Team
		Team team = new Team("Fenerbahçe", "Azure", "442", "Ülker Stadyumu", "Yellow and Navy Blue", "Turkey",
				"Viva Fenerbahçe", 5.0, 0, 0, manager, president, players);
		return team;
	}
	public static Team createTotthenam() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1

		players.add(new Player("Hugo Lloris", 27, 185, 70, "France", "GK", getOverall(), 'R', 1000000, 7200000, true,
				getAttributes(), actions));

		// DF 1
		players.add(new Player("Christian Maghoma", 35, 175, 70, "England", "RB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Danny Rose", 25, 185, 70, "England", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// DF 3
		players.add(new Player("Toby Alderweireld", 31, 183, 70, "Belgium", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));

		// DF 4
		players.add(new Player("Jan Vertonghen", 23, 188, 70, "Belgium", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));

		// MF 1
		players.add(new Player("Heung-Min Son", 28, 180, 70, "South Korea", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));

		// MF 2
		players.add(new Player("Erik Lamela", 23, 165, 70, "Argentina", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));

		// MF 3
		players.add(new Player("Victor Wanyama", 22, 188, 70, "Kenya", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// MF 4
		players.add(new Player("Eric Dier", 27, 179, 70, "England", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// F 1
		players.add(new Player("Harry Kane", 20, 183, 70, "England", "RW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// F 2
		players.add(new Player("Fernando Llorente", 27, 185, 70, "Spain", "ST", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));

		// F 3
		players.add(new Player("Samuel Shashoua", 22, 173, 70, "England", "LW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));

		/////
		// other

		// GK 1
		players.add(new Player("Michel Vorm", 29, 185, 70, "Netherlands", "GK", getOverall(), 'R', 1000000, 7200000,
				true, getAttributes(), actions));

		// DF 1
		players.add(new Player("Davison Sanchez", 29, 185, 70, "Colombia", "RB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));

		// DF 2
		players.add(new Player("Juan Foyth", 23, 175, 70, "Argentina", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// DF 3
		players.add(new Player("Serge Aurier", 28, 191, 70, "Ivory Coast", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));

		// DF 4
		players.add(new Player("Ben Davies", 19, 185, 70, "Wales", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// MF 1
		players.add(new Player("Moussa Sissoko", 21, 178, 70, "France", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));

		// MF 2
		players.add(new Player("Mousa Dembele", 21, 185, 70, "Belgium", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));

		// MF 3
		players.add(new Player("Dele Alli", 30, 183, 70, "England", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));

		// MF 4
		players.add(new Player("Christian Eriksen", 25, 175, 70, "Denmark", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));

		// Manager
		Manager manager = new Manager("Mauricio Pochettino", 46, 182, 70, "Argentina", getOverall(), 2);
		// President
		President president = new President("Aziz Yıldırım", 47, 175, 70, "Turkey");
		// Team
		Team team = new Team("Tottenham Hotspur F.C.", "Azure", "442", "Wembley Stadium", "The Lillywhites",
				"United Kingdom", "Spurs", 5.0, 0, 0, manager, president, players);
		return team;
	}
	public static Team createJuventus() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1
		players.add(new Player("Gianluigi Buffon", 27, 185, 70, "Italy", "GK", getOverall(), 'R', 1000000, 7200000,
				true, getAttributes(), actions));
		// DF 1
		players.add(new Player("Nazzareno Belfasti", 35, 175, 70, "Italy", "RB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Matteo Liviero", 25, 185, 70, "Italy", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 3
		players.add(new Player("Filippo Penna", 31, 183, 70, "Italy", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 4
		players.add(new Player("Mattia De Sciglio", 23, 188, 70, "Italy", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 1
		players.add(new Player("Leandro Fernandes", 28, 180, 70, "Netherlands", "CM", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// MF 2
		players.add(new Player("Matteo Gerbaudo", 23, 165, 70, "Italy", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Elvis Kabashi", 22, 188, 70, "Albania", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 4
		players.add(new Player("Roman Macek", 27, 179, 70, "Czech Republic", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 1
		players.add(new Player("Luca Clemenza", 20, 183, 70, "Italy", "RW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// F 2
		players.add(new Player("Jorge Martinez", 27, 185, 70, "Uruguay", "ST", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 3
		players.add(new Player("Stefano Padovan", 22, 173, 70, "Italy", "LW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// GK 1
		players.add(new Player("Carlo Pinsoglio", 29, 185, 70, "Italy", "GK", getOverall(), 'R', 1000000, 7200000, true,
				getAttributes(), actions));
		// DF 1
		players.add(new Player("Giorgio Chiellini", 29, 185, 70, "Italy", "RB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Mehdi Benatia", 23, 175, 70, "Morocco", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Alex Sandro Lobo Silva", 28, 191, 70, "Brazil", "CB", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// DF 4
		players.add(new Player("Andrea Barzagli", 19, 185, 70, "Italy", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 1
		players.add(new Player("Miralem Pjanic", 21, 178, 70, "Bosnia-Herzegovina", "CM", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// MF 2
		players.add(new Player("Sami Khedira", 21, 185, 70, "Germany", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 3
		players.add(new Player("Juan Guillermo Cuadrado", 30, 183, 70, "Colombia", "CM", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// MF 4
		players.add(new Player("Claudio Marchisio", 25, 175, 70, "Italy", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Mauricio Pochettino", 46, 182, 70, "Argentina", getOverall(), 2);
		// President
		President president = new President("Massimiliano Allegri", 50, 175, 70, "Italy");
		// Team
		Team team = new Team("Juventus F.C.", "Black and White", "442", "Juventus Stadium", "The Lillywhites", "Italy",
				"Zebre", 5.0, 0, 0, manager, president, players);
		return team;
	}

	public static Team createMonaco() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1
		players.add(new Player("Danijel Subasic", 27, 185, 70, "Croatia", "GK", getOverall(), 'R', 1000000, 7200000,
				true, getAttributes(), actions));
		// DF 1
		players.add(new Player("Jemerson", 35, 175, 70, "Brazil", "RB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 2
		players.add(new Player("Ricardo Carvalho", 25, 185, 70, "Portugal", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Jorge", 31, 183, 70, "Brazil", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 4
		players.add(new Player("Djibril Sidibe", 23, 188, 70, "France", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 1
		players.add(new Player("Fabinho", 28, 180, 70, "Brazil", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 2
		players.add(new Player("Rachid Ghezzal", 23, 165, 70, "Algeria", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Joao Moutinho", 22, 188, 70, "Portugal", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 4
		players.add(new Player("Youri Tielemans", 27, 179, 70, "Belgium", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 1
		players.add(new Player("Radamel Falcao", 20, 183, 70, "Colombia", "RW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 2
		players.add(new Player("Rony Lopes", 27, 185, 70, "Portugal", "ST", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// F 3
		players.add(new Player("Keita Balde Diao", 22, 173, 70, "Senegal", "LW", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// GK 1
		players.add(new Player("Diego Benaglio", 29, 185, 70, "Switzerland", "GK", getOverall(), 'R', 1000000, 7200000,
				true, getAttributes(), actions));
		// DF 1
		players.add(new Player("Julien Serrano", 29, 185, 70, "France", "RB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Pierre Daniel", 23, 175, 70, "Cameroon", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Andrea Raggi", 28, 191, 70, "Italy", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// DF 4
		players.add(new Player("Kamil Glik", 19, 185, 70, "Poland", "CB", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 1
		players.add(new Player("Rony Lopes", 21, 178, 70, "Portugal", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 2
		players.add(new Player("Boschilia", 21, 185, 70, "Brazil", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 3
		players.add(new Player("Thomas Lemar", 30, 183, 70, "France", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 4
		players.add(new Player("Jonathan Mexique", 25, 175, 70, "France", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Leonardo Jardim", 46, 182, 70, "Venezuelan", getOverall(), 2);
		// President
		President president = new President("Dmitry Rybolovlev", 51, 175, 70, "Russia");
		// Team
		Team team = new Team("AS Monaco FC", "The Red and Whites", "442", "Stade Louis II", "The Lillywhites", "Italy",
				"The Monégasques", 5.0, 0, 0, manager, president, players);
		return team;
	}

	public static Team createAjax() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1
		players.add(new Player("Andre Onana", 27, 185, 70, "Cameroon", "GK", getOverall(), 'R', 1000000, 7200000, true,
				getAttributes(), actions));
		// DF 1
		players.add(new Player("Joel Veltman", 35, 175, 70, "Netherlands", "RB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Matthijs de Ligt", 25, 185, 70, "Netherlands", "CB", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Johnny Heitinga", 31, 183, 70, "Netherlands", "CB", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// DF 4
		players.add(new Player("Maximilian Wober", 23, 188, 70, "Austria", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 1
		players.add(new Player("Donny van de Beek", 28, 180, 70, "Netherlands", "CM", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// MF 2
		players.add(new Player("Lucas Andersen", 23, 165, 70, "Denmark", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Hakim Ziyech", 22, 188, 70, "Morocco", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 4
		players.add(new Player("Carel Eiting", 27, 179, 70, "Netherlands", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// F 1
		players.add(new Player("David Neres", 20, 183, 70, "Brazil", "RW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// F 2
		players.add(new Player("Klaas-Jan Huntelaar", 27, 185, 70, "Netherlands", "ST", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// F 3
		players.add(new Player("Amin Younes", 22, 173, 70, "Germany", "LW", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// GK 1
		players.add(new Player("Benjamin van Leer", 29, 185, 70, "Netherlands", "GK", getOverall(), 'R', 1000000,
				7200000, true, getAttributes(), actions));
		// DF 1
		players.add(new Player("Daley Sinkgraven", 29, 185, 70, "Netherlands", "RB", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Nick Viergever", 23, 175, 70, "Netherlands", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Luis Orejuela", 28, 191, 70, "Colombia", "CB", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// DF 4
		players.add(new Player("Nicolas Tagliafico", 19, 185, 70, "Argentina", "CB", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// MF 1
		players.add(new Player("Carel Eiting", 21, 178, 70, "Netherlands", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// MF 2
		players.add(new Player("Lasse Schone", 21, 185, 70, "Denmark", "CM", getOverall(), 'R', 1000000, 10000000, true,
				getAttributes(), actions));
		// MF 3
		players.add(new Player("Frenkie De Jong", 30, 183, 70, "Netherlands", "CM", getOverall(), 'R', 1000000,
				10000000, true, getAttributes(), actions));
		// MF 4
		players.add(new Player("Siem de Jong", 25, 175, 70, "Netherlands", "CM", getOverall(), 'R', 1000000, 10000000,
				true, getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Erik ten Hag", 48, 182, 70, "Netherlands", getOverall(), 2);
		// President
		President president = new President("Hennie Henrichs", 51, 175, 70, "Netherlands");
		// Team
		Team team = new Team("AFC Ajax", "The Red and Whites", "442", "Johan Cruijff Arena", "the Jews", "Netherlands",
				"Lucky Ajax", 5.0, 0, 0, manager, president, players);

		return team;

	}


	public static Team[] buildTeams() {
		Team[] teams = new Team[32];
		teams[0] = createAjax();
		teams[1] = createDortmund();
		teams[2] = createBarcelona();
		teams[3] = createGalatasaray();
		teams[4] = createPsg();
		teams[5] = createManu();
		teams[6] = createChelsea();
		teams[7] = createPorto();
		teams[8] = createRoma();
		teams[9] = createLyon();
		teams[10] = createLeverkusen();
		teams[11] = createRbl();
		teams[12] = createBenfica();
		teams[13] = createMilan();
		teams[14] = createBasel();
		teams[15] = createSpartak();
		teams[16] = createSporting();
		teams[17] = createLiverpool();
		teams[18] = createRealMadrid();
		teams[19] = createDortmund();
		teams[20] = createCska();
		teams[21] = createSalzburg();
		teams[22] = createManchesterCity();
		teams[23] = createNapoli();
		teams[24] = createZenit();
		teams[25] = createBayern();
		teams[26] = createAtletico();
		teams[27] = createInter();
		teams[28] = createFenerbahce();
		teams[29] = createTotthenam();
		teams[30] = createJuventus();
		teams[31] = createPsv();
		return teams;
	}
	
}