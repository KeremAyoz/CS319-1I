package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class KnockoutTree implements Serializable {

	private Team[] teams;
	private Match[] matches;

	private final int TEAM_SIZE = 31;
	private final int MATCH_SIZE = 29;

	public KnockoutTree() {
		teams = new Team[TEAM_SIZE];
		for (int i = 0; i < TEAM_SIZE; i++)
			teams[i] = null;
		matches = new Match[MATCH_SIZE];
		for (int i = 0; i < MATCH_SIZE; i++)
			matches[i] = null;
	}

	public void distributeTeams(Team[] passingTeams) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < passingTeams.length; i++)
			list.add(i);
		java.util.Collections.shuffle(list);
		for (int i = 0; i < passingTeams.length; i++)
			teams[TEAM_SIZE - passingTeams.length + i] = passingTeams[list.get(i)];
	}

	public void createMatch(int idMatch, int day, int month, int year) {
		ArrayList<Action> actions = new ArrayList<Action>();
		matches[idMatch] = new Match(day, month, year, null, null, "Pierluigi Collina", "Sunny", actions);
	}

	public void playMatch(int idMatch) throws InterruptedException {

		ArrayList<Action> actions = new ArrayList<Action>();

		if (idMatch == 0) {
			// matches[0] = new Match( 0 , 0 , 0 , teams[1] , teams[2] ,
			// "Pierluigi Collina" , "Sunny" , actions );
			matches[0].setHome(teams[1]);
			matches[0].setHome(teams[2]);
			matches[0].matchSimulation();
			int firstTeamPoint = matches[0].getPointHome();
			int secondTeamPoint = matches[0].getPointAway();
			if (firstTeamPoint > secondTeamPoint)
				teams[0] = teams[1];
			else if (firstTeamPoint < secondTeamPoint)
				teams[0] = teams[2];
			else {
				System.out.println("WTF");
				teams[0] = teams[1];
			}
		}

		else if (idMatch % 2 == 1) {
			// matches[idMatch] = new Match( 0 , 0 , 0 , teams[idMatch+2] ,
			// teams[idMatch+3] , "Pierluigi Collina" , "Sunny" , actions );
			matches[idMatch].setHome(teams[idMatch + 2]);
			matches[idMatch].setHome(teams[idMatch + 3]);
			matches[idMatch].matchSimulation();
			return;
		}

		else {

			// matches[idMatch] = new Match( 0 , 0 , 0 , teams[idMatch+2] ,
			// teams[idMatch+1] , "Pierluigi Collina" , "Sunny" , actions );
			matches[idMatch].setHome(teams[idMatch + 2]);
			matches[idMatch].setHome(teams[idMatch + 1]);
			matches[idMatch].matchSimulation();

			int firstMatchFirstTeamPoint = matches[idMatch - 1].getPointHome();
			int firstMatchFirstTeamGoal = matches[idMatch - 1].getGoalHome();

			int firstMatchSecondTeamPoint = matches[idMatch - 1].getPointAway();
			int firstMatchSecondTeamGoal = matches[idMatch - 1].getGoalAway();

			int secondMatchFirstTeamPoint = matches[idMatch].getPointAway();
			int secondMatchFirstTeamGoal = matches[idMatch].getGoalAway();

			int secondMatchSecondTeamPoint = matches[idMatch].getPointHome();
			int secondMatchSecondTeamGoal = matches[idMatch].getGoalHome();

			int firstTeamPoint = firstMatchFirstTeamPoint + secondMatchFirstTeamPoint;
			int secondTeamPoint = firstMatchSecondTeamPoint + secondMatchSecondTeamPoint;

			int firstTeamGoal = firstMatchFirstTeamGoal + secondMatchFirstTeamGoal;
			int secondTeamGoal = firstMatchSecondTeamGoal + secondMatchSecondTeamGoal;

			if (firstTeamPoint > secondTeamPoint)
				teams[idMatch / 2] = teams[idMatch + 1];
			else if (firstTeamPoint < secondTeamPoint)
				teams[idMatch / 2] = teams[idMatch + 2];
			else {
				if (firstTeamGoal > secondTeamGoal)
					teams[idMatch / 2] = teams[idMatch + 1];
				else if (firstTeamGoal < secondTeamGoal)
					teams[idMatch / 2] = teams[idMatch + 2];
				else {
					if (secondMatchFirstTeamGoal > firstMatchSecondTeamGoal)
						teams[idMatch / 2] = teams[idMatch + 1];
					else if (secondMatchFirstTeamGoal < firstMatchSecondTeamGoal)
						teams[idMatch / 2] = teams[idMatch + 2];
					else {
						System.out.println("WTF");
						teams[idMatch / 2] = teams[idMatch + 1];
					}
				}
			}

		}

	}

}
