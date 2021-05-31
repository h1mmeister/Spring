package com.himanshu.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myTennisCoach")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("Inside default constructor!");
	}
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) { // constructor injection
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) { // setter injection
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public void setWhatever(FortuneService fortuneService) { // method injection
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Play Tennis regularly";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
