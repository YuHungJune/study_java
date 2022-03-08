import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("원의 반지름: ");
		double param = input.nextDouble();
		
		Calculator circle1 = new Calculator();
		System.out.println("\nCalculator 객체의 원면적 구하는 프로그램 실행\n원면적: " + circle1.circleArea(param));
		
		Computer circle2 = new Computer();
		System.out.print("\nComputer 객체의 원면적 구하는 프로그램 실행\n원면적: " + circle2.circleArea(param));
	}

}
