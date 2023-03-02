package com.sudarshan.spring_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory = new AnnotationConfigApplicationContext(appConfig.class);
    	
    	
        Vivo y12 = factory.getBean(Vivo.class);
        y12.config();
    }
}
