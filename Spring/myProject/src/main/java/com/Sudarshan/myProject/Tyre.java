package com.Sudarshan.myProject;

public class Tyre 
{
	private String brand;

	//constructor
	public Tyre(String brand) {
		super();
		this.brand = brand;
	}

	//getters and setters
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	//toString
	@Override
	public String toString() {
		return "tyre [brand=" + brand + "]";
	}
	
	
}
