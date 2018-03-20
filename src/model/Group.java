package model;

import java.io.Serializable;

import java.util.ArrayList;

/**
 * @author Kerem
 *
 */
public class Group implements Serializable{

	private int[][] statistics;
	// Played - Win - Draw - Loss - Scored - Conceded - Points
	
	private Team[] teams;
	private Match[] matches;
	
	private int[] matchCalendar;
	
	private final int TEAMS_PER_GROUP = 4;
	private final int NUMBER_OF_STATS = 7;
	private final int NUMBER_OF_MATCHES = 12;
	
	private final int POINTS_WIN = 3;
	private final int POINTS_DRAW = 1;
	private final int POINTS_LOSS = 0;
	
	/**
	 * @param statistics
	 * @param teams
	 * @param matches
	 */
	public Group(int[][] statistics, Team[] teams, Match[] matches) {
		this.statistics = statistics;
		this.teams = teams;
		this.matches = matches;
	}
	
	public Group() {
		matches = new Match[NUMBER_OF_MATCHES];
		statistics = new int[TEAMS_PER_GROUP][NUMBER_OF_STATS];
		// TODO Auto-generated constructor stub
	}
	
	public void modifyGroupStatistics( int idMatch , int idHome , int idAway ) {
		
		// Statistics - Played
		statistics[idHome][0] += 1;
		statistics[idHome][0] += 1;
		
		// Statistics - Win
		if( matches[idMatch].getPointHome() == POINTS_WIN )
			statistics[idHome][1] += 1;
		if( matches[idMatch].getPointAway() == POINTS_WIN )
			statistics[idAway][1] += 1;
		
		// Statistics - Draw
		if( matches[idMatch].getPointHome() == POINTS_DRAW )
			statistics[idHome][2] += 1;
		if( matches[idMatch].getPointAway() == POINTS_DRAW )
			statistics[idAway][2] += 1;
		
		// Statistics - Loss
		if( matches[idMatch].getPointHome() == POINTS_LOSS )
			statistics[idHome][3] += 1;
		if( matches[idMatch].getPointAway() == POINTS_LOSS )
			statistics[idAway][3] += 1;
		
		// Statistics - Scored
		statistics[idHome][4] += matches[idMatch].getGoalHome();
		statistics[idAway][4] += matches[idMatch].getGoalAway();
		
		// Statistics - Conceded
		statistics[idHome][5] += matches[idMatch].getGoalAway();
		statistics[idHome][5] += matches[idMatch].getGoalHome();
		
		// Statistics - Points
		statistics[idHome][6] += matches[idMatch].getPointHome();
		statistics[idHome][6] += matches[idMatch].getPointAway();
		
	}
	
	public void playMatch( int idMatch ) throws InterruptedException {
		
		int idHome = matchCalendar[idMatch * 2];
		int idAway = matchCalendar[idMatch * 2 + 1];
		ArrayList<Action> actions = new ArrayList<Action>();
		
		matches[idMatch] = new Match( teams[idHome] , teams[idAway] , "Pierluigi Collina" , "Sunny" , actions );
		matches[idMatch].matchSimulation();
		
		modifyGroupStatistics( idMatch , idHome , idAway );
		
	}
	
	public void playMatch( int idWeek , int dayOrder ) throws InterruptedException {
		playMatch( 2 * idWeek + dayOrder );
	}
	
	public void setMatchCalendarOrder() {
		
		matchCalendar = new int[NUMBER_OF_MATCHES * 2];
		
		// 1st week
		matchCalendar[0] = 0;
		matchCalendar[1] = 1;
		matchCalendar[2] = 2;
		matchCalendar[3] = 3;
		
		// 2nd week
		matchCalendar[4] = 1;
		matchCalendar[5] = 2;
		matchCalendar[6] = 3;
		matchCalendar[7] = 0;
		
		// 3rd week
		matchCalendar[8] = 2;
		matchCalendar[9] = 0;
		matchCalendar[10] = 3;
		matchCalendar[11] = 1;
		
		// 4th week
		matchCalendar[12] = 2;
		matchCalendar[13] = 1;
		matchCalendar[14] = 0;
		matchCalendar[15] = 3;
		
		// 5th week
		matchCalendar[16] = 1;
		matchCalendar[17] = 0;
		matchCalendar[18] = 3;
		matchCalendar[19] = 2;
		
		// 6th week
		matchCalendar[20] = 0;
		matchCalendar[21] = 2;
		matchCalendar[22] = 1;
		matchCalendar[23] = 3;
		
	}
	
	/**
	 * @return the statistics
	 */
	public int[][] getStatistics() {
		return statistics;
	}

	/**
	 * @param statistics
	 *            the statistics to set
	 */
	public void setStatistics(int[][] statistics) {
		this.statistics = statistics;
	}

	/**
	 * @return the teams
	 */
	public Team[] getTeams() {
		return teams;
	}

	public Team getTeam( int teamId ) {
		return teams[teamId];
	}
	
	/**
	 * @param teams
	 *            the teams to set
	 */
	public void setTeams(Team[] teams) {
		this.teams = teams;
	}

	/**
	 * @return the matches
	 */
	public Match[] getMatches() {
		return matches;
	}

	/**
	 * @param matches
	 *            the matches to set
	 */
	public void setMatches(Match[] matches) {
		this.matches = matches;
	}

}
