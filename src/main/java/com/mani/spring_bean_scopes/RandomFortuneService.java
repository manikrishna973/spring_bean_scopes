package com.mani.spring_bean_scopes;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private Random random = new Random();
	String[] fortuneData= {"Its Your Lucky Day", "Do what you love","Look for happiness"};
	
	@Override
	public String getDailyFortune() {
		int index=this.random.nextInt(fortuneData.length);
		String randomFortune = fortuneData[index];
		
		return randomFortune;
	}

}
