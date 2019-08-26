package homework02;

import java.util.Scanner;

public class MonthEndDay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하면 해당 월이 몇일까지 인지 알려드립니다.");
		int month = scanner.nextInt();
		String day = "";
		String result = "";
		switch (month) {
		case 1 : case 5 : case 7 : case 8 : case 10 : case 12 :
			day = "31일";
			break;
		case 3 : case 4 : case 9 : case 11 :
			day = "30일";
			break;
		case 2 : case 6 :
			day = "29일";
			break;
		}
		result =String.format("%d월은 %s일 입니다.",month,day);
	}

}
