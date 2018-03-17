package model;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * @author Kerem
 *
 */
public class Match {

	private Team home;
	private Team away;
	private String referee;
	private String weather;
	private ArrayList<Action> actions;
	
	private boolean delay;
	
	private int goalHome;
	private int goalAway;
	private int pointHome;
	private int pointAway;
	
	private final int RANDOM_RANGE = 100;
	private final int MATCH_DURATION = 90;
	private final int NUMBER_OF_PLAYERS = 11;
	
	private final int RANDOM_GOAL = 3;
	private final int RANDOM_YELLOW = 5;
	private final int RANDOM_RED = 1;
	private final int RANDOM_INJURY = 1;
	private final int RANDOM_TOTAL = RANDOM_GOAL + RANDOM_YELLOW + RANDOM_RED + RANDOM_INJURY;
	
	/**
	 * @param home
	 * @param away
	 * @param referee
	 * @param weather
	 * @param actions
	 */
	public Match(Team home, Team away, String referee, String weather, ArrayList<Action> actions) {
		this.home = home;
		this.away = away;
		this.referee = referee;
		this.weather = weather;
		this.actions = actions;
		this.goalHome = 0;
		this.goalAway = 0;
		this.setDelay(false);
	}

	public Match(Team home, Team away, String referee, String weather, ArrayList<Action> actions, boolean delay) {
		this.home = home;
		this.away = away;
		this.referee = referee;
		this.weather = weather;
		this.actions = actions;
		this.goalHome = 0;
		this.goalAway = 0;
		this.setDelay(delay);
	}
	
	// Date ile ilgili þeyler eklenecek
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
		System.out.println( "Match Begins" );
		for( int i = 1 ; i <= MATCH_DURATION ; i++ ) {
			if( delay ) {
				TimeUnit.SECONDS.sleep(1);
				System.out.println( "DELAY ULAN" );
			}
			int random_value = (int) (Math.random() * RANDOM_RANGE + 1);
			if( random_value <= RANDOM_TOTAL )
				actions.add( actionGenerator( i , random_value ) );
		}
		if( goalHome > goalAway ) {
			setPointHome( 3 );
			setPointAway( 0 );
		}
		else if( goalHome < goalAway ) {
			setPointHome( 0 );
			setPointAway( 3 );
		}
		else {
			setPointHome( 1 );
			setPointAway( 1 );
		}
		System.out.println( "Match Ends" );
		for( int i = 0 ; i < NUMBER_OF_PLAYERS ; i++ ) {
			home.getPlayers().get(i).setCntMatch( home.getPlayers().get(i).getCntMatch() + 1 );
			away.getPlayers().get(i).setCntMatch( away.getPlayers().get(i).getCntMatch() + 1 );
		}
		return getActions();
	}
	
	public Action actionGenerator( int minute , int random_value ) {
		
		int random_team = (int) (Math.random() * 2);
		
		if( random_value <= RANDOM_GOAL ) {
			int random_player_1 = -1, random_player_2 = -1;
			while( random_player_1 == random_player_2 ) {
				random_player_1 = (int) (Math.random() * NUMBER_OF_PLAYERS);
				random_player_2 = (int) (Math.random() * NUMBER_OF_PLAYERS);
			}
			if( random_team == 0 ) {
				goalHome++;
				home.getPlayers().get(random_player_1).setCntGoal( home.getPlayers().get(random_player_1).getCntGoal() + 1 );
				home.getPlayers().get(random_player_2).setCntAssist( home.getPlayers().get(random_player_2).getCntAssist() + 1 );
				return new Goal( minute , home.getPlayers().get(random_player_1) , home.getPlayers().get(random_player_2) );
			}
			else {
				goalAway++;
				away.getPlayers().get(random_player_1).setCntGoal( away.getPlayers().get(random_player_1).getCntGoal() + 1 );
				away.getPlayers().get(random_player_2).setCntAssist( away.getPlayers().get(random_player_2).getCntAssist() + 1 );
				return new Goal( minute , away.getPlayers().get(random_player_1) , away.getPlayers().get(random_player_2) );
			}
		}
		
		else if( random_value <= RANDOM_GOAL + RANDOM_YELLOW ) {
			int random_player = (int) (Math.random() * NUMBER_OF_PLAYERS);
			if( random_team == 0 ) {
				home.getPlayers().get(random_player).setCntYellowCard( home.getPlayers().get(random_player).getCntYellowCard() + 1 );
				return new YellowCard( minute , home.getPlayers().get(random_player) );
			}
			else {
				away.getPlayers().get(random_player).setCntYellowCard( away.getPlayers().get(random_player).getCntYellowCard() + 1 );
				return new YellowCard( minute , away.getPlayers().get(random_player) );
			}
		}
		
		else if( random_value <= RANDOM_GOAL + RANDOM_YELLOW + RANDOM_RED ) {
			int random_player = (int) (Math.random() * NUMBER_OF_PLAYERS);
			if( random_team == 0 ) {
				home.getPlayers().get(random_player).setCntRedCard( home.getPlayers().get(random_player).getCntRedCard() + 1 );
				return new RedCard( minute , home.getPlayers().get(random_player) );
			}
			else {
				away.getPlayers().get(random_player).setCntRedCard( away.getPlayers().get(random_player).getCntRedCard() + 1 );
				return new RedCard( minute , away.getPlayers().get(random_player) );
			}
		}
		
		else {
			int random_player = (int) (Math.random() * NUMBER_OF_PLAYERS);
			if( random_team == 0 ) {
				return new Injury( minute , home.getPlayers().get(random_player) );
			}
			else {
				return new Injury( minute , away.getPlayers().get(random_player) );
			}
		}
		
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
	
}
