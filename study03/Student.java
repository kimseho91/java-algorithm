package study03;

import java.util.Scanner;

public class Student {
	// 1. BMI 2.Ranking 3.HowMuch 4. ReportCard
	Scanner scanner = new Scanner(System.in);
	public String getBmi(String name, double height, double weight) {
		double bmi = weight / ((height*0.01)*(height*0.01));
		String result = "";
		String eval = "";
		if(bmi > 30.0) {
			eval = "고도비만";
		}else if(bmi > 25.0) {
			eval = "비만";
		}else if(bmi > 23.0) {
			eval = "과체중";
		}else if(bmi > 18.5) {
			eval = "정상";
		}else {
			eval = "저체중";
		}
		return result = String.format("당신의 BMI 수치는 %.2f로 %s 입니다.\n",bmi,eval);
	}

	public String getRank(double[] records) {
		 // 기록
		 int[] rank = new int[3]; // 순위
		 String[] player = new String[] {"A","B","C"}; // 선수
		 for(int i = 0; i < 3 ; i++) { //순위 배열을 모두 1등으로 초기화 시켜줍니다.
			 rank[i] = 1;
			 }
		 
		 
		 for(int i = 0; i < 3 ; i++) { // 선수들 끼리의 기록를 비교해서 자신의 기록보다 크면 해당순위를 1씩 증가시켜 순위를 결정.
			 for(int j = 0 ; j < 3 ; j++) {
				 if(records[i] > records[j])
					 rank[i] = rank[i]+1;
			 }
		 }
		 for(int i = 0 ; i < 3 ; i++) { // 순위 출력문입니다.
			 
			 System.out.printf("%d등 : %s 선수기록 (%.1f초)\n",rank[i],player[i],records[i]);
		 }
		 return "";
	}
	
	public void howMuch() {
		System.out.println("얼마에요 ?");
		int price = scanner.nextInt();
		System.out.printf("%d원 입니다. \n", price);
		System.out.println("몇개 드릴까요 ?");
		int quantity = scanner.nextInt();
		int total = price*quantity;
		System.out.printf("%d개 입니다. \n 총 금액은 %d 입니다. \n", quantity,total);
		int dc = total / 10;
		int total2 = total - dc;
		if(total >= 3000) {
			System.out.println("비싸요 10%만 깍아주세요.");
			System.out.printf("그럼 %d만 주세요.\n",total2);
		}else {
			System.out.println("감사합니다.\n");
		}
	}
	
	public void getReportCard() {
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
		int sum = kor+eng+math;
		int average = (kor + eng + math) / 3;
		if (average >= 90) {
			System.out.printf("%s님은 %s %d점 %s %d점 %s %d점 총점 %d점 평균 %d점으로 장학생 입니다.\n",name,subjects[0],kor,subjects[1],eng,subjects[2],math,sum,average);
		} else if (average >= 70 && average < 90) {
			System.out.printf("%s님은 %s %d점 %s %d점 %s %d점 총점 %d점 평균 %d점으로 합격 입니다.\n",name,subjects[0],kor,subjects[1],eng,subjects[2],math,sum,average);
		} else {
			System.out.printf("%s님은 %s %d점 %s %d점 %s %d점 총점 %d점 평균 %d점으로 불합격 입니다.\n",name,subjects[0],kor,subjects[1],eng,subjects[2],math,sum,average);
		}
	}
	
}
