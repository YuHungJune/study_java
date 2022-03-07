package com.urdomain.lecture.ch06;

public class SeventhCar {

	//int speed = 0;	//error
	static int speed = 0;
	int speed2 = 0;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	public static void main(String[] args) {
		speed = 10;		//static변수만 사용 가능
		SeventhCar seventhCar = new SeventhCar();
		seventhCar.speed2 = 10;
		seventhCar.run();

	}

}
