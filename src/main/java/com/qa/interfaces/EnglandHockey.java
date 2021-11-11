package com.qa.interfaces;

public class EnglandHockey implements Sports, Hockey{

	public void visitingTeamGoal(int points) {
		System.out.println(3);
		
	}

	public void homeTeamGoal(int points) {
		System.out.println(5);
		
	}

	public void injuryTimeMins(int it) {
		System.out.println(4);
		
	}

	public void homeTeam() {
		System.out.println("England");
		
	}

	public void awayTeam() {
		System.out.println("India");
		
	}

}
