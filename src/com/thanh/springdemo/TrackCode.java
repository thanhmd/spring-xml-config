package com.thanh.springdemo;

public class TrackCode implements Coach {
	private FortuneService fortuneService;

	public TrackCode(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run hard and harder";
	}

	public String giveAdvices() {
		// TODO Auto-generated method stub
		return "learn something";
	}

	public String getDailyFortune() {
		return "Just do it " + fortuneService.getFortune();
	}

	public void doMyStartupStuff() {
		System.out.println("Do my startup stuff");
	}

	public void doMyCleanupStuff() {
		System.out.println("Do my cleanup stuff 2");
	}
}
