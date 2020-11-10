package com.mani.spring_bean_scopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class SpringBeanScopesDemoApp 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring Bean Scopes : Hello World!" );
        
        //load the spring configuration file 
        
       // ClassPathXmlApplicationContext context =
        //		new ClassPathXmlApplicationContext("applicationContext.xml");  //Application context=spring container
        
        ClassPathXmlApplicationContext context =
        		new ClassPathXmlApplicationContext("prototypeScope-applicationContext.xml");  //Application context=spring container
        
        //retrieve the beans from spring container
        
        Coach theCoach = context.getBean("myCoach", Coach.class);
        
        Coach myCoach = context.getBean("myCoach", Coach.class);
        
        
        //test with the scope "singleton"
        boolean result = (theCoach==myCoach);
        
        System.out.println("\nis the same instance is used by both theCoach & myCoach ? "+result);  //pointing to the same object
         
        System.out.println("\nMemory location of theCoach: "+theCoach);
        
        System.out.println("\nMemory location of myCoach :  "+myCoach);


        
      
    }
}
