package homework03;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		String result = "";
		while (true) {
			System.out.println("0.종료  1.ArithmeticCalculator 2.BMI 3.HowMuch 4.Join 5.LeapYear 6.MonthEndDay\n"
					+ "7.PassOfFail 8.Ranking 9.ReportCard 10.ScoreCalc 11.Tax 12.TimeCalc");
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				System.out.println("1. ArithmeticCalculator");
				System.out.println("계산기를 시작합니다.\n1.더하기, 2.빼기, 3.곱하기, 4.나누기, 5.종료 \n원하는걸 숫자로 입력해주세요.");
				int choice = scanner.nextInt();
				System.out.println("계산할 값의 처음 수를 입력하세요.");
				String input = scanner.next();
				System.out.println("계산할 값의 두번째 수를 입력하세요.");
				String input2 = scanner.next();
				result = student.getArithmeticCalculator(choice, input, input2);
				System.out.println(result);
				break;
			case 2:
				System.out.println("2.BMI");
				System.out.println("BMI를 계산해드립니다.\n키를 입력해주세요.");
				int height = scanner.nextInt();
				System.out.println("몸무게를 입력해주세요.");
				int weight = scanner.nextInt();
				result = student.getBmi(height, weight);
				System.out.println(result);
				break;
			case 3:
				System.out.println("3.HowMuch");
				System.out.println("얼마에요 ?");
				int price = scanner.nextInt();
				System.out.printf("%d원 입니다. \n", price);
				System.out.println("몇개 드릴까요 ?");
				int quantity = scanner.nextInt();
				result = student.HowMuch(price, quantity);
				System.out.println(result);
				break;
			case 4:
				System.out.println("Join");
				System.out.println("아이디를 입력하세요.");
				String id = scanner.next();
				System.out.println("비밀번호를 입력하세요.");
				String pw = scanner.next();
				System.out.println("이름을 입력하세요.");
				String name = scanner.next();
				System.out.println("생년월일을 입력하세요.");
				String dob = scanner.next();
				System.out.println("혈액형을 입력하세요.");
				String blood = scanner.next();
				System.out.println("소수점 첫번째 자리까지 키를 입력해주세요.");
				double height1 = scanner.nextDouble();
				System.out.println("소수점 첫번째 자리까지 몸무게를 입력해주세요.");
				double weight1 = scanner.nextDouble();
				System.out.println("성인 여부를 입력해주세요.true 또는 false");
				boolean isAdult = scanner.hasNext();
				result = student.Join(id, pw, name, dob, blood, height1, weight1, isAdult);
				System.out.println(result);
				break;
			case 5:
				System.out.println("LeapYear");
				System.out.println("연도를 넣으면 윤년인지 아닌지를 판단해드립니다.");
				int input1 = scanner.nextInt();
				result = student.getLeapYear(input1);
				break;
			case 6:
				System.out.println("MonthEndDay");
				System.out.println("월을 입력하면 해당 월이 몇일까지 인지 알려드립니다.");
				int month = scanner.nextInt();
				result = student.getMonthEndDay(month);
				System.out.println(result);
				break;
			case 7:
				System.out.println("PassOfFail");
				String[] subjects = { "국어", "영어", "수학" };
				System.out.println("평균 점수를 계산해서 합격 여부를 알려드립니다.");
				System.out.println("이름을 입력하세요.");
				name = scanner.next();
				System.out.printf("%s 점수를 입력하세요\n", subjects[0]);
				int kor = scanner.nextInt();
				System.out.printf("%s 점수를 입력하세요\n", subjects[1]);
				int eng = scanner.nextInt();
				System.out.printf("%s 점수를 입력하세요\n", subjects[2]);
				int math = scanner.nextInt();
				result = student.getPassOfFail(name, kor, eng, math);
				System.out.println(result);
				break;
			case 8:
				System.out.println("Raikin");
				double[] records = new double[3];
				String[] player = new String[] { "A", "B", "C" };
				for (int i = 0; i < 3; i++) { // 순위 배열에 선수의 기록를 3번 입력받습니다.
					System.out.printf("%s선수 기록을 입력해주세요.\n", player[i]);
					records[i] = scanner.nextDouble();
					System.out.printf("%s선수 기록 : %.1f\n", player[i], records[i]);
				}
				result = student.getRanking(records);
				System.out.println(result);
				break;
			case 9:
				System.out.println("ReportCard");
				String[] subjects1 = { "국어", "영어", "수학" };
				System.out.println("이름을 입력하세요.");
				name = scanner.next();
				System.out.printf("%s 점수를 입력하세요\n", subjects1[0]);
				kor = scanner.nextInt();
				System.out.printf("%s 점수를 입력하세요\n", subjects1[1]);
				eng = scanner.nextInt();
				System.out.printf("%s 점수를 입력하세요\n", subjects1[2]);
				math = scanner.nextInt();
				result = student.getReportCard(name, kor, eng, math);
				System.out.println(result);
				break;
			case 10:
				System.out.println("ScoreCalc");
				System.out.println("더하시려는 숫자를 입력하세요.(종료는 -1)");
				int input4 = scanner.nextInt();
				result = student.getScoreCalc(input4);
				System.out.println(result);
				break;
			case 11:
				System.out.println("Tax");
				System.out.println("현재의 세율을 입력해주세요.");
				double tax = scanner.nextDouble();
				System.out.println("이름을 입력해주세요.");
				name = scanner.next();
				System.out.println("당신의 연봉을 입력해주세요.");
				int money = scanner.nextInt();
				result = student.getTax(tax, name, money);
				System.out.println(result);
				break;
			case 12:
				System.out.println("TimeCalc");
				System.out.println("초를 입력하세요");
				int sc = scanner.nextInt();
				result = student.getTimeCalc(sc);
				System.out.println(result);
				break;
			}
		}

	}
}
