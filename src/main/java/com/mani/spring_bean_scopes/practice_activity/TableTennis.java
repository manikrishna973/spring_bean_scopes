package com.mani.spring_bean_scopes.practice_activity;

import com.mani.spring_bean_scopes.Coach;
import com.mani.spring_bean_scopes.RandomFortuneService;

public class TableTennis implements Coach{

	
	private com.mani.spring_bean_scopes.RandomFortuneService fortuneService;
	
	
	public TableTennis(RandomFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "practice two hours everyday ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
