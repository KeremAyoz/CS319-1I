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

}
