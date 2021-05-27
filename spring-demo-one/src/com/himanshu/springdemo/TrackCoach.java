package com.himanshu.springdemo;

public class TrackCoach implements Coach {
	
	// define a private field for dependency
	private FortuneService fortuneService;
	
	// define constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService ) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

	// add an init method
	public void doMyStartupStuff() {
		System.out.println(" Inside Startup ");
	}
	
	
	// add a destroy method - custom hook
	public void doMyCleanupStuff() {
		System.out.println(" Inside Cleanup ");
	}
}
