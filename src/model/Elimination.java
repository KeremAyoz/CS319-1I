package model;

import java.util.ArrayList;

/**
 * @author Kerem
 *
 */
public class Elimination {

	// Knockout tree class ý eklenecek. //private KnockoutTree knockout;
	private ArrayList<Match> matches;

	/**
	 * @param matches
	 */
	public Elimination(ArrayList<Match> matches) {
		this.matches = matches;
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
}
