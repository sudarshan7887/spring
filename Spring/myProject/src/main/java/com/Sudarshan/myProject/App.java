package com.Sudarshan.myProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	//xml based configuration
    	
//    	Vehicle obj =(Vehicle)context.getBean("vehicle");
//    	obj.drive();    	
    	
    	//Anotation based configuration
//    	Vehicle obj =(Vehicle)context.getBean("bike");
//    	obj.drive();  
    	
    	//Add property tag    	
    	Tyre t = (Tyre)context.getBean("tyre");
    	System.out.println(t);
    	
    }
}
