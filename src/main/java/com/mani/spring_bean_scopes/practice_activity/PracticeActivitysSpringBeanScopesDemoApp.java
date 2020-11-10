package com.mani.spring_bean_scopes.practice_activity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mani.spring_bean_scopes.Coach;

/**
 * Hello world!
 *
 */
public class PracticeActivitysSpringBeanScopesDemoApp 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring Bean Scopes : Hello World!" );
        
        //load the spring configuration file 
        
       // ClassPathXmlApplicationContext context =
        //		new ClassPathXmlApplicationContext("applicationContext.xml");  //Application context=spring container
        
        ClassPathXmlApplicationContext context =
        		new ClassPathXmlApplicationContext("beanScopePracticeActivity-applicationContext.xml");  //Application context=spring container
        
        //retrieve the beans from spring container
        
        Coach theCoach = context.getBean("myPracticeCoach", Coach.class);
        
        Coach myCoach = context.getBean("myPracticeCoach", Coach.class);
        
        
        //test with the scope "singleton"
        boolean result = (theCoach==myCoach);
        
        System.out.println("\nis the same instance is used by both theCoach & myCoach ? "+result);  //pointing to the same object
         
        System.out.println("\nMemory location of theCoach: "+theCoach);
        
        System.out.println("\nMemory location of myCoach :  "+myCoach);
        
        System.out.println("\n"+theCoach.getDailyFortune());
        
        System.out.println("\n"+myCoach.getDailyFortune());


        
      
    }
}
