package homework02;

import java.util.Scanner;

public class ScoreCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sequence = "";
		int sum = 0 , average = 0 ;
		while(true) {
			System.out.println("더하시려는 숫자를 입력하세요.(종료는 -1)");
			int input = scanner.nextInt();
			if(input == -1) {
				sequence += " = ";
				break;
			}if(sum == 0){
				sequence += input;
			}else {
				sequence += " + " + input;
			}
			average++;
			sum += input;
		}
		System.out.printf("현재까지의 누적값은  %s %d 이고, 평균은 %d 입니다.", sequence , sum , sum / average);
	}
}
