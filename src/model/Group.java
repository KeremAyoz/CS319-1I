package model;

/**
 * @author Kerem
 *
 */
public class Group {

	private int[][] statistics;
	private Team[] teams;
	private Match[] matches;

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
