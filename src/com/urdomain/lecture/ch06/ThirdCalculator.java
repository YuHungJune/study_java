package com.urdomain.lecture.ch06;

public class ThirdCalculator {
	double x;	//가로변 길이
	double y;	//세로변 길이
	
	ThirdCalculator(){
		x = 1;
		y = 1;
	}
	
	ThirdCalculator(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	
	public double areaRectangle() {
		return x*y;
	}
	
	public double areaRectangle(double x, double y) {
		this.x = x;
		this.y = y;
		
		return x*y;
	}

}
