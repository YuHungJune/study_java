package com.urdomain.lecture.ch06.exc;

public class SecondCar {

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed = 0;

	public SecondCar() {

	}

	public SecondCar(String model) {
		this.model = model;

	}

	public SecondCar(String model, String color) {
		this.model = model;
		this.color = color;

	}

	public SecondCar(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		maxSpeed = maxSpeed;

	}
}
