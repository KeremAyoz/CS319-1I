package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Kerem
 *
 */
public class Team implements Serializable {

	private String name;
	private String color;
	private String tactic;
	private String stadium;
	private String history;
	private String nationality;
	private String nick;
	private double stars;
	private String style;
	private String tempo;
	private Manager manager;
	private President president;
	private ArrayList<Player> players;

	/**
	 * @param name
	 * @param color
	 * @param tactic
	 * @param stadium
	 * @param history
	 * @param nationality
	 * @param nick
	 * @param stars
	 * @param style
	 * @param tempo
	 * @param manager
	 * @param president
	 * @param players
	 */
	public Team(String name, String color, String tactic, String stadium, String history, String nationality,
			String nick, double stars, String style, String tempo, Manager manager, President president,
			ArrayList<Player> players) {
		this.name = name;
		this.color = color;
		this.tactic = tactic;
		this.stadium = stadium;
		this.history = history;
		this.nationality = nationality;
		this.nick = nick;
		this.stars = stars;
		this.style = style;
		this.tempo = tempo;
		this.manager = manager;
		this.president = president;
		this.players = players;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the tactic
	 */
	public String getTactic() {
		return tactic;
	}

	/**
	 * @param tactic
	 *            the tactic to set
	 */
	public void setTactic(String tactic) {
		this.tactic = tactic;
	}

	/**
	 * @return the stadium
	 */
	public String getStadium() {
		return stadium;
	}

	/**
	 * @param stadium
	 *            the stadium to set
	 */
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	/**
	 * @return the history
	 */
	public String getHistory() {
		return history;
	}

	/**
	 * @param history
	 *            the history to set
	 */
	public void setHistory(String history) {
		this.history = history;
	}

	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * @param nationality
	 *            the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * @return the nick
	 */
	public String getNick() {
		return nick;
	}

	/**
	 * @param nick
	 *            the nick to set
	 */
	public void setNick(String nick) {
		this.nick = nick;
	}

	/**
	 * @return the stars
	 */
	public double getStars() {
		return stars;
	}

	/**
	 * @param stars
	 *            the stars to set
	 */
	public void setStars(double stars) {
		this.stars = stars;
	}

	/**
	 * @return the style
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * @param style
	 *            the style to set
	 */
	public void setStyle(String style) {
		this.style = style;
	}

	/**
	 * @return the tempo
	 */
	public String getTempo() {
		return tempo;
	}

	/**
	 * @param tempo
	 *            the tempo to set
	 */
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	/**
	 * @return the manager
	 */
	public Manager getManager() {
		return manager;
	}

	/**
	 * @param manager
	 *            the manager to set
	 */
	public void setManager(Manager manager) {
		this.manager = manager;
	}

	/**
	 * @return the president
	 */
	public President getPresident() {
		return president;
	}

	/**
	 * @param president
	 *            the president to set
	 */
	public void setPresident(President president) {
		this.president = president;
	}

	/**
	 * @return the players
	 */
	public ArrayList<Player> getPlayers() {
		return players;
	}

	/**
	 * @param players
	 *            the players to set
	 */
	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

}
