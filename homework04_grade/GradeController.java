package homework04_grade;

import javax.swing.JOptionPane;
import homework04_grade.Grade;
import homework04_grade.GradeService;

public class GradeController {

	public static void main(String[] args) {
		Grade grade = null;
		GradeService gradeservice = new GradeService();
		while (true) {
			switch (JOptionPane.showInputDialog("0.종료 1.점수입력 2.점수총합 3.점수평균")) {
			case "0":
				System.out.println("종료");
				return;
			case "1":
				grade = new Grade();
				String kor = JOptionPane.showInputDialog("국어 점수 입력");
				grade.setKor(Integer.parseInt(kor));
				String eng = JOptionPane.showInputDialog("영어 점수 입력");
				grade.setEng(Integer.parseInt(eng));
				String math = JOptionPane.showInputDialog("수학 점수 입력");
				grade.setMath(Integer.parseInt(math));
				break;
			case "2":
				JOptionPane.showMessageDialog(null, "점수총합\n" + gradeservice.getTotal(grade));
				break;
			case "3":
				JOptionPane.showMessageDialog(null, "점수평균\n" + gradeservice.getAvg(grade));
				break;
			}

		}

	}

}
