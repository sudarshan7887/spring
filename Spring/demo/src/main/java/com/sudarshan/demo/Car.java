package com.sudarshan.demo;

import org.springframework.stereotype.Component;

@Component
public class Car implements vehicle {
public void Drive()
{
	System.out.println("Drive a Car");
}
}
