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

	/**
	 * @param knockout
	 * @param matches
	 */
	public Elimination(KnockoutTree knockout, ArrayList<Match> matches) {
		super();
		this.knockout = knockout;
		this.matches = matches;
	}
	
	public void placeTeamsToKnockoutTree( Team[] passingTeams ) {
		knockout.distributeTeams(passingTeams);
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
	 * @param knockout the knockout to set
	 */
	public void setKnockout(KnockoutTree knockout) {
		this.knockout = knockout;
	}
}
