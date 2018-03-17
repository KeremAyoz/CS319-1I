package model;

/**
 * @author Kerem
 *
 */
public class Tournament {

	private Team[] teams;
	private Group[] groups;
	private Elimination knockout;
	private static Tournament instance;

	private final int TOP5 = 5;
	
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
		return instance;
	}
	
	public static void setInstance( Tournament t ) {
		instance = t;
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
	
}
