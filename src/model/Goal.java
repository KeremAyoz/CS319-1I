package model;

/**
 * @author Kerem
 *
 */
public class Goal extends Action {

	private Player scored;
	private Player assisted;

	/**
	 * @param timeHappened
	 * @param scored
	 * @param assisted
	 */
	public Goal(int timeHappened, Player scored, Player assisted) {
		super(timeHappened);
		this.scored = scored;
		this.assisted = assisted;
	}

	/**
	 * @return the scored
	 */
	public Player getScored() {
		return scored;
	}

	/**
	 * @param scored
	 *            the scored to set
	 */
	public void setScored(Player scored) {
		this.scored = scored;
	}

	/**
	 * @return the assisted
	 */
	public Player getAssisted() {
		return assisted;
	}

	/**
	 * @param assisted
	 *            the assisted to set
	 */
	public void setAssisted(Player assisted) {
		this.assisted = assisted;
	}

}
