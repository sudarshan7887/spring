package com.Sudarshan.myProject;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle
{
	public void drive()
	{
		System.out.println("Drive a Car...");
	}
}
