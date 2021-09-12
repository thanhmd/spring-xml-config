package com.thanh.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String team;
	private String emailAddress;

	public CricketCoach() {
		System.out.println("CricketCoach: Inside no arg constructor");
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bopwling for 15 minutes a day";
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String giveAdvices() {
		return null;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("CricketCoach: Inside inside setter method: - setFortuneService");

	}

	public void setTeam(String team) {
		this.team = team;
		System.out.println("CricketCoach: Inside inside setTeam method");

	}

}
