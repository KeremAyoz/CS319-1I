package model;

import java.io.Serializable;

import java.util.ArrayList;

/**
 * @author Kerem
 *
 */
public class Group implements Serializable{

	private int[][] statistics;
	private Team[] teams;
	private Match[] matches;
	
	private int[] matchCalendar;
	
	private final int NUMBER_OF_MATCHES = 12;
	
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
		// TODO Auto-generated constructor stub
	}

	public void playMatch( int idMatch ) throws InterruptedException {
		
		int idHome = matchCalendar[idMatch * 2];
		int idAway = matchCalendar[idMatch * 2 + 1];
		ArrayList<Action> actions = new ArrayList<Action>();
		
		matches[idMatch] = new Match( teams[idHome] , teams[idAway] , "Pierluigi Collina" , "Sunny" , actions );
		matches[idMatch].matchSimulation();
		
		// Statistics
		
	}
	
	public void playMatch( int idWeek , int idMatch ) {
		playMatch( 2 * idWeek , idMatch );
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
