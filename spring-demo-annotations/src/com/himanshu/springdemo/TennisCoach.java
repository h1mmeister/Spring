package com.himanshu.springdemo;

import org.springframework.stereotype.Component;

@Component("myTennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Play Tennis regularly";
	}

}
