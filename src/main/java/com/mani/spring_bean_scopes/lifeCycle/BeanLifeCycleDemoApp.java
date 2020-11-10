package com.mani.spring_bean_scopes.lifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
	
	public static void main(String[] args) {
		
	    //load the spring configuration file
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve beans from the spring container
		
		Coach coach = context.getBean("myCoach",Coach.class);
		
		System.out.println("\n"+coach.getDailyWorkout());
		
		
		//close the context
		context.close();
		
	}
}
