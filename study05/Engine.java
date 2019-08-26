package study05;

import javax.swing.JOptionPane;

public class Engine {

	public static void main(String[] args) {
		
		Member member = null;
		Service service = new Service();
		while (true) {
			switch (JOptionPane.showInputDialog("0.종료 1.회원가입  2.마이페이지  3.아이디찾기  4.체질량지수 5.성적  6.세금")) {
			case "0":
				System.out.println("종료");
				return;
			case "1":
				member = new Member();
				member.setId(JOptionPane.showInputDialog("ID 입력"));
				member.setPw(JOptionPane.showInputDialog("PW 입력"));
				member.setName(JOptionPane.showInputDialog("이름 입력"));
				System.out.println("주민번호 입력하세요.");
//				member.setSsn(scanner.next());
				System.out.println("혈액형을 입력하세요.");
//				member.setBlood(scanner.next());
				System.out.println("소수점 첫번째 자리까지 키를 입력해주세요.");
//				member.setHeight(scanner.nextDouble());
				System.out.println("소수점 첫번째 자리까지 몸무게를 입력해주세요.");
//				member.setWeight(scanner.nextDouble());
				System.out.println("국어점수");
//				member.setKor(scanner.nextInt());
				System.out.println("영어점수");
//				member.setEng(scanner.nextInt());
				System.out.println("수학점수");
//				member.setMath(scanner.nextInt());
				System.out.println("연봉");
//				member.setSalary(scanner.nextDouble());
				System.out.println("세율");
//				member.setTax(scanner.nextDouble());
				break;
			case "2": 
				System.out.println(member.toString());
				break;
//			case "3":
//				System.out.println("아이디, 이름을  입력하면 비번 알려줌");
//				String searchName = scanner.next();
//				String searchId = scanner.next();
//				if(searchName.equals("a")&&
//						searchId.equals("a")) {
//					System.out.printf("찾는 아이디 : %s의 \n"
//							+"비밀번호: %s \n",member.getId(),member.getPw());
//				}else {
//					System.out.println("정보가 틀렸습니다.");
//				}
//				break;
			case "4":
				System.out.println("체질량지수 구하기");
				System.out.println(service.getBmi(member));
				break;
			case "5":
				System.out.println("성적 구하기");
				System.out.println(service.getReportCard(member));
				break;
			case "6":
				System.out.println("세금 구하기");
				System.out.println(service.getTax(member));
				break;
			}
		}
		
	}

}
