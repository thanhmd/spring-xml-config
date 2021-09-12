package com.thanh.springdemo;

public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Go get football";
	}

	@Override
	public String giveAdvices() {
		// TODO Auto-generated method stub
		return "Harden your skill";
	}

	@Override
	public String getDailyFortune() {
		return "football fortune";
	}

}
