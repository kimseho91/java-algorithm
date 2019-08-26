package homework02;
import java.lang.Math;
import java.util.Scanner;
import java.lang.System;
public class Tax {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("당신의 세금을 계산해드립니다.");
		System.out.println("현재의 세율을 입력해주세요.");
		double tax = scanner.nextDouble();
		System.out.println("이름을 입력해주세요.");
		String name = scanner.next();
		System.out.println("당신의 월급을 입력해주세요.");
		int Salary = scanner.nextInt();
		double tax1 = (Salary*12)/tax ;
//		double tax2 = Math.round((tax1*100)/100.0);
		System.out.printf("연봉 %d만원을 받으시는 %s님께서 납부할 세금은 %.2f만원입니다.",Salary,name,tax1);
	}

}
/**To 개발자님

클라이언트에서 프로그램 개발 요청이 왔습니다.
이름과 연봉을 입력받아서
연봉 ***만원을 받으시는 XXX님께서 납부할 세금은 ???만원입니다.
로 출력하는 프로그램을 만들어 주세요.
단) 세율이 정책이 바뀔 때 마다 변하니,
관리자가 쉽게 적용가능하도록 만들어 주세요.
현재는 세율이 9.7프로라고 합니다.� �ּ���.
����� ������ 9.7���ζ�� �մϴ�.
*/