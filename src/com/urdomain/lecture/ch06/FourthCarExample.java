package com.urdomain.lecture.ch06;

public class FourthCarExample {
	public static void main(String[] args) {
		
		FourthCar fourthCar = new FourthCar();
		
		fourthCar.setGas(3);
		
		boolean gasState = fourthCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			fourthCar.run();
		}
		
		if(fourthCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}
		else {
			System.out.println("gas를 주입하세요");
		}
	
	}

}
