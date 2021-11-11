package com.qa.interfaces;

public class Runner {

	public static void main(String[] args) {
		
		EnglandHockey hockey = new EnglandHockey();
		
		hockey.homeTeam();
		hockey.homeTeamGoal(5);
		System.out.println("-----------------");
		hockey.awayTeam();
		hockey.visitingTeamGoal(3);
		System.out.println("-----------------");
		System.out.println("Amount of Injury time in mins:");
		hockey.injuryTimeMins(4);
		
		System.out.println("-----------------");
		
		System.out.println("Manchester Derby result");
		System.out.println("-----------------");
		
		ManUnited football = new ManUnited();
		
		football.homeTeam();
		football.homeTeamScore(0);
		System.out.println("-----------------");
		football.awayTeam();
		football.awayTeamScore(2);
		System.out.println("-----------------");
		System.out.println("Number of fouls committed:");
		football.numberOfFouls(6);
	}

}
