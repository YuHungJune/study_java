package com.urdomain.lecture.ch06;

public class FinalCarExample {

	public static void main(String[] args) {
		
		FinalCar finalCar = new FinalCar();
		
		finalCar.setSpeed(50);
		System.out.println("현재 속도 : " + finalCar.getSpeed());
		
		finalCar.setSpeed(60);
		
		if(!finalCar.isStop()) {
			finalCar.setStop(true);
		}
		
		System.out.println("현재 속도 : " + finalCar.getSpeed());
		

	}

}
