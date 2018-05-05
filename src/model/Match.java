package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javafx.util.Pair;

/**
 * @author Kerem
 *
 */
public class Match implements Serializable{

	private Team home;
	private Team away;
	private String referee;
	private String weather;
	private ArrayList<Action> actions;
	
	private int day;
	private int month;
	private int year;
	
	private boolean delay;
	
	private int goalHome;
	private int goalAway;
	private int pointHome;
	private int pointAway;
	
	// Match Algo
	private int actionChance;
	private int teamHomeChance;
	private int teamAwayChance;
	private int eventGoalChance;
	private int eventInjuryChance;
	private int eventRedCardChance;
	private int eventYellowCardChance;
	
	// Match Algo
	private boolean[][] tookRedCard;
	private boolean[][] tookYellowCard;
	private String[][] playerNames;
	private int[][] playerPerformance;
	
	private final int MATCH_DURATION = 90;
	private final int NUMBER_OF_PLAYERS = 11;
	
	private final int POINTS_WIN = 3;
	private final int POINTS_DRAW = 1;
	private final int POINTS_LOSS = 0;
	
	// Match Algo
	private final int ALGO_GENERATE_ADD = 1;
	private final int ALGO_GENERATE_INITIAL = 1;
	private final int ALGO_GENERATE_DEN = 30;
	
	// Match Algo
	private final int ALGO_TEAM_ADD = 1;
	private final int ALGO_TEAM_INITIAL = 5;
	private final int ALGO_TEAM_DEN = 10;
	
	// Match Algo
	private final int ALGO_TYPE_ADD = 5;
	private final int ALGO_TYPE_INITIAL_GOAL = 15;
	private final int ALGO_TYPE_INITIAL_YELLOW = 20;
	private final int ALGO_TYPE_INITIAL_RED = 5;
	private final int ALGO_TYPE_INITIAL_INJURY = 10;
	
	/**
	 * @param home
	 * @param away
	 * @param referee
	 * @param weather
	 * @param actions
	 */
	public Match(int day , int month, int year, Team home, Team away, String referee, String weather, ArrayList<Action> actions) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.home = home;
		this.away = away;
		this.referee = referee;
		this.weather = weather;
		this.actions = actions;
		this.goalHome = -1;
		this.goalAway = -1;
		this.setDelay(false);
	}

	public Match(int day , int month, int year, Team home, Team away, String referee, String weather, ArrayList<Action> actions, boolean delay) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.home = home;
		this.away = away;
		this.referee = referee;
		this.weather = weather;
		this.actions = actions;
		this.goalHome = -1;
		this.goalAway = -1;
		this.setDelay(delay);
	}
	
	// Date ile ilgili �eyler eklenecek
	/**
	 * @return the home
	 */
	public Team getHome() {
		return home;
	}

	/**
	 * @param home
	 *            the home to set
	 */
	public void setHome(Team home) {
		this.home = home;
	}

	/**
	 * @return the away
	 */
	public Team getAway() {
		return away;
	}

	/**
	 * @param away
	 *            the away to set
	 */
	public void setAway(Team away) {
		this.away = away;
	}

	/**
	 * @return the referee
	 */
	public String getReferee() {
		return referee;
	}

	/**
	 * @param referee
	 *            the referee to set
	 */
	public void setReferee(String referee) {
		this.referee = referee;
	}

	/**
	 * @return the weather
	 */
	public String getWeather() {
		return weather;
	}

	/**
	 * @param weather
	 *            the weather to set
	 */
	public void setWeather(String weather) {
		this.weather = weather;
	}

	/**
	 * @return the actions
	 */
	public ArrayList<Action> getActions() {
		return actions;
	}

	/**
	 * @param actions
	 *            the actions to set
	 */
	public void setActions(ArrayList<Action> actions) {
		this.actions = actions;
	}

	public ArrayList<Action> matchSimulation() throws InterruptedException {
		goalHome = goalAway = 0;
		for( int i = 1 ; i <= MATCH_DURATION ; i++ ) {
			if( delay ) {
				TimeUnit.SECONDS.sleep(1);
			}
			Action a = actionGenerator( i );
			if( a != null )
				actions.add(a);
		}
		if( goalHome > goalAway ) {
			setPointHome( POINTS_WIN );
			setPointAway( POINTS_LOSS );
		}
		else if( goalHome < goalAway ) {
			setPointHome( POINTS_LOSS );
			setPointAway( POINTS_WIN );
		}
		else {
			setPointHome( POINTS_DRAW );
			setPointAway( POINTS_DRAW );
		}
		// Player Change -> Bug
		for( int i = 0 ; i < NUMBER_OF_PLAYERS ; i++ ) {
			home.getPlayers().get(i).setCntMatch( home.getPlayers().get(i).getCntMatch() + 1 );
			away.getPlayers().get(i).setCntMatch( away.getPlayers().get(i).getCntMatch() + 1 );
		}
		return getActions();
	}
	
	public void initAlgo() {
		
		actionChance = ALGO_GENERATE_INITIAL;
		teamHomeChance = ALGO_TEAM_INITIAL;
		teamAwayChance = ALGO_TEAM_INITIAL;
		eventGoalChance = ALGO_TYPE_INITIAL_GOAL;
		eventInjuryChance = ALGO_TYPE_INITIAL_INJURY;
		eventRedCardChance = ALGO_TYPE_INITIAL_RED;
		eventYellowCardChance = ALGO_TYPE_INITIAL_YELLOW;
		
		int sizeHome = home.getPlayers().size();
		int sizeAway = away.getPlayers().size();
		
		tookRedCard = new boolean[2][];
		tookRedCard[0] = new boolean[sizeHome];
		tookRedCard[1] = new boolean[sizeAway];
		for( int i = 0 ; i < sizeHome ; i++ )
			tookRedCard[0][i] = false;
		for( int i = 0 ; i < sizeAway ; i++ )
			tookRedCard[1][i] = false;
		
		tookYellowCard = new boolean[2][];
		tookYellowCard[0] = new boolean[sizeHome];
		tookYellowCard[1] = new boolean[sizeAway];
		for( int i = 0 ; i < sizeHome ; i++ )
			tookYellowCard[0][i] = false;
		for( int i = 0 ; i < sizeAway ; i++ )
			tookYellowCard[1][i] = false;
		
		playerNames = new String[2][];
		playerNames[0] = new String[sizeHome];
		playerNames[1] = new String[sizeAway];
		for( int i = 0 ; i < sizeHome ; i++ )
			playerNames[0][i] = home.getPlayers().get(i).getName();
		for( int i = 0 ; i < sizeAway ; i++ )
			playerNames[1][i] = away.getPlayers().get(i).getName();
		
		playerPerformance = new int[2][];
		playerPerformance[0] = new int[sizeHome];
		playerPerformance[1] = new int[sizeAway];
		for( int i = 0 ; i < sizeHome ; i++ ) {
			if( home.getPlayers().get(i).getPosition().equals("GK") )
				playerPerformance[0][i] = 0;
			else
				playerPerformance[0][i] = 100;
		}
		for( int i = 0 ; i < sizeAway ; i++ ) {
			if( away.getPlayers().get(i).getPosition().equals("GK") )
				playerPerformance[1][i] = 0;
			else
				playerPerformance[1][i] = 100;
		}
		
	}
	
	public int getPlayerId( int teamId , String pName ) {
		
		int teamSize = -1;
		if( teamId == 0 )
			teamSize = home.getPlayers().size();
		else
			teamSize = away.getPlayers().size();
		
		for( int i = 0 ; i < teamSize ; i++ )
			if( playerNames[teamId][i].equals(pName) )
				return i;
		
		return -1;
		
	}
	
	/*
	// Match Algo
	private final int ALGO_GENERATE_ADD = 1;
	private final int ALGO_GENERATE_INITIAL = 1;
	private final int ALGO_GENERATE_DEN = 10;
	
	// Match Algo
	private final int ALGO_TEAM_ADD = 1;
	private final int ALGO_TEAM_INITIAL = 5;
	private final int ALGO_TEAM_DEN = 10;
	
	// Match Algo
	private final int ALGO_TYPE_ADD = 5;
	private final int ALGO_TYPE_INITIAL_GOAL = 30;
	private final int ALGO_TYPE_INITIAL_YELLOW = 50;
	private final int ALGO_TYPE_INITIAL_RED = 10;
	private final int ALGO_TYPE_INITIAL_INJURY = 10;
	*/
	
	public Action actionGenerator( int minute ) {
		
		if( minute == 1 )
			initAlgo();
		
		int randomActionExist = (int) ((new Random()).nextDouble() * ALGO_GENERATE_DEN);
		randomActionExist %= ALGO_GENERATE_DEN;
		
		if( randomActionExist >= actionChance ) {
			actionChance += ALGO_GENERATE_ADD;
			return null;
		}
		actionChance = ALGO_GENERATE_INITIAL;
		
		int randomTeam = (int) ((new Random()).nextDouble() * ALGO_TEAM_DEN);
		randomTeam %= ALGO_TEAM_DEN;
		
		Team team = null;
		int chosenTeam = -1;
		if( randomTeam < teamHomeChance ) {
			team = home;
			chosenTeam = 0;
			teamHomeChance -= ALGO_TEAM_ADD;
			teamHomeChance += ALGO_TEAM_ADD;
		}
		else {
			team = away;
			chosenTeam = 1;
			teamHomeChance += ALGO_TEAM_ADD;
			teamHomeChance -= ALGO_TEAM_ADD;
		}
		
		int totalEventChance = eventGoalChance + eventInjuryChance + eventRedCardChance + eventYellowCardChance;
		int randomEvent = (int) ((new Random()).nextDouble() * totalEventChance);
		randomEvent %= totalEventChance;
		
		// Goal
		if( randomEvent < eventGoalChance ) {
			
			if( chosenTeam == 0 )
				goalHome++;
			else
				goalAway++;
			
			int sumPerformance = 0;
			ArrayList< Pair< Integer , Integer > > playerIds = new ArrayList<>();
			for( int i = 0 ; i < NUMBER_OF_PLAYERS ; i++ ) {
				int id = getPlayerId( chosenTeam , team.getPlayers().get(i).getName() );
				if( !tookRedCard[chosenTeam][id] ) {
					sumPerformance += playerPerformance[chosenTeam][id];
					playerIds.add( new Pair<Integer, Integer>( i , playerPerformance[chosenTeam][id] ) );
				}
			}
			
			int randomPerformanceScorer = (int) ((new Random()).nextDouble() * sumPerformance);
			randomPerformanceScorer %= sumPerformance;
			int randomPerformanceAssister = (int) ((new Random()).nextDouble() * sumPerformance);
			randomPerformanceAssister %= sumPerformance;
			
			Player playerScorer = null;
			for( int i = 0 , sum = 0 ; i < playerIds.size() ; i++ ) {
				sum += playerIds.get(i).getValue();
				if( randomPerformanceScorer < sum ) {
					int id = playerIds.get(i).getKey();
					playerScorer = team.getPlayers().get(id);
					break;
				}
			}
			Player playerAssister = null;
			for( int i = 0 , sum = 0 ; i < playerIds.size() ; i++ ) {
				sum += playerIds.get(i).getValue();
				if( randomPerformanceAssister < sum ) {
					int id = playerIds.get(i).getKey();
					playerAssister = team.getPlayers().get(id);
					break;
				}
			}
			
			eventGoalChance = ALGO_TYPE_INITIAL_GOAL;
			eventInjuryChance += ALGO_TYPE_ADD;
			eventRedCardChance += ALGO_TYPE_ADD;
			eventYellowCardChance += ALGO_TYPE_ADD;
			
			playerScorer.setCntGoal( playerScorer.getCntGoal() + 1 );
			playerAssister.setCntAssist( playerAssister.getCntAssist() + 1 );
			return new Goal( minute , playerScorer , playerAssister );
			
		}
		
		// Injury
		else if( randomEvent < eventGoalChance + eventInjuryChance ) {
			
			ArrayList< Pair< Integer , Integer > > playerIds = new ArrayList<>();
			for( int i = 0 ; i < NUMBER_OF_PLAYERS ; i++ ) {
				int id = getPlayerId( chosenTeam , team.getPlayers().get(i).getName() );
				if( !tookRedCard[chosenTeam][id] )
					playerIds.add( new Pair<Integer, Integer>( i , id ) );
			}
			
			int randomPerformanceInjury = (int) ((new Random()).nextDouble() * playerIds.size());
			randomPerformanceInjury %= playerIds.size();
			
			int id = playerIds.get( randomPerformanceInjury ).getKey();
			Player player = team.getPlayers().get(id);
			
			eventGoalChance += ALGO_TYPE_ADD;
			eventInjuryChance = ALGO_TYPE_INITIAL_INJURY;
			eventRedCardChance += ALGO_TYPE_ADD;
			eventYellowCardChance += ALGO_TYPE_ADD;
			
			playerPerformance[chosenTeam][ playerIds.get( randomPerformanceInjury ).getValue() ] /= 10;
			return new Injury( minute , player );
			
		}
		
		// Red Card
		else if( randomEvent < eventGoalChance + eventInjuryChance + eventRedCardChance ) {
			
			ArrayList< Pair< Integer , Integer > > playerIds = new ArrayList<>();
			for( int i = 0 ; i < NUMBER_OF_PLAYERS ; i++ ) {
				int id = getPlayerId( chosenTeam , team.getPlayers().get(i).getName() );
				if( !tookRedCard[chosenTeam][id] )
					playerIds.add( new Pair<Integer, Integer>( i , id ) );
			}
			
			int randomPerformanceRed = (int) ((new Random()).nextDouble() * playerIds.size());
			randomPerformanceRed %= playerIds.size();
			
			int id = playerIds.get( randomPerformanceRed ).getKey();
			Player player = team.getPlayers().get(id);
			
			eventGoalChance += ALGO_TYPE_ADD;
			eventInjuryChance += ALGO_TYPE_ADD;
			eventRedCardChance = ALGO_TYPE_INITIAL_RED;
			eventYellowCardChance += ALGO_TYPE_ADD;
			
			tookRedCard[chosenTeam][ playerIds.get( randomPerformanceRed ).getValue() ] = true;
			player.setCntRedCard( player.getCntRedCard() + 1 );
			return new RedCard( minute , player );
			
		}
		
		// Yellow Card
		else if( randomEvent < eventGoalChance + eventInjuryChance + eventRedCardChance + eventYellowCardChance ) {
			
			ArrayList< Pair< Integer , Integer > > playerIds = new ArrayList<>();
			for( int i = 0 ; i < NUMBER_OF_PLAYERS ; i++ ) {
				int id = getPlayerId( chosenTeam , team.getPlayers().get(i).getName() );
				if( !tookRedCard[chosenTeam][id] && !tookYellowCard[chosenTeam][id] )
					playerIds.add( new Pair<Integer, Integer>( i , id ) );
			}
			
			int randomPerformanceYellow = (int) ((new Random()).nextDouble() * playerIds.size());
			randomPerformanceYellow %= playerIds.size();
			
			int id = playerIds.get( randomPerformanceYellow ).getKey();
			Player player = team.getPlayers().get(id);
			
			eventGoalChance += ALGO_TYPE_ADD;
			eventInjuryChance += ALGO_TYPE_ADD;
			eventRedCardChance += ALGO_TYPE_ADD;
			eventYellowCardChance = ALGO_TYPE_INITIAL_YELLOW;
			
			tookYellowCard[chosenTeam][ playerIds.get( randomPerformanceYellow ).getValue() ] = true;
			player.setCntYellowCard( player.getCntYellowCard() + 1 );
			return new YellowCard( minute , player );
			
		}
		
		// Is there any other case ???
		System.out.println( "WTF - Event Type" );
		return null;
		
	}

	public int getGoalHome() {
		return goalHome;
	}

	public void setGoalHome(int goalHome) {
		this.goalHome = goalHome;
	}

	public int getGoalAway() {
		return goalAway;
	}

	public void setGoalAway(int goalAway) {
		this.goalAway = goalAway;
	}

	public int getPointHome() {
		return pointHome;
	}

	public void setPointHome(int pointHome) {
		this.pointHome = pointHome;
	}

	public int getPointAway() {
		return pointAway;
	}

	public void setPointAway(int pointAway) {
		this.pointAway = pointAway;
	}

	public boolean isDelay() {
		return delay;
	}

	public void setDelay(boolean delay) {
		this.delay = delay;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMATCH_DURATION() {
		return MATCH_DURATION;
	}

	public int getNUMBER_OF_PLAYERS() {
		return NUMBER_OF_PLAYERS;
	}

	public int getPOINTS_WIN() {
		return POINTS_WIN;
	}

	public int getPOINTS_DRAW() {
		return POINTS_DRAW;
	}

	public int getPOINTS_LOSS() {
		return POINTS_LOSS;
	}

	public boolean[][] getTookRedCard() {
		return tookRedCard;
	}

	public void setTookRedCard(boolean[][] tookRedCard) {
		this.tookRedCard = tookRedCard;
	}

	public boolean[][] getTookYellowCard() {
		return tookYellowCard;
	}

	public void setTookYellowCard(boolean[][] tookYellowCard) {
		this.tookYellowCard = tookYellowCard;
	}

	public int[][] getPlayerPerformance() {
		return playerPerformance;
	}

	public void setPlayerPerformance(int[][] playerPerformance) {
		this.playerPerformance = playerPerformance;
	}

	public int getALGO_GENERATE_ADD() {
		return ALGO_GENERATE_ADD;
	}

	public int getALGO_GENERATE_INITIAL() {
		return ALGO_GENERATE_INITIAL;
	}

	public int getALGO_GENERATE_DEN() {
		return ALGO_GENERATE_DEN;
	}

	public int getALGO_TEAM_ADD() {
		return ALGO_TEAM_ADD;
	}

	public int getALGO_TEAM_INITIAL() {
		return ALGO_TEAM_INITIAL;
	}

	public int getALGO_TEAM_DEN() {
		return ALGO_TEAM_DEN;
	}

	public int getALGO_TYPE_ADD() {
		return ALGO_TYPE_ADD;
	}

	public int getALGO_TYPE_INITIAL_GOAL() {
		return ALGO_TYPE_INITIAL_GOAL;
	}

	public int getALGO_TYPE_INITIAL_YELLOW() {
		return ALGO_TYPE_INITIAL_YELLOW;
	}

	public int getALGO_TYPE_INITIAL_RED() {
		return ALGO_TYPE_INITIAL_RED;
	}

	public int getALGO_TYPE_INITIAL_INJURY() {
		return ALGO_TYPE_INITIAL_INJURY;
	}

	public int getActionChance() {
		return actionChance;
	}

	public void setActionChance(int actionChance) {
		this.actionChance = actionChance;
	}

	public int getTeamHomeChance() {
		return teamHomeChance;
	}

	public void setTeamHomeChance(int teamHomeChance) {
		this.teamHomeChance = teamHomeChance;
	}

	public int getTeamAwayChance() {
		return teamAwayChance;
	}

	public void setTeamAwayChance(int teamAwayChance) {
		this.teamAwayChance = teamAwayChance;
	}

	public int getEventGoalChance() {
		return eventGoalChance;
	}

	public void setEventGoalChance(int eventGoalChance) {
		this.eventGoalChance = eventGoalChance;
	}

	public int getEventInjuryChance() {
		return eventInjuryChance;
	}

	public void setEventInjuryChance(int eventInjuryChance) {
		this.eventInjuryChance = eventInjuryChance;
	}

	public int getEventRedCardChance() {
		return eventRedCardChance;
	}

	public void setEventRedCardChance(int eventRedCardChance) {
		this.eventRedCardChance = eventRedCardChance;
	}

	public int getEventYellowCardChance() {
		return eventYellowCardChance;
	}

	public void setEventYellowCardChance(int eventYellowCardChance) {
		this.eventYellowCardChance = eventYellowCardChance;
	}

	public String[][] getPlayerNames() {
		return playerNames;
	}

	public void setPlayerNames(String[][] playerNames) {
		this.playerNames = playerNames;
	}
	
}
