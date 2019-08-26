package study01;
import java.util.Scanner;
public class Print5Times {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("0. 종료, 1. 계산기, 2. 달력");
			int flag = sc.nextInt();
			switch(flag) {
			case 0 :
				System.out.println("시스템 종료");
				return;
			case 1 :
				System.out.println("시스템 진행");
				break;
			}
			System.out.println("안녕");
		}

	}

}