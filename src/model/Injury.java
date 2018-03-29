package model;

/**
 * @author Kerem
 *
 */
public class Injury extends Action {

	private Player injured;

	/**
	 * @param timeHappened
	 * @param injured
	 */
	public Injury(int timeHappened, Player injured) {
		super(timeHappened);
		this.injured = injured;
	}

	/**
	 * @return the injured
	 */
	public Player getInjured() {
		return injured;
	}

	/**
	 * @param injured the injured to set
	 */
	public void setInjured(Player injured) {
		this.injured = injured;
	}

}
