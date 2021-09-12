package com.thanh.springdemo;

public class BaseBallCoach implements Coach {
	private FortuneService fortuneService;

	public BaseBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Keep practing";
	}

	@Override
	public String giveAdvices() {
		// TODO Auto-generated method stub
		return "Dont give up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
