package study07;

import javax.swing.JOptionPane;

public class MemberController {

	public static void main(String[] args) {

		MemberBean member = null;
		MemberService memberservice = new MemberService();
		while (true) {
			switch (JOptionPane.showInputDialog("0.종료 1.회원가입  2.마이페이지  3.체질량지수 4.세금")) {
			case "0":
				System.out.println("종료");
				return;
			case "1":
				member = new MemberBean();
				member.setId(JOptionPane.showInputDialog("ID 입력"));
				member.setPw(JOptionPane.showInputDialog("PW 입력"));
				member.setName(JOptionPane.showInputDialog("이름 입력"));
				member.setSsn(JOptionPane.showInputDialog("주민등록번호 입력"));
				member.setBlood(JOptionPane.showInputDialog("혈액형 입력"));
				String heigth = JOptionPane.showInputDialog("키 입력");
				member.setHeight(Double.parseDouble(heigth));
				String weigth = JOptionPane.showInputDialog("몸무게 입력");
				member.setWeight(Double.parseDouble(weigth));
				String salary = JOptionPane.showInputDialog("연봉입력");
				member.setSalary(Integer.parseInt(salary));
				String tax = JOptionPane.showInputDialog("세율입력");
				member.setTax(Double.parseDouble(tax));
				break;
			case "2":
				JOptionPane.showMessageDialog(null, "2.마이페이지\n" + member.toString());
				break;
			case "3":
				JOptionPane.showMessageDialog(null, "3.체질량지수 구하기\n" + memberservice.getBmi(member));
				break;
			case "4":
				JOptionPane.showMessageDialog(null, "4.세금구하기\n" + memberservice.getTax(member));
				break;
			}
		}
	}

}
