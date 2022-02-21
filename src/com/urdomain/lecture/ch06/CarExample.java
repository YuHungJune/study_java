package com.urdomain.lecture.ch06;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.model = "제네시스";
		car.color = "블랙";
		
		System.out.println("company : " + car.name);
		System.out.println("model : " + car.model);
		System.out.println("color : " + car.color);
		System.out.println("maxSpeed : " + car.maxSpeed);
		System.out.println("speed : " + car.speed);

	}

}
