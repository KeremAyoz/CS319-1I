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
	private int currentWeek;
	
	private final int TOP5 = 5;
	private final int MID_SEASON_WEEK = 6;
	private final int TEAMS_PER_GROUP = 4;
	private final int NUMBER_OF_GROUPS = 8;
	private final int NUMBER_OF_TEAMS = TEAMS_PER_GROUP * NUMBER_OF_GROUPS;
	
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
			Group[] groups = new Group[8];
			int[][] stats = new int[4][7];
			Match[] match = new Match[12];
			ArrayList<Action> actions = new ArrayList<Action>();
			for (int i = 0; i < 12; i++)
				match[i] = new Match(null, null, "","", actions);
			
			Team[] teams = new Team[4];
			for (int i = 0; i < 4; i++)
				teams[i] = null;
			
			for (int i = 0; i < 8; i++)
				groups[i] = new Group(stats,teams, match);
			
			ArrayList<Match> matches = new ArrayList<Match>();
			KnockoutTree kn = new KnockoutTree();
			Elimination knockout = new Elimination(kn, matches);	
			instance = new Tournament(DatabaseAccess.buildTeams(),groups,knockout);
			return instance;
		}
		else
			return instance;
		
	}
	
	public static void setInstance( Tournament t ) {
		instance = t;
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
	
	public void playWeek() {
		
		currentWeek++;
	}
	
	public void playMyMatch() {
		
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
	
	public void chooseMyGroupId( String teamName ) {
		for( int i = 0 ; i < groups.length ; i++ )
			for( int j = 0 ; j < groups[i].getTeams().length ; j++ )
				if( groups[i].getTeam(j).getName().equals( teamName ) )
					setMyGroupId(i);
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
			for( int j = 0 ; j < TEAMS_PER_GROUP ; j++ )
				groupTeams[j] = teams[ list.get( i * NUMBER_OF_GROUPS + j ) ];
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
	
}
