package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Kerem
 *
 */
public class Elimination implements Serializable {

	private KnockoutTree knockout;

	private ArrayList<Match> matches;

	private final int NUMBER_OF_MATCHES = 29;

	private final static int[] ELIMINATION_MATCH_DAYS = { 31, 19, 26, 20, 27, 3, 10, 4, 11, 5, 12, 6, 13, 13, 24, 14,
			25, 15, 26, 16, 27, 17, 28, 18, 29, 19, 30, 20, 31 };
	private final static int[] ELIMINATION_MATCH_MONTHS = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 12, 12, 12, 12, 12,
			12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12 };
	private final static int[] ELIMINATION_MATCH_YEARS = { 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019,
			2019, 2019, 2019, 2018, 2018, 2018, 2018, 2018, 2018, 2018, 2018, 2018, 2018, 2018, 2018, 2018, 2018, 2018,
			2018 };

	/**
	 * @param knockout
	 * @param matches
	 */
	public Elimination(KnockoutTree knockout, ArrayList<Match> matches) {
		super();
		this.knockout = knockout;
		this.matches = matches;
	}

	public void placeTeamsToKnockoutTree(Team[] passingTeams) {
		knockout.distributeTeams(passingTeams);
	}

	public void createMatch() {
		for (int i = 0; i < NUMBER_OF_MATCHES; i++)
			knockout.createMatch(i, ELIMINATION_MATCH_DAYS[i], ELIMINATION_MATCH_MONTHS[i], ELIMINATION_MATCH_YEARS[i]);
	}

	int getMatchId(int day, int month, int year) {
		for (int i = 0; i < NUMBER_OF_MATCHES; i++)
			if (ELIMINATION_MATCH_DAYS[i] == day && ELIMINATION_MATCH_MONTHS[i] == month && ELIMINATION_MATCH_YEARS[i] == year)
				return i;
		return -1;
	}

	Match getKnockoutMatch(int matchId) {
		if(matchId == -1)
			return null;
		return knockout.getMatches()[matchId];
	}
	
	public void playMatch(int idMatch) throws InterruptedException {
		if(idMatch == -1)
			return;
		knockout.playMatch(idMatch);
	}
	
	public void playMatch(int day, int month, int year) throws InterruptedException {
		int idMatch = getMatchId(day, month, year);
		if(idMatch == -1)
			return;
		knockout.playMatch(idMatch);
	}

	/**
	 * @return the matches
	 */
	public ArrayList<Match> getMatches() {
		return matches;
	}

	/**
	 * @param matches
	 *            the matches to set
	 */
	public void setMatches(ArrayList<Match> matches) {
		this.matches = matches;
	}

	/**
	 * @return the knockout
	 */
	public KnockoutTree getKnockout() {
		return knockout;
	}

	/**
	 * @param knockout
	 *            the knockout to set
	 */
	public void setKnockout(KnockoutTree knockout) {
		this.knockout = knockout;
	}
}
