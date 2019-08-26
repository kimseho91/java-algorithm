package homework03;

import java.util.Scanner;

public class Student {
	Scanner scanner = new Scanner(System.in);
	String result = "";

	public String getArithmeticCalculator(int choice, String input, String input2) {
		int res = Integer.parseInt(input) % Integer.parseInt(input2);
		while (true) {
			switch (choice) {
			case 5:
				return "";
			}
			
			int sum = Integer.parseInt(input) + Integer.parseInt(input2);
			int sum2 = Integer.parseInt(input) - Integer.parseInt(input2);
			int sum3 = Integer.parseInt(input) * Integer.parseInt(input2);
			int sum4 = Integer.parseInt(input) / Integer.parseInt(input2);

			switch (choice) {
			case 1:
				result = input + "+" + input2 + "=" + sum;
				break;
			case 2:
				result = input + "-" + input2 + "=" + sum2;
				break;
			case 3:
				result = input + "X" + input2 + "=" + sum3;
				break;
			case 4:
				result = input + "/" + input2 + "=" + sum4+"["+res+"]";
				break;
			}
			return result;
		}
	}

	public String getBmi(int height, int weight) {
		double bmi = weight / ((height * 0.01) * (height * 0.01));
		String eval = "";
		if (bmi > 30.0) {
			eval = "고도비만";
		} else if (bmi > 25.0) {
			eval = "비만";
		} else if (bmi > 23.0) {
			eval = "과체중";
		} else if (bmi > 18.5) {

			eval = "정상";
		} else {
			eval = "저체중";
		}
		return result = String.format("당신의 BMI 수치는 %.2f으로 %s 입니다.", bmi, eval);
	}

	public String HowMuch(int price, int quantity) {
		int total = price * quantity;
		System.out.printf("%d개 입니다. \n 총 금액은 %d 입니다. \n", quantity, total);
		int dc = total / 10;
		int total2 = total - dc;
		if (total >= 3000) {
			System.out.println("비싸요 10%만 깍아주세요.");
			System.out.printf("그럼 %d만 주세요.\n", total2);
		} else {
			System.out.println("감사합니다.");
		}
		return result;

	}

	public String Join(String id, String pw, String name, String dob, String blood, double height1,
			double weight1, boolean isAdult) {
		isAdult = true;
		 String eval = "";
		System.out.println("===== 회원가입 =====");
		if (isAdult == true) {
			eval = "성인입니다.";
		} else {
			eval = "미성년자 입니다.";
		}return result = String.format("아이디:%s \n비밀번호:%s \n이름:%s \n생년원일:%s \n성인여부:%s \n키:%.1fcm \n 몸무게:%.1fkg \n 혈액형:%s형", id, pw,
				name, dob, eval, height1, weight1, blood);
	}

	public String getLeapYear(int input1) {
		String eval = "";
		if (input1 % 4 == 0 && input1 % 100 != 0 || input1 % 400 == 0) {
			eval = input1+"년은 윤년입니다.";
		} else {
			eval = input1+"년은 평년입니다.";
		}
		return result;
	}

	public String getMonthEndDay(int month) {
		
		String day = "";
		switch (month) {
		case 1:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = "31일";
			break;
		case 3:
		case 4:
		case 9:
		case 11:
			day = "30일";
			break;
		case 2:
		case 6:
			day = "29일";
			break;
		}
		return result = String.format("%d월은 %s 입니다.", month, day);
	}

	public String getPassOfFail(String name, int kor, int eng, int math) {
		String[] subjects = { "국어", "영어", "수학" };
		double average = (kor + eng + math) / 3;
		int sum = kor + eng + math;
		String eval = "";
		if (average >= 90) {
			eval = String.format("%s님은 %s %d점 %s %d점 %s %d점 총점 %d점 평균 %.0f점으로 장학생 입니다.", name, subjects[0], kor,
					subjects[1], eng, subjects[2], math, sum, average);
		} else if (average >= 70 && average < 90) {
			eval = String.format("%s님은 %s %d점 %s %d점 %s %d점 총점 %d점 평균 %.0f점으로 합격 입니다.", name, subjects[0], kor,
					subjects[1], eng, subjects[2], math, sum, average);
		} else {
			eval = String.format("%s님은 %s %d점 %s %d점 %s %d점 총점 %d점 평균 %.0f점으로 불합격 입니다.", name, subjects[0], kor,
					subjects[1], eng, subjects[2], math, sum, average); 
		}
		return result = eval;
	}

	public String getRanking(double[] records) {
		String eval = "";
		records = new double[3]; // 기록
		int[] rank = new int[3]; // 순위
		String[] player = new String[] { "A", "B", "C" }; // 선수
		for (int i = 0; i < 3; i++) { // 순위 배열을 모두 1등으로 초기화 시켜줍니다.
			rank[i] = 1;
		}
		for (int i = 0; i < 3; i++) { // 선수들 끼리의 기록를 비교해서 자신의 기록보다 크면 해당순위를 1씩 증가시켜 순위를 결정.
			for (int j = 0; j < 3; j++) {
				if (records[i] > records[j])
					rank[i] = rank[i] + 1;
			}
		}
		for (int i = 0; i < 3; i++) { // 순위 출력문입니다.
			eval = String.format("%d등 : %s 선수기록 (%.1f초)\n", rank[i], player[i], records[i]);
		}
		return result = eval;
	}

	public String getReportCard(String name, int kor, int eng, int math) {
		System.out.println("평균 점수를 계산해서 합격 여부를 알려드립니다.");
		String[] subjects1 = { "국어", "영어", "수학" };
		String eval = "";
		int sum = kor + eng + math;
		int average = (kor + eng + math) / 3;
		if (average >= 90) {
			eval = String.format("%s님은 %s %d점 %s %d점 %s %d점 총점 %d점 평균 %d점으로 장학생 입니다.", name, subjects1[0], kor, subjects1[1],
					eng, subjects1[2], math, sum, average);
		} else if (average >= 70 && average < 90) {
			eval = String.format("%s님은 %s %d점 %s %d점 %s %d점 총점 %d점 평균 %d점으로 합격 입니다.", name, subjects1[0], kor, subjects1[1],
					eng, subjects1[2], math, sum, average);
		} else {
			eval = String.format("%s님은 %s %d점 %s %d점 %s %d점 총점 %d점 평균 %d점으로 불합격 입니다.", name, subjects1[0], kor, subjects1[1],
					eng, subjects1[2], math, sum, average);
		}
		return result = eval;
	}

	public String getScoreCalc(int input4) {
		String sequence = "";
		int sum = 0, average = 0;
		while (true) {
			if (input4 == -1) {
				sequence += " = ";
				break;
			}
			if (sum == 0) {
				sequence += input4;
			} else {
				sequence += " + " + input4;
			}
			average++;
			sum += input4;
	}
		return result = String.format("현재까지의 누적값은  %s %d 이고, 평균은 %d 입니다.", sequence, sum, sum / average);
	}

	public String getTax(double tax, String name, int money) {
		System.out.println("당신의 세금을 계산해드립니다.");
		double tax1 = money / tax;
//		double tax2 = Math.round((tax1*100)/100.0);
		return result =String.format("연봉 %d만원을 받으시는 %s님께서 납부할 세금은 %.2f만원입니다.", money, name, tax1);
	}

	public String getTimeCalc(int sc) {
		int seconds = sc % 3600 % 60;
		int minutes = sc % 3600 / 60;
		int hour = sc / 3600;
		return result = String.format("%d시 %d분 %d초 입니다.", hour, minutes, seconds);
	}

}