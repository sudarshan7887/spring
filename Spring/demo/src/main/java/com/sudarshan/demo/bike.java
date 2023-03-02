package com.sudarshan.demo;

import org.springframework.stereotype.Component;

@Component
public class bike implements vehicle {
public void Drive() 
{
	System.out.println("ridding a Bike");
}
}
