package com.sudarshan.spring_Annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class mediaTreak implements mobileProcessor {

	public void process()
	{
		System.out.println("This is 2nd best Processor");
	}

}
