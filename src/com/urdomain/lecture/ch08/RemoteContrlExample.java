package com.urdomain.lecture.ch08;

public class RemoteContrlExample {

	public static void main(String[] args) {
		
		Audio audio = new Audio();
		Television television = new Television();
		
		audio.turnOn();
		
		//인터페이스를 구현한 클래스는 위에처럼 일반 클래스 객체 만들듯이 하면 안된다.
		//audio.turnOn();
		
		//인터페이스를 구현한 클래스를 사용해야 한다. 
		RemoteControl remoteControl;	//인터페이스 변수 선언
		remoteControl = new Audio();	//구현객체로 초기화
		
		RemoteControl remoteControl2 = new Audio();	//이걸 더 많이 사용
		
		remoteControl.turnOn();

	}

}
