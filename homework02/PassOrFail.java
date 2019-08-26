package homework02;

import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("평균 점수를 계산해서 합격 여부를 알려드립니다.");
		String[] subjects = { "국어", "영어", "수학" };
		String name = "";
		System.out.println("이름을 입력하세요.");
		name = scanner.next();
		System.out.printf("%s 점수를 입력하세요\n", subjects[0]);
		int kor = scanner.nextInt();
		System.out.printf("%s 점수를 입력하세요\n", subjects[1]);
		int eng = scanner.nextInt();
		System.out.printf("%s 점수를 입력하세요\n", subjects[2]);
		int math = scanner.nextInt();
		double average = (kor + eng + math) / 3;
		int sum = kor+eng+math;
		if (average >= 90) {
			System.out.printf("%s님은 %s %d점 %s %d점 %s %d점 총점 %d점 평균 %.0f점으로 장학생 입니다.",name,subjects[0],kor,subjects[1],eng,subjects[2],math,sum,average);
		} else if (average >= 70 && average < 90) {
			System.out.printf("%s님은 %s %d점 %s %d점 %s %d점 총점 %d점 평균 %.0f점으로 합격 입니다.",name,subjects[0],kor,subjects[1],eng,subjects[2],math,sum,average);
		} else {
			System.out.printf("%s님은 %s %d점 %s %d점 %s %d점 총점 %d점 평균 %.0f점으로 불합격 입니다.",name,subjects[0],kor,subjects[1],eng,subjects[2],math,sum,average);
		}
	}

}
