package com.urdomain.lecture.ch08;

public class RemoteControlExample2 {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("asdfasdf");
				
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setVolume(int voluem) {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		rc.turnOn();

	}

}
