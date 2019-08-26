package study07;

public class MemberService {

	public String getBmi(MemberBean member) {
		String result = "";
		String eval = "";
		String name = member.getName();
		double height = member.getHeight();
		double weight = member.getWeight();
		double bmi = weight / ((height * 0.01) * (height * 0.01));
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
		return result = String.format("%s의 BMI 수치는 %.2f으로 %s 입니다.",name, bmi, eval);
	}

	public String getTax(MemberBean member) {
		String result = "";
		String name = member.getName();
		double tax = member.getTax();
		double salary = member.getSalary();
		double tax1 = salary * tax * 0.01;
//	double tax2 = Math.round((tax1*100)/100.0);
		return result = String.format("연봉 %.0f만원을 받으시는 %s님께서 납부할 세금은 %.2f만원입니다.", salary, name, tax1);
	}

}
