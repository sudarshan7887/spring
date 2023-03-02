package com.sudarshan.demo;

public class tyre {

	private String brand;

	//getter and setters injection
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "tyre [brand=" + brand + "]";
	}

	//Constructor injection
	public tyre(String brand) {
		super();
		this.brand = brand;
	}
	
}
