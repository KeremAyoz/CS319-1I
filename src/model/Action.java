package model;

/**
 * @author Kerem
 *
 */
public abstract class Action {

	private int timeHappened;

	/**
	 * @param timeHappened
	 */
	public Action(int timeHappened) {
		this.timeHappened = timeHappened;
	}

	/**
	 * @return the timeHappened
	 */
	public int getTimeHappened() {
		return timeHappened;
	}

	/**
	 * @param timeHappened
	 *            the timeHappened to set
	 */
	public void setTimeHappened(int timeHappened) {
		this.timeHappened = timeHappened;
	}

}
