package com.urdomain.lecture.ch07;

public class ComputerExample {

	public static void main(String[] args) {
		Calculator calculator= new Calculator();
		int r = 10;
		double cal = calculator.areaCircle(10);
		
		System.out.println("원면적 : " + cal);
		
		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCircle(2));
		
		

	}

}
