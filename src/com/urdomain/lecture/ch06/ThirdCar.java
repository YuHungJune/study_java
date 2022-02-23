package com.urdomain.lecture.ch06;

public class ThirdCar {

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	ThirdCar(){
		
	}
	
	ThirdCar(String model){
		this(model, null, 0);
	}
	
	ThirdCar(String model, String color){
		this(model, color, 0);
	}
	
	ThirdCar(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
