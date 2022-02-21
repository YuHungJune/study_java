package com.urdomain.lecture.ch06.exc;

public class Login {
	
	String ID;
	String password;
	String re_password;
	boolean Admin;
	
	public String login(String ID, String password, boolean Admin){
		
		int Ny = 0;
		
		String result = "로그인 되엇습니다.";
		return result;
	}
	
	public void logout() {
		
	}
	
	public String password(String password, String re_password) {
		
		int Ny = 0;
		String result;
		if(Ny == 1)
			result = "비밀번호가 사용가능.";
		else
			result = "비밀번호가 틀립니다.";
		return result;
	}
	
	

}
