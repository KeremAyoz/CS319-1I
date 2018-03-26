package model;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kerem
 *
 */
public class Tournament implements Serializable{

	private Team[] teams;
	private Group[] groups;
	private Elimination knockout;
	private static Tournament instance;
	
	private Team[] eliminationTeams;
	private int[] eliminationTeamIds;
	
	private int myTeamId;
	private int myGroupId;
	
	private int currentDay;
	private int currentMonth;
	private int currentYear;
	private int currentWeek;  // NOT USED UP TO NOW
	private int lastMatchId;
	private int lastMatchWeek;

	private int[] myGroupMatchIds;
	
	private static final int INITIAL_DAY = 1;
	private static final int INITIAL_MONTH = 11;
	private static final int INITIAL_YEAR = 2018;

	private final static int TOP5 = 5;
	private final static int NUMBER_OF_STATS = 7;
	private final static int MID_SEASON_WEEK = 6;
	private final static int TEAMS_PER_GROUP = 4;
	private final static int NUMBER_OF_GROUPS = 8;
	private final static int NUMBER_OF_TEAMS = 32;
	private final static int MATCHES_PER_GROUP = 12;
	private final static int NUMBER_OF_MY_GROUP_MATCHES = 6;
	
	private final static int TOTAL_MONTHS = 12;
	private final static int[] DAYS_MONTH = { 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 };
	
	private final static int[] GROUP_MATCH_DAYS = { 3 , 4 , 10 , 11 , 17 , 18 , 24 , 25 , 1 , 2 , 8 , 9 };
	private final static int[] GROUP_MATCH_MONTHS = { 11 , 11 , 11 , 11 , 11 , 11 , 11 , 11 , 12 , 12 , 12 , 12 };
	private final static int[] GROUP_MATCH_YEARS = { 2018 , 2018 , 2018 , 2018 , 2018 , 2018 , 2018 , 2018 , 2018 , 2018 , 2018 , 2018 };
	
	// ELIMINATION MATCH DATES - TO BE ADDED
	
	/**
	 * @param teams
	 * @param groups
	 * @param knockout
	 */
	private Tournament(Team[] teams, Group[] groups, Elimination knockout) {
		this.teams = teams;
		this.groups = groups;
		this.knockout = knockout;
	}

	/**
	 * @return the instance
	 */
	public static Tournament getInstance() {
		
		if (instance == null) {
			System.out.println("Something");
			ArrayList<Action> actions = new ArrayList<Action>();
			Match[] match = new Match[MATCHES_PER_GROUP];
			for (int i = 0; i < MATCHES_PER_GROUP; i++)
				match[i] = new Match(0, 0, 0, null, null, "","", actions);
			
			Team[] teams = new Team[TEAMS_PER_GROUP];
			for (int i = 0; i < TEAMS_PER_GROUP; i++)
				teams[i] = null;
			
			int[][] stats = new int[TEAMS_PER_GROUP][NUMBER_OF_STATS];
			
			Group[] groups = new Group[NUMBER_OF_GROUPS];
			for (int i = 0; i < NUMBER_OF_GROUPS; i++)
				groups[i] = new Group(stats,teams, match);
			
			ArrayList<Match> matches = new ArrayList<Match>();
			KnockoutTree kn = new KnockoutTree();
			Elimination knockout = new Elimination(kn, matches);
			
			instance = new Tournament(DatabaseAccess.buildTeams(),groups,knockout);
			
			instance.distributeTeams();
			instance.chooseMyGroupId();
			
			instance.currentDay = INITIAL_DAY;
			instance.currentMonth = INITIAL_MONTH;
			instance.currentYear = INITIAL_YEAR;
			instance.lastMatchId = -1;
			instance.lastMatchWeek = -1;
			
			for( int i = 0 ; i < NUMBER_OF_GROUPS ; i++ ) {
				instance.groups[i].setMatchCalendarOrder();
				for( int j = 0 ; j < MATCHES_PER_GROUP ; j++ )
					instance.groups[i].createMatch(j, GROUP_MATCH_DAYS[j], GROUP_MATCH_MONTHS[j], GROUP_MATCH_YEARS[j]);
			}
			instance.chooseMyGroupMatchIds();
			
			return instance;
			
		}
		
		else
			return instance;
		
	}
	
	public static void setInstance( Tournament t ) {
		instance = t;
	}
	
	public boolean isOnGroupMatch() {
		if( lastMatchWeek == NUMBER_OF_MY_GROUP_MATCHES - 1 )
			return false;
		int nextMatchId = myGroupMatchIds[lastMatchWeek + 1];
		if( currentDay == GROUP_MATCH_DAYS[nextMatchId] && currentMonth == GROUP_MATCH_MONTHS[nextMatchId] && currentYear == GROUP_MATCH_YEARS[nextMatchId] )
			return true;
		return false;
	}
	
	public void goNextDay() {
		currentDay++;
		if( currentDay > DAYS_MONTH[currentMonth] ) {
			currentDay = 1;
			currentMonth++;
			if( currentMonth > TOTAL_MONTHS ) {
				currentMonth = 1;
				currentYear++;
			}
		}
	}
	
	public void chooseMyGroupMatchIds() {
		myGroupMatchIds = new int[NUMBER_OF_MY_GROUP_MATCHES];
		for( int i = 0 ; i < 2 * MATCHES_PER_GROUP ; i++ )
			if( groups[myGroupId].getMatchCalendarSingleTeamId(i) == myTeamId )
				myGroupMatchIds[i/4] = i/2;
	}
	
	public void orderGroups() {
		for( int i = 0 ; i < NUMBER_OF_GROUPS ; i++ )
			groups[i].orderGroup();
	}
	
	public void placeTeamsToElimination() {
		
		orderGroups();
		
		String[] passingTeamNames;
		passingTeamNames = new String[NUMBER_OF_GROUPS * TEAMS_PER_GROUP / 2];
		
		for( int i = 0 ; i < NUMBER_OF_GROUPS ; i++ )
			for( int j = 0 ; j < TEAMS_PER_GROUP / 2 ; j++ )
				passingTeamNames[i * TEAMS_PER_GROUP / 2 + j] = groups[i].getOrderedTeamName(j);
		
		eliminationTeams = new Team[NUMBER_OF_GROUPS * TEAMS_PER_GROUP / 2];
		eliminationTeamIds = new int[NUMBER_OF_GROUPS * TEAMS_PER_GROUP / 2];
		
		for( int i = 0 ; i < NUMBER_OF_GROUPS * TEAMS_PER_GROUP / 2 ; i++ )
			for( int j = 0 ; j < teams.length ; j++ )
				if( passingTeamNames[i].equals( teams[j].getName() ) ) {
					eliminationTeams[i] = teams[j];
					eliminationTeamIds[i] = j;
				}
		
		knockout.placeTeamsToKnockoutTree( eliminationTeams );
		
	}
	
	public void playMyGroupMatch() throws InterruptedException {
		int nextMatchId = myGroupMatchIds[lastMatchWeek + 1];
		lastMatchWeek++;
		lastMatchId = nextMatchId;
		groups[myGroupId].playMatch(nextMatchId);
		goNextDay();
	}
	
	public boolean isGroupStage() {
		if( currentWeek <= MID_SEASON_WEEK )
			return true;
		else
			return false;
	}
	
	public boolean isEliminationStage() {
		if( currentWeek > MID_SEASON_WEEK )
			return true;
		else
			return false;
	}
	
	public void chooseMyTeamId( String teamName ) {
		for( int i = 0 ; i < teams.length ; i++ )
			if( teams[i].getName().equals( teamName ) )
				myTeamId = i;
	}
	
	public void chooseMyGroupId() {
		for( int i = 0 ; i < groups.length ; i++ )
			for( int j = 0 ; j < groups[i].getTeams().length ; j++ )
				if( groups[i].getTeam(j).getName().equals( teams[myTeamId].getName() ) )
					myGroupId = i;
	}
	
	public void chooseMyGroupId( String teamName ) {
		for( int i = 0 ; i < groups.length ; i++ )
			for( int j = 0 ; j < groups[i].getTeams().length ; j++ )
				if( groups[i].getTeam(j).getName().equals( teamName ) )
					myGroupId = i;
	}
	
	public Team[] getEliminationTeams() {
		return eliminationTeams;
	}

	public void setEliminationTeams(Team[] eliminationTeams) {
		this.eliminationTeams = eliminationTeams;
	}

	public int[] getEliminationTeamIds() {
		return eliminationTeamIds;
	}

	public void setEliminationTeamIds(int[] eliminationTeamIds) {
		this.eliminationTeamIds = eliminationTeamIds;
	}
	
	public int[] getMyGroupMatchIds() {
		return myGroupMatchIds;
	}

	public void setMyGroupMatchIds(int[] myGroupMatchIds) {
		this.myGroupMatchIds = myGroupMatchIds;
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
	 * @return the groups
	 */
	public Group[] getGroups() {
		return groups;
	}

	/**
	 * @param groups
	 *            the groups to set
	 */
	public void setGroups(Group[] groups) {
		this.groups = groups;
	}

	/**
	 * @return the knockout
	 */
	public Elimination getKnockout() {
		return knockout;
	}

	/**
	 * @param knockout
	 *            the knock-out to set
	 */
	public void setKnockout(Elimination knockout) {
		this.knockout = knockout;
	}

	private Object readResolve() {
		return instance;
	}
	
	/*
	 * !!! WARNING !!!
	 * groups[i] = new Group();
	 * !!! WARNING !!!
	 */
	public void distributeTeams() {
		List<Integer> list = new ArrayList<Integer>();
		for( int i = 0 ; i < NUMBER_OF_TEAMS ; i++ )
			list.add( i );
		java.util.Collections.shuffle(list);
		for( int i = 0 ; i < NUMBER_OF_GROUPS ; i++ ) {
			// groups[i] = new Group();
			Team[] groupTeams = new Team[TEAMS_PER_GROUP];
			for( int j = 0 ; j < TEAMS_PER_GROUP ; j++ ) {
				groupTeams[j] = teams[ list.get( i * TEAMS_PER_GROUP + j ) ];
			}
			groups[i].setTeams( groupTeams );
		}
	}
	
	public String[] getTopGoals() {
		
		String[] bestPlayers = new String[TOP5];
		for( int i = 0 ; i < TOP5 ; i++ )
			bestPlayers[i] = "Player Name";
		
		int[] bestGoals = new int[TOP5];
		for( int i = 0 ; i < TOP5 ; i++ )
			bestGoals[i] = -1;
		
		for( int i = 0 ; i < teams.length ; i++ )
			for( int j = 0 ; j < teams[i].getPlayers().size() ; j++ ) {
				int cnt = teams[i].getPlayers().get(j).getCntGoal();
				for( int k = 0 ; k < TOP5 ; k++ )
					if( cnt > bestGoals[k] ) {
						for( int l = TOP5 - 1 ; l > k ; l-- ) {
							bestGoals[l] = bestGoals[l-1];
							bestPlayers[l] = bestPlayers[l-1];
						}
						bestGoals[k] = cnt;
						bestPlayers[k] = teams[i].getPlayers().get(j).getName();
						break;
					}
			}
		
		String[] data = new String[TOP5];
		
		for( int i = 0 ; i < TOP5 ; i++ )
			data[i] = bestPlayers[i] + " , " + bestGoals[i];
		
		return data;
		
	}
	
	public String[] getTopAssists() {
		
		String[] bestPlayers = new String[TOP5];
		for( int i = 0 ; i < TOP5 ; i++ )
			bestPlayers[i] = "Player Name";
		
		int[] bestAssists = new int[TOP5];
		for( int i = 0 ; i < TOP5 ; i++ )
			bestAssists[i] = -1;
		
		for( int i = 0 ; i < teams.length ; i++ )
			for( int j = 0 ; j < teams[i].getPlayers().size() ; j++ ) {
				int cnt = teams[i].getPlayers().get(j).getCntAssist();
				for( int k = 0 ; k < TOP5 ; k++ )
					if( cnt > bestAssists[k] ) {
						for( int l = TOP5 - 1 ; l > k ; l-- ) {
							bestAssists[l] = bestAssists[l-1];
							bestPlayers[l] = bestPlayers[l-1];
						}
						bestAssists[k] = cnt;
						bestPlayers[k] = teams[i].getPlayers().get(j).getName();
						break;
					}
			}
		
		String[] data = new String[TOP5];
		
		for( int i = 0 ; i < TOP5 ; i++ )
			data[i] = bestPlayers[i] + " , " + bestAssists[i];
		
		return data;
		
	}
	
	public String[] getTopYellowCards() {
		
		String[] bestPlayers = new String[TOP5];
		for( int i = 0 ; i < TOP5 ; i++ )
			bestPlayers[i] = "Player Name";
		
		int[] bestYellowCards = new int[TOP5];
		for( int i = 0 ; i < TOP5 ; i++ )
			bestYellowCards[i] = -1;
		
		for( int i = 0 ; i < teams.length ; i++ )
			for( int j = 0 ; j < teams[i].getPlayers().size() ; j++ ) {
				int cnt = teams[i].getPlayers().get(j).getCntYellowCard();
				for( int k = 0 ; k < TOP5 ; k++ )
					if( cnt > bestYellowCards[k] ) {
						for( int l = TOP5 - 1 ; l > k ; l-- ) {
							bestYellowCards[l] = bestYellowCards[l-1];
							bestPlayers[l] = bestPlayers[l-1];
						}
						bestYellowCards[k] = cnt;
						bestPlayers[k] = teams[i].getPlayers().get(j).getName();
						break;
					}
			}
		
		String[] data = new String[TOP5];
		
		for( int i = 0 ; i < TOP5 ; i++ )
			data[i] = bestPlayers[i] + " , " + bestYellowCards[i];
		
		return data;
		
	}
	
	public String[] getTopRedCards() {
		
		String[] bestPlayers = new String[TOP5];
		for( int i = 0 ; i < TOP5 ; i++ )
			bestPlayers[i] = "Player Name";
		
		int[] bestRedCards = new int[TOP5];
		for( int i = 0 ; i < TOP5 ; i++ )
			bestRedCards[i] = -1;
		
		for( int i = 0 ; i < teams.length ; i++ )
			for( int j = 0 ; j < teams[i].getPlayers().size() ; j++ ) {
				int cnt = teams[i].getPlayers().get(j).getCntRedCard();
				for( int k = 0 ; k < TOP5 ; k++ )
					if( cnt > bestRedCards[k] ) {
						for( int l = TOP5 - 1 ; l > k ; l-- ) {
							bestRedCards[l] = bestRedCards[l-1];
							bestPlayers[l] = bestPlayers[l-1];
						}
						bestRedCards[k] = cnt;
						bestPlayers[k] = teams[i].getPlayers().get(j).getName();
						break;
					}
			}
		
		String[] data = new String[TOP5];
		
		for( int i = 0 ; i < TOP5 ; i++ )
			data[i] = bestPlayers[i] + " , " + bestRedCards[i];
		
		return data;
		
	}

	public int getMyTeamId() {
		return myTeamId;
	}

	public void setMyTeamId(int myTeamId) {
		this.myTeamId = myTeamId;
	}

	public int getCurrentWeek() {
		return currentWeek;
	}

	public void setCurrentWeek(int currentWeek) {
		this.currentWeek = currentWeek;
	}

	public int getMyGroupId() {
		return myGroupId;
	}

	public void setMyGroupId(int myGroupId) {
		this.myGroupId = myGroupId;
	}
	
	public int getCurrentDay() {
		return currentDay;
	}

	public void setCurrentDay(int currentDay) {
		this.currentDay = currentDay;
	}

	public int getCurrentMonth() {
		return currentMonth;
	}

	public void setCurrentMonth(int currentMonth) {
		this.currentMonth = currentMonth;
	}

	public int getCurrentYear() {
		return currentYear;
	}

	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}
	
	public int getLastMatchId() {
		return lastMatchId;
	}

	public void setLastMatchId(int lastMatchId) {
		this.lastMatchId = lastMatchId;
	}
	
	public int getLastMatchWeek() {
		return lastMatchWeek;
	}

	public void setLastMatchWeek(int lastMatchWeek) {
		this.lastMatchWeek = lastMatchWeek;
	}
	
}
