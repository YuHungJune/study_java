package com.urdomain.lecture.ch06.exc;

public class Point {
	
	String Name;		//유저 이름
	double point;		//포인트
	double pointUsed;	//사용할 포인트 점수
	int memberDegree;	//일반, 브론즈, 실버, 골드, 플레티넘
	int MemberSeq;		//유저 sequence
	int productPrice;
	
	public int useMyPoint(double point, int pointUsed, int productPrice) {
		
		if(point >= 1000 && productPrice <= productPrice) {
			productPrice -= pointUsed;
			point -= pointUsed;
		}
		
		return pointUsed;
	}
	
	public int pointUse(int MemberSeq, int memberDegree, double point, int pointUsed, int productPrice) {
			
		int subprice = useMyPoint(point, pointUsed, productPrice);
		productPrice -= subprice;
		
		return productPrice;	
		
	}
	
	public double pointAdd(int MemberSeq, int memberDegree, double point, int productPrice) {
		
		
		int price = pointUse(point, pointUsed, productPrice);
		switch(memberDegree) {
		case 1:
			price = price * 1.01;
			break;
		case 2:
			price = price * 1.02;
			break;
		case 3:
			price = price * 1.03;
			break;
		case 4:
			price = price * 1.04;
			break;
		case 5:
			price = price * 1.05;
			break;
		case 6:
			price = price * 1.06;
			break;
		default:
				break;
		}
		
		return point;
	}

}
