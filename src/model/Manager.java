package model;

import java.io.Serializable;

/**
 * @author Kerem
 *
 */
public class Manager extends Person implements Serializable {

	private int overall;
	private int experience;

	/**
	 * @param name
	 * @param age
	 * @param height
	 * @param weight
	 * @param nationality
	 */
	public Manager(String name, int age, int height, int weight, String nationality, int overall, int experience) {
		super(name, age, height, weight, nationality);
		this.overall = overall;
		this.experience = experience;
	}

	/**
	 * @return the overall
	 */
	public int getOverall() {
		return overall;
	}

	/**
	 * @param overall
	 *            the overall to set
	 */
	public void setOverall(int overall) {
		this.overall = overall;
	}

	/**
	 * @return the experience
	 */
	public int getExperience() {
		return experience;
	}

	/**
	 * @param experience
	 *            the experience to set
	 */
	public void setExperience(int experience) {
		this.experience = experience;
	}

}
