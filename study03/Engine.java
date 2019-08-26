package study03;

import java.util.Scanner;
import study03.Student;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		int flag = 0;
		while (true) {
			System.out.println("메뉴: 0.종료  1.BMI 2.Ranking 3.HowMuch 4.ReportCard 5. ");
			flag = scanner.nextInt();
			switch (flag) {
			case 0:
				System.out.println("종료합니다.");
				return;
			case 1:
				System.out.println("1.BMI");
				System.out.println("BMI를 계산해드립니다.\n이름을 입력하세요.");
				String name = scanner.next();
				System.out.println("키를 입력해주세요.");
				double height = scanner.nextDouble();
				System.out.println("몸무게를 입력해주세요.");
				double weight = scanner.nextDouble();
				String result = student.getBmi(name, height, weight);
				System.out.println(result);
				break;
			case 2:
				System.out.println("2.Ranking");
				double[] records = new double[3];
				for(int i = 0; i <3 ; i++) { // 순위 배열에 선수의 기록를 3번 입력받습니다.
					 System.out.println("선수 기록을 입력해주세요.");
					 records[i] = scanner.nextDouble();
					 System.out.printf("선수 기록 : %.1f\n",records[i]);
					 result = student.getRank(records);
					 break;
				}
				 /*for(int i = 0; i <3 ; i++) { // 순위 배열에 선수의 기록를 3번 입력받습니다.
					 System.out.printf("%s선수 기록을 입력해주세요.\n",player[i]);
					 records[i] = scanner.nextDouble();
					 System.out.printf("%s선수 기록 : %.1f\n",player[i],records[i]);
					 */
			case 3:
				System.out.println("3.HowMuch");
				student.howMuch();
				break;
			case 4:
				System.out.println("4.ReportCard");
				student.getReportCard();
				break;
			}
		}
	}
}
