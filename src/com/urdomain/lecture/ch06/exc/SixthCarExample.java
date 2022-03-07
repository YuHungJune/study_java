package com.urdomain.lecture.ch06.exc;

public class SixthCarExample {
	
	static String name = "유형준";

	public static void main(String[] args) {
		name = "bathory08";
		
		SixthCar myCar = new SixthCar("포르쉐");
		SixthCar yourCar = new SixthCar("벤츠");
		
		myCar.run();
		yourCar.run();

	}

	public static void print(String msg) {
		System.out.println(msg);
	}
}
