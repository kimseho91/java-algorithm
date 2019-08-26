package homework02;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("연도를 넣으면 윤년인지 아닌지를 판단해드립니다.");
		int input = scanner.nextInt();
		if(input % 4 == 0 && input % 100 != 0 || input % 400 ==0) {
			System.out.printf("%d년은 윤년입니다. \n",input);
		}else {
			System.out.printf("%d년은 평년입니다.",input);
		}
	}

}
