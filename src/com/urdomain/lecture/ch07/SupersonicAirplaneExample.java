package com.urdomain.lecture.ch07;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		
		SupersonicAirplane supersonicAirplane = new SupersonicAirplane();
		
		supersonicAirplane.takeOff();
		supersonicAirplane.fly();
		supersonicAirplane.flyMod = supersonicAirplane.SUPERSONIC;
		supersonicAirplane.fly();
		supersonicAirplane.flyMod = supersonicAirplane.NORMAL;
		supersonicAirplane.fly();
		supersonicAirplane.land();
		
		/////////////////////////////////
		//상수파일 생성 후 코드
		supersonicAirplane.takeOff();
		supersonicAirplane.fly();
		supersonicAirplane.flyMod = Constants.SUPERSONIC;
		supersonicAirplane.fly();
		supersonicAirplane.flyMod = Constants.NORMAL;
		supersonicAirplane.fly();
		supersonicAirplane.land();
		
	}	
}
