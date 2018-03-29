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
		players.add(new Player("ter Stegen", 30, 180, 70, "Germany", "GK", getOverall(), 'R', 85,
				70000000, true, getAttributes(), actions));
		
		players.add(new Player("Semedo", 30, 180, 70, "Portugal", "RB", getOverall(), 'R', 81 , 60000000,
				true, getAttributes(), actions));
		players.add(new Player("Pique", 30, 180, 70, "Spain", "CB", getOverall(), 'R', 87, 60000000, true,
				getAttributes(), actions));
		players.add(new Player("Umtiti", 30, 180, 70, "Spain", "CB", getOverall(), 'R', 84, 30000000, true,
				getAttributes(), actions));
		players.add(new Player("Alba", 30, 180, 70, "France", "LB", getOverall(), 'R', 86, 55000000, true,
				getAttributes(), actions));
		players.add(new Player("Rakitic", 30, 180, 70, "Crotia", "CM", getOverall(), 'R', 86, 25000000, true,
				getAttributes(), actions));
		players.add(new Player("Busquets", 30, 180, 70, "Spain", "CM", getOverall(), 'R', 87, 30000000,
				true, getAttributes(), actions));
		players.add(new Player("Iniesta", 30, 180, 70, "Spain", "CM", getOverall(), 'R', 88, 33000000, true,
				getAttributes(), actions));
		players.add(new Player("Dembele", 30, 180, 70, "Spain", "RW", getOverall(), 'R', 83, 65000000, true,
				getAttributes(), actions));
		players.add(new Player("Suarez", 30, 180, 70, "Uruguay", "ST", getOverall(), 'R', 89, 90000000, true,
				getAttributes(), actions));
		players.add(new Player("Messi", 30, 180, 70, "Argentina", "LW", getOverall(), 'R', 92, 500000000,
				true, getAttributes(), actions));
		// Others
		
		players.add(new Player("Cillessen", 30, 180, 70, "Netherlands", "GK", getOverall(), 'R', 80,
				8000000, true, getAttributes(), actions));
		players.add(new Player("Coutinho", 30, 180, 70, "Brazil", "LW", getOverall(), 'R', 87, 60000000,
				true, getAttributes(), actions));
		players.add(new Player("Paulinho", 30, 180, 70, "Brazil", "CM", getOverall(), 'R', 81, 40000000, true,
				getAttributes(), actions));
		players.add(new Player("Alcacer", 30, 180, 70, "Spain", "ST", getOverall(), 'R', 80, 8000000, true,
				getAttributes(), actions));
		players.add(new Player("Roberto", 30, 180, 70, "Spain", "RB", getOverall(), 'R', 82, 20000000, true,
				getAttributes(), actions));
		players.add(new Player("Gomes", 30, 180, 70, "Portugal", "CM", getOverall(), 'R', 83, 25000000, true,
				getAttributes(), actions));
		players.add(new Player("Vidal", 30, 180, 70, "Spain", "RB", getOverall(), 'R', 79, 11000000, true,
				getAttributes(), actions));
		players.add(new Player("Digne", 30, 180, 70, "France", "LB", getOverall(), 'R', 77, 8000000, true,
				getAttributes(), actions));
		players.add(new Player("Vermaelen", 30, 180, 70, "Belgium", "CB", getOverall(), 'R', 76, 14000000,
				true, getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Ernesto Valverde", 54, 180, 70, "Spain", getOverall(), 2);
		// President
		President president = new President("Josep Maria Bartomeu", 55, 180, 70, "Spain");
		// Team
		Team team = new Team("FC Barcelona", "Red", "4-3-3", "Camp Nou", "Barça", "Spain",
				"FCB", 5.0, "Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createGalatasaray() {
		// Galatasaray
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Muslera", 30, 180, 70, "Uruguay", "GK", 83, 'R', 83, 10000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Mariano", 30, 180, 70, "Brazil", "RB", 80, 'R', 82, 8000000, true, getAttributes(),
				actions));
		players.add(new Player("Maicon", 30, 180, 70, "Brazil", "CB", 82, 'R', 83, 14000000, true, getAttributes(),
				actions));
		players.add(new Player("Serdar", 30, 180, 70, "Turkey", "CB", 79, 'R', 81, 9000000, true, getAttributes(),
				actions));
		players.add(new Player("Nagatomo", 30, 180, 70, "Japan", "LB", 78, 'R', 80, 6000000, true, getAttributes(),
				actions));
		// MF
		players.add(new Player("Selçuk", 30, 180, 70, "Turkey", "CM", 79, 'R', 78, 5500000, true, getAttributes(),
				actions));
		players.add(new Player("Fernando", 30, 180, 70, "Brazil", "CM", 82, 'R', 84, 9000000, true,
				getAttributes(), actions));
		players.add(new Player("Belhanda", 30, 180, 70, "Morocco", "CM", 80, 'R', 80, 12000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Feghouli", 30, 180, 70, "Algeria", "RW", 81, 'R', 82, 14000000, true,
				getAttributes(), actions));
		players.add(new Player("Gomis", 30, 180, 70, "France", "ST", 83, 'R', 84, 10000000, true, getAttributes(),
				actions));
		players.add(new Player("Garry", 30, 180, 70, "Cape Verde", "LW", 79, 'R', 83, 16000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Carrosco", 30, 180, 70, "France", "GK", 78, 'R', 70, 3000000, true,
				getAttributes(), actions));
		players.add(new Player("Linnes", 30, 180, 70, "Norway", "RB", 77, 'R', 75, 5000000, true,
				getAttributes(), actions));
		players.add(new Player("Ahmet", 30, 180, 70, "Turkey", "CB", getOverall(), 'R', 73, 2500000, true,
				getAttributes(), actions));
		players.add(new Player("Denayer", 30, 180, 70, "Belgium", "CB", getOverall(), 'R', 78, 5000000,
				true, getAttributes(), actions));
		players.add(new Player("Latovlevici", 30, 180, 70, "Romania", "LB", getOverall(), 'R', 70, 1000000, true,
				getAttributes(), actions));
		players.add(new Player("Donk", 30, 180, 70, "Netherlands", "CM", getOverall(), 'R', 76, 1500000,
				true, getAttributes(), actions));
		players.add(new Player("Eren", 30, 180, 70, "Switzerland", "ST", getOverall(), 'R', 77, 3500000,
				true, getAttributes(), actions));
		players.add(new Player("Sinan", 30, 180, 70, "Turkey", "RW", getOverall(), 'R', 77, 6500000, true,
				getAttributes(), actions));
		players.add(new Player("Yasin", 30, 180, 70, "Turkey", "LW", getOverall(), 'R', 78, 4000000, true,
				getAttributes(), actions));
	
		// Manager
		Manager manager = new Manager("Fatih Terim", 65, 180, 70, "Turkey", getOverall(), 2);
		// President
		President president = new President("Mustafa Cengiz", 71, 180, 70, "Turkey");
		// Team
		Team team = new Team("Galatasaray", "Red", "4-3-3", "Ali Sami Yen", "Cimbom", "Turkey", "GAL", 5.0,
				"Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createPsg() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Trapp", 30, 180, 70, "Germany", "GK", 81, 'R', 82, 5000000, true, getAttributes(),
				actions));
		// DF
		players.add(new Player("Meunier", 30, 180, 70, "Belgium", "RB", 81, 'R', 83, 11000000, true,
				getAttributes(), actions));
		players.add(new Player("Marquinhos", 30, 180, 70, "Brazil", "CB", 82, 'R', 84, 19000000, true,
				getAttributes(), actions));
		players.add(new Player("Silva", 30, 180, 70, "Brazil", "CB", 88, 'R', 87, 16000000, true, getAttributes(),
				actions));
		players.add(new Player("Kurzawa", 30, 180, 70, "France", "LB", 82, 'R', 82, 8000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Veratti", 30, 180, 70, "Italy", "CM", 84, 'R', 88, 55000000, true,
				getAttributes(), actions));
		players.add(new Player("Rabiot", 30, 180, 70, "France", "CM", 81, 'R', 83, 10000000, true, getAttributes(),
				actions));
		players.add(new Player("Di Maria", 30, 180, 70, "Argentina", "CM", 84, 'R', 83, 15000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Mbappe", 30, 180, 70, "France", "LW", 83, 'R', 85, 100000000, true, getAttributes(),
				actions));
		players.add(new Player("Cavani", 30, 180, 70, "Uruguay", "ST", 85, 'R', 90, 90000000, true,
				getAttributes(), actions));
		players.add(new Player("Neymar", 30, 180, 70, "Brazil", "LW", 89, 'R', 92, 200000000, true, getAttributes(),
				actions));
		// Others
		players.add(new Player("Areola", 30, 180, 70, "France", "GK", getOverall(), 'R', 80, 7500000, true,
				getAttributes(), actions));
		players.add(new Player("Draxler", 30, 180, 70, "Germany", "CM", getOverall(), 'R', 84, 14000000, true,
				getAttributes(), actions));
		players.add(new Player("Pastore", 30, 180, 70, "Argentina", "CM", getOverall(), 'R', 84, 19000000, true,
				getAttributes(), actions));
		players.add(new Player("Lass", 30, 180, 70, "France", "CM", getOverall(), 'R', 82, 5000000, true,
				getAttributes(), actions));
		players.add(new Player("Yuri", 30, 180, 70, "Spain", "LB", getOverall(), 'R', 79, 7000000, true,
				getAttributes(), actions));
		players.add(new Player("Giovani", 30, 180, 70, "Argentina", "CM", getOverall(), 'R', 70, 1000000, true,
				getAttributes(), actions));
		players.add(new Player("Alves", 30, 180, 70, "Brazil", "RB", getOverall(), 'R', 83, 8500000, true,
				getAttributes(), actions));
		players.add(new Player("Motta", 30, 180, 70, "Italy", "CM", getOverall(), 'R', 81, 11000000, true,
				getAttributes(), actions));
		players.add(new Player("Kimpembe", 30, 180, 70, "France", "CB", getOverall(), 'R', 80, 8000000, true,
				getAttributes(), actions));

		// Manager
		Manager manager = new Manager("Emery", 65, 180, 70, "Spain", getOverall(), 2);
		// President
		President president = new President("El Khalafi", 71, 180, 70, "Quatar");
		// Team
		Team team = new Team("Paris Saint Germain", "Blue", "4-3-3", "Parc de Prince", "PSG", "France", "PSG", 5.0,
				"Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createManu() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("De Gea", 30, 180, 70, "Spain", "GK", getOverall(), 'R', 90, 75000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Valencia", 30, 180, 70, "Ecuador", "RB", getOverall(), 'R', 85, 14000000, true,
				getAttributes(), actions));
		players.add(new Player("Smalling", 30, 180, 70, "England", "CB", getOverall(), 'R', 83, 15000000, true,
				getAttributes(), actions));
		players.add(new Player("Bailly", 30, 180, 70, "Ivory Coast", "CB", getOverall(), 'R', 83, 15000000, true,
				getAttributes(), actions));
		players.add(new Player("Shaw", 30, 180, 70, "England", "LB", getOverall(), 'R', 79, 7000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Pogba", 30, 180, 70, "France", "CM", getOverall(), 'R', 88, 55000000, true,
				getAttributes(), actions));
		players.add(new Player("Herrera", 30, 180, 70, "Spain", "CM", getOverall(), 'R', 83, 8000000, true,
				getAttributes(), actions));
		players.add(new Player("Matic", 30, 180, 70, "Serbia", "CM", getOverall(), 'R', 86, 35000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Rashford", 30, 180, 70, "France", "RW", getOverall(), 'R', 81,13000000, true,
				getAttributes(), actions));
		players.add(new Player("Lukaku", 30, 180, 70, "Belgium", "ST", getOverall(), 'R', 85, 59000000, true,
				getAttributes(), actions));
		players.add(new Player("Martial", 30, 180, 70, "France", "LW", getOverall(), 'R', 85, 45000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Romero", 30, 180, 70, "Argentina", "GK", getOverall(), 'R', 78, 5000000, true,
				getAttributes(), actions));
		players.add(new Player("Young", 30, 180, 70, "England", "RB", getOverall(), 'R', 81, 7000000, true,
				getAttributes(), actions));
		players.add(new Player("Blind", 30, 180, 70, "Netherlands", "LB", getOverall(), 'R', 79, 8000000, true,
				getAttributes(), actions));
		players.add(new Player("Sanchez", 30, 180, 70, "Chile", "RW", getOverall(), 'R', 85, 44000000, true,
				getAttributes(), actions));
		players.add(new Player("Mata", 30, 180, 70, "Spain", "CM", getOverall(), 'R', 84, 23000000, true,
				getAttributes(), actions));
		players.add(new Player("Darmian", 30, 180, 70, "Italy", "RB", getOverall(), 'R', 79, 7000000, true,
				getAttributes(), actions));
		players.add(new Player("Carrick", 30, 180, 70, "England", "CM", getOverall(), 'R', 78, 5000000, true,
				getAttributes(), actions));
		players.add(new Player("Ibrahimovic", 30, 180, 70, "Sweden", "ST", getOverall(), 'R', 86, 8000000, true,
				getAttributes(), actions));
		
		// Manager
		Manager manager = new Manager("Mourinho", 65, 180, 70, "Portugal", getOverall(), 2);
		// President
		President president = new President("Henry Davies", 71, 180, 70, "England");
		// Team
		Team team = new Team("Manchester United", "Red-Yellow", "4-3-3", "Old Trafford", "Red Devils", "England", "MUN",
				5.0, "Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createChelsea() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Courtois", 30, 180, 70, "Belgium", "GK", getOverall(), 'R', 89, 53000000,
				true, getAttributes(), actions));
		// DF
		players.add(new Player("Azpilicueta", 30, 180, 70, "Spain", "RB", getOverall(), 'R', 82, 23000000, true,
				getAttributes(), actions));
		players.add(new Player("Rudiger", 30, 180, 70, "Germany", "CB", getOverall(), 'R', 84, 13000000, true,
				getAttributes(), actions));
		players.add(new Player("Cahill", 30, 180, 70, "England", "CB", getOverall(), 'R', 82, 11000000, true,
				getAttributes(), actions));
		players.add(new Player("Alonso", 30, 180, 70, "Italy", "LB", getOverall(), 'R', 83, 8000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Kante", 30, 180, 70, "France", "CM", getOverall(), 'R', 87, 59000000, true,
				getAttributes(), actions));
		players.add(new Player("Fabregas", 30, 180, 70, "Spain", "CM", getOverall(), 'R', 85, 45000000, true,
				getAttributes(), actions));
		players.add(new Player("Bakayoko", 30, 180, 70, "France", "CM", getOverall(), 'R', 85, 29000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Willian", 30, 180, 70, "Brazil", "RW", getOverall(), 'R', 86, 32000000, true,
				getAttributes(), actions));
		players.add(new Player("Morata", 30, 180, 70, "Spain", "ST", getOverall(), 'R', 84, 30000000, true,
				getAttributes(), actions));
		players.add(new Player("Hazard", 30, 180, 70, "Belgium", "LW", getOverall(), 'R', 89, 90000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Caballero", 30, 180, 70, "Argentina", "GK", getOverall(), 'R', 80, 1000000, true,
				getAttributes(), actions));
		players.add(new Player("Luiz", 30, 180, 70, "Brazil", "CB", getOverall(), 'R', 88, 25000000, true,
				getAttributes(), actions));
		players.add(new Player("Emerson", 30, 180, 70, "Brazil", "LB", getOverall(), 'R', 83, 14000000, true,
				getAttributes(), actions));
		players.add(new Player("Eduardo", 30, 180, 70, "Portugal", "GK", getOverall(), 'R', 82, 5000000, true,
				getAttributes(), actions));
		players.add(new Player("Barkley", 30, 180, 70, "England", "CM", getOverall(), 'R', 80, 13000000, true,
				getAttributes(), actions));
		players.add(new Player("Moses", 30, 180, 70, "Nigeria", "LB", getOverall(), 'R', 81, 11000000, true,
				getAttributes(), actions));
		players.add(new Player("Drinkwater", 30, 180, 70, "Italy", "CM", getOverall(), 'R', 82, 12000000, true,
				getAttributes(), actions));
		players.add(new Player("Christensen", 30, 180, 70, "Denmark", "CB", getOverall(), 'R', 79, 15000000, true,
				getAttributes(), actions));
		players.add(new Player("Chalobah", 30, 180, 70, "England", "CB", getOverall(), 'R', 75, 4000000, true,
				getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Conte", 65, 180, 70, "Italy", getOverall(), 2);
		// President
		President president = new President("Abramovich", 71, 180, 70, "France");
		// Team
		Team team = new Team("Chelsea", "Blue", "4-3-3", "Stamford Bridge", "Blues", "England", "CHE", 5.0,
				"Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createPorto() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Casillas", 30, 180, 70, "Spain", "GK", getOverall(), 'R', 80, 4500000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Pereira", 30, 180, 70, "Portugal", "RB", getOverall(), 'R', 79, 3000000, true,
				getAttributes(), actions));
		players.add(new Player("Marcano", 30, 180, 70, "Germany", "CB", getOverall(), 'R', 77, 5000000, true,
				getAttributes(), actions));
		players.add(new Player("Felipe", 30, 180, 70, "Brazil", "CB", getOverall(), 'R', 78, 7000000, true,
				getAttributes(), actions));
		players.add(new Player("Telles", 30, 180, 70, "Brazil", "LB", getOverall(), 'R', 81, 19000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Quintero", 30, 180, 70, "Colombia", "CM", getOverall(), 'R', 77, 8000000, true,
				getAttributes(), actions));
		players.add(new Player("Gonzalez", 30, 180, 70, "Argentina", "CM", getOverall(), 'R', 78, 6000000,
				true, getAttributes(), actions));
		players.add(new Player("Oliver", 30, 180, 70, "Spain", "CM", getOverall(), 'R', 80, 9000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Brahimi", 30, 180, 70, "Algeria", "RW", getOverall(), 'R', 81, 14000000, true,
				getAttributes(), actions));
		players.add(new Player("Aboubakar", 30, 180, 70, "Cameroon", "ST", getOverall(), 'R', 82, 18000000, true,
				getAttributes(), actions));
		players.add(new Player("Hernani", 30, 180, 70, "Portugal", "LW", getOverall(), 'R', 79, 9000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Sa", 30, 180, 70, "Portugal", "GK", getOverall(), 'R', 77, 8000000, true,
				getAttributes(), actions));
		players.add(new Player("Maxi", 30, 180, 70, "Uruguay", "RB", getOverall(), 'R', 75, 5000000, true,
				getAttributes(), actions));
		players.add(new Player("Reyes", 30, 180, 70, "Mexico", "CB", getOverall(), 'R', 76, 6000000, true,
				getAttributes(), actions));
		players.add(new Player("Luizao", 30, 180, 70, "Brazil", "CM", getOverall(), 'R', 77, 3000000, true,
				getAttributes(), actions));
		players.add(new Player("Herrera", 30, 180, 70, "Mexico", "CM", getOverall(), 'R', 78, 4000000, true,
				getAttributes(), actions));
		players.add(new Player("Moses", 30, 180, 70, "Nigeria", "LB", getOverall(), 'R', 75, 2000000, true,
				getAttributes(), actions));
		players.add(new Player("Osvaldo", 30, 180, 70, "Italia", "CM", getOverall(), 'R', 79, 2000000, true,
				getAttributes(), actions));
		players.add(new Player("Marega", 30, 180, 70, "Ghana", "ST", getOverall(), 'R', 79, 7500000, true,
				getAttributes(), actions));
		players.add(new Player("Waris", 30, 180, 70, "Ghana", "ST", getOverall(), 'R', 77, 1000000, true,
				getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Sergio Conceicao", 65, 180, 70, "Portugal", getOverall(), 2);
		// President
		President president = new President("Reyes", 71, 180, 70, "Portugal");
		// Team
		Team team = new Team("FC Porto", "Blue", "4-3-3", "Estadio do Dragao", "Porto Kings", "Portugal", "POR", 5.0,
				"Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createRoma() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Alisson", 30, 180, 70, "Brazil", "GK", getOverall(), 'R', 82, 29000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Florenzi", 30, 180, 70, "Italy", "RB", getOverall(), 'R', 83, 18000000, true,
				getAttributes(), actions));
		players.add(new Player("Jesus", 30, 180, 70, "Brazil", "CB", getOverall(), 'R', 81, 15000000, true,
				getAttributes(), actions));
		players.add(new Player("Manolas", 30, 180, 70, "Greece", "CB", getOverall(), 'R', 84, 18000000, true,
				getAttributes(), actions));
		players.add(new Player("Peres", 30, 180, 70, "Brazil", "LB", getOverall(), 'R', 82, 22000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("De Rossi", 30, 180, 70, "Italy", "CM", getOverall(), 'R', 82, 6000000, true,
				getAttributes(), actions));
		players.add(new Player("Strootman", 30, 180, 70, "Italy", "CM", getOverall(), 'R', 85, 17000000, true,
				getAttributes(), actions));
		players.add(new Player("Nainggolan", 30, 180, 70, "Belgium", "CM", getOverall(), 'R', 87, 52000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Cengiz", 30, 180, 70, "Turkey", "RW", getOverall(), 'R', 85, 24000000, true,
				getAttributes(), actions));
		players.add(new Player("Dzeko", 30, 180, 70, "Bosnia", "ST", getOverall(), 'R', 87, 19000000, true,
				getAttributes(), actions));
		players.add(new Player("Perotti", 30, 180, 70, "Argentina", "LW", getOverall(), 'R', 83, 14000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Skorupski", 30, 180, 70, "Argentina", "GK", getOverall(), 'R', 79, 5000000, true,
				getAttributes(), actions));
		players.add(new Player("Karsdrop", 30, 180, 70, "Polonia", "RB", getOverall(), 'R', 77, 7000000, true,
				getAttributes(), actions));
		players.add(new Player("Shaarawy", 30, 180, 70, "Egypt", "LW", getOverall(), 'R', 78, 9000000, true,
				getAttributes(), actions));
		players.add(new Player("Kolarov", 30, 180, 70, "Serbia", "LB", getOverall(), 'R', 80, 6000000, true,
				getAttributes(), actions));
		players.add(new Player("Pellegrini", 30, 180, 70, "Italy", "CM", getOverall(), 'R', 77, 4000000, true,
				getAttributes(), actions));
		players.add(new Player("Gerson", 30, 180, 70, "Brazil", "CM", getOverall(), 'R', 79, 16000000, true,
				getAttributes(), actions));
		players.add(new Player("Antonucci", 30, 180, 70, "Italy", "ST", getOverall(), 'R', 73, 5000000, true,
				getAttributes(), actions));
		players.add(new Player("Defrel", 30, 180, 70, "France", "ST", getOverall(), 'R', 75, 8000000, true,
				getAttributes(), actions));
		players.add(new Player("Fazio", 30, 180, 70, "Argentina", "CB", getOverall(), 'R', 77, 12000000, true,
				getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Eusebio Di Francesco", 65, 180, 70, "Italy", getOverall(), 2);
		// President
		President president = new President("Pallotta", 71, 180, 70, "Italy");
		// Team
		Team team = new Team("AS Roma", "Red", "4-3-3", "Stadio Olimpico", "Wolfs", "Italy", "ROM", 5.0, "Attack",
				"Fast", manager, president, players);
		return team;
	}

	public static Team createLyon() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Lopes", 30, 180, 70, "Portugal", "GK", getOverall(), 'R', 81, 11000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Rafael", 30, 180, 70, "Brazil", "RB", getOverall(), 'R', 82, 7000000, true,
				getAttributes(), actions));
		players.add(new Player("Diakhaby", 30, 180, 70, "France", "CB", getOverall(), 'R', 82, 9000000, true,
				getAttributes(), actions));
		players.add(new Player("Marcelo", 30, 180, 70, "Brazil", "CB", getOverall(), 'R', 82, 12000000, true,
				getAttributes(), actions));
		players.add(new Player("Marcal", 30, 180, 70, "Brazil", "LB", getOverall(), 'R', 81, 8000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Ferri", 30, 180, 70, "France", "CM", getOverall(), 'R', 79, 12000000, true,
				getAttributes(), actions));
		players.add(new Player("Cheikh", 30, 180, 70, "Spain", "CM", getOverall(), 'R', 77, 9000000, true,
				getAttributes(), actions));
		players.add(new Player("Tousart", 30, 180, 70, "France", "CM", getOverall(), 'R', 77, 7000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Traore", 30, 180, 70, "Burkina Faso", "RW", getOverall(), 'R', 78, 14000000, true,
				getAttributes(), actions));
		players.add(new Player("Fekir", 30, 180, 70, "France", "ST", getOverall(), 'R', 82, 19000000, true,
				getAttributes(), actions));
		players.add(new Player("Depay", 30, 180, 70, "Netherlands", "LW", getOverall(), 'R', 84, 22000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Mocio", 30, 180, 70, "France", "GK", getOverall(), 'R', 77, 3000000, true,
				getAttributes(), actions));
		players.add(new Player("Morel", 30, 180, 70, "France", "RB", getOverall(), 'R', 75, 2000000, true,
				getAttributes(), actions));
		players.add(new Player("Mbiwa", 30, 180, 70, "France", "CB", getOverall(), 'R', 77, 9000000, true,
				getAttributes(), actions));
		players.add(new Player("Mendy", 30, 180, 70, "France", "LB", getOverall(), 'R', 74, 6000000, true,
				getAttributes(), actions));
		players.add(new Player("Owusu", 30, 180, 70, "France", "CM", getOverall(), 'R', 78, 4000000, true,
				getAttributes(), actions));
		players.add(new Player("Cornet", 30, 180, 70, "Ivory Coast", "CM", getOverall(), 'R', 77, 11000000, true,
				getAttributes(), actions));
		players.add(new Player("Mariano", 30, 180, 70, "France", "ST", getOverall(), 'R', 73, 5000000, true,
				getAttributes(), actions));
		players.add(new Player("Dzabana", 30, 180, 70, "France", "ST", getOverall(), 'R', 72, 3000000, true,
				getAttributes(), actions));
		players.add(new Player("Diop", 30, 180, 70, "France", "CM", getOverall(), 'R', 72, 3000000, true,
				getAttributes(), actions));

		// Manager
		Manager manager = new Manager("Eusebio Di Francesco", 65, 180, 70, "Italy", getOverall(), 2);
		// President
		President president = new President("Genesio", 71, 180, 70, "Portugal");
		// Team
		Team team = new Team("OlympiqueLyonnais", "Blue", "4-3-3", "Stade de Gerland", "Les Gones", "France", "LYO", 5.0, "Attack",
				"Fast", manager, president, players);
		return team;
	}

	public static Team createLeverkusen() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Leno", 30, 180, 70, "Germany", "GK", getOverall(), 'R', 82, 8000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Tah", 30, 180, 70, "Germany", "RB", getOverall(), 'R', 80, 7000000, true,
				getAttributes(), actions));
		players.add(new Player("Bender", 30, 180, 70, "Germany", "CB", getOverall(), 'R', 81, 8000000, true,
				getAttributes(), actions));
		players.add(new Player("Jedvaj", 30, 180, 70, "Crotia", "CB", getOverall(), 'R', 79, 9000000, true,
				getAttributes(), actions));
		players.add(new Player("Wendell", 30, 180, 70, "Brazil", "LB", getOverall(), 'R', 78, 9000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Aranguiz", 30, 180, 70, "Chile", "CM", getOverall(), 'R', 79, 7000000, true,
				getAttributes(), actions));
		players.add(new Player("Bender", 30, 180, 70, "Germany", "CM", getOverall(), 'R', 78, 6000000, true,
				getAttributes(), actions));
		players.add(new Player("Yurchenko", 30, 180, 70, "Ukranie", "CM", getOverall(), 'R', 77, 5000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Bellerabi", 30, 180, 70, "Germany", "RW", getOverall(), 'R', 84, 14000000, true,
				getAttributes(), actions));
		players.add(new Player("Kiessling", 30, 180, 70, "Germany", "ST", getOverall(), 'R', 80, 9000000, true,
				getAttributes(), actions));
		players.add(new Player("Volland", 30, 180, 70, "Germany", "LW", getOverall(), 'R', 83, 11000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Ramazan", 30, 180, 70, "Austria", "GK", getOverall(), 'R', 77, 1000000, true,
				getAttributes(), actions));
		players.add(new Player("Handwerker", 30, 180, 70, "Germany", "RB", getOverall(), 'R', 78, 2500000, true,
				getAttributes(), actions));
		players.add(new Player("Atakan", 30, 180, 70, "Germany", "CM", getOverall(), 'R', 72, 1500000, true,
				getAttributes(), actions));
		players.add(new Player("Brandt", 30, 180, 70, "Germany", "ST", getOverall(), 'R', 77, 5000000, true,
				getAttributes(), actions));
		players.add(new Player("Pohjanpalo", 30, 180, 70, "Finland", "ST", getOverall(), 'R', 78, 6000000, true,
				getAttributes(), actions));
		players.add(new Player("Brasnic", 30, 180, 70, "Crotia", "CM", getOverall(), 'R', 73, 2000000, true,
				getAttributes(), actions));
		players.add(new Player("Baumgartlinger", 30, 180, 70, "Austria", "CM", getOverall(), 'R', 78, 7000000,
				true, getAttributes(), actions));
		players.add(new Player("Bailey", 30, 180, 70, "Jamaica", "ST", getOverall(), 'R', 84, 18000000, true,
				getAttributes(), actions));
		players.add(new Player("Kohr", 30, 180, 70, "Germany", "CM", getOverall(), 'R', 76, 3000000, true,
				getAttributes(), actions));

		// Manager
		Manager manager = new Manager("Eusebio Di Francesco", 65, 180, 70, "Italy", getOverall(), 2);
		// President
		President president = new President("Genesio", 71, 180, 70, "Portugal");
		// Team
		Team team = new Team("Bayer Leverkusen", "Red", "4-3-3", "Bay Arena", "Bayer Lions", "Germany", "LEV", 5.0,
				"Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createRbl() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Mvogo", 30, 180, 70, "Switzerland", "GK", getOverall(), 'R', 77, 8000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Orban", 30, 180, 70, "Germany", "RB", getOverall(), 'R', 77, 7000000, true,
				getAttributes(), actions));
		players.add(new Player("Franke", 30, 180, 70, "Germany", "CB", getOverall(), 'R', 76, 6000000, true,
				getAttributes(), actions));
		players.add(new Player("Luiaso", 30, 180, 70, "Germany", "CB", getOverall(), 'R', 75, 7000000, true,
				getAttributes(), actions));
		players.add(new Player("Klostermann", 30, 180, 70, "Germany", "LB", getOverall(), 'R', 78, 5000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Sabitzer", 30, 180, 70, "Austria", "CM", getOverall(), 'R', 74, 5500000, true,
				getAttributes(), actions));
		players.add(new Player("Keita", 30, 180, 70, "Nigeria", "CM", getOverall(), 'R', 82, 38000000, true,
				getAttributes(), actions));
		players.add(new Player("Forsberg", 30, 180, 70, "Sweden", "CM", getOverall(), 'R', 80, 14000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Bruma", 30, 180, 70, "Portugal", "RW", getOverall(), 'R', 83, 19000000, true,
				getAttributes(), actions));
		players.add(new Player("Werner", 30, 180, 70, "Germany", "ST", getOverall(), 'R', 85, 34000000, true,
				getAttributes(), actions));
		players.add(new Player("Kampl", 30, 180, 70, "Austria", "LW", getOverall(), 'R', 82, 12000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Gulacsi", 30, 180, 70, "Hungary", "GK", getOverall(), 'R', 77, 4000000, true,
				getAttributes(), actions));
		players.add(new Player("Franke", 30, 180, 70, "Germany", "CB", getOverall(), 'R', 78, 2000000, true,
				getAttributes(), actions));
		players.add(new Player("Ilsanker", 30, 180, 70, "Austria", "CM", getOverall(), 'R', 79, 3000000, true,
				getAttributes(), actions));
		players.add(new Player("Paulsen", 30, 180, 70, "Denmark", "ST", getOverall(), 'R', 75, 2000000, true,
				getAttributes(), actions));
		players.add(new Player("Augustin", 30, 180, 70, "France", "ST", getOverall(), 'R', 74, 5000000, true,
				getAttributes(), actions));
		players.add(new Player("Kuhn", 30, 180, 70, "Germany", "ST", getOverall(), 'R', 72, 1000000, true,
				getAttributes(), actions));
		players.add(new Player("Schmitz", 30, 180, 70, "Germany", "CB", getOverall(), 'R', 71, 3000000, true,
				getAttributes(), actions));
		players.add(new Player("Konate", 30, 180, 70, "France", "CB", getOverall(), 'R', 73, 2500000, true,
				getAttributes(), actions));
		players.add(new Player("Lookman", 30, 180, 70, "England", "ST", getOverall(), 'R', 74, 1500000, true,
				getAttributes(), actions));

		// Manager
		Manager manager = new Manager("Hasenhuttl", 65, 180, 70, "Germany", getOverall(), 2);
		// President
		President president = new President("Müller", 71, 180, 70, "Germany");
		// Team
		Team team = new Team("RB Leipzig", "White", "4-3-3", "RB Arena", "Bulls", "Germany", "RBL", 5.0, "Attack",
				"Fast", manager, president, players);
		return team;
	}

	public static Team createBenfica() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Svilar", 30, 180, 70, "Belgium", "GK", getOverall(), 'R', 78, 7000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Eliseu", 30, 180, 70, "Portugal", "RB", getOverall(), 'R', 80, 4000000, true,
				getAttributes(), actions));
		players.add(new Player("Jardel", 30, 180, 70, "Brazil", "CB", getOverall(), 'R', 83, 12000000, true,
				getAttributes(), actions));
		players.add(new Player("Luiaso", 30, 180, 70, "Brazil", "CB", getOverall(), 'R', 84, 7000000, true,
				getAttributes(), actions));
		players.add(new Player("Grimaldo", 30, 180, 70, "Spain", "LB", getOverall(), 'R', 78, 8000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Fejsa", 30, 180, 70, "Serbia", "CM", getOverall(), 'R', 82, 6000000, true,
				getAttributes(), actions));
		players.add(new Player("Salvio", 30, 180, 70, "Argentina", "CM", getOverall(), 'R', 80, 7500000, true,
				getAttributes(), actions));
		players.add(new Player("Cervi", 30, 180, 70, "Argentina", "CM", getOverall(), 'R', 81, 6000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Jimenez", 30, 180, 70, "Mexico", "RW", getOverall(), 'R', 80, 7000000, true,
				getAttributes(), actions));
		players.add(new Player("Jonas", 30, 180, 70, "Brazil", "ST", getOverall(), 'R', 84, 14000000, true,
				getAttributes(), actions));
		players.add(new Player("Ola John", 30, 180, 70, "Netherlands", "LW", getOverall(), 'R', 80, 9000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Lopes", 30, 180, 70, "Portugal", "GK", getOverall(), 'R', 77, 4000000, true,
				getAttributes(), actions));
		players.add(new Player("Douglas", 30, 180, 70, "Brazil", "RB", getOverall(), 'R', 76, 3000000, true,
				getAttributes(), actions));
		players.add(new Player("Rojas", 30, 180, 70, "Paraguay", "CM", getOverall(), 'R', 75, 2500000, true,
				getAttributes(), actions));
		players.add(new Player("Almeida", 30, 180, 70, "Portugal", "CM", getOverall(), 'R', 80, 8000000, true,
				getAttributes(), actions));
		players.add(new Player("Rafa", 30, 180, 70, "Portugal", "CM", getOverall(), 'R', 79, 6000000, true,
				getAttributes(), actions));
		players.add(new Player("Samaris", 30, 180, 70, "Greece", "CM", getOverall(), 'R', 80, 4000000, true,
				getAttributes(), actions));
		players.add(new Player("Gabriel", 30, 180, 70, "Brazil", "ST", getOverall(), 'R', 76, 2000000, true,
				getAttributes(), actions));
		players.add(new Player("Seferovic", 30, 180, 70, "Switzerland", "ST", getOverall(), 'R', 77, 7500000,
				true, getAttributes(), actions));
		players.add(new Player("Ruben", 30, 180, 70, "Portugal", "CB", getOverall(), 'R', 76, 1000000,
				true, getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Rui Vitoria", 65, 180, 70, "Portugal", getOverall(), 2);
		// President
		President president = new President("Sergio", 71, 180, 70, "Portugal");
		// Team
		Team team = new Team("SLBenfica", "Red", "4-3-3", "Estadio da Luz", "Eagles", "Portugal", "BEN", 5.0,
				"Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createMilan() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Donnarumma", 30, 180, 70, "Germany", "GK", getOverall(), 'R', 85, 24000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Conti", 30, 180, 70, "Italia", "RB", getOverall(), 'R', 79, 7000000, true,
				getAttributes(), actions));
		players.add(new Player("Zapata", 30, 180, 70, "Ecuador", "CB", getOverall(), 'R', 78, 1100000, true,
				getAttributes(), actions));
		players.add(new Player("Musacchio", 30, 180, 70, "Argentina", "CB", getOverall(), 'R', 82, 17000000, true,
				getAttributes(), actions));
		players.add(new Player("Antonelli", 30, 180, 70, "Italy", "LB", getOverall(), 'R', 81, 4000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Montolivo", 30, 180, 70, "Italy", "CM", getOverall(), 'R', 78, 6000000, true,
				getAttributes(), actions));
		players.add(new Player("Kessie", 30, 180, 70, "Ivory Coast", "CM", getOverall(), 'R', 80, 16000000, true,
				getAttributes(), actions));
		players.add(new Player("Biglia", 30, 180, 70, "Argentina", "CM", getOverall(), 'R', 81, 9000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Suso", 30, 180, 70, "Spain", "RW", getOverall(), 'R', 82, 1800000, true,
				getAttributes(), actions));
		players.add(new Player("Silva", 30, 180, 70, "Portugal", "ST", getOverall(), 'R', 82, 11000000, true,
				getAttributes(), actions));
		players.add(new Player("Kalinic", 30, 180, 70, "Crotia", "LW", getOverall(), 'R', 83, 15000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Abbiati", 30, 180, 70, "Italy", "GK", getOverall(), 'R', 76, 1000000, true,
				getAttributes(), actions));
		players.add(new Player("Paletta", 30, 180, 70, "Italy", "RB", getOverall(), 'R', 78, 2000000, true,
				getAttributes(), actions));
		players.add(new Player("Abate", 30, 180, 70, "Germany", "RB", getOverall(), 'R', 80, 8000000, true,
				getAttributes(), actions));
		players.add(new Player("Rodriguez", 30, 180, 70, "Switzerland", "LB", getOverall(), 'R', 83, 16000000,
				true, getAttributes(), actions));
		players.add(new Player("Bonaventura", 30, 180, 70, "Italy", "CM", getOverall(), 'R', 84, 8000000, true,
				getAttributes(), actions));
		players.add(new Player("Locatelli", 30, 180, 70, "Italy", "CM", getOverall(), 'R', 77, 4000000, true,
				getAttributes(), actions));
		players.add(new Player("Borini", 30, 180, 70, "Italy", "ST", getOverall(), 'R', 79, 7000000, true,
				getAttributes(), actions));
		players.add(new Player("Cutrone", 30, 180, 70, "Italy", "ST", getOverall(), 'R', 79, 6000000, true,
				getAttributes(), actions));
		players.add(new Player("Locatelli", 30, 180, 70, "Italy", "CM", getOverall(), 'R', 75, 2000000, true,
				getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Gattuso", 65, 180, 70, "Italy", getOverall(), 2);
		// President
		President president = new President("Xi Yhang", 71, 180, 70, "China");
		// Team
		Team team = new Team("AC Milan", "Red", "4-3-3", "San Siro", "Rossoneri", "Italy", "ACM", 5.0, "Attack",
				"Fast", manager, president, players);
		return team;
	}

	public static Team createBasel() {
		// Initialization
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Signori", 30, 180, 70, "Switzerland", "GK", getOverall(), 'R', 77, 2000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Lang", 30, 180, 70, "Switzerland", "RB", getOverall(), 'R', 78, 4000000, true,
				getAttributes(), actions));
		players.add(new Player("Balanta", 30, 180, 70, "Colombia", "CB", getOverall(), 'R', 80, 8000000, true,
				getAttributes(), actions));
		players.add(new Player("Riveros", 30, 180, 70, "Paraguay", "CB", getOverall(), 'R', 76, 4000000, true,
				getAttributes(), actions));
		players.add(new Player("Goncalves", 30, 180, 70, "Switzerland", "LB", getOverall(), 'R', 77, 3000000,
				true, getAttributes(), actions));
		// MF
		players.add(new Player("Okafor", 30, 180, 70, "Switzerland", "CM", getOverall(), 'R', 75, 2000000, true,
				getAttributes(), actions));
		players.add(new Player("Die", 30, 180, 70, "Ivory Coast", "CM", getOverall(), 'R', 76, 4500000, true,
				getAttributes(), actions));
		players.add(new Player("Simic", 30, 180, 70, "Serbia", "CM", getOverall(), 'R', 77, 1000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Younoussi", 30, 180, 70, "Norway", "RW", getOverall(), 'R', 78, 9000000, true,
				getAttributes(), actions));
		players.add(new Player("Wolfswinkel", 30, 180, 70, "Netherlands", "ST", getOverall(), 'R', 78, 7500000,
				true, getAttributes(), actions));
		players.add(new Player("Ajeti", 30, 180, 70, "Switzerland", "LW", getOverall(), 'R', 77, 2500000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Thurkauf", 30, 180, 70, "Switzerland", "GK", getOverall(), 'R', 75, 1000000, true,
				getAttributes(), actions));
		players.add(new Player("Huser", 30, 180, 70, "Switzerland", "RB", getOverall(), 'R', 76, 500000, true,
				getAttributes(), actions));
		players.add(new Player("Okafor", 30, 180, 70, "Switzerland", "RB", getOverall(), 'R', 74, 1500000, true,
				getAttributes(), actions));
		players.add(new Player("Campo", 30, 180, 70, "Switzerland", "CB", getOverall(), 'R', 73, 750000, true,
				getAttributes(), actions));
		players.add(new Player("Stocker", 30, 180, 70, "Switzerland", "CM", getOverall(), 'R', 72, 1250000, true,
				getAttributes(), actions));
		players.add(new Player("Cani", 30, 180, 70, "Switzerland", "CM", getOverall(), 'R', 74, 1500000, true,
				getAttributes(), actions));
		players.add(new Player("Oberlin", 30, 180, 70, "Switzerland", "ST", getOverall(), 'R', 71, 2000000, true,
				getAttributes(), actions));
		players.add(new Player("Pululu", 30, 180, 70, "France", "ST", getOverall(), 'R', 72, 1000000, true,
				getAttributes(), actions));
		players.add(new Player("Manzambi", 30, 180, 70, "Switzerland", "ST", getOverall(), 'R', 70, 700000, true,
				getAttributes(), actions));

		// Manager
		Manager manager = new Manager("Wicky", 65, 180, 70, "Switzerland", getOverall(), 2);
		// President
		President president = new President("Jakob", 71, 180, 70, "Switzerland");
		// Team
		Team team = new Team("FC Basel", "Red", "4-3-3", "St Jakob-Park", "Switz", "Switzerland", "BAS", 5.0,
				"Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createSpartak() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Rebrov", 30, 180, 70, "Russia", "GK", getOverall(), 'R', 77, 10000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Petkovic", 30, 180, 70, "Serbia", "RB", getOverall(), 'R', 76, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Serdar", 30, 180, 70, "Germany", "CB", getOverall(), 'R', 78, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Bocchetti", 30, 180, 70, "Italy", "CB", getOverall(), 'R', 79, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Kombarov", 30, 180, 70, "Russia", "LB", getOverall(), 'R', 77, 10000000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Bakaev", 30, 180, 70, "Russia", "CM", getOverall(), 'R', 76, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Romula", 30, 180, 70, "Brazil", "CM", getOverall(), 'R', 77, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Fernando", 30, 180, 70, "Brazil", "CM", getOverall(), 'R', 78, 10000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Promes", 30, 180, 70, "Netherlands", "RW", getOverall(), 'R', 83, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Nimely", 30, 180, 70, "Maleysia", "ST", getOverall(), 'R', 79, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Kozlov", 30, 180, 70, "Russia", "LW", getOverall(), 'R', 80, 10000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Antipov", 30, 180, 70, "Russia", "GK", getOverall(), 'R', 74, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Tiglev", 30, 180, 70, "Russia", "RB", getOverall(), 'R', 76, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Khomukha", 30, 180, 70, "Russia", "RB", getOverall(), 'R', 77, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Romulo", 30, 180, 70, "Brazil", "CB", getOverall(), 'R', 75, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Ananidze", 30, 180, 70, "Georgia", "CM", getOverall(), 'R', 76, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Malgarejo", 30, 180, 70, "Paraguay", "CM", getOverall(), 'R', 77, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Eremenko", 30, 180, 70, "Finland", "ST", getOverall(), 'R', 79, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Zobnin", 30, 180, 70, "Russia", "CM", getOverall(), 'R', 78, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Neves", 30, 180, 70, "Brazil", "CM", getOverall(), 'R', 78, 10000000, true,
				getAttributes(), actions));

		// Manager
		Manager manager = new Manager("Carrera", 65, 180, 70, "Brazil", getOverall(), 2);
		// President
		President president = new President("Igor", 71, 180, 70, "Russia");
		// Team
		Team team = new Team("Spartak Moscow", "Red", "4-3-3", "Otkrytie Arena", "Spartak", "Russia", "SMO", 5.0,
				"Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createSporting() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Patricio", 30, 180, 70, "Portugal", "GK", getOverall(), 'R', 82, 12000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Fokobo", 30, 180, 70, "Cameroon", "RB", getOverall(), 'R', 77, 4000000, true,
				getAttributes(), actions));
		players.add(new Player("Coates", 30, 180, 70, "Uruguay", "CB", getOverall(), 'R', 82, 8000000, true,
				getAttributes(), actions));
		players.add(new Player("Mathieu", 30, 180, 70, "France", "CB", getOverall(), 'R', 81, 3500000, true,
				getAttributes(), actions));
		players.add(new Player("Coentrao", 30, 180, 70, "Portugal", "LB", getOverall(), 'R', 79, 7500000, true,
				getAttributes(), actions));
		// MF
		players.add(new Player("Ruiz", 30, 180, 70, "Costa Rica", "CM", getOverall(), 'R', 81, 2000000, true,
				getAttributes(), actions));
		players.add(new Player("Battaglia", 30, 180, 70, "Argentina", "CM", getOverall(), 'R', 82, 6500000, true,
				getAttributes(), actions));
		players.add(new Player("Wendel", 30, 180, 70, "Peru", "CM", getOverall(), 'R', 79, 7000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Martins", 30, 180, 70, "Portugal", "RW", getOverall(), 'R', 82, 11000000, true,
				getAttributes(), actions));
		players.add(new Player("Dost", 30, 180, 70, "Netherlands", "ST", getOverall(), 'R', 83, 14000000, true,
				getAttributes(), actions));
		players.add(new Player("Doumbia", 30, 180, 70, "Ivory Coast", "LW", getOverall(), 'R', 81, 5500000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Salin", 30, 180, 70, "France", "GK", getOverall(), 'R', 77, 2000000, true,
				getAttributes(), actions));
		players.add(new Player("Silva", 30, 180, 70, "Portugal", "RB", getOverall(), 'R', 74, 2500000, true,
				getAttributes(), actions));
		players.add(new Player("Ristovski", 30, 180, 70, "Macedonia", "RB", getOverall(), 'R', 75, 1000000, true,
				getAttributes(), actions));
		players.add(new Player("Merih", 30, 180, 70, "Turkey", "CB", getOverall(), 'R', 77, 3000000, true,
				getAttributes(), actions));
		players.add(new Player("Acuna", 30, 180, 70, "Argentina", "CM", getOverall(), 'R', 78, 4000000, true,
				getAttributes(), actions));
		players.add(new Player("Podence", 30, 180, 70, "Portugal", "CM", getOverall(), 'R', 77, 7000000, true,
				getAttributes(), actions));
		players.add(new Player("Palninha", 30, 180, 70, "Portugal", "ST", getOverall(), 'R', 76, 6000000, true,
				getAttributes(), actions));
		players.add(new Player("Montero", 30, 180, 70, "Ecuador", "ST", getOverall(), 'R', 78, 4000000, true,
				getAttributes(), actions));
		players.add(new Player("Petrovic", 30, 180, 70, "Serbia", "CM", getOverall(), 'R', 78, 3500000, true,
				getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Jorge Jesus", 65, 180, 70, "Portugal", getOverall(), 2);
		// President
		President president = new President("Garcia", 71, 180, 70, "Portugal");
		// Team
		Team team = new Team("Sporting Lisbon", "Green", "4-3-3", "Sporting Arena", "Rossoneri", "Portugal", "SPL",
				5.0, "Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createLiverpool() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Karius", 30, 180, 70, "Germany", "GK", getOverall(), 'R', 81, 8000000, true,
				getAttributes(), actions));
		// DF
		players.add(new Player("Clyne", 30, 180, 70, "England", "RB", getOverall(), 'R', 81, 12000000,
				true, getAttributes(), actions));
		players.add(new Player("Dijk", 30, 180, 70, "Nederlands", "CB", getOverall(), 'R', 84, 65000000,
				true, getAttributes(), actions));
		players.add(new Player("Lovren", 30, 180, 70, "Crotia", "CB", getOverall(), 'R', 82, 13000000, true,
				getAttributes(), actions));
		players.add(new Player("Moreno", 30, 180, 70, "England", "LB", getOverall(), 'R', 79, 8000000,
				true, getAttributes(), actions));
		// MF
		players.add(new Player("Emre", 30, 180, 70, "Germany", "CM", getOverall(), 'R', 83, 25000000, true,
				getAttributes(), actions));
		players.add(new Player("Wijnaldum", 30, 180, 70, "Netherlands", "CM", getOverall(), 'R', 81,
				8000000, true, getAttributes(), actions));
		players.add(new Player("Lallana", 30, 180, 70, "England", "CM", getOverall(), 'R', 82, 12000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Salah", 30, 180, 70, "Egypt", "RW", getOverall(), 'R', 90,
				150000000, true, getAttributes(), actions));
		players.add(new Player("Roberto Firmino", 30, 180, 70, "Brazil", "ST", getOverall(), 'R', 86, 75000000,
				true, getAttributes(), actions));
		players.add(new Player("Sadio Mane", 30, 180, 70, "Senegal", "LW", getOverall(), 'R', 87, 58000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Mignolet", 30, 180, 70, "Belgium", "GK", getOverall(), 'R', 79, 8000000,
				true, getAttributes(), actions));
		players.add(new Player("Klavan", 30, 180, 70, "Estonia", "CB", getOverall(), 'R', 77, 9000000,
				true, getAttributes(), actions));
		players.add(new Player("Henderson", 30, 180, 70, "England", "CM", getOverall(), 'R', 81, 7500000,
				true, getAttributes(), actions));
		players.add(new Player("Gomez", 30, 180, 70, "England", "CM", getOverall(), 'R', 79, 4000000, true,
				getAttributes(), actions));
		players.add(new Player("Chamberlein", 30, 180, 70, "England", "RW", getOverall(), 'R', 83, 15000000, true,
				getAttributes(), actions));
		players.add(new Player("Robertson", 30, 180, 70, "Scotland", "DF", getOverall(), 'R', 82, 12000000,
				true, getAttributes(), actions));
		players.add(new Player("Woodburn", 30, 180, 70, "Wales", "CM", getOverall(), 'R', 73, 1500000, true,
				getAttributes(), actions));
		players.add(new Player("Arnold", 30, 180, 70, "Spain", "ST", getOverall(), 'R', 73,
				2000000, true, getAttributes(), actions));
		players.add(new Player("Matip", 30, 180, 70, "Cameroon", "CB", getOverall(), 'R', 82, 14000000, true,
				getAttributes(), actions));
		
		// Manager
		Manager manager = new Manager("Jurgen Klopp", 45, 180, 70, "Germany", getOverall(), 2);
		// President
		President president = new President("John Houlding", 71, 180, 70, "Spain");
		// Team
		Team team = new Team("Liverpool", "Red", "4-3-3", "Anfield Road", "You Will Never Walk Alone", "England",
				"LIV", 5.0, "Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createRealMadrid() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK
		players.add(new Player("Navas", 30, 180, 70, "Costa Rica", "GK", getOverall(), 'R', 86, 13000000,
				true, getAttributes(), actions));
		// DF
		players.add(new Player("Carvajal", 30, 180, 70, "Spain", "RB", getOverall(), 'R', 82, 19000000,
				true, getAttributes(), actions));
		players.add(new Player("Ramos", 30, 180, 70, "Spain", "CB", getOverall(), 'R', 89, 85000000, true,
				getAttributes(), actions));
		players.add(new Player("Varane", 30, 180, 70, "France", "CB", getOverall(), 'R', 87, 50000000, true,
				getAttributes(), actions));
		players.add(new Player("Marcelo", 30, 180, 70, "Brazil", "LB", getOverall(), 'R', 88, 70000000, true,
				getAttributes(), actions));
		

		// MF
		players.add(new Player("Modric", 30, 180, 70, "Crotia", "CM", getOverall(), 'R', 88, 50000000, true,
				getAttributes(), actions));
		players.add(new Player("Asensio", 30, 180, 70, "Spain", "CM", getOverall(), 'R', 86, 60000000, true,
				getAttributes(), actions));	
		players.add(new Player("Kroos", 30, 180, 70, "Germany", "CM", getOverall(), 'R', 89, 55000000, true,
				getAttributes(), actions));
		// FW
		players.add(new Player("Ronaldo", 30, 180, 70, "Portugal", "LW", getOverall(), 'R', 94, 1000000000,
				true, getAttributes(), actions));
		players.add(new Player("Benzema", 30, 180, 70, "France", "ST", getOverall(), 'R', 86, 25000000, true,
				getAttributes(), actions));
		players.add(new Player("Bale", 30, 180, 70, "Wales", "LW", getOverall(), 'R', 90, 60000000, true,
				getAttributes(), actions));
		// Others
		players.add(new Player("Casilla", 30, 180, 70, "Spain", "GK", getOverall(), 'R', 82, 9500000, true,
				getAttributes(), actions));
		players.add(new Player("Nacho", 30, 180, 70, "Spain", "CB", getOverall(), 'R', 84, 22000000, true,
				getAttributes(), actions));
		players.add(new Player("Borja", 30, 180, 70, "Spain", "ST", getOverall(), 'R', 77, 7500000,
				true, getAttributes(), actions));
		players.add(new Player("Casemiro", 30, 180, 70, "Brazil", "CM", getOverall(), 'R', 86, 35000000, true,
				getAttributes(), actions));
		players.add(new Player("Hernandez", 30, 180, 70, "France", "CB", getOverall(), 'R', 79, 8000000,
				true, getAttributes(), actions));
		players.add(new Player("Vazquez", 30, 180, 70, "Spain", "LW", getOverall(), 'R', 79, 17000000, true,
				getAttributes(), actions));
		players.add(new Player("Llorente", 30, 180, 70, "Spain", "CM", getOverall(), 'R', 74, 5000000,
				true, getAttributes(), actions));
		players.add(new Player("Isco", 30, 180, 70, "Spain", "CM", getOverall(), 'R', 85, 50000000, true,
				getAttributes(), actions));
		players.add(new Player("Kovacic", 30, 180, 70, "Crotia", "CM", getOverall(), 'R', 83, 20000000, true,
				getAttributes(), actions));
		
		// Manager
		Manager manager = new Manager("Zidane", 45, 180, 70, "France", getOverall(), 2);
		// President
		President president = new President("Florentino Perez", 71, 180, 70, "Spain");
		// Team
		Team team = new Team("Real Madrid", "Purple", "4-3-3", "Santiago Bernabeu", "Los Galacticos", "Spain", "RMC", 5.0,
				"Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createDortmund() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1
		players.add(new Player("Bürki", 27, 187, 70, "Switzerland", "GK", getOverall(), 'R', 82, 7200000, true,
				getAttributes(), actions));
		// DF 1
		players.add(new Player("Piszchek", 18, 196, 70, "Poland", "RB", getOverall(), 'R', 82, 8500000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Omer", 22, 190, 70, "Turkey", "CB", getOverall(), 'R', 83, 14000000, true,
				getAttributes(), actions));
		// DF 3
		players.add(new Player("Sokratis", 22, 190, 70, "Greece", "CB", getOverall(), 'R', 85, 20000000,
				true, getAttributes(), actions));
		// DF 4
		players.add(new Player("Marcel Schmelzer", 22, 190, 70, "Germany", "CB", getOverall(), 'R', 82, 9000000,
				true, getAttributes(), actions));
		// MF 1
		players.add(new Player("Nuri", 17, 180, 70, "Turkey", "CM", getOverall(), 'R', 81, 7500000, true,
				getAttributes(), actions));
		players.add(new Player("Kagawa", 29, 180, 70, "Japan", "CM", getOverall(), 'R', 81, 9000000, true,
				getAttributes(), actions));
		players.add(new Player("Götze", 30, 180, 70, "Germany", "CM", getOverall(), 'R', 82, 14000000,
				true, getAttributes(), actions));
		
		// F 1
		players.add(new Player("Yarmolenko", 30, 180, 70, "Ukraine", "RW", getOverall(), 'R', 83, 25000000,
				true, getAttributes(), actions));
		players.add(new Player("Batshuayi", 30, 180, 70, "Belgium", "ST", getOverall(), 'R', 84, 22000000,
				true, getAttributes(), actions));
		players.add(new Player("Schürrle", 30, 180, 70, "Germany", "LW", getOverall(), 'R', 83, 17000000,
				true, getAttributes(), actions));
		// GK 1
		players.add(new Player("Weidenfeller", 28, 170, 70, "Germany", "GK", getOverall(), 'R', 77, 3200000,
				true, getAttributes(), actions));
		// DF 1
		players.add(new Player("Durm", 25, 183, 70, "Germany", "RB", getOverall(), 'R', 78, 55000000, true,
				getAttributes(), actions));
		// DF 2
		players.add(new Player("Rode", 27, 190, 70, "Germany", "CM", getOverall(), 'R', 76, 8000000,
				true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Weigl", 22, 177, 70, "Germany", "CM", getOverall(), 'R', 79, 13000000, true,
				getAttributes(), actions));
		// DF 4
		players.add(new Player("Toljan", 23, 182, 70, "Germany", "RB", getOverall(), 'R', 79, 7000000,
				true, getAttributes(), actions));
		// MF 1
		players.add(new Player("Castro", 30, 171, 70, "Germany", "CM", getOverall(), 'R', 78, 11000000,
				true, getAttributes(), actions));
		// MF 2
		players.add(new Player("Reus", 25, 176, 70, "Germany", "RW", getOverall(), 'R', 83, 19000000, true,
				getAttributes(), actions));
		// MF 3
		players.add(new Player("Pulisic", 28, 190, 70, "USA", "RW", getOverall(), 'R', 82, 17000000,
				true, getAttributes(), actions));
		// MF 4
		players.add(new Player("Philip", 28, 180, 70, "Germany", "LW", getOverall(), 'R', 77, 6500000, true,
				getAttributes(), actions));
		players.add(new Player("Isak", 28, 180, 70, "Sweden", "ST", getOverall(), 'R', 76, 5500000, true,
				getAttributes(), actions));
		
		// Manager
		Manager manager = new Manager("Peter Stoger", 51, 176, 70, "Austrian", getOverall(), 2);
		// President
		President president = new President("Reinhard Rauball", 71, 175, 70, "Germany");
		// Team
		Team team = new Team("Borussia Dortmund", "Yellow", "4-4-2", "Westfalen", "Der BVB", "Germany",
				"Blaugranes or Azulgranas", 5.0, "Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createCska() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1
		players.add(new Player("Akinfeev", 21, 190, 70, "Russia", "GK", getOverall(), 'R', 81, 7500000, true,
				getAttributes(), actions));
		// DF 1
		players.add(new Player("Fernandes", 27, 189, 70, "Russia", "RB", getOverall(), 'R', 79, 5000000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Ignashevich", 38, 186, 70, "Russia", "CB", getOverall(), 'R', 77, 6000000,
				true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Berezutski", 29, 192, 70, "Russia", "CB", getOverall(), 'R', 80, 5500000, true,
				getAttributes(), actions));
		// DF 4
		players.add(new Player("Schennikov", 35, 190, 70, "Russia", "LB", getOverall(), 'R', 77, 4500000,
				true, getAttributes(), actions));
		// MF 1
		players.add(new Player("Wernbloom", 31, 187, 70, "Sweden", "CM", getOverall(), 'R', 78, 7000000,
				true, getAttributes(), actions));
		// MF 2
		players.add(new Player("Dzagoev", 26, 180, 70, "Russia", "CM", getOverall(), 'R', 79, 8500000,
				true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Natcho", 30, 180, 70, "Argentina", "CM", getOverall(), 'R', 76, 5500000,
				true, getAttributes(), actions));
		//FW
		players.add(new Player("Musa", 27, 179, 70, "Nigeria", "RW", getOverall(), 'R', 82, 14000000, true,
				getAttributes(), actions));
		players.add(new Player("Vitinho", 24, 178, 70, "Brasil", "ST", getOverall(), 'R', 83, 11000000, true,
				getAttributes(), actions));
		players.add(new Player("Milanov", 19, 180, 70, "Bulgaria", "LW", getOverall(), 'R', 78, 7000000,
				true, getAttributes(), actions));
		// GK 1
		players.add(new Player("Pomazun", 31, 186, 70, "Russia", "GK", getOverall(), 'R', 76, 3500000, true,
				getAttributes(), actions));
		// DF 1
		players.add(new Player("Ignashevich", 31, 184, 70, "Russia", "CB", getOverall(), 'R', 74, 4500000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Bistrovic", 35, 189, 70, "Cratia", "CM", getOverall(), 'R', 72, 1000000,
				true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Golovin", 26, 180, 70, "Russia", "CM", getOverall(), 'R', 73, 3500000,
				true, getAttributes(), actions));
		// DF 4
		players.add(new Player("Vasin", 22, 188, 70, "Russia", "CB", getOverall(), 'R', 74, 2500000,
				true, getAttributes(), actions));
		// MF 1
		players.add(new Player("Chalov", 21, 180, 70, "Russia", "ST", getOverall(), 'R', 76, 2000000,
				true, getAttributes(), actions));
		// MF 2
		players.add(new Player("Milanov", 19, 183, 70, "Bulgaria", "CM", getOverall(), 'R', 77,
				3000000, true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Nababkin", 30, 175, 70, "Russia", "CM", getOverall(), 'R', 78, 2500000, true,
				getAttributes(), actions));
		// MF 4
		players.add(new Player("Kuchaev", 20, 177, 70, "Russia", "CM", getOverall(), 'R', 71,
				3000000, true, getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Viktor Goncharenko", 51, 176, 70, "Russia", getOverall(), 2);
		// President
		President president = new President("Andrey Vatutin", 71, 175, 70, "Russia");
		// Team
		Team team = new Team("CSKA Moscow", "Red", "4-4-2", "VEB Arena", "Armeitsy", "Russia", "Koni ", 5.0, "Attack",
				"Fast", manager, president, players);
		return team;
	}

	public static Team createBesiktas() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1
		players.add(new Player("Fabri", 21, 190, 70, "Spain", "GK", getOverall(), 'R', 79, 7200000,
				true, getAttributes(), actions));
		// DF 1
		players.add(new Player("Gokhan", 21, 189, 70, "Turkey", "RB", getOverall(), 'R', 77, 3000000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Pepe", 20, 190, 70, "Portugal", "CB", getOverall(), 'R', 84, 5000000,
				true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Tosic", 26, 182, 70, "Serbia", "CB", getOverall(), 'L', 79, 3000000, true,
				getAttributes(), actions));
		// DF 4
		players.add(new Player("Adriano", 32, 175, 70, "Brazil", "LB", getOverall(), 'R', 73, 5000000,
				true, getAttributes(), actions));
		// MF 1
		players.add(new Player("Atiba", 20, 176, 70, "Canada", "CM", getOverall(), 'R', 78, 3000000, true,
				getAttributes(), actions));
		// MF 2
		players.add(new Player("Tolgay", 26, 175, 70, "Turkey", "CM", getOverall(), 'R', 78, 10000000,
				true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Talisca", 22, 175, 70, "Brazil", "CM", getOverall(), 'R', 80, 22000000,
				true, getAttributes(), actions));
		// F 1
		players.add(new Player("Quaresma", 23, 174, 70, "Portugal", "RW", getOverall(), 'R', 79, 7500000,
				true, getAttributes(), actions));
		// F 2
		players.add(new Player("Negredo", 22, 177, 70, "Spain", "ST", getOverall(), 'R', 78, 8000000,
				true, getAttributes(), actions));
		// F 3
		players.add(new Player("Babel ", 25, 175, 70, "Netherlands", "LW", getOverall(), 'R', 79,8000000, 
				true, getAttributes(), actions));
		// GK 1
		players.add(new Player("Tolga", 34, 187, 70, "Turkey", "GK", getOverall(), 'R', 71, 120000,
				true, getAttributes(), actions));
		// DF 1
		players.add(new Player("Vida", 25, 176, 70, "Croatia", "CB", getOverall(), 'R', 77, 9000000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Caner", 20, 189, 70, "Turkey", "LB", getOverall(), 'R', 77, 7000000,
				true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Medel", 21, 191, 70, "Chile", "CB", getOverall(), 'R', 80, 10000000,
				true, getAttributes(), actions));
		// DF 4
		players.add(new Player("Oguzhan", 19, 185, 70, "Turkey", "CM", getOverall(), 'R', 76, 7000000, true,
				getAttributes(), actions));
		// MF 1
		players.add(new Player("Tore", 25, 178, 70, "Turkey", "RW", getOverall(), 'R', 78, 8000000, true,
				getAttributes(), actions));
		// MF 2
		players.add(new Player("Love", 17, 185, 70, "Brazil", "ST", getOverall(), 'R', 75, 5000000,
				true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Necip", 32, 172, 70, "Turkey", "CM", getOverall(), 'R', 73, 2000000,
				true, getAttributes(), actions));
		// MF 4
		players.add(new Player("Larin", 25, 179, 70, "Canada", "ST", getOverall(), 'R', 69, 1000000,
				true, getAttributes(), actions));
		// MF 4
		players.add(new Player("Pektemek", 18, 179, 70, "Turkey", "ST", getOverall(), 'R', 76, 4000000, true,
						getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Şenol Güneş", 41, 187, 70, "Turkey", getOverall(), 2);
		// President
		President president = new President("Fikret Orman", 71, 175, 70, "Russia");
		// Team
		Team team = new Team("Besiktas", "Red", "4-3-3", "Vodafone Arena", "Kara Kartallar",
				"Turkey", "__", 5.0, "Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createManchesterCity() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1
		players.add(new Player("Bravo", 34, 183, 70, "Chile", "GK", getOverall(), 'R', 82, 8000000, true,
				getAttributes(), actions));
		// DF 1
		players.add(new Player("Walker", 27, 178, 70, "England", "RB", getOverall(), 'R', 83, 40000000, true,
				getAttributes(), actions));
		players.add(new Player("Kompany", 31, 193, 70, "Belgium", "CB", getOverall(), 'R', 85, 30000000,
				true, getAttributes(), actions));
		players.add(new Player("Stones", 23, 188, 70, "England", "CB", getOverall(), 'R', 85, 25000000, true,
				getAttributes(), actions));
		players.add(new Player("Mendy", 26, 183, 70, "Brazil", "LW", getOverall(), 'R', 80, 24000000, true,
				getAttributes(), actions));
		// MF 1
		players.add(new Player("Ilkay", 27, 180, 70, "Germany", "CM", getOverall(), 'R', 89, 62000000,
				true, getAttributes(), actions));
		players.add(new Player("De Bruyne", 26, 180, 70, "Belgium", "CM", getOverall(), 'R', 91, 120000000,
				true, getAttributes(), actions));
		players.add(new Player("Silva", 28, 173, 70, "England", "CM", getOverall(), 'R', 90, 45000000, true,
				getAttributes(), actions));
		
		// F 1
		players.add(new Player("Leroy Sane", 22, 183, 70, "Germany", "RW", getOverall(), 'R', 87, 55000000, true,
				getAttributes(), actions));
		players.add(new Player("Aguero", 21, 177, 70, "Argentina", "ST", getOverall(), 'R', 90, 90000000,
				true, getAttributes(), actions));
		players.add(new Player(" Sterling ", 23, 170, 70, "England", "LW", getOverall(), 'R', 87, 80000000,
				true, getAttributes(), actions));
		// GK 1
		players.add(new Player("Ederson", 29, 173, 70, "Brazil", "GK", getOverall(), 'R', 85, 35000000,
				true, getAttributes(), actions));
		// DF 1
		players.add(new Player("Danilo", 18, 176, 70, "Brazil", "RB", getOverall(), 'R', 82, 16000000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Fernandinho", 18, 189, 70, "Brazil", "CM", getOverall(), 'R', 84, 12000000,
				true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Otamendi", 21, 191, 70, "Argentina", "CB", getOverall(), 'R', 85, 25000000, true,
				getAttributes(), actions));
		// DF 4
		players.add(new Player("Laporte", 19, 185, 70, "France", "CB", getOverall(), 'R', 85, 20000000, true,
				getAttributes(), actions));
		// MF 1
		players.add(new Player("Silva", 25, 178, 70, "Portugal", "RW", getOverall(), 'R', 84, 24000000,
				true, getAttributes(), actions));
		// MF 2
		players.add(new Player("Jesus", 17, 185, 70, "Brazil", "ST", getOverall(), 'R', 85, 55000000,
				true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Toure", 30, 183, 70, "Ivory Coast", "CM", getOverall(), 'R', 83, 8000000,
				true, getAttributes(), actions));
		// MF 4
		players.add(new Player("Zinchenko", 20, 196, 70, "Ukraine", "CM", getOverall(), 'R', 77, 5000000,
				true, getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Josep Guardiola", 47, 180, 70, "Spanish", getOverall(), 2);
		// President
		President president = new President("Sheikh Mansour", 47, 175, 70, "UAE");
		// Team
		Team team = new Team("Manchester City", "Blue", "4-4-2", "Etihad Stadium", "The Sky Blues",
				"United Kingdom", "__", 5.0, "Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createNapoli() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1

		players.add(new Player("Reina", 27, 185, 70, "Spain", "GK", getOverall(), 'R', 82, 5000000, true,
				getAttributes(), actions));
		// DF 1
		players.add(new Player("Hysaj", 20, 175, 70, "Albania", "RB", getOverall(), 'R', 81, 9000000,
				true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Koulibaly", 28, 183, 70, "France", "CB", getOverall(), 'R', 85, 40000000, true,
				getAttributes(), actions));
		// DF 3
		players.add(new Player("Albiol", 32, 170, 70, "Spain", "CB", getOverall(), 'R', 83, 15000000, true,
				getAttributes(), actions));
		// DF 4
		players.add(new Player("Ghoulam", 26, 188, 70, "Algeria", "LB", getOverall(), 'R', 83, 24000000, true,
				getAttributes(), actions));
		// MF 1
		players.add(new Player("Hamsik", 21, 180, 70, "Slovakia", "CM", getOverall(), 'R', 87, 60000000,
				true, getAttributes(), actions));
		// MF 2
		players.add(new Player("Allan", 33, 165, 70, "Brazil", "CM", getOverall(), 'R', 83, 22000000,
				true, getAttributes(), actions));
		// MF 3
		players.add(new Player("Jorginho", 24, 188, 70, "Brazil", "CM", getOverall(), 'R', 79, 38000000, true,
				getAttributes(), actions));

		// F 1
		players.add(new Player("Insigne", 23, 183, 70, "Italy", "RW", getOverall(), 'R', 85, 50000000,
				true, getAttributes(), actions));
		// F 2
		players.add(new Player("Mertens", 21, 177, 70, "Belgium", "ST", getOverall(), 'R', 88, 55000000, true,
				getAttributes(), actions));
		// F 3
		players.add(new Player("Callejon", 31, 173, 70, "Spain", "LW", getOverall(), 'R', 83, 20000000, true,
				getAttributes(), actions));
		// others
		players.add(new Player("Sepe", 26, 173, 70, "Italy", "GK", getOverall(), 'R', 77, 500000, true,
				getAttributes(), actions));
		players.add(new Player("Maggio", 36, 183, 70, "Italy", "RB", getOverall(), 'R', 79, 3000000,
				true, getAttributes(), actions));
		players.add(new Player("Tonelli", 18, 189, 70, "Italy", "CB", getOverall(), 'R', 77, 7000000, true,
				getAttributes(), actions));
		players.add(new Player("Rui", 28, 191, 70, "Portugal", "LB", getOverall(), 'R', 80, 10000000, true,
				getAttributes(), actions));
		players.add(new Player("Zielinski", 28, 185, 70, "Poland", "CM", getOverall(), 'R', 79, 8000000,
				true, getAttributes(), actions));
		players.add(new Player("Rog", 26, 178, 70, "Cratia", "CM", getOverall(), 'R', 78, 7500000,
				true, getAttributes(), actions));
		players.add(new Player("Milik", 23, 185, 70, "Poland", "ST", getOverall(), 'R', 83, 14000000,
				true, getAttributes(), actions));
		players.add(new Player("Leandrinho", 30, 183, 70, "Brazil", "LW", getOverall(), 'R', 72, 1500000,
				true, getAttributes(), actions));
		players.add(new Player("Machach", 19, 196, 70, "France", "CM", getOverall(), 'R', 64, 2000000, true,
				getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Maurizio Sarri", 59, 185, 70, "Italian", getOverall(), 2);
		// President
		President president = new President("Aurelio De Laurentiis", 68, 175, 70, "Italy");
		// Team
		Team team = new Team("Napoli", "Blue", "4-4-2", "Stadio San Paolo", "The Little Donkeys", "Italy", "__",
				5.0, "Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createPsv() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1
		players.add(new Player("Zoet", 27, 185, 70, "Netherlands", "GK", getOverall(), 'R', 77, 7000000,
				true, getAttributes(), actions));
		// DF 1
		players.add(new Player("Vlerken", 22, 175, 70, "Netherlands", "RB", getOverall(), 'R', 78,
				12000000, true, getAttributes(), actions));
		// DF 2
		players.add(new Player("Mirin", 26, 185, 70, "France", "CB", getOverall(), 'R', 78,
				11000000, true, getAttributes(), actions));
		// DF 3
		players.add(new Player("Luckassen", 22, 170, 70, "Netherlands", "CB", getOverall(), 'R', 77,
				8000000, true, getAttributes(), actions));
		// DF 4
		players.add(new Player("Arias", 26, 188, 70, "Colombia", "LB", getOverall(), 'R', 72, 7000000,
				true, getAttributes(), actions));
		// MF 1
		players.add(new Player("DeCesare", 26, 180, 70, "USA", "CM", getOverall(), 'R', 73, 5000000,
				true, getAttributes(), actions));
		players.add(new Player("Pereiro", 22, 188, 70, "Uruguay", "CM", getOverall(), 'R', 77, 7500000,
				true, getAttributes(), actions));
		players.add(new Player("Hendrix", 27, 179, 70, "Netherlands", "CM", getOverall(), 'R', 78, 9000000,
				true, getAttributes(), actions));
		// F 1
		players.add(new Player("Verreth", 20, 183, 70, "Belgium", "RW", getOverall(), 'R', 75, 7000000,
				true, getAttributes(), actions));
		players.add(new Player("de Jong", 27, 185, 70, "Netherlands", "ST", getOverall(), 'R', 77, 9000000,
				true, getAttributes(), actions));
		players.add(new Player("Lozano", 22, 173, 70, "Mexico", "LW", getOverall(), 'R', 82, 18000000,
				true, getAttributes(), actions));
		// GK 1
		players.add(new Player("Room", 29, 185, 70, "Curacao", "GK", getOverall(), 'R', 76, 300000, true,
				getAttributes(), actions));
		players.add(new Player("Schwaab", 29, 185, 70, "Germany", "RB", getOverall(), 'R', 73, 2500000,
				true, getAttributes(), actions));
		players.add(new Player("Brenet", 23, 175, 70, "Netherlands", "CB", getOverall(), 'R', 74, 1500000,
				true, getAttributes(), actions));
		players.add(new Player("Alberto", 28, 191, 70, "Netherlands", "CB", getOverall(), 'R', 75,
				2000000, true, getAttributes(), actions));
		players.add(new Player("Rigo", 19, 185, 70, "Belgium", "CB", getOverall(), 'R', 76, 3500000, true,
				getAttributes(), actions));
		players.add(new Player("Rosario", 21, 178, 70, "Netherlands", "CM", getOverall(), 'R', 77, 2000000,
				true, getAttributes(), actions));
		players.add(new Player("Ramselaar", 21, 185, 70, "Netherlands", "CM", getOverall(), 'R', 79, 8000000,
				true, getAttributes(), actions));
		players.add(new Player("Lundqvist", 30, 183, 70, "Sweden", "CM", getOverall(), 'R', 69,
				2000000, true, getAttributes(), actions));
		players.add(new Player("van Ginkel", 25, 175, 70, "Netherlands", "CM", getOverall(), 'R', 78,
				9000000, true, getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Phillip Cocu", 47, 185, 70, "Netherlands", getOverall(), 2);
		// President
		President president = new President("Jan Albers", 68, 175, 70, "Netherlands");
		// Team
		Team team = new Team("PSV Eindhoven", "Red", "4-4-2", "Philips Stadion", "Boeren", "Netherlands", "__", 5.0,
				"Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createZenit() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1
		players.add(new Player("Lodygin", 27, 185, 70, "Russia", "GK", getOverall(), 'R', 80, 5000000, true,
				getAttributes(), actions));
		// DF 1
		players.add(new Player("Anyukov", 35, 175, 70, "Russia", "RB", getOverall(), 'R', 79, 6000000,
				true, getAttributes(), actions));
		players.add(new Player("Terentyev", 25, 185, 70, "Russia", "CB", getOverall(), 'R', 78, 6500000,
				true, getAttributes(), actions));
		players.add(new Player( "Criscito", 31, 183, 70, "Italy", "CB", getOverall(), 'R', 80, 8000000,
				true, getAttributes(), actions));
		players.add(new Player("Nabiullin", 23, 188, 70, "Russia", "LB", getOverall(), 'R', 79, 3000000,
				true, getAttributes(), actions));
		players.add(new Player("Yusupov", 28, 180, 70, "Russia", "CM", getOverall(), 'R', 77, 1000000, true,
				getAttributes(), actions));
		players.add(new Player("Kranevitter", 22, 188, 70, "Argentina", "CM", getOverall(), 'R', 78,
				9000000, true, getAttributes(), actions));
		players.add(new Player("Rigoni", 27, 179, 70, "Argentina", "CM", getOverall(), 'R', 79, 8000000,
				true, getAttributes(), actions));
		players.add(new Player("Sheydaev", 20, 183, 70, "Azerbaijan", "RW", getOverall(), 'R', 81, 6000000,
				true, getAttributes(), actions));
		players.add(new Player(" Poloz", 27, 185, 70, "Russia", "ST", getOverall(), 'R', 82, 5000000, true,
				getAttributes(), actions));
		players.add(new Player(" Kokorin", 22, 173, 70, "Russia", "LW", getOverall(), 'R', 83, 12000000,
				true, getAttributes(), actions));
		// other
		players.add(new Player(" Kerzhakov", 29, 185, 70, "Russia", "GK", getOverall(), 'R', 79, 2000000,
				true, getAttributes(), actions));
		players.add(new Player(" Zhirkov", 29, 185, 70, "Russia", "RB", getOverall(), 'R', 77, 3000000, true,
				getAttributes(), actions));
		players.add(new Player(" Smolnikov", 23, 175, 70, "Russia", "CB", getOverall(), 'R', 79, 5500000,
				true, getAttributes(), actions));
		players.add(new Player(" Mevlja", 28, 191, 70, "Slovenia", "CB", getOverall(), 'R', 76, 2000000, true,
				getAttributes(), actions));
		players.add(new Player(" Mammana", 19, 185, 70, "Argentina", "CB", getOverall(), 'R', 80, 8000000,
				true, getAttributes(), actions));
		players.add(new Player("Paredes", 23, 165, 70, "Argentina", "CM", getOverall(), 'R', 77, 2000000,
				true, getAttributes(), actions));
		players.add(new Player(" Fayzulin", 21, 185, 70, "Russia", "CM", getOverall(), 'R', 78, 3000000,
				true, getAttributes(), actions));
		players.add(new Player("Erokhin", 30, 183, 70, "Russia", "CM", getOverall(), 'R', 79, 1000000,
				true, getAttributes(), actions));
		players.add(new Player("Ozdoev", 25, 175, 70, "Russia", "CM", getOverall(), 'R', 74, 1400000,
				true, getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Roberto Mancini", 47, 185, 70, "Russia", getOverall(), 2);
		// President
		President president = new President("Sergey Fursenko", 68, 175, 70, "Russia");
		// Team
		Team team = new Team("Zenit", "Blue", "4-4-2", "Petrovski Stadium",
				"The Anti-aircraft Gunners", "Russia", "The Blue-White-Sky Blues", 5.0, "Attack", "Fast", manager,
				president, players);
		return team;
	}

	public static Team createBayern() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();

		players.add(new Player("Neuer", 27, 185, 70, "Germany", "GK", getOverall(), 'R', 91, 70000000, true,
				getAttributes(), actions));

		players.add(new Player("Kimmich", 35, 175, 70, "Germany", "RB", getOverall(), 'R', 85, 50000000, true,
				getAttributes(), actions));
		players.add(new Player("Hummels", 25, 185, 70, "Germany", "CB", getOverall(), 'R', 89, 95000000, true,
				getAttributes(), actions));
		players.add(new Player("Boateng", 31, 183, 70, "Germany", "CB", getOverall(), 'R', 88, 90000000,
				true, getAttributes(), actions));
		players.add(new Player("Alaba", 23, 188, 70, "Austria", "LB", getOverall(), 'R', 86, 8000000, true,
				getAttributes(), actions));
		players.add(new Player("Martinez", 28, 180, 70, "Spain", "CM", getOverall(), 'R', 84, 2000000, true,
				getAttributes(), actions));
		players.add(new Player("Thiago", 23, 165, 70, "Spain", "CM", getOverall(), 'R', 87, 40000000,
				true, getAttributes(), actions));
		players.add(new Player("Rodriguez", 22, 188, 70, "Colombia", "CM", getOverall(), 'R', 84, 35000000,
				true, getAttributes(), actions));
		players.add(new Player("Robben", 27, 179, 70, "Netherlands", "RW", getOverall(), 'R', 89, 12000000,
				true, getAttributes(), actions));
		players.add(new Player("Lewandowski", 20, 183, 70, "Poland", "ST", getOverall(), 'R', 91, 80000000,
				true, getAttributes(), actions));
		players.add(new Player("Coman", 22, 173, 70, "France", "LW", getOverall(), 'R', 87, 65000000,
				true, getAttributes(), actions));
		//other
		players.add(new Player("Ulreich", 29, 185, 70, "Germany", "GK", getOverall(), 'R', 78, 5000000, true,
				getAttributes(), actions));
		players.add(new Player("Sule", 28, 191, 70, "Germany", "CB", getOverall(), 'R', 82, 15000000, true,
				getAttributes(), actions));
		players.add(new Player("Ribery", 25, 175, 70, "France", "LW", getOverall(), 'R', 86, 11000000, true,
				getAttributes(), actions));
		players.add(new Player("Vidal", 29, 185, 70, "Chile", "CM", getOverall(), 'R', 87, 60000000, true,
				getAttributes(), actions));
		players.add(new Player("Tolisso", 28, 191, 70, "France", "CM", getOverall(), 'R', 85, 30000000, true,
				getAttributes(), actions));
		players.add(new Player("Rafinha", 25, 175, 70, "Brazil", "RB", getOverall(), 'R', 82, 14000000, true,
				getAttributes(), actions));
		players.add(new Player("Müller", 29, 185, 70, "Germany", "ST", getOverall(), 'R', 86, 3500000, true,
				getAttributes(), actions));
		players.add(new Player("Starke", 28, 191, 70, "Germany", "GK", getOverall(), 'R', 79, 1000000, true,
				getAttributes(), actions));
		players.add(new Player("Bernat", 25, 175, 70, "Spain", "LB", getOverall(), 'R', 80, 7500000, true,
				getAttributes(), actions));
		
		// Manager
		Manager manager = new Manager("Jupp Heynckes", 47, 185, 70, "Germany", getOverall(), 2);
		// President
		President president = new President("Uli Hoeneß", 68, 175, 70, "Germany");
		// Team
		Team team = new Team("Bayern Munchen", "Red", "4-4-2", "Allianz Arena", "Die Bayern", "Germany",
				"FC Hollywood", 5.0, "Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createAtletico() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1
		players.add(new Player("Oblak", 27, 185, 70, "Slovenia", "GK", getOverall(), 'R', 87, 27200000, true,
				getAttributes(), actions));
		players.add(new Player("Juanfran", 23, 165, 70, "Spain", "RB", getOverall(), 'R', 82, 5000000, true,
				getAttributes(), actions));
		players.add(new Player("Godin", 35, 175, 70, "Uruguay", "CB", getOverall(), 'R', 86, 14000000, true,
				getAttributes(), actions));
		players.add(new Player("Savic", 31, 183, 70, "Montenegro", "CB", getOverall(), 'R', 82, 19000000,
				true, getAttributes(), actions));
		players.add(new Player("Luis", 25, 185, 70, "Brazil", "LB", getOverall(), 'R', 87, 7000000, true,
				getAttributes(), actions));
		players.add(new Player("Partey", 23, 188, 70, "Ghana", "CM", getOverall(), 'R', 78, 8000000, true,
				getAttributes(), actions));
		players.add(new Player("Koke", 28, 180, 70, "Spain", "CM", getOverall(), 'R', 83, 19000000, true,
				getAttributes(), actions));
		players.add(new Player("Saul", 22, 188, 70, "Spain", "CM", getOverall(), 'R', 82,
				20000000, true, getAttributes(), actions));
		players.add(new Player("Griezmann", 27, 179, 70, "France", "RW", getOverall(), 'R', 88, 90000000,
				true, getAttributes(), actions));
		players.add(new Player("Costa", 20, 183, 70, "Spain", "ST", getOverall(), 'R', 86, 40000000,
				true, getAttributes(), actions));
		players.add(new Player("Carrasco", 27, 185, 70, "Belgium", "LW", getOverall(), 'R', 85, 20000000,
				true, getAttributes(), actions));
		
		// subs
		//sub1
		players.add(new Player("Hernandez", 29, 185, 70, "France", "GK", getOverall(), 'R', 78, 7200000,
				true, getAttributes(), actions));
		//sub2
		players.add(new Player("Correa", 29, 185, 70, "Argentina", "RW", getOverall(), 'R', 79, 12000000,
				true, getAttributes(), actions));
		players.add(new Player("Gimenez", 23, 175, 70, "Uruguay", "CB", getOverall(), 'R', 83, 25000000, true,
				getAttributes(), actions));
		players.add(new Player("Torres", 28, 191, 70, "Spain", "ST", getOverall(), 'R', 81, 5000000, true,
				getAttributes(), actions));
		players.add(new Player("Gabi", 19, 185, 70, "Spain", "CB", getOverall(), 'R', 80, 12000000, true,
				getAttributes(), actions));
		players.add(new Player("Gaitan", 21, 178, 70, "Argentina", "LW", getOverall(), 'R', 83, 16000000,
				true, getAttributes(), actions));
		players.add(new Player("Vitolo", 21, 185, 70, "Spain", "CM", getOverall(), 'R', 82, 8000000, true,
				getAttributes(), actions));
		players.add(new Player("Gameiro", 30, 183, 70, "France", "ST", getOverall(), 'R', 81, 14000000, true,
				getAttributes(), actions));
		players.add(new Player("Vrsaljko", 25, 175, 70, "Cratia", "RB", getOverall(), 'R', 83, 29000000, true,
				getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Diego Simeone", 47, 185, 70, "Argentine", getOverall(), 2);
		// President
		President president = new President("Enrique Cerezo", 70, 175, 70, "Spain");
		// Team
		Team team = new Team("Atletico Madrid", "Red", "4-4-2", "Vicente Calderon", "The Red-and-Whites", "Spain",
				"Atlético Atleti", 5.0, "Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createInter() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1

		players.add(new Player("Handanovic", 27, 185, 70, "Slovenia", "GK", getOverall(), 'R', 87, 37000000, true,
				getAttributes(), actions));
		players.add(new Player("Cancelo", 35, 175, 70, "Portugal", "RB", getOverall(), 'R', 79, 12000000, true,
				getAttributes(), actions));
		players.add(new Player("Miranda", 25, 185, 70, "Brazil", "CB", getOverall(), 'R', 83, 15000000, true,
				getAttributes(), actions));
		players.add(new Player("Skriniar", 31, 183, 70, "Slovenia", "CB", getOverall(), 'R', 79, 9000000, true,
				getAttributes(), actions));
		players.add(new Player("Dalbert", 23, 188, 70, "Brazil", "LB", getOverall(), 'R', 81, 9000000, true,
				getAttributes(), actions));
		players.add(new Player("Brozovic", 28, 180, 70, "Crotia", "CM", getOverall(), 'R', 82,
				21000000, true, getAttributes(), actions));
		players.add(new Player("Rafinha", 23, 165, 70, "Brazil", "CM", getOverall(), 'R', 81, 13000000, true,
				getAttributes(), actions));
		players.add(new Player("Valero", 22, 188, 70, "Spain", "CM", getOverall(), 'R', 83, 4000000, true,
				getAttributes(), actions));
		players.add(new Player("Eder", 20, 183, 70, "Italy", "RW", getOverall(), 'R', 83, 7000000,
				true, getAttributes(), actions));
		players.add(new Player("Icardi", 27, 185, 70, "Argentina", "ST", getOverall(), 'R', 86, 90000000,
				true, getAttributes(), actions));
		players.add(new Player("Perisic", 22, 173, 70, "Crotia", "LW", getOverall(), 'R', 85, 40000000, true,
				getAttributes(), actions));
		// others
		players.add(new Player("Padelli", 29, 185, 70, "Italy", "GK", getOverall(), 'R', 77, 1500000, true,
				getAttributes(), actions));
		players.add(new Player("Ranocchia", 29, 185, 70, "Italy", "CB", getOverall(), 'R', 75, 5500000, true,
				getAttributes(), actions));
		players.add(new Player("Santon", 23, 175, 70, "Finland", "LB", getOverall(), 'R', 77, 6500000,
				true, getAttributes(), actions));
		players.add(new Player("Vecino", 28, 191, 70, "Uruguay", "CM", getOverall(), 'R', 78, 2300000,
				true, getAttributes(), actions));
		players.add(new Player("Gagliardini", 19, 185, 70, "Italy", "CM", getOverall(), 'R', 79, 4000000,
				true, getAttributes(), actions));
		players.add(new Player("Ambrosio", 21, 178, 70, "Italy", "RB", getOverall(), 'R', 74, 2000000,
				true, getAttributes(), actions));
		players.add(new Player("Candreva", 21, 185, 70, "Italy", "RW", getOverall(), 'R', 75, 20000000,
				true, getAttributes(), actions));
		players.add(new Player("Karamoh", 30, 183, 70, "France", "RW", getOverall(), 'R', 73, 1000000, true,
				getAttributes(), actions));
		players.add(new Player("Pinamonti", 25, 175, 70, "Italy", "ST", getOverall(), 'R', 71, 20000000,
				true, getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Luciano Spalletti", 51, 185, 70, "Finland", getOverall(), 2);
		// President
		President president = new President("Erick Thohir", 47, 175, 70, "Indonesia");
		// Team
		Team team = new Team("Inter Milan", "Blue", "4-4-2", "San Siro Stadium", "The Black and Blues", "Italy",
				"The Big Grass Snake", 5.0, "Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createFenerbahce() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1
		players.add(new Player("Volkan", 27, 185, 70, "Turkey", "GK", getOverall(), 'R', 80, 3000000, true,
				getAttributes(), actions));
		players.add(new Player("Isla", 35, 175, 70, "Chile", "RB", getOverall(), 'R', 79, 7000000,
				true, getAttributes(), actions));
		players.add(new Player("Neustadter", 25, 185, 70, "Russia", "CB", getOverall(), 'R', 78, 5000000, true,
				getAttributes(), actions));
		players.add(new Player("Skrtel", 31, 183, 70, "Slovakia", "CB", getOverall(), 'R', 80, 4000000, true,
				getAttributes(), actions));
		players.add(new Player("Hasan", 23, 188, 70, "Turkey", "CB", getOverall(), 'R', 77, 3000000, true,
				getAttributes(), actions));
		players.add(new Player("Mehmet", 28, 180, 70, "Turkey", "CM", getOverall(), 'R', 78, 5000000,
				true, getAttributes(), actions));
		players.add(new Player("Souza", 23, 165, 70, "Brazil", "CM", getOverall(), 'R', 79, 11000000, true,
				getAttributes(), actions));
		players.add(new Player("Guilano", 22, 188, 70, "Brazil", "CM", getOverall(), 'R', 81, 9000000, true,
				getAttributes(), actions));
		players.add(new Player("Dirar", 20, 183, 70, "Morocco", "RW", getOverall(), 'R', 76, 6000000, true,
				getAttributes(), actions));
		players.add(new Player("Fernandao", 27, 185, 70, "Brazil", "ST", getOverall(), 'R', 79, 4000000, true,
				getAttributes(), actions));
		players.add(new Player("Valbuena", 22, 173, 70, "France", "LW", getOverall(), 'R', 81, 8000000,
				true, getAttributes(), actions));

		/////
		// other

		players.add(new Player("Kameni", 29, 185, 70, "Cameroon", "GK", getOverall(), 'R', 78, 3000000,
				true, getAttributes(), actions));
		players.add(new Player("Şener", 29, 185, 70, "Turkey", "RB", getOverall(), 'R', 77, 5000000,
				true, getAttributes(), actions));
		players.add(new Player("Neto", 23, 175, 70, "Portugal", "CB", getOverall(), 'R', 78, 8000000, true,
				getAttributes(), actions));
		players.add(new Player("Koybasi", 28, 191, 70, "Turkey", "LB", getOverall(), 'R', 76, 4000000,
				true, getAttributes(), actions));
		players.add(new Player("Janssen", 26, 185, 75, "Turkey", "ST", 79, 'R', 69, 15000000, true,
				getAttributes(), actions));
		players.add(new Player("Alper", 21, 178, 70, "Turkey", "CM", getOverall(), 'R', 77, 7000000, true,
				getAttributes(), actions));
		players.add(new Player("Mehmet", 21, 185, 70, "Turkey", "CM", getOverall(), 'R', 78, 8000000, true,
				getAttributes(), actions));
		players.add(new Player("Ozan ", 25, 175, 70, "Turkey", "CM", getOverall(), 'R', 76, 6000000, true,
				getAttributes(), actions));
		players.add(new Player("Soldado ", 25, 175, 70, "Spain", "ST", getOverall(), 'R', 79, 8000000, true,
				getAttributes(), actions));
		

		// Manager
		Manager manager = new Manager("Aykut Kocaman", 52, 174, 70, "Turkey", getOverall(), 2);
		// President
		President president = new President("Aziz Yıldırım", 47, 175, 70, "Turkey");
		// Team
		Team team = new Team("Fenerbahce", "Yellow", "4-4-2", "Ülker Stadyumu", "Yellow and Navy Blue", "Turkey",
				"Viva Fenerbahçe", 5.0, "Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createTottenham() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1

		players.add(new Player("Lloris", 27, 185, 70, "France", "GK", getOverall(), 'R', 88, 35000000, true,
				getAttributes(), actions));
		players.add(new Player("Aurier", 35, 175, 70, "Ivory Coast", "RB", getOverall(), 'R', 83, 15000000,
				true, getAttributes(), actions));
		players.add(new Player("Alderweireld", 31, 183, 70, "Belgium", "CB", getOverall(), 'R', 85, 22000000,
				true, getAttributes(), actions));
		players.add(new Player("Vertonghen", 23, 188, 70, "Belgium", "CB", getOverall(), 'R', 86, 25000000,
				true, getAttributes(), actions));
		players.add(new Player("Rose", 25, 185, 70, "England", "LB", getOverall(), 'R', 83, 14000000, true,
				getAttributes(), actions));
		players.add(new Player("Dembele", 28, 180, 70, "Belgium", "CM", getOverall(), 'R', 85, 15000000,
				true, getAttributes(), actions));
		players.add(new Player("Lamela", 23, 165, 70, "Argentina", "CM", getOverall(), 'R', 83, 11000000,
				true, getAttributes(), actions));
		players.add(new Player("Wanyama", 22, 188, 70, "Kenya", "CM", getOverall(), 'R', 84, 15000000, true,
				getAttributes(), actions));
		players.add(new Player("Son", 27, 179, 70, "South Korea", "RW", getOverall(), 'R', 87, 27000000, true,
				getAttributes(), actions));
		players.add(new Player("Kane", 20, 183, 70, "England", "ST", getOverall(), 'R', 89, 80000000, true,
				getAttributes(), actions));
		players.add(new Player("Alli", 27, 185, 70, "England", "LW", getOverall(), 'R', 86, 60000000,
				true, getAttributes(), actions));

	
		/////
		// other

		players.add(new Player("Vorm", 29, 185, 70, "Netherlands", "GK", getOverall(), 'R', 74, 5000000,
				true, getAttributes(), actions));
		players.add(new Player("Sanchez", 29, 185, 70, "Colombia", "RB", getOverall(), 'R', 82, 14000000,
				true, getAttributes(), actions));
		players.add(new Player("Lucas", 23, 175, 70, "Brazil", "RW", getOverall(), 'R', 83, 15000000, true,
				getAttributes(), actions));
		players.add(new Player("Davies", 19, 185, 70, "Wales", "CB", getOverall(), 'R', 79, 12000000, true,
				getAttributes(), actions));
		players.add(new Player("Sissoko", 21, 178, 70, "France", "CM", getOverall(), 'R', 81, 9000000,
				true, getAttributes(), actions));
		players.add(new Player("Eriksen", 25, 175, 70, "Denmark", "CM", getOverall(), 'R', 85, 50000000,
				true, getAttributes(), actions));
		players.add(new Player("Trippier", 29, 185, 70, "England", "RB", getOverall(), 'R', 79, 8000000,
				true, getAttributes(), actions));
		players.add(new Player("Dier", 23, 175, 70, "England", "CM", getOverall(), 'R', 69, 5000000, true,
				getAttributes(), actions));
		players.add(new Player("Llorente", 19, 185, 70, "Spain", "ST", getOverall(), 'R', 79, 9000000, true,
				getAttributes(), actions));


		// Manager
		Manager manager = new Manager("Mauricio Pochettino", 46, 182, 70, "Argentina", getOverall(), 2);
		// President
		President president = new President("Daniel Levy", 47, 175, 70, "England");
		// Team
		Team team = new Team("Tottenham Hotspur F.C.", "White", "4-4-2", "Wembley Stadium", "The Lillywhites",
				"United Kingdom", "Spurs", 5.0, "Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createJuventus() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1
		players.add(new Player("Buffon", 27, 185, 70, "Italy", "GK", getOverall(), 'R', 86, 5000000,
				true, getAttributes(), actions));
		players.add(new Player("Lichtsteiner", 35, 175, 70, "Switzerland", "RB", getOverall(), 'R', 82, 3000000,
				true, getAttributes(), actions));
		players.add(new Player("Benatia", 25, 185, 70, "Morocco", "CB", getOverall(), 'R', 84, 16000000, true,
				getAttributes(), actions));
		players.add(new Player("Chiellini", 31, 183, 70, "Italy", "CB", getOverall(), 'R', 88, 40000000, true,
				getAttributes(), actions));
		players.add(new Player("Sandro", 23, 188, 70, "Brazil", "LB", getOverall(), 'R', 87, 52000000,
				true, getAttributes(), actions));
		players.add(new Player("Pjanic", 28, 180, 70, "Bosnia", "CM", getOverall(), 'R', 86,
				2000000, true, getAttributes(), actions));
		players.add(new Player("Marchisio", 23, 165, 70, "Italy", "CM", getOverall(), 'R', 84, 11000000,
				true, getAttributes(), actions));
		players.add(new Player("Khedira", 22, 188, 70, "Germany", "CM", getOverall(), 'R', 84, 8000000,
				true, getAttributes(), actions));
		players.add(new Player("Cuadrado", 20, 183, 70, "Colombia", "RW", getOverall(), 'R', 84, 20000000, true,
				getAttributes(), actions));
		players.add(new Player("Higuain", 27, 185, 70, "Argentina", "ST", getOverall(), 'R', 87, 30000000,
				true, getAttributes(), actions));
		players.add(new Player("Dybala", 22, 173, 70, "Argentina", "LW", getOverall(), 'R', 89, 90000000,
				true, getAttributes(), actions));
		// others
		players.add(new Player("Szczesny", 29, 185, 70, "Poland", "GK", getOverall(), 'R', 82, 5000000, true,
				getAttributes(), actions));
		players.add(new Player("Rugani", 29, 185, 70, "Italy", "CB", getOverall(), 'R', 80, 4000000,
				true, getAttributes(), actions));
		players.add(new Player("De Sciglio", 23, 175, 70, "Italy", "RB", getOverall(), 'R', 79, 2000000,
				true, getAttributes(), actions));
		players.add(new Player("Matuidi", 28, 191, 70, "France", "CB", getOverall(), 'R', 85, 20000000, 
				true, getAttributes(), actions));
		players.add(new Player("Sturaro", 19, 185, 70, "Italy", "CM", getOverall(), 'R', 79, 7000000,
				true, getAttributes(), actions));
		players.add(new Player("Asamoah", 21, 178, 70, "Ghana", "CM", getOverall(), 'R', 82,
				9000000, true, getAttributes(), actions));
		players.add(new Player("Bernardeschi", 21, 185, 70, "Italy", "RW", getOverall(), 'R', 81, 15000000, true,
				getAttributes(), actions));
		players.add(new Player("Mandzukic", 30, 183, 70, "Cratia", "ST", getOverall(), 'R', 84,
				15000000, true, getAttributes(), actions));
		players.add(new Player("Höwedes", 25, 175, 70, "Germany", "CB", getOverall(), 'R', 79, 8000000,
				true, getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Allegri", 46, 182, 70, "Italy", getOverall(), 2);
		// President
		President president = new President(" Agnelli", 50, 175, 70, "Italy");
		// Team
		Team team = new Team("Juventus F.C.", "Black", "4-4-2", "Juventus Stadium", "The Lillywhites", "Italy",
				"Zebre", 5.0, "Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createMonaco() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1
		players.add(new Player("Subasic", 27, 185, 70, "Croatia", "GK", getOverall(), 'R', 84, 9000000,
				true, getAttributes(), actions));
		players.add(new Player("Djibril Sidibe", 23, 188, 70, "France", "RB", getOverall(), 'R', 82, 14000000,
				true, getAttributes(), actions));
		players.add(new Player("Jemerson", 35, 175, 70, "Brazil", "CB", getOverall(), 'R', 83, 12000000, true,
				getAttributes(), actions));
		players.add(new Player("Raggi", 25, 185, 70, "Italy", "CB", getOverall(), 'R', 82, 6000000,
				true, getAttributes(), actions));
		players.add(new Player("Jorge", 31, 183, 70, "Brazil", "LB", getOverall(), 'R', 79, 5000000, true,
				getAttributes(), actions));
		players.add(new Player("Fabinho", 28, 180, 70, "Brazil", "CM", getOverall(), 'R', 81, 13000000, true,
				getAttributes(), actions));
		players.add(new Player("Ghezzal", 23, 165, 70, "Algeria", "CM", getOverall(), 'R', 80, 8000000,
				true, getAttributes(), actions));
		players.add(new Player("Moutinho", 22, 188, 70, "Portugal", "CM", getOverall(), 'R', 82, 14000000,
				true, getAttributes(), actions));
		players.add(new Player("Lopes", 27, 185, 70, "Portugal", "RW", getOverall(), 'R', 78, 8500000, true,
				getAttributes(), actions));
		players.add(new Player("Falcao", 20, 183, 70, "Colombia", "ST", getOverall(), 'R', 83, 25000000,
				true, getAttributes(), actions));
		players.add(new Player("Keita", 22, 173, 70, "Senegal", "LW", getOverall(), 'R', 82, 18000000,
				true, getAttributes(), actions));
		// others
		players.add(new Player("Benaglio", 29, 185, 70, "Switzerland", "GK", getOverall(), 'R', 77, 5000000,
				true, getAttributes(), actions));
		players.add(new Player("Toure", 29, 185, 70, "Cameroon", "RB", getOverall(), 'R', 78, 2000000,
				true, getAttributes(), actions));
		players.add(new Player("Serrano", 23, 175, 70, "France", "LB", getOverall(), 'R', 77, 3000000,
				true, getAttributes(), actions));
		players.add(new Player("Tielemans", 28, 191, 70, "Belgium", "CM", getOverall(), 'R', 79, 14000000, true,
				getAttributes(), actions));
		players.add(new Player("Glik", 19, 185, 70, "Poland", "CB", getOverall(), 'R', 84, 15000000, true,
				getAttributes(), actions));
		players.add(new Player("Traore", 21, 178, 70, "Cameroon", "CM", getOverall(), 'R', 79, 7000000, true,
				getAttributes(), actions));
		players.add(new Player("Boschilia", 21, 185, 70, "Brazil", "CM", getOverall(), 'R', 79, 6000000, true,
				getAttributes(), actions));
		players.add(new Player("Lemar", 30, 183, 70, "France", "CM", getOverall(), 'R', 77, 24000000, true,
				getAttributes(), actions));
		players.add(new Player("Jovetic", 25, 175, 70, "Montenegro", "ST", getOverall(), 'R', 76, 12000000,
				true, getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Leonardo Jardim", 46, 182, 70, "Venezuelan", getOverall(), 2);
		// President
		President president = new President("Dmitry Rybolovlev", 51, 175, 70, "Russia");
		// Team
		Team team = new Team("AS Monaco", "The Red", "4-4-2", "Stade Louis II", "The Lillywhites", "Italy",
				"The Monégasques", 5.0, "Attack", "Fast", manager, president, players);
		return team;
	}

	public static Team createAjax() {
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Action> actions = new ArrayList<Action>();
		// GK 1
		players.add(new Player("Onana", 27, 185, 70, "Cameroon", "GK", getOverall(), 'R', 76, 7000000, true,
				getAttributes(), actions));
		players.add(new Player("Veltman", 35, 175, 70, "Netherlands", "RB", getOverall(), 'R', 75, 9000000,
				true, getAttributes(), actions));
		players.add(new Player("de Ligt", 25, 185, 70, "Netherlands", "CB", getOverall(), 'R', 74,
				14000000, true, getAttributes(), actions));
		players.add(new Player("Wober", 23, 188, 70, "Austria", "CB", getOverall(), 'R', 78, 6000000,
				true, getAttributes(), actions));
		players.add(new Player("Tagliafaco", 28, 180, 70, "Argentina", "LB", getOverall(), 'R', 79,
				11000000, true, getAttributes(), actions));
		players.add(new Player("Nouri", 23, 165, 70, "Netherlands", "CM", getOverall(), 'R', 80, 6000000,
				true, getAttributes(), actions));
		players.add(new Player(" Ziyech", 22, 188, 70, "Morocco", "CM", getOverall(), 'R', 84, 19000000, true,
				getAttributes(), actions));
		players.add(new Player("De Jong", 27, 179, 70, "Netherlands", "CM", getOverall(), 'R', 82, 8000000,
				true, getAttributes(), actions));
		players.add(new Player("Cerny", 20, 183, 70, "Czech", "RW", getOverall(), 'R', 78, 6500000, true,
				getAttributes(), actions));
		players.add(new Player("Huntelaar", 27, 185, 70, "Netherlands", "ST", getOverall(), 'R', 82,
				3000000, true, getAttributes(), actions));
		players.add(new Player("Younes", 22, 173, 70, "Germany", "LW", getOverall(), 'R', 81, 17000000, true,
				getAttributes(), actions));
		// others
		players.add(new Player("van Leer", 29, 185, 70, "Netherlands", "GK", getOverall(), 'R', 77,
				5000000, true, getAttributes(), actions));
		players.add(new Player("Sinkgraven", 29, 185, 70, "Netherlands", "RB", getOverall(), 'R', 78,
				7500000, true, getAttributes(), actions));
		players.add(new Player("Viergever", 23, 175, 70, "Netherlands", "CB", getOverall(), 'R', 79, 7000000,
				true, getAttributes(), actions));
		players.add(new Player("Orejuela", 28, 191, 70, "Colombia", "CB", getOverall(), 'R', 74, 4000000,
				true, getAttributes(), actions));
		players.add(new Player("Johnsen", 19, 185, 70, "Denmark", "LW", getOverall(), 'R', 73,
				3000000, true, getAttributes(), actions));
		players.add(new Player("Dolberg", 21, 178, 70, "Denmark", "ST", getOverall(), 'R', 77, 6500000,
				true, getAttributes(), actions));
		players.add(new Player("Schone", 21, 185, 70, "Denmark", "CM", getOverall(), 'R', 79, 7000000, true,
				getAttributes(), actions));
		players.add(new Player("De Jong", 30, 183, 70, "Netherlands", "CM", getOverall(), 'R', 75,
				4500000, true, getAttributes(), actions));
		players.add(new Player("Siem", 25, 175, 70, "Netherlands", "CM", getOverall(), 'R', 78, 5000000,
				true, getAttributes(), actions));
		// Manager
		Manager manager = new Manager("Erik ten Hag", 48, 182, 70, "Netherlands", getOverall(), 2);
		// President
		President president = new President("Hennie Henrichs", 51, 175, 70, "Netherlands");
		// Team
		Team team = new Team("AFC Ajax", "Red", "4-4-2", "Johan Cruijff Arena", "the Jews", "Netherlands",
				"Lucky Ajax", 5.0, "Attack", "Fast", manager, president, players);

		return team;

	}

	public static Team[] buildTeams() {
		Team[] teams = new Team[32];
		teams[0] = createAjax();
		teams[1] = createMonaco();
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
		teams[21] = createBesiktas();
		teams[22] = createManchesterCity();
		teams[23] = createNapoli();
		teams[24] = createZenit();
		teams[25] = createBayern();
		teams[26] = createAtletico();
		teams[27] = createInter();
		teams[28] = createFenerbahce();
		teams[29] = createTottenham();
		teams[30] = createJuventus();
		teams[31] = createPsv();
		return teams;
	}

}