package com.urdomain.lecture.ch06.exc;

public class SixthCar {
	String model;
	int speed;
	
	SixthCar(String model){
		this.model = model;
	}
	
	public void setSpped(int speed) {
		this.speed = speed;
	}
	
	public void run() {
		for(int i = 10; i <= 50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속 : "+ this.speed + "km/h)" );
		}
	}

}