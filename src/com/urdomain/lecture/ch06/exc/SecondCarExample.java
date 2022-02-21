package com.urdomain.lecture.ch06.exc;

public class SecondCarExample {

	public static void main(String[] args) {
		
		SecondCar car1 = new SecondCar();
		System.out.println("company : " + car1.company);
		System.out.println("model: " + car1.model);
		System.out.println("color : " + car1.color);
		System.out.println("maxSpeed : " + car1.maxSpeed);
		
		SecondCar car2 = new SecondCar("소나타");
		System.out.println("company : " + car2.company);
		System.out.println("model: " + car2.model);
		System.out.println("color : " + car2.color);
		System.out.println("maxSpeed : " + car2.maxSpeed);
		
		SecondCar car3 = new SecondCar("소나타", "블랙");
		System.out.println("company : " + car3.company);
		System.out.println("model: " + car3.model);
		System.out.println("color : " + car3.color);
		System.out.println("maxSpeed : " + car3.maxSpeed);
		
		SecondCar car4 = new SecondCar("아반떼", "빨강", 50);
		System.out.println("company : " + car4.company);
		System.out.println("model: " + car4.model);
		System.out.println("color : " + car4.color);
		System.out.println("maxSpeed : " + car4.maxSpeed);

	}

}
