package model;

/**
 * @author Kerem
 *
 */
public abstract class Card extends Action {

	private Player player;

	/**
	 * @param timeHappened
	 * @param player
	 */
	public Card(int timeHappened, Player player) {
		super(timeHappened);
		this.player = player;
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @param player the player to set
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}
	
}
