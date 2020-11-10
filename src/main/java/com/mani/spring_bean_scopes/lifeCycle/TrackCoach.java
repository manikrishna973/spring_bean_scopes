package com.mani.spring_bean_scopes.lifeCycle;


public class TrackCoach implements Coach {

	public TrackCoach() {
		System.out.println("\nTrackCoach: in no-arg constructor and instantiaties the bean TrackCoach");
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	
	//custom init & destroy method(s)
	
	//If you give a return type just note that you will not be able to capture the return
	
	//The method can have any method name.
	
	//The method can not accept any arguments. The method should be no-arg.
	
	public void doMyStartUpStuff() {
		System.out.println("\nTrackCoach: inside method doMyStartUpStuff ");
	}
	
	public void doMyCleanUpStuff() {
		System.out.println("\nTrackCoach: inside method doMyCleanUpStuff ");
	}

}
