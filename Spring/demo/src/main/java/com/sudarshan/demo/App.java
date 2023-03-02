package com.sudarshan.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        
 //    vehicle obj = (vehicle)context.getBean("vehicle");     //xml based configuration

//        vehicle obj = (vehicle)context.getBean("car");
        
     // vehicle obj = (vehicle)context.getBean("bike");
    //obj.Drive();
        
        tyre t = (tyre)context.getBean("tyre");
        System.out.println(t);
    }
}
