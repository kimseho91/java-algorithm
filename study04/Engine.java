package study04;

import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		while (true) {
			System.out.println("0.종료 1. BMI 2.이해못할문제");
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				System.out.println("BMI");
				String name = scanner.next();
				double height = scanner.nextDouble();
				double weight = scanner.nextDouble();
				String result = student.getBmi(name, height, weight);
				System.out.println(result);
				break;
			case 2:
				System.out.println("이해못할문제");
				System.out.println("이름 입력");
				name = scanner.next();
				System.out.println("주소 입력");
				String adress = scanner.next();
				System.out.println("신용등급");
				String credit = scanner.next();
				System.out.println("나이");
				int age = scanner.nextInt();
				System.out.println("은행잔고");
				int money = scanner.nextInt();
				result = student.daechul(name, adress, credit, age, money);
				// 이름, 주소, 나이, 은행잔고, 신용도
				// 결과가 뭘 넣든간에 1억 대출
				System.out.println(result);
				break;
			}
		}
	}

}
