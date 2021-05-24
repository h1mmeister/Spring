package com.himanshu.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// default constructor
	public CricketCoach() {
		System.out.println("Cricket");
	}
	
	// setter method
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice batting!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
